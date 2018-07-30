package cn.edu.lingnan.usersys.usermgr.domain;

import java.util.jar.Attributes.Name;

/**
 * 用户信息类
 * @author 男神infinite
 *
 */
public class UserVO {
    private int id; //主键
    private String name;  //用户名
    private String password;  //密码
    private String mail;   //邮箱
    private String power;   //权限
    private String birth;    //生日
    private String userId;
    
    /**
     * 取得用户编号
     * @return 编号
     */
    public String getUserId(){
    	return userId;
    }
    /**
     * 设置用户编号为指定参数的值
     * @param userId 用户编号
     */
    public void setUserId(String userId){
    	this.userId = userId;
    }
    /**
     * 取得编号
     * @return 编号
     */
    public int getId(){
    	return id;
    }
    /**
     * 设置编号为指定参数的值
     * @return 编号
     */
    public void setId(int id){
    	this.id = id;   
    }
    /**
     * 取得用户名
     * @return 用户名
     */
    public String getName(){
    	return name;
    }
    /**
     * 设置用户名为指定参数的值
     * @return 用户名
     */
    public void setName(String name){
    	this.name = name;
    }
    /**
     * 取得密码
     * @return 密码
     */
    public String getPassword(){
    	return password;
    }
    /**
     * 设置密码为指定参数的值
     * @return 密码
     */
    public void setPassword(String password){
    	this.password = password;
    }
    /**
     * 取得邮箱
     * @return 邮箱
     */
    public String getMail(){
    	return mail;
    }
    /**
     * 设置邮箱为指定参数的值
     * @return 邮箱
     */
    public void setMail(String mail){
    	this.mail = mail;
    }
    /**
     * 取得权限
     * @return 权限
     */
    public String getPower(){
    	return power;
    }
    /**
     * 设置权限为指定参数的值
     * @return 权限
     */
    public void setPower(String power){
    	this.power = power;
    }
    /**
     * 取得生日
     * @return 生日
     */
    public String getBirth(){
    	return birth;
    }
    /**
     * 设置生日为指定参数的值
     * @return 生日
     */
    public void setBirth(String birth){
    	this.birth = birth;
    }
}
