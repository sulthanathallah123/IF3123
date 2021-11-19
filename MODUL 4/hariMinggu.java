import java.time.DayOfWeek;
import java.time.LocalDate;

public class hariMinggu {
    public static void main(String[] args) {
        int banyak_hari_minggu = 0;
        for (int year = 1901 ; year <2001 ; year++ ){
            for (int month = 1 ; month <= 12 ; month++){
                if (LocalDate.of(year, month, 1).getDayOfWeek() == DayOfWeek.SUNDAY){
                    banyak_hari_minggu++;
                }
            }
        }
        System.out.println("Banyak hari minggu antara 1 Januari 1901 dan 31 Desember 2000 adalah = "+banyak_hari_minggu);
    }
}
