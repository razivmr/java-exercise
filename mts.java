import java.util.Scanner;//no.10

public class mts {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("\nSelamat datang di program fungsi matematis");

        while(true){
        System.out.println("Fungsi yang dapat Anda lakukan antara lain: ");
        System.out.println(" 1. Pertambahan\n 2. Rata-rata\n 3. Pangkat\n 0. untuk keluar");
        System.out.println("Silakan masukkan pilihan Anda: ");
        int pilihan = input.nextInt();

        if(pilihan == 1){
            System.out.println("Masukkan 2 buah bilangan: ");
            int a = input.nextInt();
            int b = input.nextInt();
            int hasil = a+b;
            System.out.println("Jumlahnya adalah : " + hasil + "\n");
        } else if  (pilihan == 2){
            System.out.println("Masukkan 3 buah bilangan: ");
            int a = input.nextInt();
            int b = input.nextInt();  
            double c = input.nextInt();
            double hasil = ((a+b+c)/3);
            System.out.println("Rata-ratanya adalah : " + hasil + "\n");
        }else if (pilihan == 3){
            System.out.println("Masukkan 2 buah bilangan: ");
            int a = input.nextInt();
            int b = input.nextInt();
            int hasil = (int) Math.pow(a, b);
            System.out.println("Pangkatnya adalah : " + hasil + "\n");
        }else if(pilihan == 0) {
            System.out.println("Terima kasih telah menggunakan program ini.\n"); break;
        }else {
            System.out.println("Maaf, angka yang anda masukkan tidak terdapat dalam pilihan\n");
        }
    }
    }
}