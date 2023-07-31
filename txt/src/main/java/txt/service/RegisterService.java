package txt.service;
import txt.bean.UsersBean;
import txt.dao.UserDao;


public class RegisterService {
	  public static int register(UsersBean user) {
	   
		if(UserDao.selectUsernameForRegister(user) == 1) {
			return 1;
		} else {
			UserDao.inseretForLogin(user);
			return 0;
		}
	}
}