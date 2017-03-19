/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensor;

import java.util.Date;

/**
 *
 * @author stephan_wink
 */
public interface sensorIntf {
    
    double data_d = 0;
    //Date date_d;
    
    public Date getTimeStamp();
    public String getData();
    public String getUnit();
    public void setData();
    
    public void sensorSet(String type_str);    
}
