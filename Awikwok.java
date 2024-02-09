package awikwok;
import java.util.*;

public class Awikwok {
    private static final String[] jadwalLapangan = {"09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00"};

    public static void main(String[] args) {
        record User(String nama, int nohp) {}
        Scanner scanner = new Scanner(System.in);
        boolean inginMelakukanBooking = true;
       
        
        
        LinkedList<String> listkode = new LinkedList<>();
        while (inginMelakukanBooking) {
            System.out.println("List User");
            System.out.println("1. Admin");
            System.out.println("2. Prabowo");
            System.out.print("Masuk sebagai :");
          int choose = scanner.nextInt();
            if(choose == 1){
                
             System.out.println("Anda memasuki kawasan admin");
                System.out.println("si aku ngebooking di jam :" + listkode);
             
             
         }else if (choose == 2){
             System.out.println("Prabowo");
         }
            
            System.out.println("\nSelamat datang di GOR BANJALAN!!!");
            System.out.print("Silahkan pilih paket anda (1. Reguler, 2. Khusus, 3. Member): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih paket Reguler. Silakan lakukan booking.");
                    break;
                case 2:
                    System.out.println("Anda memilih paket Khusus. Silakan lakukan booking.");
                    break;
                case 3:
                    System.out.println("Anda memilih paket Member. Silakan lakukan booking.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
                    continue;
            }

            System.out.println("Jadwal Lapangan:");
            for (String waktu : jadwalLapangan) {
                System.out.println(waktu + " ");
            }
            System.out.println();

            
            System.out.print("Masukkan waktu yang ingin Anda booking (hh:mm) (pisahkan dengan koma jika lebih dari satu): ");
            String waktuBooking = scanner.next();
            String[] listKode = waktuBooking.split(",");
            
            for (int i = 0; i < listKode.length; i++) {
                listKode[i] = listKode[i].trim(); // Remove leading and trailing whitespaces
                System.out.println("Booking berhasil untuk waktu: " + listKode[i]);
                listkode.add(listKode[i]);
                
                for (int j = 0; j < jadwalLapangan.length; j++) {
                    if (jadwalLapangan[j].equals(listKode[i])) {
                        jadwalLapangan[j] = "Booked";
                    }
                }
            }
            System.out.print("Ingin melakukan booking lagi? (y/n): ");
            String jawaban = scanner.next().toLowerCase();
            inginMelakukanBooking = jawaban.equals("y");
        }

        System.out.println("Terima kasih!");
        scanner.close();
    }
}

