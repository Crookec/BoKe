package Info;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Comment {
	int _id,_pid;
	String _send,_words,_time;
	
	public Comment()
	{
		
	}
	
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public int get_pid() {
		return _pid;
	}
	public void set_pid(int _pid) {
		this._pid = _pid;
	}
	public String get_send() {
		return _send;
	}
	public void set_send(String _send) {
		this._send = _send;
	}
	public String get_words() {
		return _words;
	}
	public void set_words(String _words) {
		this._words = _words;
	}
	public String get_time() {
		return _time;
	}
	public void set_time(String _time) {
		this._time = _time;
	}
	
}
