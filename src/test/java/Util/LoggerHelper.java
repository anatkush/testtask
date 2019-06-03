package Util;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.text.SimpleDateFormat;
import java.util.Date;


public class LoggerHelper {

    static {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy_HH_mm_ss");
        System.setProperty("current.date",dateFormat.format(new Date()));
    }

    private static boolean root=false;
    public static Logger getLogger(Class cls){
        if (root){
            return Logger.getLogger(cls);
        }
        PropertyConfigurator.configure("properties/log4j.properties");
        root = true;
        return Logger.getLogger(cls);
    }
}
