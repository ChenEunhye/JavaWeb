package txt.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import txt.bean.PhotoBean;
import txt.util.DBHelp;

public class PhotoDao{
	private static final String PhotoList = null;
	private static List<PhotoBean> photoList = new ArrayList<PhotoBean>();

	public static List<PhotoBean> selectById() {
		Connection con = DBHelp.getConn();
		String sql = null;
			sql="select * from photo";
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			ArrayList<PhotoBean> photoList = new ArrayList<PhotoBean>();
			while(rs.next()) {
				int id = rs.getInt("id");
				String dizhi = rs.getString("dizhi");
				int sort = rs.getInt("sort");
				PhotoBean pho = new PhotoBean(id,dizhi, sort);
				System.out.println(pho);
				photoList.add(pho);
			}
			
			System.out.println(photoList);
			return photoList;
		
		}catch(SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBHelp.closeDBResource(rs, ps, con);}
		return null;
			
		}
	private static String getImgpath() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		PhotoBean photoData = new PhotoBean(0, null,1);
		selectById();
		
	}
}