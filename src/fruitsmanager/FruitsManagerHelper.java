/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitsmanager;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author OluwasegunAjayi
 */
public class FruitsManagerHelper {
    
    //Method to determine the number of words in the start with each letter of the alphabet
    public void analyseFruitsList(String [] fruits){
        if (fruits.length <= 0) {
            System.err.println("No Fruits In Fruit List To Analyse");
            return;
        }
        
        Map<String, Integer> letterCountMap = new HashMap<>();
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < alphabets.length(); i++){
            letterCountMap.put(""+alphabets.charAt(i), 0);//Initializing all the values
        }
        
        for (String fruit : fruits){
            if (fruit.length() > 0){
                String firstLetter = "" + fruit.charAt(0);
                String capitalFirstLetter = firstLetter.toUpperCase();
                int alphabetValue = letterCountMap.get(capitalFirstLetter);
                letterCountMap.put(capitalFirstLetter, alphabetValue + 1);//Updating the count
            }
        }
        
        for (Map.Entry<String, Integer> letterCount : letterCountMap.entrySet()){
            System.out.println(letterCount.getKey() + ": " + letterCount.getValue());
        }
    }
    
    //Method to analyse fruit list to details
    public void analyseFruitsListToDetails(String [] fruits){
        if (fruits.length <= 0) {
            System.err.println("No Fruits In Fruit List To Analyse");
            return;
        }
        
        Map<String, FruitsOutput> letterCountMap = new HashMap<>();
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < alphabets.length(); i++){
            FruitsOutput fruitsOutput = new FruitsOutput();
            fruitsOutput.setTotal(0);
            fruitsOutput.setParticularFruitCount(new HashMap());
            letterCountMap.put(""+alphabets.charAt(i), fruitsOutput);//Initializing all the values
        }
        
        for (String fruit : fruits){
            if (fruit.length() > 0){
                String firstLetter = "" + fruit.charAt(0);
                String capitalFirstLetter = firstLetter.toUpperCase();
                FruitsOutput fruitsOutput = letterCountMap.get(capitalFirstLetter);
                int alphabetValue = fruitsOutput.getTotal() + 1;
                Map<String, Integer> fruitCount = fruitsOutput.getParticularFruitCount();
                if(!fruitCount.containsKey(fruit)){
                    fruitCount.put(fruit, 1);
                }else{
                    int countValue = fruitCount.get(fruit);
                    fruitCount.put(fruit, countValue + 1);
                }
                
                fruitsOutput.setParticularFruitCount(fruitCount);
                fruitsOutput.setTotal(alphabetValue);
                letterCountMap.put(capitalFirstLetter, fruitsOutput);//Updating the count
            }
        }
        
        for (Map.Entry<String, FruitsOutput> letterCount : letterCountMap.entrySet()){
            FruitsOutput fruitsOutput = letterCount.getValue();
            System.out.println(letterCount.getKey() + ": " + fruitsOutput.getTotal());
            
            for (Map.Entry<String, Integer> fruitCount : fruitsOutput.getParticularFruitCount().entrySet()){
                System.out.println(fruitCount.getValue() + " " + fruitCount.getKey());
            }
        }
    }
}
