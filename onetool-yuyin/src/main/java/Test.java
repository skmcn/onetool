import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		String aaa = "";
		for (int i = 0; i < 10; i++) {
			aaa += (aaa == "" ? "" : ",") + "a" + (i + 1);
		}
		System.out.println(aaa);

		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMinimumIntegerDigits(4);
		nf.setGroupingUsed(false);
		System.out.println(nf.format(13));


		SimpleDateFormat sdf = new SimpleDateFormat("今天是 " + "yyyy 年 MM 月 dd 日 E HH 点 mm 分 ss 秒");
		System.out.println(sdf.format(new Date()));
		
		/*
		Integer aa = 100000000;
		
		Integer a = 2;		// 单价
		Integer b = 10;		// 次/天
		Integer c = 20000;	// 数量
		Integer d = 1;		// 天数
		System.out.println(10000*160 + "--" + (aa / (a * b * c)) / 30);
		*/
		
		/*
		Integer aa = 2000000;
		
		Integer a = 10;		// 单价
		Integer b = 1;		// 次/天
		Integer c = 10000;	// 数量
		System.out.println(aa / (a * b * c));
		*/
		
		
	}
}