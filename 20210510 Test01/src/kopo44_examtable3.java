import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class kopo44_examtable3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.78:3306/kopoctc", "root", "kopoctc");
		Statement stmt = conn.createStatement();
		
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values ('ȿ��', 209901, 95, 100, 95);");
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values ('����', 209902, 95, 95, 95);");
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values ('����', 209903, 100, 100, 100);");
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values ('����', 209904, 100, 95, 90);");
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values ('�ҿ�', 209905, 80, 100, 70);");
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values ('ť��', 209906, 100, 100, 70);");
		stmt.execute("insert into examtable2 (name, studentid, kor, eng, mat) values ('ȭ��', 209907, 70, 70, 70);");
		
		stmt.close();
		conn.close();
	}

}
