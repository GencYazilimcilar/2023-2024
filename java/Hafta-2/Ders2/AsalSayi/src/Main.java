public class Main {
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
        for(short i=2;i<1000;i++){
            sayi_asal_mi(i);
        }
    }
}