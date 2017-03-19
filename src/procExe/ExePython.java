/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procExe;

import java.util.Scanner;

/**
 *
 * @author stephan_wink
 */
public class ExePython {
    
    public static boolean isWindowsSystem()
    { 
        String osName = System.getProperty("os.name").toLowerCase();
        return osName.contains("windows");
    }
  
    public static boolean isLinuxSystem()
    { 
        String osName = System.getProperty("os.name").toLowerCase();
        return osName.contains("linux");
    }
    
    public static boolean isOsxSystem()
    { 
        String osName = System.getProperty("os.name").toLowerCase();
        return osName.contains("mac");
    }
    
    public static String execPython(String pythonFile) throws Exception
    { 
        String output = new String();
        
        if (isWindowsSystem())
        { 
            //Runtime.getRuntime().exec("cmd /c start " + pythonFile);
            System.out.println("windows system");
        }
        if (isLinuxSystem())
        { 
            //Runtime.getRuntime().exec("xdg-open " + pythonFile);
            System.out.println("linux system");
        }
        if (isOsxSystem())
        { 
            ProcessBuilder pb = new ProcessBuilder("python", pythonFile);         
            Process p = pb.start();
            Scanner s = new Scanner( p.getInputStream() ).useDelimiter( "\\Z" );
            output = s.next();
            s.close();
            int exitCode = p.waitFor();           
        }
        
        return(output);
    }
}
