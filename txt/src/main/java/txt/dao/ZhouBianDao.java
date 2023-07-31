package txt.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import txt.bean.ZhouBianBean;
import txt.util.DBHelp;

public class ZhouBianDao {
	public static void selectForHomeDataBySort(ZhouBianBean zhoubianDate) {
		  Connection con = DBHelp.getConn();
		  String sql = null;
		  if(zhoubianDate.getSort()==0)
		  sql="select * from zhoubian ";
		  else
		   sql="select * from zhoubian where sort=?";
		  PreparedStatement ps = null;
		  ResultSet rs = null;
		  try {
		   ps = con.prepareStatement(sql);
		   if(zhoubianDate.getSort()!=0) 
		    ps.setInt(1, zhoubianDate.getSort());
		   rs = ps.executeQuery();
		   ArrayList<ZhouBianBean> zhoubianList = new ArrayList<ZhouBianBean>();
		   while(rs.next()) {
		    int id = rs.getInt("id");
		    String xinxi = rs.getString("xinxi");
		    String dizhi = rs.getString("dizhi");
		    BigDecimal jiage = rs.getBigDecimal("jiage");
		    int sort = rs.getInt("sort");
		    int kucun = rs.getInt("kucun");
		    ZhouBianBean zhoubian = new ZhouBianBean(id, xinxi, dizhi, sort, jiage, kucun);
		    zhoubianList.add(zhoubian);
		   }
		   zhoubianDate.setZhoubianList(zhoubianList);
		   System.out.println(zhoubianDate);
		  
		  }catch(SQLException e) {
		   //TODO Auto-generated catch block
		   e.printStackTrace();
		  }finally {
		   DBHelp.closeDBResource(rs, ps, con);
		  
		  }
		  
		 }
	
	public static void updatekucun(ZhouBianBean zhoubianData) {
		Connection con = DBHelp.getConn();
		String sql = "update zhoubian set kucun = ? where id = ?";	
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, zhoubianData.getKucun()-1);
			ps.setInt(2, zhoubianData.getId());
			ps.executeQuery();
		}catch(SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBHelp.closeDBResource(rs, ps, con);
		
		}
		
			
	}
	
	public static void main(String[] args) {
		ZhouBianBean zhoubianData = new ZhouBianBean(0, null);
		selectForHomeDataBySort(zhoubianData);
	}
}
