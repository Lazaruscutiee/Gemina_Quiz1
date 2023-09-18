/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gemina_quiz1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Gemina_Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] BasicArray = {82,44,96,7,13,56,74,14,98,36};
        Scanner print = new Scanner(System.in);
        System.out.println("Code time press \nNo 1 Basic Array \nNo 2 Delete Array \nNo 3 Shorting");
        int number = print.nextInt();
        
        switch (number) {
            case 1:
                Elements(BasicArray);
                break;
            case 2:
                DeleteArray(BasicArray);
                break;
            case 3:
                Shorting(BasicArray);
                break;
            default:
                System.out.println("WRONG INPUT!!!");
                break;
        }
    }
    public static void Elements(int[] Elements){
       
        int [] BasicArray = {82,44,96,7,13,56,74,14,98,36};
        for (int i = 0; i < 10; i++){
            System.out.println("The Basic Arrays are: "+ BasicArray[i]);
        }
        
        
        
       /* System.out.println("Elements: 82,44,96,7,13,56,74,14,98,36");
        System.out.println("Enter The Element to be deleted or removed: ");
        int elements = scan.nextInt();*/
    }
    public static void DeleteArray(int [] deletearray){
        int [] OrigArray = {82,44,96,7,13,56,74,14,98,36};
        Scanner scan = new Scanner(System.in);
        System.out.println("Elements 82,44,96,7,13,56,74,14,98,36 ");
        System.out.println("");
        int elementtodelete;
        
    }
    
    public static void Shorting(int [] Shortinglement){
        
        int [] origArray = {82,44,96,7,13,56,74,14,98,36};
        Scanner scn = new Scanner(System.in);
        System.out.println("Element list:82,44,96,7,13,56,74,14,98,36 ");
        System.out.println("Insert New Element: ");
        int elementToInsert = scn.nextInt();
        
        if (origArray.length >= Integer.MAX_VALUE){
            System.out.println("Arrays Too large: ");
        }
        else{
            int [] newArray = Arrays.copyOf(origArray, origArray.length + 1);
            newArray [newArray.length - 1] = elementToInsert;
            
            System.out.println("OrigArray" + Arrays.toString(origArray));
            System.out.println("Element Inserted at the END: " + elementToInsert);
            System.out.println("Updated Array: " + Arrays.toString(newArray) );
            
            //hello World!!
    }
}
    
}