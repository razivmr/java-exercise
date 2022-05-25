
class Matematika{
    private double hasil;
    public double jumlah(double a, double b){
        hasil = a + b;
        return hasil;
    }
    public double pengurangan(double a, double b){
        hasil = a - b;
        return hasil;
    }
    public double perkalian(double a, double b){
        hasil = a * b;
        return hasil;
    }
    public double pemmbagian(double a, double b){
        hasil = a / b;
        return hasil;
    }
}
public class MatematikaTest {
    public static void main(String [] args){
        double a = 100; double b = 3.0;
        double hasilJumlah, hasilKurang, hasilKali, hasilBagi;

        Matematika hitung  = new Matematika();

        hasiljumlah = hitung.jumlah(a,b);
        hasilKurang = hitung.pengurangan(a,b);
        hasilKali = hitung.perkalian(a,b);
        hasilBagi = hitung.pemmbagian(a,b);

        System.out.println("Program demo operasi matematika");
        System.out.println("__________");

        System.out.println("Penjumlahan " + a + " + " + b + " = " + hasilJumlah); 
        System.out.println("\nPengurangan " + a + " - " + b + " = " + hasilKurang); 
        System.out.println("\nPerkalian " + a + " x " + b + " = " + hasilKali); 
        System.out.println("\nPembagian " + a + " / " + b + " = " + hasilBagi);
    }
}
