public class Car {
    private String name;
    private String model;
    private int productionYear;
    private int price;
    private int discount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            this.name="default";
        }
        else{
            this.name=name;
        }

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.isEmpty()){
            this.model="default";
        }
        else{
            this.model = model;
        }
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        if(productionYear<1886 ||productionYear>2023){
            this.productionYear=2010;
        }
        else{
            this.productionYear = productionYear;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price<0){
            this.price=100000;
        }
        else{
            this.price = price;
        }
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        if(discount<0 || discount>100){
            this.discount=0;
        }
        else{
            this.discount = discount;
        }
    }
}
