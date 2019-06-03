package Util;

import org.apache.log4j.Logger;

public class Log {

    private static Logger Log = LoggerHelper.getLogger(LoggerHelper.class);

    public static void info(String message) {
        Log.info(message);
    }

    public static void warn(String message) {
        Log.warn(message);
    }

    public static void error(String message) {
        Log.error(message);
    }
}
