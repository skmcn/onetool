import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateWorld {
    public static void main(String[] args) {
        
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
