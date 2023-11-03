public class Main {
    public static void tek_sayilari_hesapla(){
        byte count=0;
        short sum=0;
        for(byte counter=1;counter<=100;counter++){
            if(counter%2==1){
                count++;
                sum+=counter; // sum=sum+counter;
            }
        }
        System.out.println("Kac adet tek sayi var? : "+count+"\nTek sayilarin" +
                " toplamı?: "+sum);
    }
    public static int Pow(){
        int a=5;
        int b=a*a;
        return b;
    }
    public static int Pow2(int sayi,int ussu){
        int total=1;
        for(int i=1;i<=ussu;i++){
            total=total*sayi;
        }
        return total;
    }
    public static double Sum(double...sayi){
        double sum=0;
        for(double a:sayi){
            sum+=a;
        }
        return sum;
    }
    public static void sayi_asal_mi(short sayi){
        boolean asal_mi=true;
        for(short i=2;i<sayi;i++){
            if(sayi%i==0){
                asal_mi=false;
                break;
            }
        }
        if(asal_mi){
            System.out.println("Asal sayi: "+sayi);
        }
    }
    public static void main(String[] args) {

        /*int a;
        a=(false)?100:5;
        System.out.println(a);*/
        /*byte counter=1;
        byte toplam=0;
        while(counter<=100){
            if(counter%2==0){
                toplam+=1;
            }

            counter++;
        }
        System.out.println(toplam);*/
        /*byte count=0;
        short sum=0;
        for(byte counter=1;counter<=100;counter++){
            if(counter%2==1){
                count++;
                sum+=counter; // sum=sum+counter;
            }
        }
        System.out.println("Kac adet tek sayi var? : "+count+"\nTek sayilarin" +
                " toplamı?: "+sum);*/

        /*for(byte a=0;a<100;a++){
            if(a==50){
                break;
            }
            System.out.println(a);
        }*/
        //tek_sayilari_hesapla();
        /*int pow=Pow();
        System.out.println(pow);*/
        //System.out.println(Pow2(5,8));
        //System.out.println(Sum(5.5,9.8,8.9));

        for(short i=2;i<1000;i++){
            sayi_asal_mi(i);
        }
    }
}