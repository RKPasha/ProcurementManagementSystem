
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
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
    private List<String> inventory;
    
    private Inventory() {
        list = new ArrayList<Accessories>();
        inventory = new ArrayList<String>();
    }
    
    public static Inventory getObject() {
        if (obj == null) {
            obj = new Inventory();
        }
        return obj;
    }
    
    public void addAccessory(Accessories A) {
        list.add(A);
    }
    
        public void deleteAccessory(String name) {
        int index = searchAccessory(name);
        if (index == -1) {
        } else {
            list.remove(index);
        }
    }
        
        public void updateAccessory(String name, Accessories A) {
        int index = searchAccessory(name);
        if (index == -1) {
        } else {
            list.set(index, A);
        }
    }
    
        private int searchAccessory(String name)
    {
        int index = -1;
         for(int i = 0 ; i  < list.size(); i++)
         {
             if(list.get(i).getItemName().equalsIgnoreCase(name))
             {
                 //System.out.println("Item Found");
                 index = i;
                 break;
             }
         }
        return index;
    }
    
    public void addItemsToComboBox(){
        for(int  i = 0; i < list.size(); i++){
            inventory.add(list.get(i).getItemName());
        }
    }
    
    public List<String> getComboBoxItems(){
        return inventory;
    }
    
    public List<Accessories> getAllInventory() {
        return list;
    }
    
        public Accessories getItem(String name)
    {
        int index = searchAccessory(name);
        return list.get(index);
    }
    
    protected void saveInventory() throws Throwable {
        try {
            FileWriter fw = new FileWriter("Inventory.csv");
            fw.write("Item Name,Quantity Present\n");
            for (int i = 0; i < list.size(); i++) {
                fw.write(list.get(i).getItemName() + ","
                        + list.get(i).getQuantity() + "\n");
            }
            fw.flush();
            fw.close();
            super.finalize();
            System.out.println("Inventory Data Saved Successfully");
        } catch (Throwable e) {
            throw e;
        }
    }
    
    public void loadInventory() throws ParseException {
        try {
            FileReader fr = new FileReader("Inventory.csv");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            line = br.readLine();
            while (line != null) {
                Accessories A = new Accessories();
                String[] toks = line.split(",");
                
                A.setItemName(toks[0]);
                int quantity = Integer.parseInt(toks[1]);
                A.setQuantity(quantity);
                Inventory.getObject().addAccessory(A);
                line = br.readLine();
            }
            br.close();
            fr.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
