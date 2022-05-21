import java.util.Scanner;//no.9,5
public class prim {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int bil, akhir;
        
         System.out.print("Sampai : ");
         akhir=input.nextInt();
         
        for (int i=0; i<=akhir; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                System.out.print(i+" ");
            }             
        }    
    }
}
