public class Main {
    public static void main(String[] args) {
        // Latihan 1
        Bentuk b = new Bentuk("Merah");
        b.printInfo();
 
        BujurSangkar bs = new BujurSangkar(5, "Biru");
        bs.printInfo();
 
        // Latihan 2
        Lingkaran l = new Lingkaran(7, "Hijau");
        l.printInfo();
 
        // Latihan 3
        Silinder s = new Silinder(10, 7, "Kuning");
        s.printInfo();
    }
}
