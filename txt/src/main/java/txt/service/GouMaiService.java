package txt.service;

import txt.dao.GouMaiDao;
import txt.bean.ZhouBianBean;

public class GouMaiService {
	
	public static void preparezhoubianData(ZhouBianBean zhoubianDate) {
		if(zhoubianDate.getKeyWord()==null)
			GouMaiDao.selectAll(zhoubianDate);
	else {
		GouMaiDao.selectForHomeDataByKeyWord(zhoubianDate);
	}
	}
	public static void updatekucun(ZhouBianBean zhoubianData) {
		if("buy".equals(zhoubianData.getAction())) {
			GouMaiDao.updatekucun(zhoubianData);
		}
	}
}
