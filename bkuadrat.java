import java.util.Scanner;//no.1

public class bkuadrat {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double a, b, c, d;

        System.out.println("\nMasukkan nilai a b c :");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        
        d = (b*b)-(4*a*c);
        System.out.println("Hasilnya adalah : \n" + d + "\n");
    }
}
