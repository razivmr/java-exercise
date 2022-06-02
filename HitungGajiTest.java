import java.text.DecimalFormat;

class HitungGaji{
    /*deklarasi variabel internal. variavel potongan menyatakan dana asuransi kesehatan,iuran koperasi, 
    cicilan kendaraan dan sebagainya. hanya variabel gajikotor dan gajibersih yang dapat diakses lingkungan luar*/
    private double gajiKotor, gajiSetelahPajak;
    public double gajiBersih;
    private double potongan = 75000.00;

    //method set variabel interna; gajikotor
    public void setGaji(double gaji) {
        gajiKotor = gaji;
    }

    //method menghitung gaji bersih
    public void hitungGaji() {
        gajiSetelahPajak = gajiKotor - (0.2 * gajiKotor);
        gajiBersih = gajiSetelahPajak - potongan;
    }

    //method return nilai gajikotor
    public double getGajiKotor() {
        return gajiKotor;
    }

    //method return nilai gaji bersih
    public double getGajiBersih() {
        return gajiBersih;
    }
}

public class HitungGajiTest {
    public static void main(String[]args) {
        
        //mengset tampilan hasil menjadi dua digit desimal dengan library
        DecimalFormat digitPresisi = new DecimalFormat("0.00");

        System.out.println("\nDemo Enkapsulasi");
        System.out.println("------------------");

        //mwmbuat INSTANSE dari class hitunggaji untuk pegawai dan panggil method2
        HitungGaji tony = new HitungGaji();
        tony.setGaji(2500000);
        tony.hitungGaji();

        System.out.println("Informasi Gaji Pegawai");
        System.out.println("\nBesar Gaji kotor : " + digitPresisi.format(tony.getGajiKotor()));
        System.out.println("\nBesar Gaji yang dibawa pulang : " + digitPresisi.format(tony.getGajiBersih()));
    }
}
