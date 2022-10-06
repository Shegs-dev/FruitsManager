/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitsmanager;

import java.util.Scanner;

/**
 *
 * @author OluwasegunAjayi
 */
public class CountFruits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FruitsManagerHelper managerHelper = new FruitsManagerHelper();
        //Using a try-catch block to handle errors from the Fruits API HTTP Response
        try{
            String[] fruits = {"Strawberry", "Mango", "Cherry", "Lime", "Guava", "Papaya", "Nectarine", "Pineapple", "Lemon", "Plum", "Tangerine", "Fig", "Blueberry", "Grape", "Jackfruit", "Pomegranate", "Apple", "Pear", "Orange", "Watermelon", "Raspberry", "Banana"};
            System.out.println("Please select 1 for the Basic Analysis of the Fruits or 2 for a more detailed analysis");
            int choice = input.nextInt();
            if (choice == 1) managerHelper.analyseFruitsList(fruits);
            else if (choice == 2) managerHelper.analyseFruitsListToDetails(fruits);
            else {
                System.err.println("You did not make a valid choice so we would assume the Basic Analysis as Default");
                managerHelper.analyseFruitsList(fruits);
            }
        }catch (Exception e){
            System.err.println("Error From Fruits API " + e);
        }
    }
    
}
