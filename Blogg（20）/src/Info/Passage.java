package Info;

import java.text.SimpleDateFormat;
import java.util.Date;

import Operation.PassageOP;

public class Passage {
	private int _id,_throw;
	private String _title,_article,_uid,_time;
	
	
	public Passage()
	{
		
	}
	public Passage(String uid,String title,String time,String article){//读博文具体内容用
		this.set_uid(uid);
		this.set_article(article);
		this.set_title(title);
		this.set_time(time);
	}
	
	public Passage(int id,String title,String time){//读某个博主的所有博文用
		this.set_id(id);
		this.set_title(title);
		this.set_time(time);
	}
	
	public Passage(String title,String article,String uid){//写博文用
		PassageOP passageop=new PassageOP();
		int id=passageop.get_newId();
		this.set_article(article);
		this.set_id(id);
		this.set_throw(0);
		this.set_title(title);
		this.set_uid(uid);
		SimpleDateFormat sdf =new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
		String date = sdf.format(new Date());
		this.set_time(date);
		}
	
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String get_title() {
		return _title;
	}
	public void set_title(String _title) {
		this._title = _title;
	}
	public String get_article() {
		return _article;
	}
	public void set_article(String _article) {
		this._article = _article;
	}
	public String get_uid() {
		return _uid;
	}
	public void set_uid(String _uid) {
		this._uid = _uid;
	}
	public String get_time() {
		return _time;
	}
	public void set_time(String _time) {
		this._time = _time;
	}
	public int get_throw() {
		return _throw;
	}
	public void set_throw(int _throw) {
		this._throw = _throw;
	}
	
}
