public class Main {
    public static void main(String[] args) {
        /*int[] a=new int[5];
        a[0]=20;
        a[1]=25;
        a[2]=30;
        a[3]=55;
        a[4]=80;
        for(int b=0;b<=4;b++){
            System.out.println(a[b]);
        }
        System.out.println(a[2]);
        for(int b:a){
            System.out.println(b);
        }*/

        /*int[] sinavNotlari={50,94,56,78,12,65,23};
        int[][] matris=new int[3][5];
        for(int i=0;i<3;i++){
            for(int k=0;k<5;k++){
                matris[i][k]=i*k +5;
            }
        }
        for(int i=0;i<3;i++){
            for(int k=0;k<5;k++){
                System.out.println(matris[i][k]);
            }
        }*/
        /*String[] names=new String[10];
        String[] surnames=new String[10];
        int[] years=new int[10];
        int index=0;
        names[index]="Deneme";
        surnames[index]="Soyad";
        years[index]=2005;
        index++;
        names[index]="Deneme 2";
        surnames[index]="Soyad 2";
        years[index]=2003;*/
        /*Musteri[] musteriArray=new Musteri[10];
        Musteri yeniMusteri=new Musteri("Celil","Vural",2000);
        yeniMusteri.name="Celil";
        yeniMusteri.surname="Vural";
        yeniMusteri.year=2000;
        yeniMusteri.setSurname("vural");
        yeniMusteri.setName("celil");
        yeniMusteri.setYear(1940);

        musteriArray[0]=yeniMusteri;
        yeniMusteri.yasHesapla();
        yeniMusteri.print();*/
        Car bmw=new Car();
        bmw.setName("BMW");
        bmw.setModel("E60");
        bmw.setProductionYear(2015);
        bmw.setPrice(100000000);
        bmw.setDiscount(0);
        Car honda=new Car();

    }
}