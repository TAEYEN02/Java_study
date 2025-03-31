package ex06_List;

public class UserInfo {
	private String id;
	private String pwd;
	//1.getter/setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pwd;
	}

	public void setPass(String pwd) {
		this.pwd = pwd;
	}
	
//	//2. 생성자를 통해서 받는다
//	public UserInfo(String id, String pwd) {
//		this.id = id;
//		this.pwd = pwd;
//	}

}
