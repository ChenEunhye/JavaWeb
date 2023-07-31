package txt.dao;


import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import txt.bean.HuDongBean;
import txt.util.DBHelp;

public class HuDongDao {
	private static final String HudongList = null;
	private static List<HuDongBean> hudongList = new ArrayList<HuDongBean>();

	 public static void inseretForHuDong(HuDongBean nicheng) {
		  
		  Connection conn=DBHelp.getConn(); 
		     String sql="insert into hudong (nicheng,pinglun,userid) values(?,?,?)";
		     PreparedStatement ps =null;
		     ResultSet rs =null;
		     
		  try {
		   ps = conn.prepareStatement(sql);
		   ps.setString(1,nicheng.getNicheng());
		   ps.setString(2,nicheng.getPinglun());
		   ps.setInt(3,nicheng.getUserId());
		  int res = ps.executeUpdate();
		   if (res ==1) {}}
		   catch (SQLException e) {
		   e.printStackTrace();
		  }finally {
		   DBHelp.closeDBResource(rs, ps, conn);
		  }
		 }
	 public static boolean deleteForHuDong(String id) {
		  	 Connection conn=DBHelp.getConn(); 
		     String sql="delete from hudong where id=?";
		     PreparedStatement ps =null;
		     ResultSet rs =null;
		     int res=0;
		  try {
		   ps = conn.prepareStatement(sql);
		   ps.setString(1,id);
		   res = ps.executeUpdate();
		  }
		   catch (SQLException e) {
		   e.printStackTrace();
		  }finally {
		   DBHelp.closeDBResource(rs, ps, conn);
		  }
		  return true;
		 }
	public static List<HuDongBean> selectById() {
		Connection con = DBHelp.getConn();
		String sql = null;
			sql="select * from hudong";
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			ArrayList<HuDongBean> hudongList = new ArrayList<HuDongBean>();
			while(rs.next()) {
				int id = rs.getInt("id");
				String nicheng = rs.getString("nicheng");
				String pinglun = rs.getString("pinglun");
				int userId = rs.getInt("userid");
				HuDongBean hudong = new HuDongBean(id,nicheng, pinglun, userId);
				System.out.println(hudong);
				hudongList.add(hudong);
				
			}
			
			System.out.println(hudongList);
			return hudongList;
		
		}catch(SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBHelp.closeDBResource(rs, ps, con);}
		return null;
			
		}

	public static void main(String[] args) {
		HuDongBean hudongData = new HuDongBean(0, null,1);
		selectById();
		inseretForHuDong(hudongData);
		
	}
}
