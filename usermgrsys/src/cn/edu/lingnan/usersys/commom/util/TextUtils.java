package cn.edu.lingnan.usersys.commom.util;

public class TextUtils {
    public static boolean isEmpty(CharSequence str){
    	if(str == null || str.length() == 0)
    		return true;
    	else {
			return false;
		}
    }
}
