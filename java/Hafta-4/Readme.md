![](assets/banner.png)
# Hafta 4
# İçindekiler
- [Inheritance (Kalitim)](#inheritance-kalitim)
  - [Kalitimda Constructor Zinciri ve Super Anahtar Sozcugu](#kalitimda-constructor-zinciri-ve-super-anahtar-sozcugu) 
- [Polymorphism (Cok Bicimlilik)](#polymorphism-cok-bicimlilik)
- [Overloading (Aşırı Yükleme)](#overloading-asiri-yukleme)
- [Sınıf Ödevi 1](#sinif-odevi-1)
- [Sınıf Ödevi 2](#sinif-odevi-2)
- [Odev](#odev)
# Inheritance (Kalitim)
Kalıtım, programlama ortamında da gerçek hayattaki tanımına benzer 
bir işi gerçekleştirir. Bir sınıfın başka bir sınıftan kalıtım yapması 
demek, kalıtımı yapan sınıfın diğer sınıftaki nitelik ve davranışlarını 
kendisine alması demektir.  Kalıtımı yapan sınıfa alt sınıf, kendisinden 
kalıtım yapılan sınıfa ata sınıf dersek, ata sınıfta tanımlı olan ve private
işaretlenmemiş olan her şeyin alt sınıf için de tanımlı olduğunu 
söyleyebiliriz. Buda bir şeyleri daha genel katagoride ayırmamıza 
ve bu sayede kod tekrarından kurtulmamızı sağlar.

**(Ata sınıfın diğer adları:Base class,Super class)**

**Unutmayın javada her class sadece 1 tane base class'a 
sahip olabilir. Ama sahip olduğu base class'ında base class'ları
olabilir.**

Eğer bir A sınıfın B sınıfından kalıtım yapması isteniyorsa, aşağıda ki şekilde tanımlanır.
```java
public class A extends B {
     // 
}
```

Diğer bir örnek ile:
```java
public class Car{
    public void printCarName(String carName){
        System.out.println(carName);
    }
}
public class Bmw extends Car{
    private int productionYear;
    public Car(int productionYear){
        this.productionYear=productionYear;
    }
    public void printProductionYear(){
        System.out.println(productionYear);
    }
}
```
Gördüğünüz üzere Bmw sınıfı Car sınıfını **extends** keywordü
ile base sınıfıı olarak tanımlıyor. Bmw sınıfının içerisi boş olmasına
rağmen **printCarName** isimli fonksiyona bmw sınıfı üzerinden erişebiliyoruz.
```java
    Bmw bmw = new Bwm(2018);
    bmw.printCarName("Bmw tarafından çağırıldı.");
```
Kalıtımın bize getirdiği bir güzel özellik ise alt sınıf 
aynı zamanda üst sınıfta olabilir. Bu sayede yukarıdaki
örneğimiz üzerinden bahsedicek olursak Bmw sınıfını (unutmayın 
artık buda bir veri türü), aynı zamanda Car türündedir.
O zaman ben Bmw yi new'lerken aşağıdaki şekilde de kullanabilirim.
```java
Car bmw=new Bmw(2018);
```
Hatırlar iseniz bir değişken tanımını aşağıdaki şekilde yapıyorduk:
```java
veri_turu degisken_adi=deger;
```
Burada Bmw de bir Car türü olduğundan yukarıdaki gibi bir
değişkende tutabiliriz. Buda bize bir fonksiyonumuz Car türünde
bir değişken istediğinde bizim **bmw** değişkeninide ona 
gönderebiliceğimiz anlamına geliyor.Ama burada şöyle bir 
fark var! Eğer ki bir fonksiyonda parametre olarak Bmw sınıfını
değilde Car sınıfı türünde bir değişken ister isek, o fonksionda
sadece Car sınıfı içinde tanımlanmış özellikleri kullanabiliriz.
Bmw için tanımladığımız diğer özellikleri kullanamayız.
```java
public static void printCar(Car car){
    car.printCarName("Fonksiyon içinden çağırıldı.");
    //Burada car.printProductionYear diyemeyiz 
}
public static void main(String[] args){
    Bmw bmw=new Bmw(2018); // yada Car bmw=new Bmw(2018)
    printCar(bmw);
}
```
## Kalitimda Constructor Zinciri ve Super Anahtar Sozcugu
Bir class'a ait bir nesne oluşturulurken ilk olarak o class'ın 
constructer'ının çalıştığını biliyoruz. Bir class'ı oluşturmaya
çalışırken önce o class'ın var ise base class'ı oluşturulur. Haliyle
en üst class'ın constructer'ı ilk olarak çalışır. Bu durumda da o constructer
eğerki bir değer istiyor ise (parametreli ise), bizim üst class'ların
constructer'ına o paremetreleri iletmemiz gerekiyor. Burada da 
devreye **super** keyword'ü karşımıza çıkıyor. Super keyword'ünü
bir üst sınıfın temsili olarak düşünebiliriz. Kısaca bu
anahtar kelime, üst sınıfın constructer'ını çağırmak ve
üst sınıfın değişkenlerine ve metotlarına erişmek için
kullanılır.

```java
super();
/*Buradaki parantez bir üst sınıfın constructer'ına veri
 * göndermemizi sağlar.
 */
super.fonk_name_or_field_name;
/*
 * Bu sayede ise üst sınıfın değişkenine yada fonksiyonuna
 * direkt olarak ulaşabiliriz.
 * */
```
Hadi gelin bunu basitçe örnek ile gösterelim:
```java
public class Car{
    private String carName;
    public Car(String carName){
        this.carName=carName;//carName in şimdilik getter ve setter methodlarını yazmayacağız.
        System.out.println("Car class'ının constructer'ı çalıştı.");
    }
    public void printCarName(){
        System.out.println(carName);
    }
}
public class Bmw extends Car{ 
    public Bmw(){
        super("Bmw");
        System.out.println("Bmw class'ının constructer'ı çalıştı.");
    }
}
```
Şimdi Main class'ımızda aşağıdaki kodu çalıştırırsak:
```java
Bmw bmw=new Bmw();
```
Ekranda gördüğümüz çıktı aşağıdaki gibi olucaktır:
```
Car class'ının constructer'ı çalıştı.
Bmw class'ının constructer'ı çalıştı.
```

Kalıtım konusuna basit bir örnek daha yapıp sıradaki konuya geçelim.
Bu örneğimizde içeriğimizi biraz daha değiştirelim. Gerçek hayatta
kullandığımız gibi bir product class'ımız olsun ve bu class'ı miras alan
iki adet kategorik class'ımız daha olsun.
```java
public class Product{
    private String name; // Her ürünün bir name ve fiyat bilgisi olur
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Product name: " + name);
        System.out.println("Product Price: " + price + " TL");
    }
}
public class Book extends Product {
    private String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public void printAuthor() {
        System.out.println("Author: " + author);
    }
}
public class Electronics extends Product {
    private String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public void printBrand() {
        System.out.println("Brand: " + brand);
    }
}
```
Main class'ta:
```java
Book book = new Book("Java Programlama", 49.99, "John Doe");
Electronics electronic = new Electronics("Akıllı Telefon", 12299.99, "Samsung");

book.displayInfo();
book.printAuthor();

electronic.displayInfo();
electronic.printBrand();
```
Bu örnekte de gördüğümüz gibi ortak olan özellikleri genel bir
class'ta topladık. Bu sayede aynı şeyleri tekrar tekrar yazmamış
olduk.
# Polymorphism (Cok Bicimlilik)
OOP'nin temel prensiplerinden biri olan polimorfizm, farklı 
veri türlerini ve class'ları farklı şekilde işleme yeteneğini ifade eder. 

Polimorfizm, alt sınıfların, temel (base) sınıflardaki 
metotları geçersiz kılma (method overriding) sayesinde 
farklı biçimlerde davranabilmesini sağlar. Bu sayede 
alt sınıflar, temel sınıfın davranışını kendi 
ihtiyaçlarına göre uyarlayabilirler. 

**Metotlarda "Geçersiz Kılma" (Method Overriding):** 
Bu, bir alt sınıf içinde, doğrudan veya dolaylı olarak 
temel (base) sınıflardan gelen bir veya daha fazla 
metodu aynı adı ve aynı parametre listesi ile yeniden 
uygulama sürecini ifade eder.

Kullanım örneği:
```java
public class Vehicle {
    public void accelerate() {
        System.out.println("Araç hızlanıyor.");
    }

    public void brake() {
        System.out.println("Araç fren yapıyor.");
    }
}

public class Car extends Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Otomobil hızlanıyor.");
        /*
         * base classın accelerate fonksiyonu yerine 
         * sınıfımıza özel bir fonksiyon yazdık.
         * */
    }
}

public class Motorcycle extends Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Motosiklet hızlanıyor.");
    }

    @Override
    public void brake() {
        System.out.println("Motosiklet fren yapıyor.");
    }
}
```
```java
Vehicle arac1 = new Car();
Vehicle arac2 = new Motorcycle();

arac1.accelerate(); // "Otomobil hızlanıyor."
arac2.accelerate(); // "Motosiklet hızlanıyor."
arac1.brake();      // "Araç fren yapıyor."
arac2.brake();      // "Motosiklet fren yapıyor."
```

# Overloading (Asiri Yukleme)
Java'da "overloading" (aşırı yükleme), aynı isme sahip fakat farklı 
parametre listeleriyle tanımlanmış birden fazla fonksiyonun veya metodun 
aynı sınıf içinde bulunmasına denir. Overloading, metotların daha okunaklı 
ve anlaşılabilir hale gelmesini sağlar ve aynı ismi taşıyan farklı işlevlere 
sahip metotların kullanılmasını kolaylaştırır.

Yukarıda yaptığımız product yapısını ele alıcak olursak örneğimiz:
```java
public class Product{
    private String name; 
    private double price;
    public Product(){
        name="Product";
        price=5000;
        /* Burada parametreli ve parametresiz aynı isimde iki fonksiyomuz
        * (constructor'ımız) var. Bu sayede ben bir product oluştururken
        * parametre göndermez isem bu fonksiyon çalışır
        */
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Product name: " + name);
        System.out.println("Product Price: " + price + " TL");
    }
}
public class Book extends Product {
    private String author;
    public Book(){
        super();//parametresiz olanını kullandık
        author="Default author";
    }
    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public void printAuthor() {
        System.out.println("Author: " + author);
    }
}
public class Electronics extends Product {
    private String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public void printBrand() {
        System.out.println("Brand: " + brand);
    }
}
```
```java
Book book = new Book();
Electronics electronic = new Electronics("Akıllı Telefon", 12299.99, "Samsung");
book.displayInfo();
book.printAuthor();
electronic.displayInfo();
electronic.printBrand();
```
Başka bir örnek ise:
```java
public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
    public double sum(double a, double b) {
        return a + b;
    }
    public int sum(int a, int b, int c) {
        return a + b + c;
    }
}
```
```java
Calculator cal = new Calculator();
int result=cal.sum(5,10); //iki adet int verdiğimizden caldaki 1. fonk çalışır
double result2=cal.sum(5.8,45.9); //parametreleri double olan fonk çalışır
int result3=cal.sum(5,9,7); //3 parametreli fonk çalışır
```
# Sinif Odevi 1
Bir önceki örnekte oluşturulan Book ve Electronics sınıflarının toString() fonksiyonlarını **override**
ediniz.
# Sinif Odevi 2
Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız. Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır.

### Sınıfın Nitelikleri

- name : Çalışanın adı ve soyadı
- salary : Çalışanın maaşı
- workHours : Haftalık çalışma saati
- hireYear : İşe başlangıç yılı

### Sınıfın Metotları

- Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
- tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
- Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
- Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.(Ham maaşına)
- bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
- raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2023 olarak alın.
- Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
- Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
- Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
- toString() : Çalışana ait bilgileri ekrana bastıracaktır.

### Ekran Çıktısı
```java
Adı : kemal
Maaşı : 2000.0
Çalışma Saati : 45
Başlangıç Yılı : 1987
Vergi : 60.0
Bonus : 150.0
Maaş Artışı : 300.0
Vergi ve Bonuslar ile birlikte maaş : 2090.0
Toplam Maaş : 2390.0
```

# Odev
**Araç Sınıfı Oluşturma:**
- Bir "Araç" sınıfı oluşturun. Bu sınıfın aşağıdaki özellikleri içermesi gerekiyor:
  - String türünde "marka" özelliği (örneğin, "Bmw", "Toyota" gibi).
  - int türünde "modelYili" özelliği (örneğin, 2020, 2022 gibi).
  - Bir "Araç" sınıfına ait bir "tanit" metodu, bu metodun görevi, aracın markası ve model yılı hakkında bilgi vermek olmalıdır.

**Otomobil ve Motorsiklet Sınıflarının Oluşturulması**
  - Bir "Otomobil" sınıfı oluşturun ve bu sınıfı "Araç" sınıfından kalıtım alacak şekilde tanımlayın. Otomobil sınıfı, ayrıca aşağıdaki özelliklere sahip olmalıdır:
    - String türünde "kasaTipi" özelliği (örneğin, "Sedan", "SUV" gibi).
    - "Otomobil" sınıfına ait bir "tanit" metodu, bu metodun görevi, otomobilin markası, model yılı ve kasa tipi hakkında bilgi vermek olmalıdır. Bu metod, üst sınıftan (Araç sınıfından) miras alınan "tanit" metodu ile geçersiz kılınmalıdır.

**Bir "Motorsiklet" sınıfı oluşturun**
- Bu sınıfı "Araç" sınıfından kalıtım alacak şekilde tanımlayın. Motorsiklet sınıfı, ayrıca aşağıdaki özelliklere sahip olmalıdır:
  - int türünde "tekerlekSayisi" özelliği (örneğin, 2, 3 gibi).
  - Bir "Motorsiklet" sınıfına ait bir "tanit" metodu, bu metodun görevi, motorsikletin markası, model yılı ve tekerlek sayısı hakkında bilgi vermek olmalıdır. Bu metod, üst sınıftan (Araç sınıfından) miras alınan "tanit" metodu ile geçersiz kılınmalıdır.

**Main Sınıfı Oluşturma**
  - Bir "Main" sınıfı oluşturun ve bu sınıfta aşağıdaki işlemleri yapın:
  - Bir otomobil nesnesi ve bir motorsiklet nesnesi oluşturun ve bu nesnelerin markası, model yılı ve kasa tipi/tekerlek sayısı bilgilerini ayarlayın.

**Kalıtım ve Polimorfizm Kullanma**
- Bu nesneleri "Araç" türünde referans değişkenlerle saklayın. Bu, polymorphism örneği sağlayacaktır.

- Bu referans değişkenlerini kullanarak her iki nesneyi de "tanit" metoduyla çağırın ve sonuçları yazdırın. Ayrıca, bu nesneleri bir "Araç" dizisinde saklayın.

- Bir static bir metod oluşturun ve bu metoda bir "Araç" türünde bir dizi (array) gönderin. Bu metot, dizideki tüm araçları "tanit" metoduyla çağırsın.

- Oluşturduğunuz otomobil ve motorsiklet nesnelerini bu metoda gönderin ve sonuçları yazdırın. sıl çalıştığını göstermelidir.