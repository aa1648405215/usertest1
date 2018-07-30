package cn.edu.lingnan.usersys.usermgr.business.service;

import cn.edu.lingnan.usersys.usermgr.domain.UserVO;

/**
 * 用户service接口
 * @author 男神infinite
 *
 */
public interface UserService {
  
	 /**
	    * 注册用户/添加用户
	    * @param user 用户信息
	    * @return 成功返回true，失败返回false
	    */
		public boolean addUser(UserVO user);
		/**
		 * 用户登录
		 * @param name 用户信息
		 * @param password 用户信息
		 * @return
		 */
		public UserVO login(String name,String password);
		
		/**
		 * 查找最大id值
		 * @return 最大id值
		 */
		public int findMaxId();
}
