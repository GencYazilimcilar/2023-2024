public class Product extends ProductAbstract implements IProduct{

    public Product(String productName,
                   double price,String shopName,double discount,
                   String description,String categoryName){
        //super(categoryName);
        super.productName=productName;
        super.price=price;
        super.shopName=shopName;
        super.discount=discount;
        super.description=description;
        super.changeProductName(productName);
    }

    @Override
    public void print(){
        System.out.println("Product Name: "+this.productName);
        System.out.println("Price: "+this.price);
        System.out.println("Shop Name: "+this.shopName);
        System.out.println("Discount: "+this.discount);
        System.out.println("Description: "+this.description);
        //System.out.println("Category Name: "+super.categoryName);
    }

    @Override
    public void print2() {
        System.out.println("Print2");
    }

    @Override
    public void changePrice(double price){
        if(! (price>100000)){
            System.out.println("Price en dusuk 100 000 Tl olabilir");
        }else{
            this.price=price;
        }
    }

    @Override
    public void changeDiscount(double discount) {
        super.discount=discount;
    }
}
