package txt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import txt.bean.UsersBean;
import txt.util.DBHelp;

public class UserDao {
 
 public static void selectForLogin(UsersBean user) {
  
  Connection conn=DBHelp.getConn();
     String sql="select * from users where usr=? and pwd=?";
     PreparedStatement ps =null;
     ResultSet rs =null;
  try {
   ps = conn.prepareStatement(sql);
   ps.setString(1,user.getUsr());
   ps.setString(2,user.getPwd());
   rs=ps.executeQuery();
      while(rs.next()){
       int id=rs.getInt("id");
          String tel=rs.getString("tel");
          String email=rs.getString("email");       
          user.setId(id);
          user.setTel(tel);
          user.setEmail(email);
      }
  }
   catch (Exception e) {
   user.setId(-1);
  }finally {
   DBHelp.closeDBResource(rs, ps, conn);
  }
 }
 public static int selectUsernameForRegister(UsersBean user) {
	  
	 Connection conn=DBHelp.getConn();
     String sql="select count(*) as number from users where usr=?";
     PreparedStatement ps =null;
     ResultSet rs =null;
     int res = 0;
  try {
   ps = conn.prepareStatement(sql);
   ps.setString(1,user.getUsr());
   rs=ps.executeQuery();
   rs.next();
   res = Integer.parseInt(rs.getString("number")) ;
  }catch (Exception e) {
	  e.printStackTrace();
  }finally {
   DBHelp.closeDBResource(rs, ps, conn);
  }
  return res>0?1:0;
 }
 public static void inseretForLogin(UsersBean user) {
		  
		  Connection conn=DBHelp.getConn(); 
		     String sql="insert into users (tel,usr,email,pwd) values(?,?,?,?)";
		     PreparedStatement ps =null;
		     ResultSet rs =null;
		  try {
		   ps = conn.prepareStatement(sql);
		   ps.setString(1,user.getTel());
		   ps.setString(2,user.getUsr());
		   ps.setString(3,user.getEmail());
		   ps.setString(4,user.getPwd());
		   
		   
		   int res = ps.executeUpdate();
		   if (res ==1) {}
		   
		  }
		   catch (SQLException e) {
		   e.printStackTrace();
		  }finally {
		   DBHelp.closeDBResource(rs, ps, conn);
		  }
		 }
     public static void main(String args[]){
         UsersBean user = new UsersBean("ceh","123456");
         UsersBean usar = new UsersBean("123","ww","123","123");
         new UserDao().selectForLogin(user);
         new UserDao().inseretForLogin(usar);
        } 
 }

