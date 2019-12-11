package Creational;

public class SingletonPattern {

    public static void main(String[] args) {
        // Singleton instance of logger
        Logger log = Logger.getInstance();

        log.info("This is info message.");
        log.warn("This is warn message.");
        log.warn("This is error message.");
    }
}
