/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procExe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
            String s;
            Process p;
            try {
                System.out.println("python " + pythonFile);
                p = Runtime.getRuntime().exec("python " + pythonFile);
                BufferedReader br = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));
                output = br.readLine();
 
                p.waitFor();
                System.out.println ("exit: " + p.exitValue());
                p.destroy();
            } catch (Exception e) {}
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
