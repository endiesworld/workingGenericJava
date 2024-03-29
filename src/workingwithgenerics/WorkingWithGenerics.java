/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package workingwithgenerics;

/**
 *
 * @author emmanuel
 */
import java.util.ArrayList ;

public class WorkingWithGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] myArray = {2, 4, 6, 8, 10} ;
        String[] myStringArray = {"Emmanuel", "Okoro", "Dubem", "Kamma", "Adaobi"} ;
        
        PrintIntegerArray printArray = new PrintIntegerArray(myArray) ;
        printArray.printArray();
        
        PrintStringsArray stringArray = new PrintStringsArray(myStringArray) ;
        stringArray.printArray();
        
        GenericPrintArray genericStringArray = new GenericPrintArray(myStringArray) ;
        genericStringArray.printArray();
        
        GenericPrintArray genericIntegerArray = new GenericPrintArray(myArray ) ;
        genericIntegerArray.printArray();
        
        ArrayAndArrayListOps myArraysObj = new ArrayAndArrayListOps() ;
        
        Double[] localArr = {1.2, 2.3, 3.4, 4.5, 5.6} ;
        ArrayList<Double> mutableArr = new ArrayList<>() ;
        mutableArr.add(2.1) ;
        mutableArr.add(3.1) ;
        mutableArr.add(4.1) ;
        
        myArraysObj.fillUpLocalArray(localArr);
        myArraysObj.fillUpArrayList(mutableArr);
        
        myArraysObj.printLocalArray();
        myArraysObj.printArrayList();
        
    }
    
}
