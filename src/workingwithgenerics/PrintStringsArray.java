/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workingwithgenerics;

/**
 *
 * @author endie
 */
public class PrintStringsArray {
    String[] myStringArray ;
    
    public PrintStringsArray(int arraySize){
        this.myStringArray = new String[arraySize] ;
    }
    
    public PrintStringsArray(String[] array){
        this.myStringArray = array ;
    }
    
    public void printArray(){
        for(String data : this.myStringArray){
            System.out.println("The current value in your array is: " + data);
        }
    }
}
