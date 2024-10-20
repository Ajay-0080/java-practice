import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JavaJdbcMysqlCrud {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/luminar_db_demo","root","ajaymysql");
			
			Statement stmt = conn.createStatement();
			/*int flagInsert=stmt.executeUpdate("insert into student(st_name,st_mark)values('jenny',250)");
			if(flagInsert>0){
				System.out.println("values inserted");
			}
			else{
				System.out.println("not inserted");
			}
			
			int flagUpdate = stmt.executeUpdate("update student set st_mark=320 where st_id=3");*/
			int flagDelete=stmt.executeUpdate("delete from student where st_id=6");
			if(flagDelete>0) {
				System.out.println("deleted selected part");
			}
			else {
				System.out.println("not deleted");
			}
			ResultSet rs = stmt.executeQuery("select *from student");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getFloat(3));
			}
					
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
					
	}

}
