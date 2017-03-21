/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procExe;

import myMqtt.*;

/**
 *
 * @author stephan_wink
 */
public interface DataCallback {
    
    
    public void setData(String msg);
    
}
