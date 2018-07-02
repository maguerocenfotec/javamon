/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamon.utils.enums;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mario
 */
public enum Element {
    Fire (0),
    Water(1),
    Earth(2),
    Air(3),
    Aether(4);
    
    private static Map<Integer, Element> map = new HashMap<Integer, Element>();
    
    static {
        for (Element elemEnum : Element.values()) {
            map.put(elemEnum.ElementNumber, elemEnum);
        }
    }
    
    private int ElementNumber;
    
    private Element(int pElementNumber){ 
        this.ElementNumber = pElementNumber;
    }
    
    public static Element valueOf( int pElementNumber ){
        return map.get(pElementNumber);
    }
            
}
