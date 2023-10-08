# DERS-1
![](assets/banner.png)
# İçindekiler

- [DERS-1](#ders-1)
- [İçindekiler](#i̇çindekiler)
  - [Yazılım Nedir?](#yazılım-nedir)
  - [Java Nedir?](#java-nedir)
    - [Java Nasıl Çalışır?](#java-nasıl-çalışır)
      - [Derleme Aşaması](#derleme-aşaması)
      - [Yürütme Aşaması](#yürütme-aşaması)
      - [Java'nın Platform Bağımsızlığı](#javanın-platform-bağımsızlığı)
      - [Java'nın Yüksek Verimliliği](#javanın-yüksek-verimliliği)
      - [Java'nın Çok İşlevliliği](#javanın-çok-i̇şlevliliği)
    - [Java Kurulum Aşamaları](#java-kurulum-aşamaları)
  - [İlk Java programı](#i̇lk-java-programı)
  - [Veri Tipleri](#veri-tipleri)
  - [Değişkenler](#değişkenler)
  - [Operatorler](#operatorler)
    - [Aritmetik Operatörler](#aritmetik-operatörler)
    - [Mantıksal Operatörler](#mantıksal-operatörler)
    - [Karşılaştırma Operatörleri](#karşılaştırma-operatörleri)
    - [Diğer Operatörler](#diğer-operatörler)
  
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
- Derlenmiş kod, bir .class dosyası olarak kaydedilir. .class dosyası, Java sanal makinesi tarafından çalıştırılabilir.

![Derleme Aşaması Şeması](assets/ders-1-javac-compile.jpg)

#### Yürütme Aşaması
Derlenmiş Java kodu, Java sanal makinesi (JVM) tarafından çalıştırılır. JVM, platform bağımsız bir ortamdır. Bu, Java kodlarının herhangi bir platformda çalışabileceği anlamına gelir.

JVM, derlenmiş Java kodunu aşağıdaki adımları izleyerek çalıştırır:

- JVM, .class dosyasını yükler. Bu aşamada, JVM derlenmiş kodu belleğe yükler.
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

### Java Kurulum Aşamaları
- Jdk indirme:https://www.oracle.com/tr/java/technologies/downloads (Windows için x64 MSI Installer tavsiye)
- Intellij Idea indirme: https://www.jetbrains.com/idea/download (30 gün ücretsiz/üyelik oluşturup öğrenci belgenizi gönderirseniz tamamen ücretsiz olucaktır)

## İlk Java programı

```java
public static void main(String args[]){
    System.out.println("Hello PAUGYT");
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

![Veri Tipleri ve Değişkenler](assets/ders-1-variables.webp)

## Değişkenler

Değişken, bir programda saklanan bir veriyi temsil eden bir isimdir. Değişkenler, veri tipine göre farklı değerler tutabilir.
```java
public static void main(String args[]){
    int x = 5; // Bir tamsayı değişkeni.
    String gyt = "Genç Yazılımcılar Topluluğu"; // Bir Metinsel değişken.
    char karakter = 'g'; // Bir karakter değişkeni.
    boolean yD = true; // Bir mantıksal veri türü değişkeni. true/false
    double ondalıklıSayı: 20.22; //Bir ondalıklı sayı değişkeni. 
}
```

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
public static void main(String args[]){
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

### Mantıksal Operatörler

Java'da mantıksal operatörler, iki veya daha fazla mantıksal ifadenin değerini karşılaştırmak için kullanılır.

Mantıksal operatörler, aşağıdakileri gerçekleştirmek için kullanılır:
- Ve: (&&)
- Veya: (||)
- Değil: (!)

```java
public static void main(String args[]){
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

### Karşılaştırma Operatörleri
Java'da karşılaştırma operatörleri, iki değeri karşılaştırmak için kullanılır. 

Bu operatörler
- Eşittir (==) 
- Eşit değildir (!=)
- Büyüktür (>)
- Küçüktür (<)
- Büyük Eşittir (>=)
- Küçük eşittir (<=)

```java
public static void main(String args[]){
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

- Atama operatörleri: Değişkenlere değer atamak için kullanılır.
- İlişkisel operatörler: Değişkenlerin veya ifadelerin değerlerini karşılaştırmak için kullanılır.
- Bitsel operatörler: Sayıların bitlerini manipüle etmek için kullanılır.
- Koşul operatörleri: Koşulları kontrol etmek için kullanılır.
- Yazdırma operatörleri: Ekran çıktısı üretmek için kullanılır.
- Diğer operatörler: Java dilinde kullanılan diğer operatörler.