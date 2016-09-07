package ResponsibilityChain;

public class InfoMessage extends AbstractLogger {
	public InfoMessage(int level){
		this.level = level;
	}

	public void printMsg(int level, String msg){
		if (level != this.level)
			this.nextObject.printMsg(level, msg);
		else {
			System.out.println("INFO : " + msg);
		}

	}

}
