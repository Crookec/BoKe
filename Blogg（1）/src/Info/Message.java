package Info;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {
	int _id;
	String _send,_receive,_message,_time;
	public Message()
	{
		
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_send() {
		return _send;
	}

	public void set_send(String _send) {
		this._send = _send;
	}

	public String get_receive() {
		return _receive;
	}

	public void set_receive(String _receive) {
		this._receive = _receive;
	}

	public String get_message() {
		return _message;
	}

	public void set_message(String _message) {
		this._message = _message;
	}

	public String get_time() {
		return _time;
	}

	public void set_time(String _time) {
		this._time = _time;
	}
	
}
