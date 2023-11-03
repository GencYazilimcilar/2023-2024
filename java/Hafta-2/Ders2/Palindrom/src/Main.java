public class Main {
    public static boolean isPalindromeForString(String text){
        byte textCount=(byte) (text.length()-1);//length saymaya 1 den başlarken indexlemeler 0 dan başlar bu yüzden 1 eksini aldık
        String originalString=text;//Eğerki büyük küçük harf hassasiyeti istemiyorsanız originalString=text.toUpperCase();
        String reversedString="";
        while (textCount>=0){
            char character=originalString.charAt(textCount);
            originalString=originalString.substring(0,textCount);
            //0 ıncı indexten başlayıp son indexe kadar(son index dahil değil) olan kısımdan yeni bir string oluşturmuş olduk
            textCount--;//stringimizin boyutu 1 küçülmüş olduğundan countumuzu 1 azalttık
            reversedString+=character;//ters stringimize elde ettiğimiz karakteri ekledik
        }
        return reversedString.equals(text);//equalls '==' tir görevi görüyordu
    }
    public static boolean isPalindromeForNumber(int number){
        int originalNumber=number;
        boolean control=true;
        int reversedNumber=0;
        while (originalNumber>0){
            byte digit= (byte) (originalNumber%10); //son basamağını almış olduk
            originalNumber/=10;//sayı 10 a bölerek son basamağını çıkartmış olduk
            reversedNumber*=10;//Burda yeni sayımızı 10 ile çarpmamızın nedeni yeni bir basamak oluşturmak sağ taraftan
            reversedNumber=reversedNumber+digit;//burdada oluşturduğumuz yeni basamağı fonksiyonumuza gelen sayının sondaki basamağını koyduk
        }
        return number==reversedNumber;/*unutmayın şuanda orjinalNumber değişkeni 0 oldu.
        Sürekli bir basamak çıkarttığımız için. O yüzden number ile kıyaslıyoruz.*/
    }
    public static void main(String[] args) {
        int number=10101;
        int number2=10102;
        System.out.println(number+" sayisi palindrommu : "+isPalindromeForNumber(number));
        System.out.println(number2+" sayisi palindrommu : "+isPalindromeForNumber(number2));
        String text="Ada";
        String text2="ada";
        System.out.println(text+" stringi palindrommu : "+isPalindromeForString(text));
        System.out.println(text2+" stringi palindrommu : "+isPalindromeForString(text2));

    }
}