/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workingwithgenerics;
import java.util.ArrayList ;
import java.util.Arrays ;

/**
 *
 * @author endie
 */
public class ArrayAndArrayListOps {
    Double[] localArray1  ;
//    int[] localArray2 = {2,4,6,8} ;
    
    // Generics does not accept primitive data types
    ArrayList<Double> arrayList = new ArrayList<>() ;
//    ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(8, 10, 12, 14)) ;
    
//    public ArrayAndArrayListOps(int arrSize){
//     this.localArray1 = new Double[arrSize] ;
//    }
    
    public void fillUpLocalArray(Double[] arr){
        this.localArray1 = arr ;
    }
    
    public void fillUpArrayList(ArrayList<Double> arr){
        for (int index = 0; index <  arr.size(); index++){
            this.arrayList.add(index, arr.get(index)) ;
        }
    }
    
    public void printLocalArray(){
    
        GenericPrintArray genericStringArray = new GenericPrintArray(this.localArray1) ;
        genericStringArray.printArray();
    
    }
    
    public void printArrayList(){
    
       this.arrayList.forEach(number -> {
            System.out.println("Element: " + number);
        });
    }
    
}
