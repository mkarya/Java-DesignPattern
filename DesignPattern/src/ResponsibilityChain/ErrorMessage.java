package ResponsibilityChain;

public class ErrorMessage extends AbstractLogger {
	public ErrorMessage(int level){
		this.level = level;
	}

	public void printMsg(int level, String msg){
		if (level != this.level)
			this.nextObject.printMsg(level, msg);
		else {
			System.out.println("ERROR : " + msg);
		}	
	}

}
