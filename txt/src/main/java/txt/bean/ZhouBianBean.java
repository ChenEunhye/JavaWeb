package txt.bean;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ZhouBianBean {
	private int id;
	private String xinxi;
	private String dizhi;
	private int sort;
	private BigDecimal jiage;
	private int kucun;
	private String keyWord;
	private String action;
	private ArrayList<ZhouBianBean> zhoubianList;
	
	public ZhouBianBean() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getXinxi() {
		return xinxi;
	}

	public void setXinxi(String xinxi) {
		this.xinxi = xinxi;
	}

	public String getDizhi() {
		return dizhi;
	}

	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public BigDecimal getJiage() {
		return jiage;
	}

	public void setJiage(BigDecimal jiage) {
		this.jiage = jiage;
	}

	public int getKucun() {
		return kucun;
	}

	public void setKucun(int kucun) {
		this.kucun = kucun;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public ArrayList<ZhouBianBean> getZhoubianList() {
		return zhoubianList;
	}

	public void setZhoubianList(ArrayList<ZhouBianBean> zhoubianList) {
		this.zhoubianList = zhoubianList;
	}

	@Override
	public String toString() {
		return "ZhouBianBean [id=" + id + ", xinxi=" + xinxi + ", dizhi=" + dizhi + ", sort=" + sort + ", jiage="
				+ jiage + ", kucun=" + kucun + ", keyWord=" + keyWord + ", action=" + action + ", zhoubianList="
				+ zhoubianList + "]";
	}

	public ZhouBianBean(int id, String xinxi, String dizhi, int sort, BigDecimal jiage, int kucun, String keyWord,
			String action, ArrayList<ZhouBianBean> zhoubianList) {
		super();
		this.id = id;
		this.xinxi = xinxi;
		this.dizhi = dizhi;
		this.sort = sort;
		this.jiage = jiage;
		this.kucun = kucun;
		this.keyWord = keyWord;
		this.action = action;
		this.zhoubianList = zhoubianList;
	}

	public ZhouBianBean(int sort, String keyWord) {
		// TODO Auto-generated constructor stub
		this.sort=sort;
		this.keyWord=keyWord;
	}

	public ZhouBianBean(int id, String xinxi, String dizhi, int sort, BigDecimal jiage, int kucun) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.xinxi = xinxi;
		this.dizhi = dizhi;
		this.sort = sort;
		this.jiage = jiage;
		this.kucun = kucun;
	}

	public ZhouBianBean(String action, int id,int kucun) {
		this.action = action;
		this.id = id;
		this.kucun=kucun;
	}

}
