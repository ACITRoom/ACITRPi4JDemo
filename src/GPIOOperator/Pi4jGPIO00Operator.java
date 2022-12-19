/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package GPIOOperator;

import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinEdge;
import com.pi4j.io.gpio.PinPullResistance;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;


/**
 *
 * @author:Alan Chung
 * @Create:Dec 19, 2022 
 * @Version:1.0.0
 */
public class Pi4jGPIO00Operator {



    private GpioPinDigitalInput  GPIOPinInput = null;        

    public Pi4jGPIO00Operator(){
        
    }
    //====================================================================================================================================
    public boolean GPIOInputInitialFun(){
        try{             
            this.GPIOPinInput = GpioFactory.getInstance().provisionDigitalInputPin(RaspiPin.GPIO_00, PinPullResistance.PULL_DOWN);           
            this.GPIOPinInput.addListener((GpioPinListenerDigital) (GpioPinDigitalStateChangeEvent event) -> {
                String PinName1 = event.getPin().getName();
                if (PinName1.contains(PinName1) == true){
                    if (event.getState() == PinState.HIGH){
                        DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),"======>>> PinName="+PinName1,"High State");
                   
                    }
                    else  if (event.getState() == PinState.LOW){
                        DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),"======>>> PinName="+PinName1,"Low State");
                      
                    }                   
                }} // create GPIO listener
            );   
            return true;
        }catch (SecurityException ex){
             DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),"Main", ex.getMessage());
        }
        return false;
    }
    //====================================================================================================================================
    public boolean GPIOInputWithHighInitialFun(){
        try{             
            this.GPIOPinInput = GpioFactory.getInstance().provisionDigitalInputPin(RaspiPin.GPIO_00, PinPullResistance.PULL_DOWN);           
            this.GPIOPinInput.addListener((GpioPinListenerDigital) (GpioPinDigitalStateChangeEvent event) -> {
                String PinName1 = event.getPin().getName();
                if (PinName1.contains(PinName1) == true){
                    if (event.getState() == PinState.HIGH){
                        DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),"===> PinName="+PinName1,"High State");
                    }
                }
            });  // create GPIO listener  
            return true;
        }catch (SecurityException ex){
             DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),"Main", ex.getMessage());
        }
        return false;
    }
    //====================================================================================================================================
    public boolean GPIOInputWithLowInitialFun(){
        try{             
            this.GPIOPinInput = GpioFactory.getInstance().provisionDigitalInputPin(RaspiPin.GPIO_00, PinPullResistance.PULL_UP);           
            this.GPIOPinInput.addListener((GpioPinListenerDigital) (GpioPinDigitalStateChangeEvent event) -> {
                String PinName1 = event.getPin().getName();
                if (PinName1.contains(PinName1) == true){
                    if (event.getState() == PinState.LOW){
                        DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),"======>>> PinName="+PinName1,"Low State");
                        
                        
                    }                       
                }
            });// create GPIO listener
            return true;
        }catch (SecurityException ex){
             DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),"Main", ex.getMessage());
        }
        return false;
    }
    //====================================================================================================================================
    public boolean GPIOInputWithRiseEdgeInitialFun(){
        try{             
            this.GPIOPinInput = GpioFactory.getInstance().provisionDigitalInputPin(RaspiPin.GPIO_00, PinPullResistance.PULL_UP);           
            this.GPIOPinInput.addListener((GpioPinListenerDigital) (GpioPinDigitalStateChangeEvent event) -> {
                String PinName1 = event.getPin().getName();
                if (PinName1.contains(PinName1) == true){
                    if (event.getEdge() == PinEdge.RISING){
                        DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),"======>>> PinName="+PinName1,"Rise State");
                        
                        
                    }                      
                }
            });// create GPIO listener
            return true;
        }catch (SecurityException ex){
             DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),"Main", ex.getMessage());
        }
        return false;
    }    
    //====================================================================================================================================
    public boolean GPIOInputWithFallEdgeInitialFun(){
        try{             
            this.GPIOPinInput = GpioFactory.getInstance().provisionDigitalInputPin(RaspiPin.GPIO_00, PinPullResistance.PULL_DOWN);           
            this.GPIOPinInput.addListener((GpioPinListenerDigital) (GpioPinDigitalStateChangeEvent event) -> {
                String PinName1 = event.getPin().getName();
                if (PinName1.contains(PinName1) == true){
                    //---------------------------------------
                    if (event.getEdge() == PinEdge.FALLING){
                        DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),"======>>> PinName="+PinName1,"FALLING");
                        
                        
                    }                      
                }
            });// create GPIO listener
                                   
            return true;
        }catch (SecurityException ex){
             DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),"Main", ex.getMessage());
        }
        return false;
    }      
    //======================================================================================================================================      
    //======================================================================================================================================         
     public boolean GPIOOuputSetHighFun(){           
        try{
            GpioPinDigitalOutput GPIOPinOutput = GpioFactory.getInstance().provisionDigitalOutputPin(RaspiPin.GPIO_00, "PIN", PinState.HIGH);   
            GPIOPinOutput.setState(PinState.HIGH);           
            return true;
        }catch (Exception ex){
             DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),"Main", ex.getMessage());
        }
        return false;
     }
     //======================================================================================================================================        
      public boolean GPIOOuputSetToggleFun(){           
        try{

            GpioPinDigitalOutput GPIOPinOutput = GpioFactory.getInstance().provisionDigitalOutputPin(RaspiPin.GPIO_00, "PIN", PinState.HIGH);   
            GPIOPinOutput.toggle();         
            return true;
        }catch (Exception ex){
             DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),ex.toString(), ex.getMessage());
        }
        return false;
     }
     
     //======================================================================================================================================          
      public boolean GPIOOuputSetLowFun(){
           
        try{
            GpioPinDigitalOutput GPIOPinOutput = GpioFactory.getInstance().provisionDigitalOutputPin(RaspiPin.GPIO_00, "PIN", PinState.HIGH);   
            GPIOPinOutput.setState(PinState.LOW);    
            return true;
        }catch (Exception ex){
             DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),ex.toString(), ex.getMessage());
        }
        return false;
     }
          
   
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
    private void DebugLogFun( String MinorHeader, String LogMessage, String AdditionalMessage){
       System.out.println("PiBoardIO==>" + this.getClass().getSimpleName() +"+"+ MinorHeader +"+"+ LogMessage +"+"+ AdditionalMessage);
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
   
}
