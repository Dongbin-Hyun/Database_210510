import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class kopo44_DBTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.78:3306/kopoctc", "root", "kopoctc");
		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery("select *from examtable");
		
		while (rset.next()) {
			System.out.println("�̸� : " + rset.getString(1));
			System.out.println("�й� : " + rset.getInt(2));
			System.out.println("���� : " + rset.getInt(3));
			System.out.println("���� : " + rset.getInt(4));
			System.out.println("���� : " + rset.getInt(5));
			System.out.println("=======================");
			
		}
		

	}

}
