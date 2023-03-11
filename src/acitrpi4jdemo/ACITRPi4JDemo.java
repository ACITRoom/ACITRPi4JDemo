/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acitrpi4jdemo;

import RunOperator.RunMainOperator;

/**
 *
 * @author Alan Chung
 */
public class ACITRPi4JDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        int timerCounter = 0;          
        //--------------------------------------------------------------------------------------- 
        RunMainOperator RunOperatorObj = new RunMainOperator();   
        RunOperatorObj.InitialFun();  
        String AppName = "ACITRPi4JDemo";
        //--------------------------------------------------------------------------------------- 
       if (RunOperatorObj.ProgramIsNotRunFun()== true){
           System.out.println( AppName +"==>" + " NO for Run And existed");     
       }
       else {
            //--------------------------------------------------------------------------------------- 
           System.out.println( AppName +"==>" + " Start To Run");  
           RunOperatorObj.RunProgramFun();
            //---------------------------------------------------------------------------------------           
            for(;;){
                try {   
                    Thread.sleep(2000);
                    if ((timerCounter % 30) == 1){
                        System.out.println( AppName +"==>" + " Running for 1 minute Counter Vaule =" + timerCounter);      
                    }
                     
                    if ((timerCounter % 300) == 1){
                    
                    }
                    timerCounter++;   
                    if (timerCounter > 10000000) timerCounter = 0;
                } catch (InterruptedException ex) {        
                    System.out.println( AppName + "InterruptedException" + ex.getMessage());
                }
            }     
       }

       System.out.println( AppName +"==>" + " Existed Now");
        

    }
    
}
