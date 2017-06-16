package Info;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Anser {
	int _id;
	int _sid;
	int _flag;//标识回复的是留言箱0还是博文评论1
	String _anser,_time,_aid;
	
	public Anser()
	{

	}
	


	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public int get_sid() {
		return _sid;
	}

	public void set_sid(int _sid) {
		this._sid = _sid;
	}

	public int get_flag() {
		return _flag;
	}

	public void set_flag(int flag) {
		this._flag = flag;
	}

	public String get_anser() {
		return _anser;
	}

	public void set_anser(String _anser) {
		this._anser = _anser;
	}

	public String get_time() {
		return _time;
	}

	public void set_time(String _time) {
		this._time = _time;
	}

	public String get_aid() {
		return _aid;
	}

	public void set_aid(String _aid) {
		this._aid = _aid;
	}
	
	
}
