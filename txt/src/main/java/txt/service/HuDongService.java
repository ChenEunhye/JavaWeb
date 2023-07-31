package txt.service;

import java.util.List;

import txt.bean.HuDongBean;
import txt.dao.HuDongDao;

public class HuDongService {
	public static List<HuDongBean>  selectById() {
		return HuDongDao.selectById();
	}

	public static HuDongBean inseret(HuDongBean nicheng) {
		 
		HuDongDao.inseretForHuDong(nicheng);
		return nicheng;
	}
	public static void deletepinglun(String id) {
		
		HuDongDao.deleteForHuDong(id);
	}
}
