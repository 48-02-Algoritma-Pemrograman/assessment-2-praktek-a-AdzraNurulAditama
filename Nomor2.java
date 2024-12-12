import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {

    static int[] hargaBuku = {350000, 450000, 500000, 95000};
    static String[] daftarBuku = {"Sherlock Holmes", "Arsene Lupin", "Game Of Throne", "Psychology Of Money"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> hargaBelanja = new ArrayList<>();
        int totalBelanja = 0;

        System.out.println("Daftar Buku:");
        for (int i = 0; i < daftarBuku.length; i++) {
            System.out.println((i + 1) + "." + daftarBuku[i] + " " + hargaBuku[i]);
        }

        String inputPengguna;
        do {
            System.out.print("Masukan pilihan buku [1/2/3/4]: ");
            int pilihanBuku = scanner.nextInt();
            if (pilihanBuku >= 1 && pilihanBuku <= 4) {
                hargaBelanja.add(hargaBuku[pilihanBuku - 1]);
                totalBelanja += hargaBuku[pilihanBuku - 1];
            } else {
                System.out.println("Pilihan tidak valid.");
            }

           
            System.out.print("Input lagi (Y/N)?: ");
            inputPengguna = scanner.next();
        } while (inputPengguna.equalsIgnoreCase("Y")); 

       
        int voucher = hitungVoucher(totalBelanja);

        int totalHargaSetelahVoucher = totalBelanja;

        System.out.println("Total voucher belanja = " + voucher);
        System.out.println("Total yang harus dibayar = " + totalHargaSetelahVoucher);

        scanner.close();
    }

    public static int hitungVoucher(int totalBelanja) {
        if (totalBelanja < 200000) {
            return 0;  
        } else if (totalBelanja >= 200000 && totalBelanja <= 500000) {
            return 50000;  
        } else if (totalBelanja > 500000 && totalBelanja <= 750000) {
            return 100000;  
        } else if (totalBelanja > 750000 && totalBelanja <= 1000000) {
            return 150000;  
        } else {
            return 200000;  
        }
    }
}

