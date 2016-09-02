import java.util.Locale;
import java.util.ResourceBundle;

/*
 * struts2的I18N分为 action级    （action名字_en_US.properties，文件放在包下）
 *		          package级（package_en_US.properties，     文件放在包下）
 *			   	  app级             （这部分随便取名_en_US.properties， 文件放在src下）
 *						   --由于app级的前缀名不确定，所以 1.（struts下）struts.xml中得配置<constant name="struts.custom.i18n.resources" value="bbs" />
 *											    2.（非struts下）如该项目配置:ResourceBundle res1 = ResourceBundle.getBundle("app", Locale.CHINA);
 *
 *
*/
public class Test {
	public static void main(String[] args) {
		// CHINA   --> ("zh", "CN") app_zh_CN.properties
		// CHINESE --> ("zh", "")   app_zh.properties
		ResourceBundle res1 = ResourceBundle.getBundle("app", Locale.CHINA); //获取properties配置文件
		ResourceBundle res2 = ResourceBundle.getBundle("app", Locale.US);
		System.out.println(res1.getString("welcome.msg" ));
		System.out.println(res2.getString("welcome.msg" ));
	}
}
