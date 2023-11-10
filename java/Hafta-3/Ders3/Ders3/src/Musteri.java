public class Musteri {

    private String name;
    private String surname;
    private int year;
    public Musteri(String name,String surname,int year){
        this.name=name;
        this.year=year;
        this.surname=surname;
    }
    public void setName(String name){
        if(name.isEmpty() || name.length()>50){
        }
        else{
            this.name=name;
        }
    }
    public void setSurname(String surname){
        if(surname.isEmpty() || surname.length()>50){
        }
        else{
            this.surname=surname;
        }
    }
    public void setYear(int year){
        if(!(year>2023 || year<1950 )){
            this.year=year;
        }
        else{
            this.year=2000;
        }
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getYear(){
        return year;
    }
    public void print(){
        System.out.println(name+" "+surname);
        System.out.println(year);
    }
    public int yasHesapla(){
        return 2023-year;
    }
}
