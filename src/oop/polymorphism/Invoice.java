package oop.polymorphism;

public class Invoice implements Payable{

    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem){
        if(quantity < 0) throw new IllegalArgumentException("quantity < 0");
        if(pricePerItem < 0.0) throw new IllegalArgumentException("Price per item < 0.0");

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0) throw new IllegalArgumentException("quantity < 0");
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if(pricePerItem < 0) throw new IllegalArgumentException("quantity < 0");
        this.pricePerItem = pricePerItem;
    }

    @Override
    public String toString(){
        return String.format(
                "%s: %s%n%s : %s%n%s : %d%n%s : %.2f",
                "Part Number", getPartNumber(),
                "Part Description", getPartDescription(),
                "Quantity", getQuantity(),
                "Price per Item", getPricePerItem()
        );
    }

    @Override
    public double getPaymentAmount(){
        return getQuantity() * getPricePerItem();
    }

    public static void main(String[] args) {

        Invoice invoice = new Invoice("035", "Brake box control",
                3, 200.0);

        System.out.println(invoice);
        System.out.println();
        System.out.println("Invoice amount " + invoice.getPaymentAmount());

    }
}
