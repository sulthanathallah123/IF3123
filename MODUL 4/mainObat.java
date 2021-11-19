import java.util.Scanner;

public class mainObat extends obat{
    public static void main(String[] args) {
        int usia;
        char jenis_kelamin;
        int beratBadan;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jenis kelamin = ");
        jenis_kelamin = input.next().charAt(0);
        System.out.println("Masukkan usia = ");
        usia = input.nextInt();
        System.out.println("Masukkan berat badan (dibulatkan) = ");
        beratBadan = input.nextInt();
        cariObat(usia, jenis_kelamin, beratBadan);
    }
}
