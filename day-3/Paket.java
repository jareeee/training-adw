import java.util.Scanner; 
import java.util.Random;

class Paket {

    public static Integer totalBeli(int harga, int jumlah){
        int banyak = harga * jumlah;
        int Ppn = banyak*10/100;
        int total = Ppn + banyak;
        return total;
    }

    public static String randomKode(){
        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";

        // combine all strings
        String alphaNumeric = numbers + upperAlphabet;

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 6;

        for(int i = 0; i < length; i++) {

            // generate random index number
            int index = random.nextInt(alphaNumeric.length());

            // get character specified by index
            // from the string
            char randomChar = alphaNumeric.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
        }

        String randomString = sb.toString();
        return randomString;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Daftar menu : \n1. Paket hemat \n2. Paket Nasi \n3. Paket special \nPilih paket :");
        int pilihPaket = obj.nextInt();

        System.out.println("Jumlah beli: ");
        int jumlah = obj.nextInt();

        switch (pilihPaket) {
            case 1:
                System.out.println("Paket Hemat x" +jumlah);
                System.out.println("Total harga : " + totalBeli(7500, jumlah));
                System.out.println("Fajar  "+randomKode());
                break;
            case 2:
                System.out.println("Paket Nasi x" +jumlah);
                System.out.println("Total harga : " + totalBeli(10000, jumlah));
                System.out.println("Fajar  "+randomKode());
                break;
            case 3:
                System.out.println("Paket Special x" +jumlah);
                System.out.println("Total harga : " + totalBeli(15000, jumlah));
                System.out.println("Fajar  "+randomKode());
                break;
            default:
                System.out.println("Tidak ada paket dengan kode " + pilihPaket);
        }
    }
}