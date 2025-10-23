public class DikdortgenHesaplama {
    public static void main(String[] args) {
        double en = 4.5;   // En değeri
        double boy = 7.9;  // Boy değeri
        
        // Alan Hesaplama
        double alan = en * boy;
        
        // Çevre Hesaplama
        double cevre = 2 * (en + boy);
        
        System.out.println("--- Dikdörtgen Hesaplamaları ---");
        System.out.println("En: " + en + ", Boy: " + boy);
        System.out.println("Alan: " + alan);
        System.out.println("Çevre: " + cevre);
    }
}
