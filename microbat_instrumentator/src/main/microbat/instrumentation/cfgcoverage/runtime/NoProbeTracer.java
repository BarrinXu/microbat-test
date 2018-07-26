package microbat.instrumentation.cfgcoverage.runtime;

public class NoProbeTracer extends EmptyCoverageTracer implements ICoverageTracer {
	private CoverageTracer ownerTracer;
	
	public NoProbeTracer(CoverageTracer coverageTracer) {
		this.ownerTracer = coverageTracer;
	}

	@Override
	public void enterMethod(String methodId, String paramTypeSignsCode, String paramNamesCode, Object[] params,
			boolean isEntryPoint) {
		ownerTracer.methodCallStack.push(methodId);
	}

	@Override
	public void _exitMethod(String methodId) {
		ownerTracer.methodCallStack.safePop();
	}	
	
	
}
