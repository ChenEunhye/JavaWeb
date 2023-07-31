package txt.service;

import java.util.List;


import txt.bean.PhotoBean;
import txt.dao.PhotoDao;

public class PhotoService {
	public static List<PhotoBean>  selectById() {
		return PhotoDao.selectById();
	}
}