package cn.edu.lingnan.usersys.usermgr.business.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.edu.lingnan.usersys.commom.exception.daoException;
import cn.edu.lingnan.usersys.commom.util.DBUtils;
import cn.edu.lingnan.usersys.usermgr.domain.UserVO;

/**
 * 用户dao接口的实现类
 * @author 男神infinite
 *
 */
public  class UserDaoImpl implements UserDao {
  /**
   * 数据库连接
   */
	private Connection conn;
	/**
	 * 构造方法
	 * @param conn 数据库连接
	 */
	public UserDaoImpl(Connection conn){
		//给属性赋初始化值
		this.conn = conn;
	}
	/**
	 * 用户登录
	 * @param user 用户信息
	 * @return 用户信息
	 */
	public UserVO login(String name,String password){
		//声明结果集对象变量，用于保存数据库查询结果
		ResultSet rs = null;
		//声明预编译的声明对象变量，用于进行数据库操作的载体
		PreparedStatement prep = null;
		//声明用户对象变量，用于保存从结果集中提取出来的数据
		UserVO user = null;
		try {
		//调用连接对象的	.prepareStatement方法，得到预编译对象，赋值给预编译对象变量
	    prep = conn.prepareStatement("select * from t_user where name=? and password=?");
		//调用预编译对象的setXXX方法，给？号赋值
	    prep.setString(1, name);
		prep.setString(2, password);
		//调用预编译对象的executeQuery方法，执行查询操作，返回查询结果，赋值给结果集对象变量
		rs=prep.executeQuery();
		if(rs.next()){
			//创建一个新用户对象，赋值给用户对象变量
			user = new UserVO();
			/*
			 * 调用结果集对象的getXXX方法，取出各个字段的值，
			 * 然后再调用用户对象的setXXX方法，给属性赋值
			 * 最后新创建的对象中包含了查询结果中的所有字段的值
			 */
			user.setId(rs.getInt("id"));
			user.setUserId(rs.getString("userid"));
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));
			user.setMail(rs.getString("mail"));
			user.setPower(rs.getString("power"));
			user.setBirth(rs.getString("birth"));
		   }
		//如果出现异常，输出异常信息
		} catch (SQLException e) {
			System.out.println("在插入用户的时候出错了，错误信息是："+e.getMessage());
			//将异常封装 成自定义异常
			throw new daoException("登录时查询数据出错",e);
			//e.printStackTrace();
		}finally{
			//调用数据库工具类，关闭结果集对象和声明对象
			DBUtils.CloseStatment(rs, prep);
		}
		/*
		 * 最后，返回用户对象，如果查询结果不为空，该对象中封装了查询结果中的数据
		 * 如果查询结果为空，该对象为空值null
		 */
		return user;
	}
	
	/**
	 * 注册用户/添加用户
	 */
	public boolean addUser(UserVO user) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int findMaxId() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
