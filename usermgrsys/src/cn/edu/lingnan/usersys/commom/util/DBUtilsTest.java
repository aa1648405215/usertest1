package cn.edu.lingnan.usersys.commom.util;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

/**
 * 数据库连接测试
 * @author 男神infinite
 *
 */
public class DBUtilsTest {

	@Test  //注解 数据库连接测试
	public void testGetConnection() {
		Connection conn = DBUtils.getConnection();
		System.out.println(conn);
	}

}
