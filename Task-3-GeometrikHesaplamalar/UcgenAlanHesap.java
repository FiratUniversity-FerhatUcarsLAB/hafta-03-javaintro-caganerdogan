public class UcgenHesaplama {
    public static void main(String[] args) {
        // Kenar uzunlukları
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        
        System.out.println("--- Üçgen Hesaplamaları (Heron) ---");
        System.out.println("Kenarlar (a, b, c): " + a + ", " + b + ", " + c);
        
        // 1. Adım: Yarı Çevre (s) hesaplama
        double s = (a + b + c) / 2.0;
        System.out.println("Yarı Çevre (s): " + s); // s = 12 / 2 = 6.0
        
        // 2. Adım: Alan hesaplama (Heron formülü)
        // Math.sqrt() karekök almak için kullanılır.
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        System.out.println("Alan (Heron Formülü): " + alan); // Sonuç: 6.0 (Bu bir dik üçgendir)
    }
}
