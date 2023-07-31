package txt.bean;

public class UsersBean {
	private int id;
	private String tel;
	private String usr;
	private String email;
	private String pwd;
	
	public UsersBean(String tel, String usr, String email, String pwd) {
		super();
		this.tel = tel;
		this.usr = usr;
		this.email = email;
		this.pwd = pwd;
		
	}
	public UsersBean(int id, String tel, String usr, String email, String pwd) {
		super();
		this.id = id;
		this.tel = tel;
		this.usr = usr;
		this.email = email;
		this.pwd = pwd;
		
	}
	public UsersBean(String usr, String pwd) {
		super();
		this.usr = usr;
		this.pwd = pwd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getUsr() {
		return usr;
	}

	public void setUsr(String usr) {
		this.usr = usr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	
	
	
}
