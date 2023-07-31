package txt.service;


import txt.dao.ZhouBianDao;
import txt.bean.ZhouBianBean;

public class ZhouBianService {
	
	public static void preparezhoubianData(ZhouBianBean zhoubianDate) {
			ZhouBianDao.selectForHomeDataBySort(zhoubianDate);
	
	}
}
