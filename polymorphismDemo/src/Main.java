public class Main {
    public static void main(String[] args) {
        DatabaseLogger databaseLogger = new DatabaseLogger();
        EmailLogger emailLogger = new EmailLogger();
        FileLogger fileLogger = new FileLogger();
        ConsoleLogger consoleLogger = new ConsoleLogger();

        databaseLogger.log("db logged");
        emailLogger.log("email logged");
        fileLogger.log("file logged");
        consoleLogger.log("file logged");

        BaseLogger[] loggers = new BaseLogger[] {databaseLogger,fileLogger,emailLogger,consoleLogger};

       for(BaseLogger logger : loggers){
           logger.log("Log message: ");
       }

       CustomerManager customerManager = new CustomerManager(databaseLogger);
       customerManager.add();
    }
}
