import java.util.Scanner;
import java.util.ArrayList;

public class BeeenasBouquet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inginBeli = true;

        // Judul aplikasi
        System.out.println("------------------------------------------------------");
        System.out.println("== = == = == =   - BEEENA's BOUQUET -   = == = == = ==");

        // Input nama pembeli
        System.out.print("Nama : ");
        String namaPembeli = scanner.nextLine();

        // Daftar bouquet dan harganya
        ArrayList<String> namaBouquet = new ArrayList<>();
        ArrayList<Double> hargaBouquet = new ArrayList<>();

        namaBouquet.add("pipefly bouquet");
        hargaBouquet.add(45000.0);
        namaBouquet.add("gradualove bouquet");
        hargaBouquet.add(80000.0);
        namaBouquet.add("birthday bouquet");
        hargaBouquet.add(50000.0);
        namaBouquet.add("snack bouquet");
        hargaBouquet.add(35000.0);

        // Loop untuk pembelian 
        while (inginBeli) {
            System.out.println("\nSelamat datang di beeena's bouquet, " + namaPembeli + "!");
            System.out.println("Kami memiliki berbagai pilihan bouquet terbaik");
            System.out.println("untuk setiap moment spesial ;)");
            System.out.println("\n------------------  DAFTAR BOUQUET  ------------------");
            System.out.println("======================================================");
            for (int i = 0; i < namaBouquet.size(); i++) {
                System.out.println((i + 1) + ". " + namaBouquet.get(i) + " - Rp" + hargaBouquet.get(i));
            }

         // Input budget dari pelanggan  
        System.out.println("------------------------------------------------------");
        System.out.print("Masukkan budget : Rp ");
        double maksimalBudget = scanner.nextDouble();

        // Menampilkan bouquet yang sesuai dengan budget
        System.out.println("\nItem yang sesuai dengan budget (Rp " + maksimalBudget + "):");
        int count = 0;
        for (int i = 0; i < namaBouquet.size(); i++) {
            if (hargaBouquet.get(i) <= maksimalBudget) {
                System.out.println((i + 1) + ". " + namaBouquet.get(i) + " - Rp " + hargaBouquet.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Tidak ada bouquet yang sesuai dengan budget.");
            continue; // Kembali ke awal loop jika tidak ada item
        }

        // Input pilihan bouquet
        System.out.print("\nMasukkan pilihan bouquet (1-" + namaBouquet.size() + "): ");
        int pilihan = scanner.nextInt();
        double totalHarga = 0;

        // Switch case untuk menentukan harga bouquet sesuai dengan pilihan
        switch (pilihan) {
        case 1:
            totalHarga = 45000;
            System.out.println("Anda memilih pipefly bouquet. harga: Rp. " + totalHarga);
            break;
        case 2:
            totalHarga = 80000;
            System.out.println("Anda memilih gradualove bouquet. harga: Rp. " + totalHarga);
            break;
        case 3:
            totalHarga = 50000;
            System.out.println("Anda memilih birthday bouquet. harga: Rp. " + totalHarga);
            break;
        case 4:
            totalHarga = 35000;
            System.out.println("Anda memilih snack bouquet. harga: Rp. " + totalHarga);
            break;
        default:
            System.out.println("Pilihan tidak valid. silakan coba lagi.");
            continue; // kembali ke awal loop jika pilihan tidak validS
            }

        // Input jumlah bouquet yang ingin dibeli
        System.out.print("Jumlah bouquet yang ingin dibeli: ");
        int jumlah = scanner.nextInt();

        // Akumulasi total pembayaran
        double totalBayar = totalHarga * jumlah;
        double diskon = 0;

        // Menghitung diskon
        if (jumlah >= 5) {
            diskon = totalBayar * 0.10; // Diskon 10% jika membeli 5 atau lebih
            System.out.println("Selamat anda mendapatkan diskon 10%!");
        } else if (jumlah >= 2) {
            diskon = totalBayar * 0.05; // Diskon 5% jika membeli 2 atau lebih
            System.out.println("Selamat anda mendapatkan diskon 5%!");
        }

        totalBayar -= diskon;

        // Menampilkan detail pemesanan
        System.out.println("\n= = = = = = = =    DETAIL PEMESANAN    = = = = = = = =");
        System.out.println("______________________________________________________");
        System.out.println("Nama                         : " + namaPembeli);
        System.out.println("Item yang dipilih            : " + namaBouquet.get(pilihan - 1));
        System.out.println("Total harga                  : Rp. " + (totalHarga * jumlah));
        System.out.println("Total diskon                 : Rp. " + diskon);
        System.out.println("Total pembayaran             : Rp. " + totalBayar);
        System.out.println("______________________________________________________");

        // Input pembayaran
        System.out.print("\nTUNAI                        : Rp ");
        double uangBayar = scanner.nextDouble();
        if (uangBayar >= totalBayar) {
            double kembalian = uangBayar - totalBayar;
            System.out.println("KEMBALI                      : Rp " + kembalian);
            System.out.println("\nPembelian berhasil. Terima kasih, " + namaPembeli + "!");
        } else {
        double kekurangan = uangBayar - totalBayar;
        System.out.println("Uang pembayaran tidak cukup. Kekurangan :" + kekurangan);
        }

        // Tanya pengguna jika ingin membeli lagi
        System.out.print("Apakah ingin membeli lagi? (true/false): ");
        inginBeli = scanner.nextBoolean();
        }

        // Menampilkan informasi penutup
        System.out.println("\nTerima kasih telah berbelanja di beeena's bouquet !!! ");
        System.out.println("Selamat menikmati moment spesial bersama");
        System.out.println("orang tersayang ;) ");
        System.out.println("\n--------------  by : FEBRIANA N.A/006  ---------------");
        System.out.println("======================================================");

        scanner.close();
    }
}


