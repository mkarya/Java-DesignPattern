package structuralBridgePattern;

public class RoundRobin extends ThreadingScheduling {
	private String strategy;
	private ThreadImplemator xx;
	
	public RoundRobin(String platform) {
		super(platform);
		this.strategy = "RoundRobin";
		xx = ThreadImplemator.getImplementationForPlatform(platform, strategy);
	}
	
	public void runThreading() {
		xx.runThreading();
	}
}
