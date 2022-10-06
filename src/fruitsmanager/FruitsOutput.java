/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitsmanager;

import java.util.Map;

/**
 *
 * @author OluwasegunAjayi
 */
public class FruitsOutput {
    
    //private fields
    private int total;
    private Map<String, Integer> particularFruitCount;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Map<String, Integer> getParticularFruitCount() {
        return particularFruitCount;
    }

    public void setParticularFruitCount(Map<String, Integer> particularFruitCount) {
        this.particularFruitCount = particularFruitCount;
    }
    
}
