import java.util.Scanner;//no.2

public class ganpos {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Masukkan niali n : ");
        n = input.nextInt();
        for (int i = 1; i <= n; i+=2) {
            System.out.println(i);
        }
    }
}
