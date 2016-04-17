import java.util.Locale;
import java.util.ResourceBundle;

/*
 * struts2��I18N��Ϊ action��    ��action����_en_US.properties���ļ����ڰ��£�
 *		          package����package_en_US.properties��     �ļ����ڰ��£�
 *			   	  app��             ���ⲿ�����ȡ��_en_US.properties�� �ļ�����src�£�
 *						   --����app����ǰ׺����ȷ�������� 1.��struts�£�struts.xml�е�����<constant name="struts.custom.i18n.resources" value="bbs" />
 *											    2.����struts�£������Ŀ����:ResourceBundle res1 = ResourceBundle.getBundle("app", Locale.CHINA);
*/
public class Test {
	public static void main(String[] args) {
		ResourceBundle res1 = ResourceBundle.getBundle("app", Locale.CHINA); //��ȡproperties�����ļ�
		ResourceBundle res2 = ResourceBundle.getBundle("app", Locale.US);
		System.out.println(res1.getString("welcome.msg" ));
		System.out.println(res2.getString("welcome.msg" ));
	}
}
