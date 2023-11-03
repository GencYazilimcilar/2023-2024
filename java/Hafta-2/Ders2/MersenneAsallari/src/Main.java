public class Main {
    //değişkenlerimizin long olması lazım yoksa ilk 50 sayıyı kontrol edemezsiniz
    public static boolean isPrime(long number){//sayi asal ise true dönücek
        boolean control=true;
        for(long i=2;i<number;i++){
            if(number%i==0){
                control=false;
                break;
            }
        }
        return  control;
    }
    public static long Pow(long number, long degree){//üs alma fonksiyonumuz
        long total=1;
        for(long i=1;i<=degree;i++){
            total*=number;
        }
        return total;
    }
    public static long findMersenne(long number){//bize (2^p)-1 ile yeni bir sayı(m sayısı) üretecek olan fonksiyon
        long mersenneNumber=Pow(2,number)-1;
        return mersenneNumber;
    }
    public static long findPerfectNumberWithMersenne(long p,long m){//mükemmel sayıları üreticek olan fonksiyon
        long perfectNumber=(Pow(2,p-1))*(m);
        return perfectNumber;
    }
    public static void main(String[] args) {
        for (long i=2;i<50;i++){
            boolean controlForIsPrime=isPrime(i);//asalmı fonksiyonuna sayımızı kontrol ettiriyoruz
            if(controlForIsPrime){
                long m=findMersenne(i);//mersenne asalları yöntemiyle formüldeki m ifademizi buluyoruz.
                boolean controlForMIsPrime=isPrime(m);// m nin asal olduğundan emin oluyoruz
                if(controlForMIsPrime) System.out.println("Mersenne ile mukemmel sayi: "+findPerfectNumberWithMersenne(i,m));
            }
        }
    }
}