package Creational;

public class Logger {
    private static Logger sigletonInstance = new Logger();

    public static Logger getInstance() {

        return sigletonInstance;
    }

    private Logger() {

    }

    public void info(String message){

        System.out.println("INFO: " + message);
    }

    public void warn(String message){

        System.out.println("WARN: " + message);
    }

    public void error(String message){

        System.out.println("ERROR: " + message);
    }
}
