import java.sql.*;
public class db 
{
  public static void main(String[] args)
  {
    try{
      Class.forName("org.gjt.mm.mysql.Driver");
      Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1","root","");
      PreparedStatement stmt;
      ResultSet rs;
      stmt=con.prepareStatement("Create Database EFIR");
      stmt.executeUpdate();
    
      stmt=con.prepareStatement("use EFIR");
      stmt.executeUpdate();
    
      stmt=con.prepareStatement("Create Table users(uname varchar(20),upass varchar(20))");
      stmt.executeUpdate();
    
      stmt=con.prepareStatement("Insert into users values('admin001','password12')");
      stmt.executeUpdate();
    
      stmt=con.prepareStatement("create table fir(fid varchar(50),cname varchar(20),fathername varchar(20),caddress varchar(50),dof date,cemail varchar(20),state varchar(20),city varchar(20),loc varchar(20),aadhar varchar(20),description varchar(100),status varchar(20))");
      stmt.executeUpdate();
    
      System.out.println("connected");
    }catch(Exception e){System.out.println(e);}
  }
      
}
