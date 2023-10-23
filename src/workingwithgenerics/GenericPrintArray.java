/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workingwithgenerics;

/**
 *
 * @author endie
 */
public class GenericPrintArray <T>{
    
    T[] myIntegerArray ;
    
    
    public GenericPrintArray(T[] array){
        this.myIntegerArray = array ;
    }
    
    public void printArray(){
        for(T data : this.myIntegerArray){
            System.out.println("The current value in your array is: " + data + "and the data type is: " + data.getClass().getName());
        }
    }
    
}
