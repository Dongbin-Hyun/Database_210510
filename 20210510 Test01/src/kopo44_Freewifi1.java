import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class kopo44_Freewifi1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.78:3306/kopoctc", "root", "kopoctc");
		Statement stmt = conn.createStatement();
		
		stmt.execute(	"create table freewifi("+
				"inst_place		  varChar(50), " +
				"inst_place_detail	varchar(50), " +
				"inst_city		  varchar(50), " +
				"inst_country	  varchar(50), " +
				"inst_place_flag	  varchar(50), " +
				"service_provider	varchar(50), " +
				"wifi_ssid	 varchar(50), " +
				"inst_date   varchar(50), " +
				"palce_addr_road")

	}

}
