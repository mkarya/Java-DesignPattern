package structuralBridgePattern;

public abstract class ThreadImplemator {
	static ThreadImplemator getImplementationForPlatform(String platform, String strategy) {
		switch (platform) {
		case "Linux":
			return new LinuxThreadImplementor(strategy);
		case "window":
			System.out.println("strategy not supported");
		}
		
		return null;
	}
	
	public abstract void runThreading();

}
