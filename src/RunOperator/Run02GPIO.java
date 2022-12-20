/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package RunOperator;

import GPIOOperator.Pi4jGPIO00Operator;

/**
 *
 * @author:Alan Chung
 * @Create:Dec 19, 2022 
 * @Version:1.0.0
 */
public abstract class Run02GPIO extends Run00Operator {

   
    protected Pi4jGPIO00Operator Pi4jGPIO00OperatorObj = new Pi4jGPIO00Operator();



    //============================================================================================
    protected boolean GPIOOperatorInitialFun(){        
        try {

            if (this.Pi4jGPIO00OperatorObj.GPIOOuputSetHighFun() == false){
                
            }


            return true;        
        }catch (Exception ex) {
           
        }
        finally{
        
        }
        return false;
    }
    //============================================================================================
}
