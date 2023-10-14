# Hafta 3
![](assets/banner.png)
## Fonksiyonlar

Java'da fonksiyonlar ve metotlar (methods), programınızda belirli
işlemleri düzenlemek ve tekrar kullanılabilirliği artırmak için kullanılan
temel yapı taşlarıdır. Fonksiyonlar, Java'da "metotlar" olarak adlandırılır.

Bir metotdun tanımı:
```java
    [erişim_belirleyici] [geri_dönüş_tipi] [metot_adı](parametreler) {
        // Metotun işlevi
    }
```
- erişim_belirleyici: Metodun erişim düzeyini belirtir (public, private, protected, vb.).
- geri_dönüş_tipi: Metotun geri döndüreceği değerin veri türünü belirtir (void, int, String, vb.).
  (void geriye birşey dönmeyeceğini belirtir)
- metot_adı: Metodun adını tanımlar.
- parametre_listesi: Metota giriş parametrelerini tanımlar (isteğe bağlı).

**Not: Erişim belirteçlerini ilerleyen derslerde daha detaylı anlatılıcaktır.
Şimdilik sadece public erişim belirtecini ve static keywordünü kullanınız.**

### Parametresiz void fonksiyon
```java
    public static void SayHello(){
        System.out.println("Merhaba");
    }
    public static void main(String[] args){
        SayHello(); //Fonksiyonu çağırma
        SayHello();
        SayHello();
        SayHello();
    }
```
### Parametresiz geriye bir değer döndüren fonksiyon
```java
    public static int GetValue(){
        return 10; //return keyword ü geriye bir şey döndürmek için kullanılır
    }
    public static void main(String[] args){
        int a=GetValue(); //Fonksiyonu çağırma
        System.out.println("A nın değeri: "+a);
    }
```
### Parametreli void fonksiyon
```java
    public static void Sum(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        Sum(5,12); // Parametreleri vererek çağrılır
    }
```
### Parametreli geriye bir değer döndüren fonksiyon
```java
    public static int Sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        int sum=Sum(5,12);
        System.out.println(sum);
    }
```
### Params kullanımı
Eğerki bir fonksiyonda gelen parametrelerin sayısı belli değil ise kullanılır.
```java
    public static int Sum(int... values){ // Gelen verilerin hepsi aynı tür olmalıdır.
        int sum = 0;
        for (int value : values) {
            sum+=value;
        }
        return sum;
    }
    public static void main(String[] args){
        int sum=Sum(5,12,21,83,45);
        System.out.println(sum);
    }
```