package klasy;

import java.util.ArrayList;
import java.util.List;

public class test08 {
    public static void main(String[] args) {
        Invoice f1 = new Invoice("A001", "faktura 001", 1, 1.50);
        Invoice f2 = new Invoice("A002", "faktura 002", 2, 1.50);
        Invoice f3 = new Invoice("A003", "faktura 003", 3, 3.50);
        Invoice f4 = new Invoice("A004", "faktura 004", 4, 2.50);
        Invoice f5 = new Invoice("A005", "faktura 005", 5, 5.50);
    }
}
class Invoice{
    private String id;
    private String description;
    private int quantity;
    private double unitPrice;

    public Invoice(String id, String description, int quantity, double unitPrice) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
class Invoces{
    private List<Invoice> list = new ArrayList<>();

    public Invoces(List<Invoice> list) {
        this.list = list;
    }

    private int sumQuantity(){
        int sum = 0;
        for(Invoice inv : list){
            sum += inv.getQuantity();
        }
        return sum;
    }
    private int avgUnitPrice(){
        int sum = 0;
        for(Invoice inv : list){
            sum += inv.getQuantity();
        }
        return sum/list.size();
    }

    @Override
    public String toString() {
        return "Invoices{allQuantities=" + sumQuantity()+ ",getAverageUnitPrice="+ avgUnitPrice() + "}";
    }
}
