package microbat.instrumentation.runtime;

/**
 * @author LLT
 * This class is supposed to keep at very basic, NOT use or trigger ANY other liberay function even in jdk,
 * only Array is allowed.
 * [TO AVOID RECURSIVE LOOP IN GET_TRACER!!]
 */
public abstract class TracerStore<T extends ITracer> {
	public static final int INVALID_THREAD_ID = -1;
	protected ITracer[] rtStore = new ITracer[10];
	protected long mainThreadId = INVALID_THREAD_ID;
	protected int lastUsedIdx = INVALID_THREAD_ID;
	
	/* threadId must be valid */
	@SuppressWarnings("unchecked")
	public synchronized T get(long threadId) {
		if (threadId != mainThreadId) {
			return null; // for now, only recording trace for main thread.
		}
		for (int i = 0; i < lastUsedIdx; i++) {
			ITracer tracer = rtStore[i];
			if (tracer.getThreadId() == threadId) {
				return (T) tracer;
			}
		}
		T tracer = initTracer(threadId);
		rtStore[++lastUsedIdx] = tracer;
		return tracer;
	}
	
	protected abstract T initTracer(long threadId);

	public void setMainThreadId(long mainThreadId) {
		this.mainThreadId = mainThreadId;
	}

	public T getMainThreadTracer() {
		return get(mainThreadId);
	}
	
	public long getMainThreadId() {
		return mainThreadId;
	}
}
