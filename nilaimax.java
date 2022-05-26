import java.util.Scanner;

class nilaimax {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println();

    int[] arr = new int[5];
    int n=5, i, max_num;

    System.out.println("\nInput "+ n +" angka(enter):");
    // menyimpan input ke dalam array
    for(i = 0; i < n; i++){
      arr[i] = input.nextInt();
    }

    max_num = arr[0];
    // mencari nilai terbesar dengan loop
    for(i = 0; i < n; i++){
      if(arr[i] > max_num){
        max_num = arr[i];
      }
    }
    System.out.println("nilai terbesar dari 5 bilangan adalah: " + max_num);
  }
}