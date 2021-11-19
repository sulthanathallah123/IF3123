public class obat {
    public static void cariObat(int usia, char jenis_kelamin, int beratBadan){
        if ( (jenis_kelamin == 'l' & usia < 21 & beratBadan >= 150) || (jenis_kelamin == 'p' & usia < 21 & beratBadan < 150) ){
            System.out.println("Kondisi Pasien sesuai dengan ketentuan Obat 1, maka harus diberikan obat 1.");
        }else if ( (jenis_kelamin == 'l' & usia >= 21 & beratBadan >= 150) || (jenis_kelamin == 'l' & usia <21 & beratBadan >= 150) ){
            System.out.println("Kondisi Pasien sesuai dengan ketentuan Obat 2, maka harus diberikan obat 2.");
        }else if ( (jenis_kelamin == 'l' & usia < 21 & beratBadan < 150) || (jenis_kelamin == 'p' & usia >=21 & beratBadan<150) ){
            System.out.println("Kondisi Pasien sesuai dengan ketentuan Obat 3, maka harus diberikan obat 3.");
        }else {
            System.out.println("Kondisi pasien tidak sesuai dengan obat yang kami miliki");
        }
    }
}
