public class Keyword extends Product{
    public String keyword;
    public Keyword(String keyword,String productName,
                   double price,String shopName,double discount,
                   String description,String categoryName){
        super(productName,price,shopName,discount,description,categoryName);
        this.keyword=keyword;
    }
}
