package Info;

import java.text.SimpleDateFormat;
import java.util.Date;

import Operation.MessageOP;

public class Message {
	int _id;
	String _send,_receive,_message,_time;
	public Message()
	{
		
	}
	
	public Message(String send,String receive,String message)//发表留言用
	{
		MessageOP messageop=new MessageOP();
		int id=messageop.get_newId();
		SimpleDateFormat sdf =new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
		String date = sdf.format(new Date());
		this.set_time(date);
		this.set_id(id);
		this.set_send(send);
		this.set_receive(receive);
		this.set_message(message);
	}
	
	public Message(int id,String send,String message,String time)//读取留言用
	{
		this.set_id(id);
		this.set_send(send);
		this.set_message(message);
		this.set_time(time);
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
