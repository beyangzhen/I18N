import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
	
	// FULL  : 2016年9月2日 星期五 下午03时21分47秒 CST
	// MEDIUM：2016-9-2 15:21:22
	// SHORT ：16-9-2 下午3:21
	public static void main(String[] args) {
		Date date = new Date();
		int style = DateFormat.FULL;
		
		/* 取日期 */
		String date = DateFormat.getDateInstance(style , Locale.CHINESE).format(date);
		System.out.println(date);
		
		/* 取时间 */
		String time = DateFormat.getTimeInstance(style, Locale.CHINESE).format(date);
		System.out.println(time);
		
		/* 完整日期时间 */
		String datetime = DateFormat.getDateTimeInstance(style, style, Locale.CHINESE).format(date);
		System.out.println(datetime);
		
		/* 解析String型，日期 */
		String dt = "2016年9月2日 星期五 下午03时21分47秒 CST";
		try {
			Date parse = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.CHINESE).parse(dt);
			System.out.println(parse.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
