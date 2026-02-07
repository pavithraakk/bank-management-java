import javax.swing.*;
//.* means can use anything in that package

import java.awt.*; //image and image.scale-default all comes under this
import java.awt.event.*;//for action listner


public class Login extends JFrame implements ActionListener{
    JButton signup,signin,clear;//globally initializing so i can use it in action listener thing
    Login(){
        setTitle("ATM");

        setLayout(null);//to edit the position manually

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("atm.png"));
        /*imageicon is a class included in swing package. to load and hold image.
        ImageIcon i1 = new ImageIcon("atm.png");
        this can be used but adding classloader.getsystemresource()is professional way */

    Image i2= i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
    /*imageicon mean just a frame or its just a object and swing deals with these frames.
     while all the resize and this work in image. i.e image means the actual image and 
     image.scale.default is used to get the good quality.it cant directly load an image,an object is required */

    ImageIcon i3= new ImageIcon(i2);
        JLabel label= new JLabel(i3);
        /*jlabel is a passive display component. which means no input or anything just display.
        jlabel doesnt accept files directly. only objects
        */

        label.setBounds(20, 40, 200, 200);
        add(label);// to add it to the frame.
        JLabel text = new JLabel("Welcome To ATM");
        text.setBounds(250,100,400,40);
        text.setFont(new Font("Osward",Font.BOLD,38));
        add(text);

         JLabel card = new JLabel("card no");
        card.setBounds(250,200,400,40);
        card.setFont(new Font("Osward",Font.PLAIN,18));
        add(card);

        JTextField cardbox= new JTextField();
        cardbox.setBounds(330,210,220,25);
        add(cardbox);



         JLabel pin = new JLabel("pin");
        pin.setBounds(250,250,400,40);
        pin.setFont(new Font("Osward",Font.PLAIN,18));
        add(pin);

         JTextField pinbox= new JTextField();
         pinbox.setBounds(330,260,220,25);
        add(pinbox);

        JButton signup = new JButton("SIGN UP");
        signup.setBounds(330,300,100,20);
         signup.addActionListener(this);
        add(signup);

         JButton signin = new JButton("SIGN IN");
        signin.setBounds(450,300,100,20);
        signin.addActionListener(this);//......................................................
        add(signin);

         JButton clear = new JButton("CLEAR");
        clear.setBounds(330,340,220,30);
         clear.addActionListener(this);
        add(clear);

        
        getContentPane().setBackground(Color.white);//all the frame evrthing is contained in pane
       setSize(800,480);//frame size
       setVisible(true);
       setLocation(350,200);//coz by default the frame would appear on the bottom left,can change that
    }
    public void ACTION_PERFORMED(ActionEvent ae){   //ae is obj
          if(ae.getSource()==clear){

          }
          else if(ae.getSource()==signin){
                                                   //................................................
          }
          else if(ae.getSource()==signup){

          }
    }
    public static void main(String args[]){
new Login();
}
} 