![](assets/banner.png)
# Hafta 2
# İçindekiler
- [Koşullu İfadeler](#kosullu-ifadeler)
  - [if/else if/else](#ifelse-ifelse)
  - [Switch-case](#switch-case)
  - [Ternary Operatör](#ternary-operator)
- [Döngüler](#donguler)
  - [For](#for)
  - [While](#while)
  - [Do While](#do-while)
  - [Continue ve Break](#continue-ve-break)
- [Fonksiyonlar](#fonksiyonlar)
  - [Parametresiz void fonksiyon](#parametresiz-void-fonksiyon)
  - [Parametresiz geriye bir değer döndüren fonksiyon](#parametresiz-geriye-bir-deger-donduren-fonksiyon)
  - [Parametreli void fonksiyon](#parametreli-void-fonksiyon)
  - [Parametreli geriye bir değer döndüren fonksiyon](#parametreli-geriye-bir-deger-donduren-fonksiyon)
  - [Params kullanımı](#params-kullanimi)
- [Sınıf Ödevi](#sinif-odevi)
- [Ödev](#odev)
## Kosullu Ifadeler
Java'da koşullu ifadeler, belirli bir koşulu kontrol ederek program akışınızı yönlendirmenizi sağlar.
Javada kullanılan koşullu ifadeler:
- İf - else if - else yapısı
- Switch-case
- Ternary (Üçlü) Operatör
### if/else if/else
```java
public static void main(String[] args){
    if(koşul){ //koşul doğru ise girer
        //İşlemler
    }
    else{
        //if koşuluna girmez ise buraya girer
        //İşlemler
    }
}
```
```java
public static void main(String[] args){
    if(koşul){ //koşul doğru ise girer
        //işlemler
    }
    else if(2. koşul){ //if de ki koşul sağlanmaz ise burası kontrol edilir
        //işlemler
    }
    else if(3. koşul){
        //işlemler
    }
    ...
    else if(n. koşul){
        //işlemler
    }
    else{
        //if koşuluna girmez ise buraya girer
        //İşlemler
    }
}
```
Yukarıda da görülüceği üzere else if yapısı birden fazla kez kullanılabilir.
```java
public static void main(String[] args){
    int a=10;
    if(a>15){
        System.out.println("A 15 den büyük");
    }
    else if(a>=10){ //if de ki koşul sağlanmaz ise burası kontrol edilir
        System.out.println("A 10 dan büyük veya eşit");
    }
    else{
        System.out.println("A 10 dan küçük");
    }
}
```
### Switch-case
```java
public static void main(String[] args){
    int a=10;
    switch(a){ //değeri switch e verirsin
        case 5: // a 5 e eşitse girer
            System.out.println("A == 5");
            break; // case i bitirir.
        case 10:// a 10 a eşitse girer
            System.out.println("A == 10");
            break; // case i bitirir. case ler istenildiği kadar yazılabilir.
        default: // yukarıdaki hiçbir case e girmez ise burası çalışır.
            System.out.println("A hiçbir case de doğrulanmadı.");
    }
}
```
### Ternary Operator
```java
public static void main(String[] args){
    String sonuc = (koşul) ? "Koşul doğru" : "Koşul yanlış";
}
```

```java
public static void main(String[] args){
    int a=10;
    String sonuc = (sayi < 10) ? "Sayı 10'dan küçüktür" : "Sayı 10'dan büyük yada eşittir.";
    System.out.println(sonuc);
}
```
## Döngüler
Java'da döngüler, belirli bir işlemi veya işlemleri tekrarlamak için kullanılır.
- for
- while
- do-while
### For
```java
public static void main(String[] args){
    for (değişken;koşul;değişkenin değerini değiştirme) { // koşul true oldukça döngü çalışır
        System.out.println("Döngü çalıştı");
    }
}
```

```java
    public static void main(String[] args){
        for (int i = 0; i < 5; i++) {
            System.out.println("Paü GYT - İterasyon " + i);
        }
    }
```
### While
```java
public static void main(String[] args){
   while(koşul){ // koşul true olduğu sürece döngü çalışır
    // işlemler
   }
}
```

```java
    public static void main(String[] args){
        int i=0;
        while(i<10){
            System.out.println("Paü GYT - İterasyon " + i);
            i++;
        }
    }
```
### Do-While
Bu döngü türünün diğer ikisinden farkı; diğer döngü türlerinde önce koşul
kontrol edilirken bu döngü türünde önce işlemler yapılır sonra koşul
kontrol edilir.
```java
public static void main(String[] args){
    do {
        // işlemler
    } while (koşul);
}
```

```java
    public static void main(String[] args){
       int i = 0;
        do {
            System.out.println("Paü GYT - İterasyon " + i);
            i++;
        } while (i < 5);
    }
```
### Continue ve Break
- continue: Bu keyword o anki iterasyonu atlatmaya yarar. Yani bir döngümüz
olsun ve biz bu döngüde belirli koşullar sağlandığında işlem yapmak istemeyelim.
Bu durumda continue anahtar kelimesini kullanmamız gerekmektedir.
```java
    public static void main(String[] args){
        int i=0;
        while(i<10){
            if(i%2==0){
                i++;
                continue;
                /* Bu kod çalıştığında  aşağıdaki kodlar çalışmayacaktır
                    ve tekrardan while de ki koşul kontrol edilicektir.
                */
            }
            System.out.println("Paü GYT - İterasyon " + i);
            i++;
        }
    }
```
- break: Bu keyword o anki döngüyü kırmaya yarar. Yani belirli bir durumda
döngümüzü sonlandırmak istersek bu keywordü kullanabiliriz.
```java
    public static void main(String[] args){
        int i=0;
        while(i<10){
            if(i%2==0){
                break;
            }
            System.out.println("Paü GYT - İterasyon " + i);
            i++;
        }
    }
```
## Fonksiyonlar

Java'da fonksiyonlar ve metotlar (methods), programınızda belirli
işlemleri düzenlemek ve tekrar kullanılabilirliği artırmak için kullanılan
temel yapı taşlarıdır. Fonksiyonlar, Java'da "metotlar" olarak adlandırılır.

Bir metotdun tanımı:
```java
    [erişim_belirleyici] [geri_dönüş_tipi] [metot_adı](parametre_listesi) {
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
### Parametresiz geriye bir deger donduren fonksiyon
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
### Parametreli geriye bir deger donduren fonksiyon
```java
    public static int Sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        int sum=Sum(5,12);
        System.out.println(sum);
    }
```
### Params kullanimi
Eğerki bir fonksiyonda gelen parametrelerin sayısı belli değil ise kullanılır.
Bu sayede fonksiyona gelicek olan aynı türden veriler için
sürekli bir değişken belirtmemize gerk kalmaz.
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
## Sinif Odevi
### Sinif Odevi 1
- 1-10000 arasında kaç tane asal sayısı olduğunu bulan java kodunu yazınız.
### Sinif Odevi 2
Palindrom, tersten okunuşu da aynı olan cümle, sözcük ve sayılara denilmektedir.
Örn:
- 1001
- 12321
- ada
- ata
vb. gibi baştan sona ve sondan başa okunuşu/yazılışı aynı olan ifadelere denir.

**Ödev:**
- Palindromik sayiları: Bir sayının palindromik olup olmadığını true yada false ile bize bildiren
fonksiyonu yazın.
- Palindromik kelimeler: Bir stringin ifadenin olup palindromik olmadığını true yada false ile 
bize bildiren fonksiyonu yazın.

## Odev
**Mersenne Asalları**

**p** bir asal sayı olmak üzere 2<sup>p</sup>-1 şeklinde yazılabilen asal sayılara verilen isimdir. 
Bir diğer deyişle Mersenne asalları, m=2<sup>p</sup>-1 olarak ifade edilebilen asallardır (yani 
hem m hem p birer asal sayıdır). Bu yöntemle elde edilebilen ilk birkaç Mersenne asalı için 
p asalı 2, 3, 5, 7, 13, 17, 19, 31, 61 ve 89'dur.

Mersenne asallarını kullanarak yeni mükemmel sayıları
bulabiliriz. İlk asal sayımıza **asal_sayi**, 2<sup>asal_sayi</sup>-1 dan elde ettiğimiz asal sayıyada 
**asal_sayi2** dersek:
- Formül:(2<sup>asal_sayi-1</sup>)*(asal_sayi2)

Bu formül ile elde ettiğimiz sayı mükemmel sayı olmalıdır.

Ödeviniz **Mersenne Asallarını** kullanarak mükemmel sayılar bulmak.

Ödevde ihtiyacınız olan yapılar:
- Bir sayının asal olup olmadığını bulup true/false döndüren bir fonksiyon.
- Mersenne asallarını bulup, bize bunlar ile mükemmel sayı üreticek bir fonksiyon.
**(Bu fonksiyonda 2 den başlayıp 50 de biten bir döngü kullanmanızı tavsiye ediyorum.
Mersenne asallarını fonksiyon sürekli bulup, ekrana bu asallar ile üretilmiş mükemmel sayıları yazın.)**
