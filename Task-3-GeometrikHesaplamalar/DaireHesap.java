public class DaireHesaplama {
    public static void main(String[] args) {
        double yaricap = 5.5; // Yarıçap değeri
        
        // Alan Hesaplama: π * r * r
        // Math.PI Java'da tanımlı Pi sabitidir.
        double alan = Math.PI * yaricap * yaricap;
        
        // Çevre Hesaplama: 2 * π * r
        double cevre = 2 * Math.PI * yaricap;
        
        System.out.println("--- Daire Hesaplamaları ---");
        System.out.println("Yarıçap (r): " + yaricap);
        System.out.println("Alan (πr²): " + alan);
        System.out.println("Çevre (2πr): " + cevre);
    }
}
