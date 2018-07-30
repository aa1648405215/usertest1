package cn.edu.lingnan.usersys.commom.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 类型转换工具类
 * @author 男神infinite
 *
 */
public class TypeUtils {
    /**
     * 字符串转化为日期
     * @param str 指定字符串
     * @return 转换后的日期
     */
	public static Date strToDate(String str){
		Date date = null;
		//设置要格式化的日期格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			//调用parse()方法，将字符串解析为指定格式的日期类型
			date = sdf.parse(str);
		} catch (ParseException e) {
			// 将异常封装为自定义异常
			//e.printStackTrace();
		}
		//转换后的值
		return date;
	}
	/**
	 * 日期转换为字符串
	 * @param date 指定日期格式
	 * @return 转换后的值
	 */
	public static String dateToString(Date date){
		String str= null;
		//设置要格式化的日期格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
		//调用format()方法，将日期格式化为字符串 
		str = sdf.format(date);
	    } catch (Exception e) {
		// 将异常封装为自定义异常
		//e.printStackTrace();
	    }
		//返回转换后的值
		return str;
	}
	
	public static boolean checkEmail(String email){
		try {
		String mail = email.replaceAll
				("^[A-Za-z0-9\\u4e00-\\u9fa5]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$","");
		if (mail.length()==0){
			return true;
		}else {
			System.out.println("邮箱格式错误");
			return false;
		}
		} catch (Exception e) {
			// 将异常封装为自定义异常
			//e.printStackTrace();
		}
		return false;
				
	}
	

}
