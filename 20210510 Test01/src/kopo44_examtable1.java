import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class kopo44_examtable1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.78:3306/kopoctc", "root", "kopoctc");
		Statement stmt = conn.createStatement();
		
		stmt.execute(	"create table kopo44_examtable(" +
						"name varchar(20)," +
						"studentid int not null primary key," +
						"kor	int," +
						"eng	int," +
						"mat	int)" +
						"DEFAULT CHARSET=utf8;");
		stmt.close();
		conn.close();
		
		
	}

}
