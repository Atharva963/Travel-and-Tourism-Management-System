
package travel.management.system;
import javax.swing.* ;
import java.awt.* ;
public class AddCustomer extends JFrame {
    AddCustomer(){
        setBounds(450 , 200 , 850 , 550) ;
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        JLabel lblusername = new JLabel("Username" );
        lblusername.setBounds(30, 50 , 150 , 25);
        add(lblusername);
        
        
        setVisible(true) ;
        
    }
    public static void main(String[] args) {
        new AddCustomer() ;
    }
}
