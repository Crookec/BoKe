package Info;

import java.text.SimpleDateFormat;
import java.util.Date;

import Operation.AnserOP;


public class Anser {
	int _id;
	int _sid;
	int _flag;//标识回复的是留言箱0还是博文评论1
	String _anser,_time,_aid;
	
	public Anser()
	{

	}
	
	public Anser(String aid,int sid,int flag,String anser)
	{
		AnserOP anserop=new AnserOP();
		int id=anserop.get_newId();
		this.set_aid(aid);
		this.set_id(id);
		this.set_sid(sid);
		this.set_flag(flag);
		this.set_anser(anser);
		SimpleDateFormat sdf =new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
		String date = sdf.format(new Date());
		this.set_time(date);
	}
	
	public Anser(int id,String aid,String time,String anser)
	{
		this.set_aid(aid);
		this.set_time(time);
		this.set_anser(anser);
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
