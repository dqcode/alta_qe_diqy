public class Main {
    public static void main(String[] args){
        persegi main1 = new persegi(4);
        System.out.println("menghitung luas persegi:" + main1.hitungluas());
        System.out.println("menghitung keliling persegi :" + main1.hitungkeliling());

        persegipanjang main2= new persegipanjang(7,8);
        System.out.println("hitung luas persegipanjang :" + main2.hitungluas());
        System.out.println("hitung keliling persegipanjang :" + main2.hitungkeliling());

        segitiga main3 = new segitiga(3,4);
        System.out.println("menghitungluas segitiga :" + main3.hitungluas());

    }

}