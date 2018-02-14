package microbat.instrumentation.trace.data;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import sav.strategies.dto.AppJavaClassPath;

public class FilterChecker implements IFilterChecker {
	private static final IFilterChecker checker = new FilterCheckerMock();
	
	private List<String> appBinFolders;
	private List<String> extLibs;
	private List<String> bootstrapIncludes = new ArrayList<>();
	private Set<String> includes = new HashSet<>();
	
	public void startup(AppJavaClassPath appClasspath) {
		extLibs = new ArrayList<>();
		appBinFolders = new ArrayList<>();
		for (String cp : appClasspath.getClasspaths()) {
			if (cp.startsWith(appClasspath.getWorkingDirectory())) {
				if (cp.endsWith(".jar")) {
					extLibs.add(cp);
				} else {
					File binFolder = new File(cp);
					if (binFolder.exists() && binFolder.isDirectory()) {
						if (!cp.endsWith("/")) {
							cp = cp + "/";
						}
						appBinFolders.add(cp);
					}
				}
			}
		}
		addBootstrapIncludes(ArrayList.class.getName());
	}
	
	private void addBootstrapIncludes(String... classNames) {
		for (String className : classNames) {
			bootstrapIncludes.add(className.replace(".", "/"));
		}
	}
	
	@Override
	public boolean checkTransformable(String classFName, String path, boolean isBootstrap) {
		if (isBootstrap) {
			return bootstrapIncludes.contains(classFName);
		}
		for (String extLib : extLibs) {
			if (path.startsWith(extLib)) {
				return true;
			}
		}
		for (String binFolder : appBinFolders) {
			if (path.startsWith(binFolder)) {
				includes.add(classFName);
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean checkAppClass(String classFName) {
		return includes.contains(classFName);
	}
	
	@Override
	public boolean checkExclusive(String classFName, String methodName) {
		return !includes.contains(classFName);
	}
	
	public static void setup(AppJavaClassPath appClasspath) {
		checker.startup(appClasspath);
	}

	public static boolean isExclusive(String className, String methodName) {
		return checker.checkExclusive(className, methodName);
	}
	
	public static boolean isTransformable(String classFName, String path, boolean isBootstrap) {
		return checker.checkTransformable(classFName, path, isBootstrap);
	}
	
	public static boolean isAppClass(String classFName) {
		return checker.checkAppClass(classFName);
	}
}
