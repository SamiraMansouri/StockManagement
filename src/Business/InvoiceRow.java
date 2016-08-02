/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author apple
 */
public class InvoiceRow {
    
    int ID;
    int Amount;
    double FirstPrice;
    String Category;

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public double getFirstPrice() {
        return FirstPrice;
    }

    public void setFirstPrice(double FirstPrice) {
        this.FirstPrice = FirstPrice;
    }
    
    
    
}
