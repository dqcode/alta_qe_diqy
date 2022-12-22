public class Main {
    public static void main(String[] args){
        kubus main1 =  new kubus(10);
        System.out.println("menghitung volume kubus :" + main1.hitungvolume());

        balok main2 =  new balok(3,6,10);
        System.out.println("menghitung volume balok :" + main2.hitungvolume());
    }

}