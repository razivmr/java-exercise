import java.util.Scanner; //no.3

public class bulpos {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("masukkan n : ");
        n = input.nextInt();
        
        for (int i = n; i >= 1; i--){
            System.out.println(i);
        }
    }
}
