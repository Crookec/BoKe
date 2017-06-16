package Info;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Passage {
	private int _id,_throw;
	private String _title,_article,_uid,_time;
	
	
	public Passage()
	{
		
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
