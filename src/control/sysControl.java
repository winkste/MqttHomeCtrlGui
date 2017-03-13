/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author winkste
 */
public class sysControl implements btnIntface{

  @Override
  public void notifyButtonPressed(int btnIdx) 
  {
    System.out.println("Button pressed: " + btnIdx);
  }
  
}
