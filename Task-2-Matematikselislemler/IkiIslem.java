public class IkiIslemSonucu {
    public static void main(String[] args) {
        // Pay ve Payda için double değişkenleri tanımla ve hesapla
        double pay = (9.5 * 4.5) - (2.5 * 3);
        double payda = 45.5 - 3.5;
        
        // Sonucu hesapla
        double sonuc = pay / payda;
        
        System.out.println("Pay: " + pay);
        System.out.println("Payda: " + payda);
        System.out.println("Sonuc (Pay / Payda): " + sonuc);
        
        // Sonucu 4 ondalık basamak ile yazdırma
        String formatliSonuc = String.format("%.4f", sonuc);
        System.out.println("4 Ondalık Basamakla Sonuç: " + formatliSonuc); // Sonuç: 0.8875
    }
}
