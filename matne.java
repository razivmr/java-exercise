import java.util.Scanner;//no.6
public class matne {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, i, j;

        System.out.println("\nMasukkan nilai n : ");
        n = input.nextInt();
        
        for ( i = 1; i <= n; i++){
            if (i == 1 || i==n){
                for ( j = 0; j <= n; j++){
                    System.out.print("*");
                }
            }else {
                for (j= 1; j <= n; j++){
                    if (j==1 || j == n){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            
        }
    }
}