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
public abstract class Run00Operator {

   



    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  
    //===============================================================================================================================
    protected void DebugLogFun(String MinorHeader, String MainTitle, String SubTitle, String MainMsg, String SubMsg){     
       System.out.println(this.getClass().getSimpleName() +"_"+ MinorHeader +"_"+  MainTitle+"_"+ SubTitle+"_"+ MainMsg +"_"+ SubMsg);
    }   
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
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
}
