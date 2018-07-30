package cn.edu.lingnan.usersys.commom.exception;

public class serviceException extends RuntimeException{

	 /**
     * 默认构造方法
     */
	public serviceException(){
		
	}
	/**
	 * 构造方法
	 * @param arg0，异常的详细信息
	 */
	public serviceException(String arg0){
		super(arg0);
	}
	/**
	 * 构造方法
	 * @param arg0，产生异常的原因
	 */
	public serviceException(Throwable arg0){
		super(arg0);
	}
	/**
	 * 构造方法
	 * @param arg0，异常的详细信息
	 * @param arg1，产生异常的原因
	 */
	public serviceException(String arg0,Throwable arg1){
		super(arg0,arg1);
	}
}
