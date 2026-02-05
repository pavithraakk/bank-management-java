import javax.swing.*;
//.* means can use anything in that package
public class login extends JFrame{
    login(){
        setTitle("ATM");
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("atm.png"));
        JLabel label= new JLabel(i1);
        add(label);
       setSize(800,480);//frame size
       setVisible(true);
       setLocation(350,200);//coz by default the frame would appear on the bottom left,can change that
    }
    public static void main(String args[]){
new login();
}
}