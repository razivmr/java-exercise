import java.util.Scanner;//no.9

public class suhu {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        suhu konversi = new suhu();

        System.out.println("\nMasukkan niali celcius : ");
        int celcius = input.nextInt();
        konversi.setCelcius(celcius);

        konversi.cToF();
        System.out.println("\nHasil konversi celcius ke fahrenheit : " + konversi.gethasil());
        konversi.cToK();
        System.out.println("\nHasil konversi celcius ke kelvin : " + konversi.gethasil());
        konversi.cToR();
        System.out.println("\nHasil konversi celcius ke reamur : " + konversi.gethasil());
    }

    
    int celcius;
    double hasil; 

    public void setCelcius(int a) {celcius = a;}
    public int getCelcius() {return celcius;}

    public double gethasil() {return hasil;}
        
    public double cToF(){
        hasil = ((celcius * 1.8) + 32); return hasil;}
    public double cToK(){
        hasil = (celcius+273); return hasil; }
    public double cToR(){
         hasil = (celcius * 0.8); return hasil; }
}
