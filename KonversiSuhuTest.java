public class KonversiSuhuTest {
    
    public static void main(String[]args) {
        double celcius = 37.0;
        double fahrenheit = 145.0;
        double hasiltoFahrenheit, hasiltoCelcius;

        KonversiSuhu konvert = new KonversiSuhu();

        hasiltoFahrenheit = konvert.toFahrenheit(celcius);
        hasiltoCelcius = konvert.toCelcius(fahrenheit);

        System.out.println("Konversi Suhu");
        System.out.println("___________\n");

        System.out.println("Inisiasi nilai celcius = " + celcius);
        System.out.println("Cetak nilai celcius toFahrenheit = " + hasiltoFahrenheit + "\n");
        System.out.println("Inisiasi nilai fahrenheit = " + fahrenheit); 
        System.out.println("Cetak nilai fahrenheit toCelcius = " + hasiltoCelcius + "\n");
    }
}
class KonversiSuhu{
    double hasil; 
    
    public double toFahrenheit(double celcius){
        hasil = ((celcius * 1.8) + 32); //*9/5+32
        return hasil;
    }
    public double toCelcius(double fahrenheit){
        hasil = ((fahrenheit-32) * (0.55556)); //-32*5per9
        return hasil;
    }
}