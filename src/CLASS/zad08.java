package CLASS;

import java.util.*;

public class zad08 {
    public static void main(String[] args) {
        ArrayList<Invoice> list = new ArrayList<>() {
            {
                add(new Invoice("A001", "faktura 001", 1, 1.50));
                add(new Invoice("A002", "faktura 002", 2, 2.50));
                add(new Invoice("A003", "faktura 003", 3, 3.50));
                add(new Invoice("A004", "faktura 004", 4, 4.50));
                add(new Invoice("A005", "faktura 005", 5, 5.50));
            }
        };
        Invoices invoices = new Invoices(list);
        System.out.println(invoices);
    }

}
class Invoice{
    private String id;
    private String desc;
    private int quantity;
    private double unitPrice;

    public Invoice(String id, String desc, int quantity, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}

class Invoices{
    private ArrayList<Invoice> list;

    public Invoices(ArrayList<Invoice> list) {
        this.list = list;
    }
    private int SumQuantities(){
        int sum = 0;
        for(Invoice invoice : list){
            sum += invoice.getQuantity();
        }
        return sum;
    }
    private float AvgUnitPrice(){
        float sum = 0;
        for(Invoice invoice : list){
            sum += invoice.getUnitPrice();
        }
        return sum/SumQuantities();
    }

    @Override
    public String toString() {
        return "Invoices{allQuantities="+SumQuantities()+", getAverageUnitPrice="+AvgUnitPrice()+"}";
    }
}
