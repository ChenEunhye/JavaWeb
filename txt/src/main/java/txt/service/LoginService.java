package txt.service;
import txt.bean.UsersBean;
import txt.dao.UserDao;


public class LoginService {
	  public static void login(UsersBean user) {
	   UserDao.selectForLogin(user);
	  }
	}