package txt.util;

import java.sql.*;


public class DBHelp {
	
	public static Connection getConn(){
		Connection conn = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/txt?useSSL=true&useUnicode=true&"
				+ "characterEncoding=utf-8&serverTimezone=Asia/Shanghai", "root", "123456");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
		}
	
	public static void closeDBResource(ResultSet rs, Statement stm, Connection con) {
		try {
			if (rs != null) {
				rs.close();
				rs = null;
			}
			if (stm != null) {
				stm.close();
				stm = null;
			}
			if (con != null) {
				con.close();
				con = null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("关闭数据库出现了问题");
			e.printStackTrace();
		}

	}
    public  void printTableDataForTest(){
    	Connection conn=getConn();
    	String sql="select * from users";
    	PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
	    	ResultSet rs=ps.executeQuery();;
	    	while(rs.next()){
	    		int id=rs.getInt(1);
	    	    String tel=rs.getString("tel");
	    	    String username=rs.getString(3);
	    	    String email=rs.getString(4);
	    	    String pwd=rs.getString(5);
	    	    

	    	    System.out.print(id+"\t");
	    	    System.out.print(tel+"\t");	
	    	    System.out.print(username+"\t");
	    	    System.out.print(email+"\t");
	    	    System.out.print(pwd+"\t\n");
	    	   
    	
	    	}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	    	
    }
    public static void main(String args[]){
   	 
   	 new DBHelp().printTableDataForTest();
    }

	public static ResultSet excuteQuery(String sql) {
		// TODO Auto-generated method stub
		return null;
	}	
}