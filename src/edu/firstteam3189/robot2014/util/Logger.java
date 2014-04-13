package edu.firstteam3189.robot2014.util;

/**
 * This class is used to dump informational messages.
 *
 * @author Michael
 */
public class Logger {

    public static final int DEBUG = 4;
    public static final int ERROR = 1;
    public static final int INFO = 3;
    public static final int TRACE = 5;
    public static final int WARNING = 2;
    private static int level = TRACE;
    private String prefix;

    public Logger(Class cls) {
        prefix = getName(cls) + " ";
    }

    public void debug(String message) {
        log(DEBUG, message, null);
    }

    public void error(String message) {
        error(message, null);
    }

    public void error(String message, Throwable t) {
        log(ERROR, message, t);
    }

    public void info(String message) {
        log(INFO, message, null);
    }

    public void trace(String message) {
        log(TRACE, message, null);
    }

    public void warning(String message) {
        log(WARNING, message, null);
    }

    /**
     * This method return just the name of the class (i.e. without package).
     */
    private String getName(Class cls) {
        String name = cls.getName();

        return name.substring(name.lastIndexOf('.') + 1);
    }

    private void log(int messageLevel, String message, Throwable t) {
        if (messageLevel < level) {
            System.out.print(prefix);
            System.out.print('[');

            switch (messageLevel) {
                case TRACE:
                    System.out.print("TRACE");
                    break;
                case DEBUG:
                    System.out.print("DEBUG");
                    break;
                case INFO:
                    System.out.print("INFO");
                    break;
                case WARNING:
                    System.out.print("WARN");
                    break;
                case ERROR:
                    System.out.print("ERROR");
                    break;
                default:
                    System.out.print("...");
                    break;
            }

            System.out.print("] ");
            System.out.println(message);

            if (t != null) {
                t.printStackTrace();
            }
        }
    }
}
