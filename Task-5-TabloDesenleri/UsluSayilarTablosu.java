public class UsluSayilarTablosu {
    public static void main(String[] args) {
        System.out.println("--- Üslü Sayılar Tablosu (a'dan a³'e) ---");
        System.out.printf("%-5s %-5s %-5s\n", "a", "a²", "a³");
        System.out.println("-----------------");

        // a=1'den a=5'e kadar döngü
        for (int a = 1; a <= 5; a++) {
            int aKare = a * a; // a²
            int aKup = a * a * a; // a³
            
            // Tablo formatında yazdırma
            System.out.printf("%-5d %-5d %-5d\n", a, aKare, aKup);
        }
        System.out.println("-----------------");
    }
}
