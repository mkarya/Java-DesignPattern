package ResponsibilityChain;

public class DemoChainOfResponsibility {
	private static AbstractLogger createChainOfResponsibility(){
		DebugMessage debug = new DebugMessage(AbstractLogger.DEBUG);
		ErrorMessage error = new ErrorMessage(AbstractLogger.ERROR);
		FatelMessage fetal = new FatelMessage(AbstractLogger.FATEL);
		InfoMessage info = new InfoMessage(AbstractLogger.INFO);
		
		fetal.nextObject = error;
		error.nextObject = debug;
		debug.nextObject = info;
		
		return fetal;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractLogger logger = createChainOfResponsibility();
		
		logger.printMsg(AbstractLogger.ERROR, "This is error message");
		logger.printMsg(AbstractLogger.FATEL, "This is fetal message");
		logger.printMsg(AbstractLogger.INFO, "This is info message");
		logger.printMsg(AbstractLogger.DEBUG, "This is debug message");
		
		return;
	}

}
