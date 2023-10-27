public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello Paü GYT");
        System.out.println("Hello Paü GYT2");
        System.out.println("Hello Paü GYT3");
        //dslşfsdmşlf kdsfşl s
        short degisken=55;
        double degisken2=55.5;
        String degisken3="Merhaba GYT!";
        char degisken4='s';
        System.out.println(degisken);
        System.out.println(degisken2);
        System.out.println(degisken3);
        System.out.println(degisken4);
        degisken4='s';
        degisken2=60.5;
        */
        /*int a = 10;
        int b = 20;

        int toplam = a + b;
        System.out.println("Toplam : " + toplam);
        int fark = b - a;
        System.out.println("Fark : " + fark);
        int carpim = a * b;
        System.out.println("Çarpım : " + carpim);
        int bolum = b / a;
        System.out.println("Bolüm : " + bolum);
        int mod = b % a;
        System.out.println("Kalan : " + mod);

        int a1=5;
        int b1=10;

        boolean esitmi=a1==b1;
        boolean buyukmu=a1>b1;
        boolean kucukmu=a1<b1;
        boolean  buyukesitmi=a1>=b1;
        boolean kucukesittir=a1<=b1;
        boolean esitdegilmi=a1!=b1;
        System.out.println(a1==b1);

        int a2=((5+8)+9-10)/89*8;

*/
       /* System.out.println("Metin");
        String de="Paragraf 1\n\tParagraf 2";
        System.out.println(de);
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Stringin uzunluğu: " + txt.length()); // Output:26
        String deneme="Merhaba Pau";
        System.out.println(deneme.toUpperCase());
        System.out.println(deneme.toLowerCase());*/
        /*String txt = "Bu bir örnek metindir. Bu metin içinde arama yapacağız.";
        System.out.println(txt.indexOf("pau"));
        System.out.println("d".equals("d"));
        double o=58.9898;
        int o2=(int)o;//manual
        double b=o2;//otomatik*/
        int not=105;

        if(not>90 && not<=100){
            System.out.println("Ders Notu:AA");
        }
        else if(not>80 && not<=90){
            System.out.println("Ders Notu:BA");
        }
        else if(not>75&& not<=80){
            System.out.println("Ders Notu:BB");
        }
        else if(not>70 && not<=75){
            System.out.println("Ders Notu:CB");
        }
        else if(not > 60 && not<=70){
            System.out.println("Ders Notu:CC");
        }
        else if(not >=50 && not<=60){
            System.out.println("Ders Notu:D1");
        }
        else if(not>=0 && not<50){
            System.out.println("Ders Notu:FF");
        }
        else{
            System.out.println("Sınırların dışarısında bir not girildi");
        }

    }
}