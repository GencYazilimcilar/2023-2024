![](assets/banner.png)
# Hafta 1
## İçindekiler
- [Java Için Kurulumlar](#java-için-kurulumlar)
- [Yazılım Nedir?](#yazılım-nedir)
- [Java Nedir?](#java-nedir)
  - [Java Nasıl Çalışır?](#java-nasıl-çalışır)
    - [Derleme Aşaması](#derleme-aşaması)
    - [Yürütme Aşaması](#yürütme-aşaması)
    - [Java'nın Platform Bağımsızlığı](#javanın-platform-bağımsızlığı)
    - [Java'nın Yüksek Verimliliği](#javanın-yüksek-verimliliği)
    - [Java'nın Çok İşlevliliği](#javanın-çok-i̇şlevliliği)
  - [Javanın Avantajları ve Dezavantajları](#javanın-avantajları-ve-dezavantajları)
- [İlk Java programı](#i̇lk-java-programı)
- [Veri Tipleri](#veri-tipleri)
- [Değişkenler](#değişkenler)
  - [Değişkenleri Ekrana Yazma](#değişkenleri-ekrana-yazma)
  - [Değişken Tanımlama Kuralları](#değişken-tanımlama-kuralları)
- [Operatorler](#operatorler)
  - [Aritmetik Operatörler](#aritmetik-operatörler)
  - [Atama Operatörleri](#atama-operatörleri)
  - [Ilişkisel Operatörler](#ilişkisel-operatörler)
  - [Diğer Operatörler](#diğer-operatörler)
- [Strings](#strings)
  - [String Length](#string-length)
  - [String UpperCase ve LoverCase](#string-upperCase-ve-loverCase)
  - [String Bir Karakter Veya Kelime Bulma](#string-bir-karakter-veya-kelime-bulma)
  - [String Concatenation](#string-concatenation)
  - [String Substring](#string-substring)
  - [String Karşılaştırma](#string-karşılaştırma)
  - [String Trim](#string-trim)
- [Javada Tip Dönüşümü](#javada-tip-dönüşümü)
## Java Için Kurulumlar
- Intellij Idea indirme: https://www.jetbrains.com/idea/download (30 gün ücretsiz/üyelik oluşturup öğrenci belgenizi gönderirseniz tamamen ücretsiz olucaktır)
- Intellij Idea kurulumunu yaptıktan sonra, Intellij Idea'yı açıp
new project seçeneğinden sonra aşağıdaki adımları izleyiniz:
![](assets/IntellijIdeaInstallJdk.png)
![](assets/IntellijIdeaInstallJdk-2.png)
- İndirmeyi yaptıktan sonra artık Java yazmaya hazırsınız.
## Yazılım Nedir?
Yazılım, bilgisayarların ve diğer elektronik cihazların çalışmasını sağlayan programların ve verilerin tümüdür. Yazılım, bilgisayar donanımının nasıl kullanılacağını ve belirli görevleri nasıl yerine getireceğini belirler.
## Java Nedir?
Java, Sun Microsystems tarafından geliştirilen ve 1995 yılında piyasaya sürülen bir programlama dilidir. Java, nesne yönelimli, platform bağımsız, yüksek verimli, çok işlevli, yüksek seviye, hem yorumlanan hem de derlenen bir dildir.
### Java Nasıl Çalışır?
Java, aşağıdaki iki aşamada çalışır:

- Derleme: Java kodları, javac derleyicisi tarafından derlenir. Derleme işlemi, Java kodlarını makine koduna dönüştürür.
- Yürütme: Derlenmiş Java kodu, Java sanal makinesi (JVM) tarafından çalıştırılır. JVM, platform bağımsız bir ortamdır. Bu, Java kodlarının herhangi bir platformda çalışabileceği anlamına gelir.

#### Derleme Aşaması
Java kodları, javac derleyicisi tarafından derlenir. Derleme işlemi, Java kodlarını makine koduna dönüştürür. Makine kodu, bilgisayarın doğrudan anlayabileceği bir koddur.

Derleme işlemi, aşağıdaki adımları içerir:
- Kaynak kod, sözdizimsel ve anlamsal analize tabi tutulur. Bu aşamada, kaynak koddaki hatalar tespit edilir ve düzeltilir.
- Kaynak kod, makine koduna dönüştürülür. Bu aşamada, Java kodundaki değişkenler, işlevler ve ifadeler makine koduna dönüştürülür.
- Derlenmiş kod, bir `.class` dosyası olarak kaydedilir. `.class` dosyası, Java sanal makinesi tarafından çalıştırılabilir.

![Derleme Aşaması Şeması](assets/ders-1-javac-compile.jpg)

#### Yürütme Aşaması
Derlenmiş Java kodu, Java sanal makinesi (JVM) tarafından çalıştırılır. JVM, platform bağımsız bir ortamdır. Bu, Java kodlarının herhangi bir platformda çalışabileceği anlamına gelir.

JVM, derlenmiş Java kodunu aşağıdaki adımları izleyerek çalıştırır:

- JVM, `.class` dosyasını yükler. Bu aşamada, JVM derlenmiş kodu belleğe yükler.
- JVM, derlenmiş kodu yorumlar. Bu aşamada, JVM derlenmiş kodu makine koduna dönüştürür ve ardından makine kodunu çalıştırır.
- JVM, derlenmiş kodun yürütülmesini tamamlar. Bu aşamada, JVM derlenmiş kodun yürütmesini tamamlar ve ardından kodun çıktısını üretir.

![Java Nasıl Çalışır](assets/ders-1-how-to-java-works.jpg)
#### Java'nın Platform Bağımsızlığı
Java kodları, herhangi bir platformda çalışacak şekilde derlenebilir. Bu, Java kodlarının bir kez yazıldıktan sonra herhangi bir işletim sisteminde kullanılabileceği anlamına gelir.

Java'nın platform bağımsızlığı, aşağıdaki faktörlere bağlıdır:

- Java kodları, derleyici tarafından makine koduna dönüştürülür. Bu, Java kodlarının herhangi bir platformda çalışabileceği anlamına gelir.
- Java sanal makinesi (JVM), platform bağımsız bir ortamdır. Bu, JVM'nin herhangi bir platformda çalışabileceği anlamına gelir.

#### Java'nın Yüksek Verimliliği
Java, yüksek verimli bir programlama dilidir. Bu, Java programlarının genellikle diğer programlama dillerine göre daha hızlı ve verimli çalıştığı anlamına gelir.

Java'nın yüksek verimliliği, aşağıdaki faktörlere bağlıdır:

- Derleme: Java, derlenmiş bir dildir. Bu, Java kodunun Java Virtual Machine (JVM) tarafından çalıştırılmadan önce bir makine koduna dönüştürüldüğü anlamına gelir. Derleme, kodun daha hızlı yürütülmesine yardımcı olur.
- Otomatik çöp toplama: Java, otomatik çöp toplama özelliğine sahiptir. Bu, programcının bellek yönetimiyle ilgilenmesini ortadan kaldırır. Bellek yönetimi, performansı etkileyebilecek bir görevdir.
- Nesne yönelimli tasarım: Java, nesne yönelimli bir dildir. Nesne yönelimli tasarım, programları daha verimli hale getirmeye yardımcı olabilir.

#### Java'nın Çok İşlevliliği
Java, çok çeşitli uygulamalar geliştirmek için kullanılabilir. Mobil uygulamalar, web uygulamaları, oyunlar, masaüstü uygulamaları ve daha pek çok şey Java ile yazılabilir.

Java'nın çok işlevliliği, aşağıdaki faktörlere bağlıdır:

- Java, nesne yönelimli bir dildir. Bu, programların nesnelerden oluştuğu anlamına gelir. Nesneler, veri ve işlevlerden oluşan birimleri temsil eder. Bu, Java kodunun yeniden kullanılabilirliğini ve esnekliğini artırır.
- Java, platform bağımsızdır. Bu, Java kodunun herhangi bir platformda çalışabileceği anlamına gelir. Bu, Java kodunun farklı platformlar arasında taşınmasını kolaylaştırır.

### Javanın Avantajları ve Dezavantajları
**Avantajlar:**
- Platform Bağımsızlık: Java, "Write Once, Run Anywhere" (Bir kere yaz, her yerde çalıştır) ilkesine dayanır. Bu, Java'nın farklı işletim sistemlerinde ve cihazlarda çalışabilmesini sağlar. Java uygulamaları, Java Sanal Makinesi (JVM) aracılığıyla çalıştığı için platform bağımsızdır.
- Büyük Topluluk ve Kaynaklar: Java, büyük ve aktif bir geliştirici topluluğuna sahiptir. Bu, Java geliştiricilerinin sorunlarını çözmek için geniş bir kaynak havuzuna erişebilmelerini sağlar.
- Güvenlik: Java, güvenlik odaklı bir dil olarak tasarlanmıştır. JVM, uygulamaların izole bir ortamda çalışmasını sağlar ve çeşitli güvenlik önlemlerini içerir.
- Nesne Yönelimli Programlama (OOP): Java, nesne yönelimli programlamayı destekler, bu da kodun daha organize ve bakımı daha kolay olmasını sağlar.
- Geniş Kütüphane Desteği: Java, zengin bir standart kütüphane sunar, bu da geliştiricilerin çeşitli görevleri kolayca gerçekleştirmelerini sağlar.
- Yüksek Performans: Java uygulamaları, yüksek performanslı bir şekilde çalışabilen bir dil olup, çeşitli optimizasyon tekniklerini içerir.

**Dezavantajlar:**
- Daha Fazla Bellek Tüketimi: Java uygulamaları genellikle diğer dillere göre daha fazla bellek tüketir. Bu, özellikle sınırlı kaynaklara sahip cihazlarda önemli bir dezavantaj olabilir.
- Başlatma Zamanı Gecikmeleri: Java uygulamaları, JVM'nin başlatılma süreci nedeniyle daha uzun başlatma sürelerine sahip olabilir.
- Hız Sorunları: Java, bazı durumlarda C/C++ gibi dillere kıyasla daha düşük işlemci hızına sahip olabilir. Ancak modern JVM'ler ve derleyiciler bu farkı azaltmıştır.
- Doğrudan Donanım Erişimi Sorunları: Java, doğrudan donanım erişimi konusunda bazı kısıtlamalara sahiptir. Bu nedenle, düşük seviyeli işlemler gerektiren uygulamalarda dezavantajlı olabilir.
- Karmaşıklık: Java bazen gereksiz karmaşıklık yaratabilir, özellikle yeni başlayanlar için öğrenmesi ve kullanması zor olabilir.
## İlk Java programı

```java
public static void main(String[] args){
    System.out.println("Hello PAUGYT"); //System.out.println() içerisindekileri ekrana yazar
}
```
## Yorum Satırı
Yorum satırları Java derleyicisi tarafından okunmayan/işlenmeyen yazılardır. Bu da yazdığımız kodların yanlarına/üstlerine
o kod parçaları ile ilgili açıklamalar/bilgilendirmeler yazmamızı sağlar.
Java da sıklıkla kullandığımız 2 adet yorum satırı işareti vardır. Bunlar:
- //
- /* */
işaretleridir.
```java
  public static void main(String[] args){
    System.out.println("Hello PAUGYT");
    //Tek satırlık yorum satırı
    /*
      Çok satırlı
      yorum satırı
    */
  }
  ```
## Veri Tipleri
Veri tipi, bir değişkenin tutabileceği verinin türünü tanımlar. Veri tipleri, sayısal, karakter, metin ve mantıksal olmak üzere dört ana kategoriye ayrılır.

- Sayısal veri tipleri, tamsayılar, ondalık sayıları temsil eder.
  - Tamsayı veri tipleri, tamsayı değerlerini temsil eder. Örneğin, int, long, short ve byte gibi veri tipleri tamsayı veri tipleridir.
  - Ondalık veri tipleri, ondalık sayı değerlerini temsil eder. Örneğin, float ve double gibi veri tipleri ondalık veri tipleridir.
- Karakter veri tipi, tek bir karakteri temsil eder. Örneğin, char gibi veri tipi karakter veri tipidir.
- Metin veri tipi, bir veya daha fazla karakterden oluşan bir metni temsil eder. Örneğin, String gibi veri tipi metin veri tipidir.
- Mantıksal veri tipi, doğru veya yanlış değerini temsil eder. Örneğin, boolean gibi veri tipi mantıksal veri tipidir.

![Veri Tipleri ve Değişkenler](assets/variables.webp)

## Değişkenler

Değişken, bir programda saklanan bir veriyi temsil eden bir isimdir. Değişkenler, veri tipine göre farklı değerler tutabilir.
```java
public static void main(String[] args){
    byte a=1;
    short b=1;
    int x = 5; // Bir tamsayı değişkeni.
    String gyt = "Genc Yazilimcilar Toplulugu"; // Bir Metinsel değişken.
    char karakter = 'g'; // Bir karakter değişkeni.
    boolean yD = true; // Bir mantıksal veri türü değişkeni. true/false
    float kucukOndalikliSayi= 20.22 //Bir ondalıklı sayı değişkeni.  7 haneli hassasiyet sunar.
    double buyukOndalikliSayi= 20.222222222; 20.22; //Bir ondalıklı sayı değişkeni.  15 haneli hassasiyet sunar.
}
```
### Değişkenleri Ekrana Yazma
```java
public static void main(String[] args){
    int x = 5;
    String gyt = "Genc Yazilimcilar Toplulugu";
    char karakter = 'g';
    boolean yD = true;
    float kucukOndalikliSayi= 20.22
    double buyukOndalikliSayi= 20.222222222;
    System.out.println(x);
    System.out.println(gyt);
    System.out.println(yD);
    System.out.println(kucukOndalikliSayi);
    System.out.println(buyukOndalikliSayi);
}
```
### Değişken Tanımlama Kuralları
Java'da değişken tanımlarken belirli kurallara uymalısınız. İşte Java'da değişken tanımlama kuralları:
- Değişken Adı: Değişken adları harfle veya alt çizgi ( _ ) ile başlamalıdır.
Sadece ingilizce karakter **(alfabe)** kullanılmalıdır.
İlk karakter harf, alt çizgi ( _ ) olabilir veya özel karakterlerden $
kullanılabilir. Ardından harf, rakam veya alt çizgi ( _ ) kullanılabilir.
**Diğer karakterler de
  bazı yöntemler ile destekleniyor. Fakat ingilizce karakter dışındakiler önerilmez.**
Örnek geçerli değişken adları:
  - 'sayi'
  - '_yeniDegisken'
  - '$_myVariable'
  - 'musteriAdi123'
## Operatorler
### Aritmetik Operatörler

Java'da aritmetik operatörler, matematiksel işlemler yapmak için kullanılır.

Aritmetik operatörler, aşağıdakileri gerçekleştirmek için kullanılır:
- Toplama: (+)
- Çıkarma: (-)
- Çarpma: (*)
- Bölme: (/)
- Modül: (%)

```java
public static void main(String[] args){
    int a = 10;
    int b = 20;

    int toplam = a + b;
    System.out.println("Toplam :" + toplam);
    int fark = b - a;
    System.out.println("Fark :" + fark);
    int carpim = a * b;
    System.out.println("Çarpım :" + carpim);
    int bolum = b / a;
    System.out.println("Bolüm :" + bolum);
    int mod = b % a;
    System.out.println("Kalan :" + mod);
}
```
### Atama Operatörleri
Bir değişkeni başka bir değişkene atamak veya bir değişkene bir veri atamak için kullanılır.
Atama operatörleri aşağıdaki gibidir:
- Eşittir: (=)
- Artı Eşittir (+=)
- Eksi Eşittir (-=)
- Çarpı Eşittir (*=)
- Bölü Eşittir (/=)
```java
public static void main(String[] args){
    // Ve operatörü
    int a = 10;
    int b = 20;
    a+=5; // a=a+5; ile aynıdır. Sonuç: 15
    a-=b; // a=a-b; ile aynıdır. Sonuç: -5
    a*=b; // a=a*b; ile aynıdır. Sonuç: -100
    a/=b; // a=a/b; ile aynıdır. Sonuç: -5
}
```
### Mantıksal Operatörler

Java'da mantıksal operatörler, iki veya daha fazla mantıksal ifadenin değerini karşılaştırmak için kullanılır.

Mantıksal operatörler, aşağıdakileri gerçekleştirmek için kullanılır:
- Ve: (&&)
- Veya: (||)
- Değil: (!)

![](assets/truth-table.png)
```java
public static void main(String[] args){
    // Ve operatörü
    int a = 10;
    int b = 20;
    boolean esitMi = (a == b);
    System.out.println(esitMi); // false
    // Veya operatörü
    int a = 10;
    int b = 20;
    boolean esitMi = (a == b);
    boolean buyukMu = (a > 10);
    boolean veya = esitMi || buyukMu;
    System.out.println(veya); // true
    // Değil operatörü
    int a = 10;
    boolean esitMi = (a == 10);
    boolean degil = !esitMi;
    System.out.println(değil); // false
}
```

### Ilişkisel Operatörler
Java'da karşılaştırma operatörleri, iki değeri karşılaştırmak için kullanılır.

Bu operatörler
- Eşittir (==)
- Eşit değildir (!=)
- Büyüktür (>)
- Küçüktür (<)
- Büyük Eşittir (>=)
- Küçük eşittir (<=)

```java
public static void main(String[] args){
    // Eşittir operatörü
    int a = 10;
    int b = 10;
    boolean esitMi = (a == b);
    System.out.println(esitMi); // true
    // Eşit değildir operatörü
    int a = 10;
    int b = 20;
    boolean esitMi = (a != b);
    System.out.println(esitMi); // true
    // Büyüktür operatörü
    int a = 10;
    int b = 20;
    boolean buyukMu = (a > b);
    System.out.println(buyukMu); // false
    // Küçüktür operatörü
    int a = 10;
    int b = 20;
    boolean kucukMu = (a < b);
    System.out.println(kucukMu); // true
    // Büyük eşittir operatörü
    int a = 10;
    int b = 20;
    boolean buyukEsittir = (a >= b);
    System.out.println(buyukEsittir); // false
    // Küçük eşittir operatörü
    int a = 10;
    int b = 20;
    boolean kucukEsittir = (a <= b);
    System.out.println(kucukEsittir); // true
}
```


### Diğer Operatörler
Java'da aritmetik ve mantıksal operatörlerin yanı sıra, aşağıdaki gibi diğer operatörler de bulunur:

- Bitsel operatörler: Sayıların bitlerini manipüle etmek için kullanılır.
- Koşul operatörleri: Koşulları kontrol etmek için kullanılır.
- Yazdırma operatörleri: Ekran çıktısı üretmek için kullanılır.
- Diğer operatörler: Java dilinde kullanılan diğer operatörler.

## Kaçış Karakterleri
Kaçış karakterleri Javada bir string hazırlarken kullandığımız bazı
elemanlardır. Bunlar:
```
\b --> Önceki karakteri silmeye yarar
\t --> Tab
\r --> Satır başı yapar
\n --> Satır atlar
\" --> Çift tırnak
\’ --> Tek tırnak
\\ --> Backslash
```
Bildiğiniz üzere Javada bir string hazırlarken çift tırnaklar
arasında("") stringimizi yazıyoruz. Fakat bu stringin içerisinde
çift tırnak kullanmak istersek yada yazdığımız metinde bir yerde
alt satıra inmek istersek vb. durumlarda bunları kaçış karakterleri
olmadan yapamayız.

**Örnek kullanımlar:**
```java
public static void main(String[] args){
  String tab="Bir tab\tboşluklu.";
  String altSatir="Uzun bir metin.\nAlt satırdayız artık.";
  String ciftTirnak="Cift tirnak:\"";
  System.out.println(tab);
  System.out.println("**************");
  System.out.println(altSatir);
  System.out.println("**************");
  System.out.println(ciftTirnak);
}
```
## Strings
Bu başlık altında Javadaki string'ler için hazır bazı özellikleri
inceleyeceğiz.

### String Length
Bir stringin uzunluğunu bulmamıza yarar.
```java
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("Stringin uzunluğu: " + txt.length()); // Output:26
```
### String UpperCase ve LowerCase
Bir stringin tamamını büyük yada küçük harfe çevirmemize yarar.
```java
String txt = "Merhaba PAU GYT";
System.out.println(txt.toUpperCase());   // Output:"MERHABA PAU GYT"
System.out.println(txt.toLowerCase());   // Output:"merhaba pau gyt"
```
### String Bir Karakter Veya Kelime Bulma
Bir string'te bir karakteri bulmamıza yarayan fonksiyon:
```java
String txt = "Bu bir örnek metindir. Bu metin içinde arama yapacağız.";
String search="metin";
System.out.println(txt.indexOf(search));// Output:13
System.out.println(txt.indexOf("p")); // Output:47
System.out.println(txt.indexOf("pau"));// Output:-1 kelimeyi bulamaz ise -1 sonucu verir
```
### String Concatenation
Bir string'i birleştirme işlemi yapamızı sağlar.
```java
String firstString = "PAU";
String secondString = "GYT";
System.out.println(firstString + " " + secondString); // Output:PAU GYT
System.out.println(firstString.concat(secondString)); // Output:PAUGYT
```
### String Substring
Bir stringin içerisinden daha küçük bir string alma işlemidir.
```java
String myString="Merhaba PAU GYT";
String sub=myString.substring(0,7); //Burada 0 dahil 7 dahil değildir
System.out.println(sub); // Outpus:Merhaba
```
### String Karşılaştırma
```java
String myString = "Merhaba Pau Gyt";
System.out.println(myString.equals("merhaba PAU GYT")); // Output:false çünkü java büyük küçük harfe duyarlıdır.
System.out.println(myString.equalsIgnoreCase("merhaba pau gyt")); // Output:true çünkü equalsIgnoreCase ifadesi büyük/küçük harf duyarsızdır.
```
### String Trim
Trim ifadesi bir stringteki boşlukları silmemize yarar.
```java
String myString="   Merhaba PAU GYT    ";
System.out.println(myString);// Output:   Merhaba PAU GYT
System.out.println(myString.trim());// Output:Merhaba PAU GYT
```
**Aşağıdaki kodun çıktısı nedir?**
```
int x=10;
String y="20";
System.out.println(x+y);
```
Burada devreye tip dönüşümü dediğimiz kavram giriyor. Javada
bir veri tipini başka bir veri tipine çevirme işlemi çok
basittir. Sadece bu hususta dikkat etmemiz gereken bir önemli
nokta vardır. **Bu husus daha büyük bir veri tipini daha küçük
bir veri tipine dönüştürürsek veri kaybı yaşanabilir.**
### Javada Tip Dönüşümü
Javada tip dönüşümü bir veri türünü başka bir veri türüne dönüştürme
işlemidir. Burada iki farklı yol vardır. Bunlar:
- **Manual Cast:** Daha büyük bir veri tipinden daha küçük veri
tipine cast işlemi yapmak için değişkenin önüne parantez içerisinde
yeni veri tipini yapmaktır. Bu hususta veri kaybı yaşanabilir. Mesela
double gibi ondalıklı bir sayıyı int veri türüne cast yaparsak, ondalıklı
veri değerini kaybederiz.
- **Automatic Cast:** Küçük bir veri türünden daha büyük bir veri türüne
cast yaparken ekstra efor harcamadan bu işlemi javanın kendinisin yapmasıdır.
```java
double value = 9.78;
int intValue = (int) myDouble; // Manual casting
double myDouble = 9;
int myInt = myDouble; // Automatic casting
```
