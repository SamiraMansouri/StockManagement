/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author apple
 */
public class Invoice {
    int ID;
    Date Entrydate;
    int TotalAmount;
    double TotalPrice;
    
    public List<InvoiceRow> invoiceRows=new ArrayList<InvoiceRow>();

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getEntrydate() {
        return Entrydate;
    }

    public void setEntrydate(Date Entrydate) {
        this.Entrydate = Entrydate;
    }

    public int getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(int TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(double TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    
    
}
