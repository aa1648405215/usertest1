package cn.edu.lingnan.usersys.commom.exception;

public class daoException extends RuntimeException {
    /**
     * 默认构造方法
     */
	public daoException(){
		
	}
	/**
	 * 构造方法
	 * @param arg0，异常的详细信息
	 */
	public daoException(String arg0){
		//调用父类的super(String)构造方法，重写详细的异常信息
		super(arg0);
	}
	/**
	 * 构造方法
	 * @param arg0，产生异常的原因
	 */
	public daoException(Throwable arg0){
		super(arg0);
	}
	/**
	 * 构造方法
	 * @param arg0，异常的详细信息
	 * @param arg1，产生异常的原因
	 */
	public daoException(String arg0,Throwable arg1){
		super(arg0,arg1);
	}
}
