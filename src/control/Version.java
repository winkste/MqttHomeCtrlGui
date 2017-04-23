/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author stephan_wink
 */
public class Version {
    
    private static final class InstanceHolder {
        static final Version INSTANCE = new Version();
    }
    
    private static final String SWPARTNUMBER = "N309001SW";
    private static final String SWVERSION = "002";   
    private static final String VERSION_OVERVIEW = ""
        + "000  -> initial version"
        + "         first version running different displays"
        + "001  -> first version running on PI"
        + "002  -> code improvements"
        + "         changed MyMQTTClient to singleton class";
       
    private Version(){}
    
    public static Version getInstance () {
        return InstanceHolder.INSTANCE;
    }

    public static String getSWPARTNUMBER() {
        return SWPARTNUMBER;
    }

    public static String getSWVERSION() {
        return SWVERSION;
    }

    public static String getVERSION_OVERVIEW() {
        return VERSION_OVERVIEW;
    }
    
}
