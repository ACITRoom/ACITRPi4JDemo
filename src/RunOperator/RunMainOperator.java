/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package RunOperator;

/**
 *
 * @author:Alan Chung
 * @Create:Dec 19, 2022 
 * @Version:1.0.0
 */
public class RunMainOperator extends Run02Timer{

   
 //============================================================================================
    public boolean InitialFun(){        
        try {

            //--------------------------------------------------------------------------------------------            
            if (GPIOOperatorInitialFun() == false){
                
            }
            
            //--------------------------------------------------------------------------------------------            

            return true;        
        }catch (SecurityException ex) {
             DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),
               "Main",  "ST",ex.toString(), ex.getMessage());                 
        }
        finally{
        
        }
        return false;
    }
  //============================================================================================
    public boolean ProgramIsNotRunFun(){        
        try {


        }catch (Exception ex) {
             DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),
               "Main",  "ST",ex.toString(), ex.getMessage());              
        }
        finally{
        
        }
        return false;
    }
    //============================================================================================
    public boolean RunProgramFun(){        
        try {

          
            return true;        
        }catch (Exception ex) {
             DebugLogFun(new Object(){}.getClass().getEnclosingMethod().getName(),
               "Main",  "ST",ex.toString(), ex.getMessage());                
        }
        finally{
        
        }
        return false;
    }
    //============================================================================================



    //============================================================================================
    private boolean ExampleFun(){        
        try {



            return true;        
        }catch (Exception ex) {
           
        }
        finally{
        
        }
        return false;
    }
    //============================================================================================

    @Override
    protected void Timer01FeedbackEventFun() {
       
    }
}
