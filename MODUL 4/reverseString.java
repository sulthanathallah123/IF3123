import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        String inputan;
        String reverse = "";
        char tampung;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kata yang ingin di reverse = ");
        inputan = input.nextLine();
        for (int i = 0; i<inputan.length() ; i++){
            tampung = inputan.charAt(i);
            reverse = tampung+reverse;
        }
        System.out.println("Kata asli =  "+inputan+"\nReverse = "+reverse);
    }
}
