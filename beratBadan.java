import java.util.Scanner;

public class beratBadan {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int jumlahSiswa;
        double beratBadan;
        double totalBerat = 0;
        double rataRataBerat;

        System.out.println("Masukkan jumlah siswa : ");
            jumlahSiswa = scan.nextInt();

        for(int i = 1; i <=jumlahSiswa; i++) {
            System.out.println("Masukkan berat badan siswa ke-" + i + ": ");
            beratBadan = scan.nextDouble();
            totalBerat +=beratBadan;
        } 

        rataRataBerat = totalBerat/ jumlahSiswa;
        System.out.println("Rata-rata berat badan dari " + jumlahSiswa + " siswa adalah " + rataRataBerat);

        scan.close();
    }
}
