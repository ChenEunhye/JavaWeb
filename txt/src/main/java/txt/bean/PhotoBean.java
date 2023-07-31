package txt.bean;

import java.util.ArrayList;

public class PhotoBean {
	private int sort;
	private ArrayList<PhotoBean> photoList;
	private String dizhi;
	private int id;

	public PhotoBean() {
		super();
	}

	public PhotoBean(int sort) {
		super();
		this.sort = sort;
	}
    public PhotoBean(String dizhi) {
    	super();
		this.dizhi = dizhi;
    }
    
	public PhotoBean(int id, String dizhi, int sort2) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.dizhi = dizhi;
		this.sort = sort;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getDizhi() {
		return dizhi;
	}

	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<PhotoBean> getPhotoList() {
		return photoList;
	}

	public void setPhotoList(ArrayList<PhotoBean> photoList) {
		this.photoList = photoList;
	}

	@Override
	public String toString() {
		return "PhotoBean [sort=" + sort + ", photoList=" + photoList + ", dizhi=" + dizhi + ", id=" + id + "]";
	}


	
	

}
