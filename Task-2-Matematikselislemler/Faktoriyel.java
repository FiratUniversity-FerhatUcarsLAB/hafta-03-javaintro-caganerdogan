public class Faktoriyel {
    public static void main(String[] args) {
        System.out.println("5! = 5 x 4 x 3 x 2 x 1 Hesaplaması:");
        
        // Başlangıç değeri
        int faktoriyel = 5;
        System.out.println("Adım 1 (5): " + faktoriyel);
        
        // Adım 2: 5 * 4
        faktoriyel = faktoriyel * 4;
        System.out.println("Adım 2 (5 * 4): " + faktoriyel); // Sonuç: 20
        
        // Adım 3: 20 * 3
        faktoriyel = faktoriyel * 3;
        System.out.println("Adım 3 (20 * 3): " + faktoriyel); // Sonuç: 60
        
        // Adım 4: 60 * 2
        faktoriyel = faktoriyel * 2;
        System.out.println("Adım 4 (60 * 2): " + faktoriyel); // Sonuç: 120
        
        // Adım 5: 120 * 1
        faktoriyel = faktoriyel * 1;
        System.out.println("Adım 5 (120 * 1): " + faktoriyel); // Sonuç: 120
        
        System.out.println("5! Nihai Sonuç: " + faktoriyel);
    }
}
