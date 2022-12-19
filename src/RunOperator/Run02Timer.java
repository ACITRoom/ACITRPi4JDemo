/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package RunOperator;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author:Alan Chung
 * @Create:Dec 19, 2022 
 * @Version:1.0.0
 */

public abstract class Run02Timer extends Run00Operator {

   
   //========================================================================================================
    private Timer Timer01Obj = null;       
    protected int Timer01DefaultInterval = 5000;
    private boolean Timer01IsEnable = false;            
    private int Timer01StopCounter = 100;    
    private final Object LockObjTimer01 = new Object();
    //========================================================================================================
    private boolean Timer01InitialFun(int timeInterval, boolean Start){
        
        try{
               
            synchronized(LockObjTimer01) {          
                
                if (Start == true){
                    if (this.Timer01IsEnable == true){
                        return true;
                    }
                    this.Timer01IsEnable = true;   
                    if (this.Timer01Obj != null){                              
                        return true;
                    }
                    this.Timer01Obj = new Timer("Timer01");//create a new Timer    
                    if (timeInterval <= 1){
                        timeInterval = 5;
                    }
                    this.Timer01DefaultInterval = timeInterval;
                    TimerTask Timer01EventHandlerFun = new TimerTask() {
                        @Override
                        public void run() {
                           Timer01FeedbackEventFun();
                        }
                    };
                    //-------------------------------------------------------------------------------------------------------------
                    this.Timer01Obj.scheduleAtFixedRate(Timer01EventHandlerFun, 0, Timer01DefaultInterval);
                    this.Timer01StopCounter = 100;
                }
                else {
                    if (this.Timer01StopCounter  > 0) {
                        this.Timer01StopCounter = this.Timer01StopCounter - 1;
                        return true;
                    }            
                    //------------------------------------------------------------------------------------            
                    if (this.Timer01Obj == null){                
                        return false;
                    }   
                    //------------------------------------------------------------------------------------
                    this.Timer01StopCounter = 100;
                    this.Timer01Obj.cancel();                      
                    this.Timer01Obj = null;
                    this.Timer01IsEnable = false;      
                }                
                //------------------------------------------------------------------------- 
            }
            return true;
        }  catch (SecurityException ex) {
             this.Timer01IsEnable = false;   
            DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),
               "Main",  "ST",ex.toString(), ex.getMessage());       
        }
           return false;
    }    
    //========================================================================================================
    protected abstract void Timer01FeedbackEventFun();
    //========================================================================================================
    protected boolean Timer01StopFun(){
        return Timer01InitialFun(this.Timer01DefaultInterval, false);      
    }    
    //========================================================================================================
    protected boolean Timer01StartFun(){
           return  Timer01InitialFun(this.Timer01DefaultInterval, true);
    }
    //========================================================================================================

}
