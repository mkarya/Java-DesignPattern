package ResponsibilityChain;

public abstract class AbstractLogger {
	public static int FATEL = 0;
	public static int ERROR = 1;
	public static int INFO = 2;
	public static int DEBUG = 3;
	
	protected int level;
	
	protected AbstractLogger nextObject;
	
	public abstract void printMsg(int level, String msg);
		
}
