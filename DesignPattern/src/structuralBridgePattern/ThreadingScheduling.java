package structuralBridgePattern;

public abstract class ThreadingScheduling {
	
	protected String platform;
	
	public ThreadingScheduling(String platform) {
		this.platform = platform;
	}

	public abstract void runThreading();
	
	
}
