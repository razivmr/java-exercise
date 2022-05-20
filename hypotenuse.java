import java.util.Scanner;//no.8
import java.lang.Math;

public class hypotenuse {

    private int bilangan1;
    private int bilangan2;
    private double hasil, hasil1;

    public void setBilangan1(int a) {bilangan1 = a;}
    public int getBilangan1() {return bilangan1;}

    public void setBilangan2(int a) {bilangan2 = a;}
    public int getBilangan2() {return bilangan2;}

    public double gethasil() {return hasil;}
    public void hitung(){
        hasil1 = ((bilangan1*bilangan1)+(bilangan2*bilangan2));
        hasil = (Math.sqrt(hasil1));
    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        hypotenuse x = new hypotenuse();
        int alas, bawah;

        System.out.println("\n### Menghitung sisi panjang segitiga dengan pythagoras ###");
        System.out.println("\nMasukkan nilai a :");
        alas = input.nextInt();
        x.setBilangan1(alas);
        System.out.println("Masukkan nilai b : ");
        bawah = input.nextInt();
        x.setBilangan2(bawah);

        x.hitung();
        System.out.println("\nHasilnya : " + x.gethasil());
    }
}
