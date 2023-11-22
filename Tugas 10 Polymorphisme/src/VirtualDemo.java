public class VirtualDemo{
    public static void main (String[] args){
        Gaji s = new Gaji ("Wahyu", "KUBAR", 3, 5000.00);
        Pegawai e = new Gaji ("Zelfitrio", "Batusangkar", 2, 2500.00);
        Pegawai p = new Pegawai("Rodes", "Padangpanjang", 1);

        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");  
        s.mailCheck();
        System.out.println(s.Kelas);
        
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        e.mailCheck();
        System.out.println(e.Kelas);
        
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        p.mailCheck();
        System.out.println(p.Kelas);
    }
}
