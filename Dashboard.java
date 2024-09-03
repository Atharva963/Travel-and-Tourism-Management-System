package travel.management.system;
import javax.swing.* ;
import java.awt.* ;
public class Dashboard extends JFrame{
    Dashboard(){
        //setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel ();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        add(p1); 
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon (i2);
        JLabel icon = new JLabel (i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        JLabel heading = new JLabel ("Dashboard");
        heading.setBounds(80 , 10 , 300 , 40 );
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Raleway" , Font.BOLD , 35));
        p1.add(heading);
        
        JPanel p2 = new JPanel ();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        JButton addpersonalDetails = new JButton("Add Personal Details");
        addpersonalDetails.setBounds(0,0,300,50);
        addpersonalDetails.setBackground(new Color(0,0,102));
        addpersonalDetails.setForeground(Color.WHITE);
        addpersonalDetails.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        addpersonalDetails.setMargin(new Insets(0,0,0,60));
        p2.add(addpersonalDetails);
        
        JButton updatepersonalDetails = new JButton("Update Personal Details");
        updatepersonalDetails.setBounds(0,50,300,50);
        updatepersonalDetails.setBackground(new Color(0,0,102));
        updatepersonalDetails.setForeground(Color.WHITE);
        updatepersonalDetails.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        updatepersonalDetails.setMargin(new Insets(0,0,0,30));
        p2.add(updatepersonalDetails);
        
        JButton viewPersonalDetails = new JButton("View Details");
        viewPersonalDetails.setBounds(0,100,300,50);
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,130));
        p2.add(viewPersonalDetails);
        
        JButton deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0,150,300,50);
        deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,40));
        p2.add(deletePersonalDetails);
        
        JButton checkpackages = new JButton("Check Packages");
        checkpackages.setBounds(0,200,300,50);
        checkpackages.setBackground(new Color(0,0,102));
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        checkpackages.setMargin(new Insets(0,0,0,110));
        p2.add(checkpackages);
        
        JButton bookpackages = new JButton("Book Package");
        bookpackages.setBounds(0,250,300,50);
        bookpackages.setBackground(new Color(0,0,102));
        bookpackages.setForeground(Color.WHITE);
        bookpackages.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        bookpackages.setMargin(new Insets(0,0,0,120));
        p2.add(bookpackages);
        
        JButton viewpackage = new JButton("View Package");
        viewpackage.setBounds(0,300,300,50);
        viewpackage.setBackground(new Color(0,0,102));
        viewpackage.setForeground(Color.WHITE);
        viewpackage.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        viewpackage.setMargin(new Insets(0,0,0,120));
        p2.add(viewpackage);
        
        JButton viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0,350,300,50);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        viewhotels.setMargin(new Insets(0,0,0,130));
        p2.add(viewhotels);
        
        JButton bookhotel = new JButton("Book Hotel");
        bookhotel.setBounds(0,400,300,50);
        bookhotel.setBackground(new Color(0,0,102));
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        bookhotel.setMargin(new Insets(0,0,0,140));
        p2.add(bookhotel);
        
        
        JButton viewbookhotel = new JButton("View Booked Hotel");
        viewbookhotel.setBounds(0,450,300,50);
        viewbookhotel.setBackground(new Color(0,0,102));
        viewbookhotel.setForeground(Color.WHITE);
        viewbookhotel.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        viewbookhotel.setMargin(new Insets(0,0,0,70));
        p2.add(viewbookhotel);
        
        JButton destination = new JButton("Destinations");
        destination.setBounds(0,500,300,50);
        destination.setBackground(new Color(0,0,102));
        destination.setForeground(Color.WHITE);
        destination.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        destination.setMargin(new Insets(0,0,0,125));
        p2.add(destination);
        
        JButton Payment = new JButton("Payments");
        Payment.setBounds(0,550,300,50);
        Payment.setBackground(new Color(0,0,102));
        Payment.setForeground(Color.WHITE);
        Payment.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        Payment.setMargin(new Insets(0,0,0,155));
        p2.add(Payment);
        
        JButton Calculator = new JButton("Calculator");
        Calculator.setBounds(0,600,300,50);
        Calculator.setBackground(new Color(0,0,102));
        Calculator.setForeground(Color.WHITE);
        Calculator.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        Calculator.setMargin(new Insets(0,0,0,145));
        p2.add(Calculator);
        
        JButton Notepad = new JButton("Notepad");
        Notepad.setBounds(0,650,300,50);
        Notepad.setBackground(new Color(0,0,102));
        Notepad.setForeground(Color.WHITE);
        Notepad.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        Notepad.setMargin(new Insets(0,0,0,155));
        p2.add(Notepad);
        
        JButton about = new JButton("About");
        about.setBounds(0,700,300,50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma" , Font.PLAIN , 20));
        about.setMargin(new Insets(0,0,0,175));
        p2.add(about);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5) ;
        JLabel image = new JLabel(i6) ;
        image.setBounds(0,0,1650,1000);
        add(image);
        
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(400,70,1200,70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway" , Font.PLAIN , 55));
        
        image.add(text);
        
        
        setVisible(true);
        
    }
    public static void main(String[] args) {
        new Dashboard();
    }
}
