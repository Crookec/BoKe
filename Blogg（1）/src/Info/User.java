package Info;

public class User {
	private String _id,_name,_nick,
	_address,_sex,_workaddress,_job,_birth,_blogname,_pwd;
	private int _flag;
	
	public User()
	{
		
	}
	
	public User(String id,String nick,String pwd,String blogname)
	{
		this.set_id(id);
		this.set_nick(nick);
		this.set_pwd(pwd);
		this.set_blogname(blogname);
		this.set_flag(1);
		this.set_sex("");
		this.set_birth("");
		this.set_address("");
		this.set_birth("");
		this.set_job("");
		this.set_name("");
		this.set_sex("");
		this.set_workaddress("");
	}
	
	public User(String id,String name,String nick,String
			address,String sex,String workaddress,String job,String birth,String blogname)
	{
		this.set_address(address);
		this.set_birth(birth);
		this.set_blogname(blogname);
		this.set_flag(1);
		this.set_id(id);
		this.set_job(job);
		this.set_nick(nick);
		this.set_name(name);
		this.set_sex(sex);
		this.set_workaddress(workaddress);
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_nick() {
		return _nick;
	}

	public void set_nick(String _nick) {
		this._nick = _nick;
	}

	public String get_address() {
		return _address;
	}

	public void set_address(String _address) {
		this._address = _address;
	}

	public String get_sex() {
		return _sex;
	}

	public void set_sex(String _sex) {
		this._sex = _sex;
	}

	public String get_workaddress() {
		return _workaddress;
	}

	public void set_workaddress(String _workaddress) {
		this._workaddress = _workaddress;
	}

	public String get_job() {
		return _job;
	}

	public void set_job(String _job) {
		this._job = _job;
	}

	public int get_flag() {
		return _flag;
	}

	public void set_flag(int _flag) {
		this._flag = _flag;
	}

	public String get_birth() {
		return _birth;
	}

	public void set_birth(String _birth) {
		this._birth = _birth;
	}

	public String get_blogname() {
		return _blogname;
	}

	public void set_blogname(String _blogname) {
		this._blogname = _blogname;
	}

	public String get_pwd() {
		return _pwd;
	}

	public void set_pwd(String _pwd) {
		this._pwd = _pwd;
	}
	
	
}
