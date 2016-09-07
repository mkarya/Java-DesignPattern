package ResponsibilityChain;

public class FatelMessage extends AbstractLogger{
		public FatelMessage(int level){
			this.level = level;
		}
		
		public void printMsg(int level, String msg){
			if (level != this.level)
				this.nextObject.printMsg(level, msg);
			else {
				System.out.println("FATEL : " + msg);
			}
			
		}
		
}
