public class persegipanjang {
    int panjang;
    int lebar;

    public persegipanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int hitungluas() {
        return this.panjang * this.lebar;
    }
    public int hitungkeliling(){
        return this.panjang*2 + this.lebar*2;
    }
}