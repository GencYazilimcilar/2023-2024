public class Kalitim {
    public int x;
    protected int y;
    public Kalitim(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void topla() {
        System.out.println(x + y);
    }
    public void print(){
        System.out.println("Kalitim sinifindan");
        System.out.println("x: " + x + " y: " + y);
    }
}
