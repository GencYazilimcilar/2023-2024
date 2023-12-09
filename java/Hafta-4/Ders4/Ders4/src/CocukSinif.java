public class CocukSinif extends Kalitim {
    public int z=5;
    public CocukSinif(){
        super(5, 10);
    }
    public void deneme(){
        super.y=15;
    }

    @Override
    public void print() {
        //super.print();
        System.out.println("Cocuk sinifindan");
        System.out.println("x:"+super.x+" y:"+super.y+" z:"+z);
    }
    public void print(int z){
        this.z=z;
        System.out.println("Cocuk sinifindan");
        System.out.println("x:"+super.x+" y:"+super.y+" z:"+z);
    }
}
