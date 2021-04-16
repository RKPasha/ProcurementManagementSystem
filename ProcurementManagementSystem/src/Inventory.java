
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdullah
 */
public class Inventory {
    private static Inventory obj;
     private List<Accessories> list;
     
     private Inventory(){
         list = new ArrayList<Accessories>();
     }
     
        public static Inventory getObject() {
        if (obj == null) {
            obj = new Inventory();
        }
        return obj;
    }
        
        public void addAccessory(Accessories A){
            list.add(A);
        }
        
    public List<Accessories> getAllInventory() {
        return list;
    }
}
