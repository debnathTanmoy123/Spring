package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test  {

	private String driver,url,username,pwd;
	Connection con=null; 
	
	
	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	//init
	
	public void init() throws Exception {
	Class.forName(driver);
	con=DriverManager.getConnection(url, username, pwd);
	System.out.println("connection open");	
	}
	

	public void save(int id,String name,String email,String address)throws Exception
	{
	PreparedStatement ps=con.prepareStatement("insert into practice.Student values(?,?,?,?)");	
	ps.setInt(1, id);
	ps.setString(2, name);
	ps.setString(3, email);
	ps.setString(4, address);
	ps.executeUpdate();
	}
	
	//destroy
	public void destroy() throws Exception {
		con.close();
		System.out.println("connection closed");
	}

	

} 
