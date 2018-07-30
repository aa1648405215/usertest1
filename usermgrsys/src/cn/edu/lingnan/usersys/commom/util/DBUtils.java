package cn.edu.lingnan.usersys.commom.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 连接数据库
 * @author 男神infinite
 *
 */

public class DBUtils {
	/**
	 * 连接数据库方法
	 * @return
	 */
	public  static Connection getConnection() {		
		Connection conn = null;		
	       try {
			Class.forName("oracle.jdbc.driver.OracleDriver");// 注册驱动程序
			conn = DriverManager.getConnection //获取数据库连接
						("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "1234");
		      } catch (ClassNotFoundException e) {
			   System.out .println("mysql的驱动程序找不到啦，看一看是不是对应的jar包没有加载啊？");
			   e.printStackTrace();
		      }catch (SQLException e) {
			   System.out.println("获取数据库连接时出现运行SQL语句错误");
				e.printStackTrace();
			}
	       return conn;    
		}
	/**
	 * 开启事务
	 * @param conn
	 */
	public static void Begintransaction (Connection conn){
		try {
			//将事务的自动提交模式设为假
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			// 将异常封装为自定义异常
			//e.printStackTrace();
		}
	}
	/**
	 * 提交事务
	 * @param conn
	 */
	public static void Commit (Connection conn){
		try {
			//提交事务
			conn.commit();
			//将事务的自动提交模式设为真
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			// 将异常封装为自定义异常
			e.printStackTrace();
		}
	}
	/**
	 * 回滚事务
	 * @param conn
	 */
	public static void Rollback (Connection conn){
		try {
			//回滚事务
			conn.rollback();
			//将事务的自动提交模式设为真
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			// 将异常封装为自定义异常
			e.printStackTrace();
		}
	}
	/**
	 * 关闭数据库连接
	 * @param conn
	 */
	public static void CloseConnection (Connection conn){
		try {
			 //如果数据库连接对象不为空，则关闭该对象
			    if(conn!=null){
				conn.close();
				}
			} catch (SQLException e) {
				// 将异常封装为自定义异常
				e.printStackTrace();
			}	
	}
	public static void CloseStatment (ResultSet rs,Statement stmt){
		try {
			//如果查询结果集对象不为空，则关闭该对象
		if(rs!=null){			
		   rs.close();			
		}
		//如果声明对象不为空，则关闭该对象
		if (stmt!=null) {
			stmt.close();
		}
		} catch (SQLException e) {
			// 将异常封装为自定义异常
			e.printStackTrace();
		}
	}
}
