import java.util.HashMap;
import java.util.Scanner;

class Karyawan {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        HashMap<String, Integer> golonganDict = new HashMap<>();
        HashMap<String, Integer> pendidikanDict = new HashMap<>();
        int gaji = 300000;
        int totalGaji = 0;


        String[] golongan = {"1","2","3"};
        int[] golonganPersen = {5, 10, 15};
        String[] pendidikan = {"SMA", "D1", "D3", "S1"};
        int[] pendidikanPersen = {25/10, 5, 20, 30};


        for (int i = 0; i < golongan.length; i++) {
            golonganDict.put(golongan[i], golonganPersen[i]);
        }

        for (int i = 0; i < pendidikan.length; i++) {
            pendidikanDict.put(pendidikan[i], pendidikanPersen[i]);
        }

        System.out.println("Program hitung gaji karyawan : ");
        
        System.out.println("Nama Karyawan : ");
        String nama = obj.next();
        
        System.out.println("Golongan jabatan : ");
        String gol = obj.next();
        
        System.out.println("Pendidikan : ");
        String pend = obj.next();
 
        System.out.println("Jumlah jam kerja : ");
        int jamKerja = obj.nextInt();
        
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Honor yang diterima");

        int tunjangan = gaji * golonganDict.get(gol) / 100;
        System.out.println("Tunjangan Jabatan : Rp. " + tunjangan);

        int tunjanganPend = gaji * pendidikanDict.get(pend.toUpperCase()) / 100;
        System.out.println("Tunjangan Pendidikan : Rp. " + tunjanganPend);

        if(jamKerja > 8 ) {
            int lembur = 3500 * (jamKerja - 8);
            System.out.println("honor lembur : Rp. " + lembur);

            totalGaji = gaji + tunjangan + tunjanganPend + lembur;
            System.out.println("total gaji : Rp. " + totalGaji);
        } else {
            totalGaji = gaji + tunjangan + tunjanganPend ;
            System.out.println("total gaji : Rp. " + totalGaji);
        }       
    }
}