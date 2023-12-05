package ProjectAdmin;
import java.util.Scanner;
import java.sql.*;

public class Actions {
	private Statement stmt;
	private ResultSet rs;
	private Connection conn;

	protected Actions() {
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;
	}
	
	protected void Connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost/moomoobank?"
			+ "user=root");
			System.out.println("Connected!");
		} 
		
		catch (Exception ex) { //xử lý ngoại lệ nếu có
			System.out.println("Failed to connect!");
			ex.printStackTrace();
		}
	}
	
	protected void Disconnect() throws SQLException {
		if(conn != null) {
				System.out.println("Disconnected!");
				conn.close();
		}
	}
	//BONUS
	
	protected int addInfo( String	idcus, String namecus, String sexcus, String birthcus, String address) {
		try {
			PreparedStatement pStmt = null;
			pStmt = conn.prepareStatement("insert into info values (?, ?, ?, ?, ?)");
			pStmt.setString(1, idcus);
			pStmt.setString(2, namecus);
			pStmt.setString(3, sexcus);
			pStmt.setString(4, birthcus);
			pStmt.setString(5, address);
			pStmt.executeUpdate();
			return 1;
		}
		catch (SQLException ex){ 
			 System.out.println("SQLException: " + ex.getMessage());
			 return 0;
			}
	}
	
	protected int delInfo(String idcus) {
		try {
			PreparedStatement pStmt = null;
			pStmt = conn.prepareStatement("delete from info where idcus=?");
			pStmt.setString(1, idcus);
			pStmt.executeUpdate();
			return 1;
		}
		catch (SQLException ex){ 
			 System.out.println("SQLException: " + ex.getMessage());
			 return 0;
			}
	}
	
	protected int addTel(String phone, String brand, long money) {
		try {
			PreparedStatement pStmt = null;
			pStmt = conn.prepareStatement("insert into tel values (?, ?, ?)");
			pStmt.setString(1, phone);
			pStmt.setString(2, brand);
			pStmt.setLong(3, money);
			pStmt.executeUpdate();
			return 1;
		}
		catch (SQLException ex){ 
			 System.out.println("SQLException: " + ex.getMessage());
			 return 0;
			}
	}
	
	protected int delPhone(String phone) {
		try {
			PreparedStatement pStmt = null;
			pStmt = conn.prepareStatement("delete from tel where phone=?");
			pStmt.setString(1, phone);
			pStmt.executeUpdate();
			return 1;
		}
		catch (SQLException ex){ 
			 System.out.println("SQLException: " + ex.getMessage());
			 return 0;
			}
	}
	
	protected int addExAcc(String exid, String exname, String excomp, long exbal) {
		try {
			PreparedStatement pStmt = null;
			pStmt = conn.prepareStatement("insert into exacc values (?, ?, ?, ?)");
			pStmt.setString(1, exid);
			pStmt.setString(2, exname);
			pStmt.setString(3, excomp);
			pStmt.setLong(4, exbal);
			pStmt.executeUpdate();
			return 1;
		}
		catch (SQLException ex){ 
			 System.out.println("SQLException: " + ex.getMessage());
			 return 0;
			}
	}
	
	protected int delExAcc(String exid, String excomp) {
		try {
			PreparedStatement pStmt = null;
			pStmt = conn.prepareStatement("delete from exacc where exid=? and excomp=?");
			pStmt.setString(1, exid);
			pStmt.setString(2, excomp);
			pStmt.executeUpdate();
			return 1;
		}
		catch (SQLException ex){ 
			 System.out.println("SQLException: " + ex.getMessage());
			 return 0;
			}
	}
	
	protected int delAccount(String idacc) {
		try {
			long remain = 1;
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select balance from customer where idacc = '" + idacc + "'");
			if (stmt.execute("select balance from customer where idacc = '" + idacc + "'")) {
				rs = stmt.getResultSet();
			}
			while (rs.next()) 
				 remain = rs.getLong("balance");
			
			if(remain==0) {
				rs = stmt.executeQuery("call delacc('" + idacc + "')");
				System.out.println("Delete successfully");
			}
			else
				System.out.println("There are remaining money!");
			return 1;
		}
		catch (SQLException ex){ 
			 System.out.println("SQLException: " + ex.getMessage());
			 return 0;
			}
	}
	
	
}

