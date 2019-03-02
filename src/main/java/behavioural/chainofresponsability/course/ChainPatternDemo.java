package behavioural.chainofresponsability.course;

public class ChainPatternDemo {
    public static void main(String[] args) {

        AbstractLogger loggerChain = getChainOfLoggers();

        System.out.println("=== FIRST LEVEL ===");
        loggerChain.logMessage(AbstractLogger.INFO, "This is an info.");

        System.out.println("=== SECOND LEVEL ===");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug.");

        System.out.println("=== THIRD LEVEL ===");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error.");
    }

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

//    === FIRST LEVEL ===
//    Console::Logger - This is an info.
//            === SECOND LEVEL ===
//    File::Logger - This is a debug.
//    Console::Logger - This is a debug.
//            === THIRD LEVEL ===
//    Error::Logger - This is an error.
//    File::Logger - This is an error.
//    Console::Logger - This is an error.

}


