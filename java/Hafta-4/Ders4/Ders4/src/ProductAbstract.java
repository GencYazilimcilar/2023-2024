public abstract class ProductAbstract {
    protected String productName;
    protected double price;
    public String shopName;
    public double discount;
    public String description;
    public void changeProductName(String productName){
        this.productName=productName;
    }
    public abstract void changeDiscount(double discount);
}
