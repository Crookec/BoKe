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
		 * //连接数据库 DBConnection.get_Connection(); //连接数据库
		 */

		/*
		 * //注册部分，按确认键后操作 String
		 * _id,_name,_nick,_address,_sex,_workaddress,_job,
		 * _birth,_blogname,_pwd; int _flag; String jieguo="";//传入后台后传回结果
		 * 
		 * _id="17826875887"; _nick="半只金鱼"; _pwd="123456";
		 * _blogname=_nick+"的博客";//默认博客名字 User user=new
		 * User(_id,_nick,_pwd,_blogname); BloggerInfo bloggerinfo=new
		 * BloggerInfo(); //判断用户是否已存在 if(bloggerinfo.hadId(_id)) {
		 * jieguo="该账号已有人使用！"; } else if(bloggerinfo.hadNick(_nick)) {
		 * jieguo="该昵称已有人使用！"; } else { //正则判断手机号是否符合要求、判断密码、昵称是否为空 String
		 * regExp = "1[3578]\\d{9}";
		 * 
		 * Pattern p = Pattern.compile(regExp);
		 * 
		 * Matcher m = p.matcher(_id); System.out.println(_id);
		 * if(m.matches()&&!_nick.equals(null)&&!_pwd.equals(null)&&_pwd.length(
		 * )==6) { bloggerinfo.Zhuce(user); jieguo="注册成功！"; } else {
		 * if(!m.matches()) { jieguo="请输入符合要求的手机号！";
		 * 
		 * } else if(_nick.equals(null)) { jieguo="昵称不能为空!"; } else {
		 * jieguo="请输入六位的密码"; } } } System.out.println(jieguo); //注册部分
		 */

		/*
		 * //修改个人信息部分 String _id,_name,_nick,_address,_sex,_workaddress,_job,
		 * _birth,_blogname,_pwd; int _flag; String jieguo="";//传入后台后传回结果
		 * _id="17826875886";////当前登录的账号id //先读出所有信息，除了id,pwd,flag User user=new
		 * User(); BloggerInfo bloggerinfo=new BloggerInfo();
		 * user=bloggerinfo.getById(_id); _name=user.get_name();
		 * _nick=user.get_nick(); _address=user.get_address();
		 * _sex=user.get_sex(); _workaddress=user.get_workaddress();
		 * _job=user.get_job(); _birth=user.get_birth();
		 * _blogname=user.get_blogname();
		 * System.out.println(_name+","+_nick+","+_address+","+_sex+","+
		 * _workaddress+"," +_job+","+_birth+","+_blogname); //输入修改后信息
		 * _name="薛静怡"; _nick="只金鱼"; _address="浙江省玉环县"; _sex="女";
		 * _workaddress="浙江农林大学"; _job="本科学生"; _birth="1996-01-31 ";
		 * _blogname="一树梨花"; user=new
		 * User(_id,_name,_nick,_address,_sex,_workaddress,_job,_birth,_blogname
		 * ); try { Date date; SimpleDateFormat sdf = new SimpleDateFormat(
		 * "yyyy-MM-dd "); date = sdf.parse(_birth); } catch (ParseException e)
		 * { jieguo="日期错误"; System.out.println(e.getMessage()); }
		 * if(!_sex.equals("男")&&!_sex.equals("女")) { jieguo="请在性别一栏填男或女"; }
		 * else if(bloggerinfo.hadNick(_nick)) { jieguo="该昵称已有人占用!"; } else
		 * if(jieguo.equals("日期错误")) { jieguo="请按××××-××-××格式输入生日"; } else {
		 * jieguo="个人信息修改成功"; bloggerinfo.Change(user); }
		 * System.out.println(jieguo); //修改个人信息部分
		 */

		/*
		 * //我的博文部分 String _uid="17826875886";//当前登录的账号id ArrayList<Passage>
		 * _myPassages=new ArrayList<Passage>(); PassageOP passageop=new
		 * PassageOP(); passageop.get_myPassages(_myPassages, _uid);
		 * Iterator<Passage> iter=_myPassages.iterator(); while(iter.hasNext())
		 * {
		 * 
		 * Passage passage=(Passage) iter.next();
		 * System.out.println(passage.get_id()+passage.get_title()+passage.
		 * get_time()); } //我的博文部分
		 */

		/*
		 * //发表博文部分 String _uid="17826875886";//当前登录的账号id String _title="黄执中";
		 * String _article="马薇薇胡渐彪范湉湉萧晓"; Passage passage=new
		 * Passage(_title,_article,_uid); PassageOP passageop=new PassageOP();
		 * passageop.Add(passage); //发表博文部分
		 */

		/*
		 * //删除博文部分 int id=1;//选择博文id 
		 * PassageOP passageop=new
		 * PassageOP();//删除该博文
		 *  passageop.Delete(id); //删除博文部分
		 */

		// 点入博文具体内容部分
		// 显示博文内容
	/*	String uid = "17826875887";// 当前登录的账号id
		int pid = 2;// 当前显示文章id
		PassageOP passageop = new PassageOP();
		Passage passage = passageop.getById(pid);
		System.out.println(passage.get_title() + passage.get_time() + passage.get_article());
		// 显示博文内容
		
		//显示评论和回复
				CommentOP commentop=new CommentOP();
				ArrayList<Comment> comments=new ArrayList<Comment>();
				commentop.get_Comments(comments, pid);
				Iterator<Comment> iter=comments.iterator();
				while(iter.hasNext())
				{
					Comment comment=(Comment)iter.next();
					BloggerInfo bloggerinfo=new BloggerInfo();
					String nick=bloggerinfo.get_Nick(comment.get_send());
					System.out.println(nick+"评论："+comment.get_time()+comment.get_words());
					ArrayList<Anser> ansers=new ArrayList<Anser>();
					AnserOP anserop=new AnserOP();
					int sid=comment.get_id();
					anserop.get_cAnser(ansers,sid);
					Iterator<Anser> aiter=ansers.iterator();
					while(aiter.hasNext())
					{
						Anser anser=(Anser) aiter.next();
						String anick=bloggerinfo.get_Nick(anser.get_aid());
						System.out.println(anick+"回复："+anser.get_time()+anser.get_anser());
					}
				}		
				//显示评论和回复*/

	/*	//评论博文
		CommentOP commentop=new CommentOP();
		String words="aaaaa";//评论内容
		Comment comment=new Comment(pid,uid,words);
		commentop.Add(comment);
		//评论博文*/
		
	/*	//回复博文下评论
		int sid=1;//当前选中的博文评论id(与留言板同)
		String words="2222";
		Anser anser=new Anser(uid,sid,1,words);
		AnserOP anserop=new AnserOP();
		anserop.Add(anser);
		//回复博文下评论*/
				
		/*//删除博文评论(连带删除回复)
		int sid=1;//当前选中的博文评论id(与留言板同)
		CommentOP commentop=new CommentOP();
		commentop.DeleteById(sid);
		//删除博文评论*/
				
		/*//删除博文(留言箱留言)评论回复
		int id=1;//当前选中的回复id
		AnserOP anserop=new AnserOP();
		anserop.DeleteC(id);
		//删除博文回复*/
		//点入博文具体内容部分
		
		//留言板部分
		/*String uid="17826875887";//当前登录的账号id
		String oid="17826875886";//查看的留言板主人账号
		
		//显示所有留言和回复
		MessageOP messageop=new MessageOP();
		ArrayList<Message> messages=new ArrayList<Message>();
		messageop.ReadBoxByUid(messages, oid);
		Iterator<Message> iter=messages.iterator();
		while(iter.hasNext())
		{
			Message message=(Message)iter.next();
			BloggerInfo bloggerinfo=new BloggerInfo();
			String nick=bloggerinfo.get_Nick(message.get_send());
			System.out.println(nick+"留言："+message.get_time()+message.get_message());
			ArrayList<Anser> ansers=new ArrayList<Anser>();
			AnserOP anserop=new AnserOP();
			int sid=message.get_id();
			anserop.get_mAnser(ansers,sid);
			Iterator<Anser> aiter=ansers.iterator();
			while(aiter.hasNext())
			{
				Anser anser=(Anser) aiter.next();
				String anick=bloggerinfo.get_Nick(anser.get_aid());
				System.out.println(anick+"回复："+anser.get_time()+anser.get_anser());
			}
		}*/
		//显示所有留言和回复
	/*	//删除博文(留言箱留言)评论回复
		int id=1;//当前选中的回复id
		AnserOP anserop=new AnserOP();
		anserop.DeleteC(id);
		//删除博文回复*/
		
		
	/*	//给该博主留言
		String uid="17826875887";//当前登录的账号id
		String oid="17826875886";//查看的留言板主人账号
		String words="赵云赵云我爱你";//留言内容
		Message message=new Message(uid,oid,words);
		MessageOP messageop=new MessageOP();
		messageop.AddBox(message);
		//给该博主留言*/
		
	/*	//回复留言
		String uid="17826875887";//当前登录的账号id
		int sid=1;//当前选中的留言id
		String words="我比较喜欢韩信";
		Anser anser=new Anser(uid,sid,0,words);
		AnserOP anserop=new AnserOP();
		anserop.Add(anser);
		//回复留言
		//留言板部分*/
		
		/*//删除留言板留言
		int id=2;//选中的留言id
		MessageOP messageop=new MessageOP();
		messageop.DeleteBox(id);
		//删除留言板留言*/
		
		//博友部分
		String uid="17826875887";//当前登录账号
		String fid="17826875887";//博友账号
		/*//列出所有关注博友
		ArrayList<String> friends=new ArrayList<String>();
		FriendOP friendop=new FriendOP();
		friendop.ReadById(friends, uid);
		Iterator iter=friends.iterator();
		while(iter.hasNext())
		{
			String friend=(String) iter.next();
			System.out.println(friend);
		}
		//列出所有关注博友*/
		
		/*//关注博友
		FriendOP friendop=new FriendOP();
		friendop.Add(uid, fid);
		//关注博友*/
		
		/*//取关博友
		FriendOP friendop=new FriendOP();
		friendop.Delete(uid,fid);
		//取关博友*/
		//博友部分
	}
}
