import java.util.Scanner; 

public class main {

    public static Integer waktuRental(int angka){
        int afterOneHours = 200000*25/100*(angka-1);
        return 200000 + afterOneHours;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Isi daftar penyewa");
        
        System.out.println("Nama Penyewa: ");
        String nama = obj.nextLine();

        System.out.println("alamat: ");
        String alamat = obj.nextLine();

        System.out.println("No. Telephone: ");
        String telp = obj.nextLine();
        
        System.out.println("Lama rental: ");
        int waktu = obj.nextInt();
        
        System.out.println("Total bayar: " + waktuRental(waktu));
    }
}