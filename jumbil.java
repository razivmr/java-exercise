import java.util.Scanner; //no.4
public class jumbil {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n;
        float jumlah;
        jumlah=0;

        while (true){
            n = input.nextInt();
            if (n==-99) break;
            jumlah += n;
        }
        System.out.println("\nHasil penjumlahan data = " + jumlah + "\n");
    }
}
