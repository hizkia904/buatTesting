public class VersiTesting {
    public static String test(String Matkul,int jamMulai,int jamSelesai,String nilaiMasukan,int[] jadwalAnda){
        
        //jadwal suatu mata kuliah
        System.out.println("Masukkan nama matakuliah");
        String namaMatkul = Matkul;
        System.out.println("Masukkan jadwal mulai matakuliah " + namaMatkul);
        int jamMulaiMatakuliah = jamMulai;
        System.out.println("Masukkan jadwal selesai matakuliah " + namaMatkul);
        int jamSelesaiMataKuliah = jamSelesai;
        int mulai = jamMulaiMatakuliah - 7;
        int selesai = jamSelesaiMataKuliah - 7;
        int[] jadwalASD = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = mulai; i <= selesai; i++) {
            jadwalASD[i] = 1;
        }
        for (int i = 0; i < 12; i++) {
            System.out.print(jadwalASD[i]);
        }
        System.out.println("");
       
        //masukkan nilai suatu matakuliah
        System.out.println("Masukkan nilai matakuliah " + namaMatkul);
        String nilai = nilaiMasukan ;
        
        
        //jadwal calon asisten dosen
        System.out.println("Masukkan jadwal anda");
        int[] jadwalCalonASDOS = jadwalAnda;
        // for (int i = 0; i < 12; i++) {
        //     jadwalCalonASDOS[i] = sc.nextInt();
        // }
        for (int i = 0; i < 12; i++) {
            System.out.print(jadwalCalonASDOS[i]);
        }
        System.out.println("");
        
        //cek jadwal
        int[] banding = new int[12];
        for (int i = 0; i < 12; i++) {
            banding[i] = jadwalASD[i] + jadwalCalonASDOS[i];
        }
        for (int i = 0; i < 12; i++) {
            System.out.print(banding[i]);
        }

        boolean result1 = true;
        for (int i = mulai; i <= selesai; i++) {
            if (jadwalASD[i] == banding[i]) {
                result1 = true;
            } else {
                result1 = false;
            }
        }
        System.out.println();
        String hasil = "";
        if(result1){
            hasil+="Jadwal tidak bentrok";
        }
        else{
            hasil+="Bentrok";
        }
        
        //cek nilai  
        boolean result2 = true;
        if(nilai.equals("A") || nilai.equals("A-") || nilai.equals("B+") || nilai.equals("B") || nilai.equals("B-")){
            hasil+="\nNilai masuk kedalam kriteria";
            result2 = true;
        }
        else {
            hasil+="\nNilai tidak masuk kedalam kriteria";
            result2 = false;
        }
        
        System.out.println();
        if(result1 && result2){
            hasil+="\nCocok menjadi asisten dosen " + namaMatkul;
        }
        else{
            hasil+="\nTidak cocok menjadi asisten dosen " + namaMatkul;
        }
        return hasil;
    }
}
