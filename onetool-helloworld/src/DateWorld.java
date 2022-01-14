import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateWorld {
    public static void main(String[] args) {
        System.out.println((1*1024*1024)/4);        // 1M 262144中文
        System.out.println(1*1024*1024*108);        // 108T有113246208M
        System.out.println(113246208/60/60/24);     // 1310天
        System.out.println(113246208/60/60/24/365);
    }
    public void t02 () {
        SimpleDateFormat dateFormatYYMMDDTT = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DAY_OF_MONTH, 3);// 今天+3天
        System.out.println(dateFormatYYMMDDTT.format(c.getTime()));
    }
    
    public void t01 () {
        Date date = new Date();
        SimpleDateFormat dateFormatYYMMDDTT = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(dateFormatYYMMDDTT.format(date));
        System.out.println("----------------------------");
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DAY_OF_MONTH, 3);// 今天+3天
        System.out.println(dateFormatYYMMDDTT.format(c.getTime()));
    }
    
}
