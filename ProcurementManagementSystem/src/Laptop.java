
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
public class Laptop {

    private List<String> Model;
    private List<String> Processor;
    private List<String> Generation;
    private int Quantity;

    public Laptop() {
        this.Model = new ArrayList<>();
        this.Processor = new ArrayList<>();
        this.Generation = new ArrayList<>();
    }
    
    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
}
