![](assets/banner.png)
# Hafta 2
# İçindekiler
- [Array](#array)
# Array
Diziler/Array, Java'da aynı türden verileri içeren veri yapılarıdır.
Bu sayede aynı türde olan birden fazla veriyi tek bir değişken
üzerinde tutabiliyoruz. Diziler sabit boyutludur, yani 
başlangıçta belirlediğiniz boyutta oluşturulur ve daha sonra 
boyutları değiştirilemez.

**Bir dizinin örnek tanımı:**
```java
veri_tipi[] degisken_name=new veri_tipi[eleman_sayisi];
```
şeklinde tanımlanır.
Burdaki tanımdan da anlaşılıcağı üzere şimdiye kadar tanımladığımız
Java programlarının başlangıç noktası olan main fonksiyonumuzda
aslında args ismine sahip bir String array parametresine sahiptir.

![](assets/TekBoyutluDiziler.png)
```java
public static void main(String[] args){
    int[] birinciSinavNotlari=new int[10]; // 10 elaman saklayabilen bir int dizisi
    birinciSinavNotlari[0]=80; // dizinin ilk elemanı
    birinciSinavNotlari[1]=65; //dizinin ikinci elemanı
    //Bu şekilde tek tek verebiliriz yada
    int[] sinavNotlari={80,65,95,45,75,65,75,10,35,30}; // Şeklinde tek seferdede tanımlayabiliriz
}
```
Dizinin elemanlarına ulaşmak için:
```java
public static void main(String[] args){
    int[] sinavNotlari={80,65,95,45,75,65,75,10,35,30};
    System.out.println("1. Eleman: "+sinavNotlari[0]); // gibi tek tek uğraşabiliriz
    for(byte i=0;i<dizi.length;i++){
        System.out.println(i+". Eleman: "+sinavNotlari[i]);
    }
    //şeklinde döngü ile yazdırabiliriz
}
```
burada sadece ekrana yazdırmak olarak düşünmeyelim. Burda veriyi
manipüle edebiliriz. Mesela 3 üncü elemandaki değeri bir fonksiyona
gönderebiliriz vb.

Burada son olarak veriye erişmek için foreach dediğimiz daha kolay
bir yöntem var. Foreach in yapısı:
```java
for(degisken_tipi degisken_ismi:Veri_dizisi){
...
}
```
```java
public static void main(String[] args){
    byte[] sinavNotlari={80,65,95,45,75,65,75,10,35,30};
    for(byte eleman:sinavNotlari){
        System.out.println(eleman);
    }
}
```
## Matrisler
Java'da matrisler, çok boyutlu diziler (arrays) olarak tanımlanır.
İki veya daha fazla boyutlu diziler kullanılarak matrisler 
oluşturulabilir.

<img src="assets/matris.jpg" alt="Resim Açıklaması" width="800" height="400">

```java
public static void main(String[] args){
    byte[] matris=new byte[2][2];//2x2 lik bir matris
    matris[0][0] = 1;
    matris[0][1] = 2;
    matris[1][0] = 3;
    matris[1][1] = 4;
    for(byte i=0;i<2;i++){
        for(byte k=0;k<2;k++){
            System.out.print(matris[i][k]+" ");
        }
        System.out.println();
    }
}
```
Bu kodun çıktısı:
```
1 2
3 4
```