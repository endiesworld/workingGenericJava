/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workingwithgenerics;

/**
 *
 * @author endie
 */
public class PrintIntegerArray {
    
    Integer[] myIntegerArray ;
    
    public PrintIntegerArray(int arraySize){
        this.myIntegerArray = new Integer[arraySize] ;
    }
    
    public PrintIntegerArray(Integer[] array){
        this.myIntegerArray = array ;
    }
    
    public void printArray(){
        for(Integer data : this.myIntegerArray){
            System.out.println("The current value in your array is: " + data);
        }
    }
}
