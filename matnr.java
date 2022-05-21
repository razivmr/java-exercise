import java.util.Scanner;//no.5
public class matnr {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("\nMasukkan nilai n :");
        n = input.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
