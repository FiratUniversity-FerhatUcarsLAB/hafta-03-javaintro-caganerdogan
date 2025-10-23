public class CarpimTablosu {
    public static void main(String[] args) {
        final int SABIT_SAYI = 2; // Çarpım tablosu istenen sayı
        
        System.out.println("--- 2'nin Çarpım Tablosu (1'den 10'a) ---");
        
        // i=1'den i=10'a kadar döngü
        for (int i = 1; i <= 10; i++) {
            int sonuc = SABIT_SAYI * i;
            
            // Format: 2 x 1 = 2
            System.out.printf("%d x %d = %d\n", SABIT_SAYI, i, sonuc);
        }
        System.out.println("----------------------------------------");
    }
}
