public class Mouse extends Product{
    public int dpi;
    public String color;
    public boolean makro;
    public Mouse(int dpi,String color, boolean makro,String productName,
                 double price,String shopName,double discount,
                 String description,String categoryName){
        super(productName,price,shopName,discount,description,categoryName);
        this.dpi=dpi;
        this.color=color;
        this.makro=makro;
        super.productName=productName;
    }

}
