package Operation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Info.Anser;
import Info.Comment;
import Info.Message;
import Info.Passage;
import Info.User;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * //�������ݿ� DBConnection.get_Connection(); //�������ݿ�
		 */

		/*
		 * //ע�Ჿ�֣���ȷ�ϼ������ String
		 * _id,_name,_nick,_address,_sex,_workaddress,_job,
		 * _birth,_blogname,_pwd; int _flag; String jieguo="";//�����̨�󴫻ؽ��
		 * 
		 * _id="17826875887"; _nick="��ֻ����"; _pwd="123456";
		 * _blogname=_nick+"�Ĳ���";//Ĭ�ϲ������� User user=new
		 * User(_id,_nick,_pwd,_blogname); BloggerInfo bloggerinfo=new
		 * BloggerInfo(); //�ж��û��Ƿ��Ѵ��� if(bloggerinfo.hadId(_id)) {
		 * jieguo="���˺�������ʹ�ã�"; } else if(bloggerinfo.hadNick(_nick)) {
		 * jieguo="���ǳ�������ʹ�ã�"; } else { //�����ж��ֻ����Ƿ����Ҫ���ж����롢�ǳ��Ƿ�Ϊ�� String
		 * regExp = "1[3578]\\d{9}";
		 * 
		 * Pattern p = Pattern.compile(regExp);
		 * 
		 * Matcher m = p.matcher(_id); System.out.println(_id);
		 * if(m.matches()&&!_nick.equals(null)&&!_pwd.equals(null)&&_pwd.length(
		 * )==6) { bloggerinfo.Zhuce(user); jieguo="ע��ɹ���"; } else {
		 * if(!m.matches()) { jieguo="���������Ҫ����ֻ��ţ�";
		 * 
		 * } else if(_nick.equals(null)) { jieguo="�ǳƲ���Ϊ��!"; } else {
		 * jieguo="��������λ������"; } } } System.out.println(jieguo); //ע�Ჿ��
		 */

		/*
		 * //�޸ĸ�����Ϣ���� String _id,_name,_nick,_address,_sex,_workaddress,_job,
		 * _birth,_blogname,_pwd; int _flag; String jieguo="";//�����̨�󴫻ؽ��
		 * _id="17826875886";////��ǰ��¼���˺�id //�ȶ���������Ϣ������id,pwd,flag User user=new
		 * User(); BloggerInfo bloggerinfo=new BloggerInfo();
		 * user=bloggerinfo.getById(_id); _name=user.get_name();
		 * _nick=user.get_nick(); _address=user.get_address();
		 * _sex=user.get_sex(); _workaddress=user.get_workaddress();
		 * _job=user.get_job(); _birth=user.get_birth();
		 * _blogname=user.get_blogname();
		 * System.out.println(_name+","+_nick+","+_address+","+_sex+","+
		 * _workaddress+"," +_job+","+_birth+","+_blogname); //�����޸ĺ���Ϣ
		 * _name="Ѧ����"; _nick="ֻ����"; _address="�㽭ʡ����"; _sex="Ů";
		 * _workaddress="�㽭ũ�ִ�ѧ"; _job="����ѧ��"; _birth="1996-01-31 ";
		 * _blogname="һ���滨"; user=new
		 * User(_id,_name,_nick,_address,_sex,_workaddress,_job,_birth,_blogname
		 * ); try { Date date; SimpleDateFormat sdf = new SimpleDateFormat(
		 * "yyyy-MM-dd "); date = sdf.parse(_birth); } catch (ParseException e)
		 * { jieguo="���ڴ���"; System.out.println(e.getMessage()); }
		 * if(!_sex.equals("��")&&!_sex.equals("Ů")) { jieguo="�����Ա�һ�����л�Ů"; }
		 * else if(bloggerinfo.hadNick(_nick)) { jieguo="���ǳ�������ռ��!"; } else
		 * if(jieguo.equals("���ڴ���")) { jieguo="�밴��������-����-������ʽ��������"; } else {
		 * jieguo="������Ϣ�޸ĳɹ�"; bloggerinfo.Change(user); }
		 * System.out.println(jieguo); //�޸ĸ�����Ϣ����
		 */

		/*
		 * //�ҵĲ��Ĳ��� String _uid="17826875886";//��ǰ��¼���˺�id ArrayList<Passage>
		 * _myPassages=new ArrayList<Passage>(); PassageOP passageop=new
		 * PassageOP(); passageop.get_myPassages(_myPassages, _uid);
		 * Iterator<Passage> iter=_myPassages.iterator(); while(iter.hasNext())
		 * {
		 * 
		 * Passage passage=(Passage) iter.next();
		 * System.out.println(passage.get_id()+passage.get_title()+passage.
		 * get_time()); } //�ҵĲ��Ĳ���
		 */

		/*
		 * //�����Ĳ��� String _uid="17826875886";//��ǰ��¼���˺�id String _title="��ִ��";
		 * String _article="��ޱޱ�����뷶��������"; Passage passage=new
		 * Passage(_title,_article,_uid); PassageOP passageop=new PassageOP();
		 * passageop.Add(passage); //�����Ĳ���
		 */

		/*
		 * //ɾ�����Ĳ��� int id=1;//ѡ����id 
		 * PassageOP passageop=new
		 * PassageOP();//ɾ���ò���
		 *  passageop.Delete(id); //ɾ�����Ĳ���
		 */

		// ���벩�ľ������ݲ���
		// ��ʾ��������
	/*	String uid = "17826875887";// ��ǰ��¼���˺�id
		int pid = 2;// ��ǰ��ʾ����id
		PassageOP passageop = new PassageOP();
		Passage passage = passageop.getById(pid);
		System.out.println(passage.get_title() + passage.get_time() + passage.get_article());
		// ��ʾ��������
		
		//��ʾ���ۺͻظ�
				CommentOP commentop=new CommentOP();
				ArrayList<Comment> comments=new ArrayList<Comment>();
				commentop.get_Comments(comments, pid);
				Iterator<Comment> iter=comments.iterator();
				while(iter.hasNext())
				{
					Comment comment=(Comment)iter.next();
					BloggerInfo bloggerinfo=new BloggerInfo();
					String nick=bloggerinfo.get_Nick(comment.get_send());
					System.out.println(nick+"���ۣ�"+comment.get_time()+comment.get_words());
					ArrayList<Anser> ansers=new ArrayList<Anser>();
					AnserOP anserop=new AnserOP();
					int sid=comment.get_id();
					anserop.get_cAnser(ansers,sid);
					Iterator<Anser> aiter=ansers.iterator();
					while(aiter.hasNext())
					{
						Anser anser=(Anser) aiter.next();
						String anick=bloggerinfo.get_Nick(anser.get_aid());
						System.out.println(anick+"�ظ���"+anser.get_time()+anser.get_anser());
					}
				}		
				//��ʾ���ۺͻظ�*/

	/*	//���۲���
		CommentOP commentop=new CommentOP();
		String words="aaaaa";//��������
		Comment comment=new Comment(pid,uid,words);
		commentop.Add(comment);
		//���۲���*/
		
	/*	//�ظ�����������
		int sid=1;//��ǰѡ�еĲ�������id(�����԰�ͬ)
		String words="2222";
		Anser anser=new Anser(uid,sid,1,words);
		AnserOP anserop=new AnserOP();
		anserop.Add(anser);
		//�ظ�����������*/
				
		/*//ɾ����������(����ɾ���ظ�)
		int sid=1;//��ǰѡ�еĲ�������id(�����԰�ͬ)
		CommentOP commentop=new CommentOP();
		commentop.DeleteById(sid);
		//ɾ����������*/
				
		/*//ɾ������(����������)���ۻظ�
		int id=1;//��ǰѡ�еĻظ�id
		AnserOP anserop=new AnserOP();
		anserop.DeleteC(id);
		//ɾ�����Ļظ�*/
		//���벩�ľ������ݲ���
		
		//���԰岿��
		/*String uid="17826875887";//��ǰ��¼���˺�id
		String oid="17826875886";//�鿴�����԰������˺�
		
		//��ʾ�������Ժͻظ�
		MessageOP messageop=new MessageOP();
		ArrayList<Message> messages=new ArrayList<Message>();
		messageop.ReadBoxByUid(messages, oid);
		Iterator<Message> iter=messages.iterator();
		while(iter.hasNext())
		{
			Message message=(Message)iter.next();
			BloggerInfo bloggerinfo=new BloggerInfo();
			String nick=bloggerinfo.get_Nick(message.get_send());
			System.out.println(nick+"���ԣ�"+message.get_time()+message.get_message());
			ArrayList<Anser> ansers=new ArrayList<Anser>();
			AnserOP anserop=new AnserOP();
			int sid=message.get_id();
			anserop.get_mAnser(ansers,sid);
			Iterator<Anser> aiter=ansers.iterator();
			while(aiter.hasNext())
			{
				Anser anser=(Anser) aiter.next();
				String anick=bloggerinfo.get_Nick(anser.get_aid());
				System.out.println(anick+"�ظ���"+anser.get_time()+anser.get_anser());
			}
		}*/
		//��ʾ�������Ժͻظ�
	/*	//ɾ������(����������)���ۻظ�
		int id=1;//��ǰѡ�еĻظ�id
		AnserOP anserop=new AnserOP();
		anserop.DeleteC(id);
		//ɾ�����Ļظ�*/
		
		
	/*	//���ò�������
		String uid="17826875887";//��ǰ��¼���˺�id
		String oid="17826875886";//�鿴�����԰������˺�
		String words="���������Ұ���";//��������
		Message message=new Message(uid,oid,words);
		MessageOP messageop=new MessageOP();
		messageop.AddBox(message);
		//���ò�������*/
		
	/*	//�ظ�����
		String uid="17826875887";//��ǰ��¼���˺�id
		int sid=1;//��ǰѡ�е�����id
		String words="�ұȽ�ϲ������";
		Anser anser=new Anser(uid,sid,0,words);
		AnserOP anserop=new AnserOP();
		anserop.Add(anser);
		//�ظ�����
		//���԰岿��*/
		
		/*//ɾ�����԰�����
		int id=2;//ѡ�е�����id
		MessageOP messageop=new MessageOP();
		messageop.DeleteBox(id);
		//ɾ�����԰�����*/
		
		//���Ѳ���
		String uid="17826875887";//��ǰ��¼�˺�
		String fid="17826875887";//�����˺�
		/*//�г����й�ע����
		ArrayList<String> friends=new ArrayList<String>();
		FriendOP friendop=new FriendOP();
		friendop.ReadById(friends, uid);
		Iterator iter=friends.iterator();
		while(iter.hasNext())
		{
			String friend=(String) iter.next();
			System.out.println(friend);
		}
		//�г����й�ע����*/
		
		/*//��ע����
		FriendOP friendop=new FriendOP();
		friendop.Add(uid, fid);
		//��ע����*/
		
		/*//ȡ�ز���
		FriendOP friendop=new FriendOP();
		friendop.Delete(uid,fid);
		//ȡ�ز���*/
		//���Ѳ���
	}
}
