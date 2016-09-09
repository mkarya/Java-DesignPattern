package structuralBridgePattern;

public class LinuxThreadImplementor extends ThreadImplemator {
	private String strategy;
	
	public LinuxThreadImplementor(String strategy){
		this.strategy = strategy;
	}
	
	public void runThreading() {
		System.out.println("running threading on Linux using strategy :" + this.strategy);
	}
	
}
