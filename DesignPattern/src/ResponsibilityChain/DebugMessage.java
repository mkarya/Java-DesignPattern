package ResponsibilityChain;

public class DebugMessage extends AbstractLogger{
	public DebugMessage(int level){
		this.level = level;
	}

	public void printMsg(int level, String msg){
		if (level != this.level)
			this.nextObject.printMsg(level, msg);
		else {
			System.out.println("DEBUG : " + msg);
		}

	}

}
