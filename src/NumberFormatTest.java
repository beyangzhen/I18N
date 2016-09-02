import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * 
 *  getNumberInstance(Locale locale)  ：获得具有多种用途  的NumberFormat实例对象
 *	getIntegerInstance(Locale locale) ：获得处理整数      的NumberFormat实例对象
 *	getCurrencyInstance(Locale locale)：获得处理货币      的NumberFormat实例对象
 *	getPercentInstance(Locale locale) ：获得处理百分比数值的NumberFormat实例对象
 *
 *  @author yz
 *
 */
public class NumberFormatTest {

	public static void main(String[] args) {
		/* 获取各种类型货币 */
		int price = 10;
		String p = NumberFormat.getCurrencyInstance(Locale.CHINA).format(price);
		System.out.println(p);
		
		/* 解析String型，货币 */
		String  s = "￥10.00";
		try {
			Number number = NumberFormat.getCurrencyInstance(Locale.CHINA).parse(s);
			System.out.println(number);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
