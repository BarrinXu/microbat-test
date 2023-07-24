package microbat.handler;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.widgets.Display;

import microbat.Activator;
import microbat.bytecode.ByteCode;
import microbat.bytecode.ByteCodeList;
import microbat.bytecode.OpcodeType;
import microbat.debugpilot.propagation.BP.BeliefPropagation;
import microbat.instrumentation.output.RunningInfo;
import microbat.model.trace.Trace;
import microbat.model.trace.TraceNode;
import microbat.model.value.VarValue;
import microbat.preference.DebugPilotPreference;
import microbat.util.JavaUtil;
import microbat.vectorization.TraceVectorizer;
import microbat.vectorization.vector.*;
import microbat.views.MicroBatViews;
import microbat.views.TraceView;
import microbat.model.BreakPoint;

import java.util.ArrayList;
public class TestHandler extends AbstractHandler {
	
	private final List<OpcodeType> unmodifiedType = new ArrayList<>();
	TraceView traceView = null;
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		JavaUtil.sourceFile2CUMap.clear();
		Job job = new Job("Testing Tregression") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				setup();
				
				execute();
				
				return Status.OK_STATUS;
			}
		};
		
		job.schedule();
		return null;
	}
	
	private void execute() {
		System.out.println(Activator.getDefault().getPreferenceStore().getString(DebugPilotPreference.PROPAGATOR_TYPE));
		System.out.println(Activator.getDefault().getPreferenceStore().getString(DebugPilotPreference.PATHFINDER_TYPE));
		System.out.println("-----");
	}
	
	private void setup() {
		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				traceView = MicroBatViews.getTraceView();
			}
		});
	}

}
