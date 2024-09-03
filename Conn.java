
package travel.management.system;
import java.sql.* ;
public class Conn {
    Connection c ;
    Statement st ;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver") ;
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagementsystem" , "root" , "") ;
            st = c.createStatement();
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
