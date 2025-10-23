public class HesapOzeti {
    public static void main(String[] args) {
        // Ürün verileri
        String urun1 = "Defter";     int miktar1 = 2; double fiyat1 = 15.50;
        String urun2 = "Kalem Seti"; int miktar2 = 1; double fiyat2 = 25.75;
        String urun3 = "Silgi";      int miktar3 = 4; double fiyat3 = 3.25;
        
        double toplamFiyat = (miktar1 * fiyat1) + (miktar2 * fiyat2) + (miktar3 * fiyat3);
        
        System.out.println("=========================================");
        // Başlıklar için format
        System.out.printf("%-15s %-8s %-10s\n", "ÜRÜN", "MİKTAR", "BİRİM FİYAT");
        System.out.println("=========================================");

        // Her bir ürün satırı için format
        System.out.printf("%-15s %-8d %-10.2f TL\n", urun1, miktar1, fiyat1);
        System.out.printf("%-15s %-8d %-10.2f TL\n", urun2, miktar2, fiyat2);
        System.out.printf("%-15s %-8d %-10.2f TL\n", urun3, miktar3, fiyat3);
        
        System.out.println("-----------------------------------------");
        // Toplam satırı
        System.out.printf("%-24s %-10.2f TL\n", "GENEL TOPLAM:", toplamFiyat);
        System.out.println("=========================================");
    }
}
