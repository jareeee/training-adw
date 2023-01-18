import java.util.Scanner; 
import java.util.HashMap;


public class Chicken {


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // Dictionaries
        HashMap<String, Integer> kodeDict = new HashMap<>();

        // Declare variables
        int[] harga = {2500, 2000, 1500};
        String[] kode = {"D", "P", "S"};

        // Put dictionary
        for (int i = 0; i < kode.length; i++) {
            kodeDict.put(kode[i], harga[i]);
        }

        // Menu
        System.out.println("Kode jenis harga \nD - Dada = Rp. 2500 \nP - Paha = Rp. 2000 \nS - Sayap = Rp. 1500 ");
        System.out.println("Berapa jenis :");
        int jenis = obj.nextInt();

        int totalSemua = 0;

        // Looping through jenis
        for(int i = 1; i <= jenis; i++){
            
            // UI
            System.out.println("jenis ke - "+i);

            System.out.println("Kode potong(D/P/S): ");
            String nama = obj.next();
            String upperCaseNama = nama.toUpperCase();


            System.out.println("banyak potong: ");
            int banyak = obj.nextInt();

            // Logic
            int total = banyak * kodeDict.get(upperCaseNama);
            System.out.println("Jumlah harga : " + total);
            totalSemua += total ;
        }
        // Logic Output
        System.out.println("Jumlah bayar: " + totalSemua);
        // Pajak 10%
        int pajak = totalSemua * 10 / 100;
        System.out.println("Pajak 10% : " + pajak);
        // Total bayar
        int totalBayar = totalSemua + pajak;
        System.out.println("Total Bayar : " + totalBayar);

    }
}