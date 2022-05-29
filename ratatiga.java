import java.util.Scanner;
public class ratatiga{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b;
        double c, hasil;

        System.out.println("\nMasukkan bilangan 1 : ");
        a = input.nextInt();
        System.out.println("\nMasukkan bilangan 2 : ");
        b = input.nextInt();
        System.out.println("\nMasukkan bilangan 3 : ");
        c = input.nextInt();
        hasil = ((a+b+c)/3);
        System.out.println("Hasil rata-ratanya adalah : " + hasil);
    }
}