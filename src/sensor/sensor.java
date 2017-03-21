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
public abstract class sensor {
    
    private double data_d;
    private Date date_d;
    private String type_str;
    private String unit_str;
    
    public void sensor(String newType_str, String newUnit_str)
    {
        type_str = newType_str;
        unit_str = newUnit_str;
    }
}
