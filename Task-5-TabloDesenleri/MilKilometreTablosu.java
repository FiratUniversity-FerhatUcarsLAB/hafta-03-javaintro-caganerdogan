public class DonusumTablosu {
    public static void main(String[] args) {
        final double MIL_TO_KM = 1.609; // Dönüşüm sabiti
        
        // Dönüştürülecek mil değerleri
        int[] milDegerleri = {1, 5, 10, 20, 50};
        
        System.out.println("--- Mil -> Kilometre Dönüşüm Tablosu ---");
        System.out.printf("%-10s %-15s\n", "Mil", "Kilometre");
        System.out.println("--------------------------");

        // Her bir mil değeri için döngü
        for (int mil : milDegerleri) {
            double kilometre = mil * MIL_TO_KM;
            
            // Tablo formatında yazdırma (kilometreyi 3 ondalık basamakla)
            System.out.printf("%-10d %-15.3f\n", mil, kilometre);
        }
        System.out.println("--------------------------");
    }
}
