public class Kelipatan {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int hasil_kelipatan = 0;
        for (int i= 0 ; i < 1000 ; i++){
            if (i % 3 == 0){
                hasil_kelipatan = hasil_kelipatan + i;
            }else if (i % 5 == 0){
                hasil_kelipatan = hasil_kelipatan + i;
            }
        }
        System.out.println(hasil_kelipatan);
    }
}
