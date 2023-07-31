package txt.bean;

import java.util.ArrayList;

public class HuDongBean {
	private ArrayList<HuDongBean> hudongList;
	private int id;
	private int userId;
	private String nicheng;
	private String pinglun;
	
	public ArrayList<HuDongBean> getHudongList() {
		return hudongList;
	}
	public void setHudongList(ArrayList<HuDongBean> hudongList) {
		this.hudongList = hudongList;
	}
	public int getId() {
		return id;
	}
	public int getUserId() {
		System.out.print("调用了我~");
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNicheng() {
		return nicheng;
	}
	public void setNicheng(String nicheng) {
		this.nicheng = nicheng;
	}
	public String getPinglun() {
		return pinglun;
	}
	public void setPinglun(String pinglun) {
		this.pinglun = pinglun;
	}
	@Override
	public String toString() {
		return "HuDongBean [hudongList=" + hudongList + ", id=" + id + ", nicheng=" + nicheng + ", pinglun=" + pinglun
				+ "]";
	}
	public HuDongBean() {
		super();
	}
	public HuDongBean(ArrayList<HuDongBean> hudongList) {
		super();
		this.hudongList = hudongList;
	}
	public HuDongBean(String nicheng) {
		super();
		this.nicheng = nicheng;
	}
	public HuDongBean(int id) {
		super();
		this.id = id;
	}
	public HuDongBean(int id, String nicheng, String pinglun) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.nicheng = nicheng;
		this.pinglun = pinglun;
	}
	public HuDongBean(int i, Object object, int j) {
		// TODO Auto-generated constructor stub
	}
	public HuDongBean(String nicheng2, String pinglun2, int id) {
		// TODO Auto-generated constructor stub
		this.nicheng = nicheng2;
		this.pinglun = pinglun2;
		this.userId = id;
	}
	
	public HuDongBean(int id1,String nicheng2, String pinglun2, int id) {
		// TODO Auto-generated constructor stub
		this.id = id1;
		this.nicheng = nicheng2;
		this.pinglun = pinglun2;
		this.userId = id;
	}
	
	
	
	
	
	
	
	
}
