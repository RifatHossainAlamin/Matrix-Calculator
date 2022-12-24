import javax.swing.*;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Loginsystem extends JFrame implements ActionListener {
    private JFrame frame;
    private JLabel label,l1,l2,adl1,adl2,adl3,adl4,imgl;
    private JTextField tf1,adtf1,adtf2,adtf3;
    private JPasswordField pf,adpf1,adpf2;
    private JButton b1,b2,adb1,adb2,adb3;
    private Container box,adminbox;
    private ImageIcon img,ico;
    Loginsystem(){
        workside();

    }
    public void workside(){
        //img:
        img=new ImageIcon(getClass().getResource("2.gif"));

        //container:
//        box=this.getContentPane();
//        box.setLayout(null);
//        box.setBackground(Color.black);
        //font:
        Font font = new Font("Arial",Font.BOLD,23);
        Font font1 = new Font("Cambria",Font.BOLD,16);



        //label:
        label =new JLabel("    Login");
        label.setBounds(100,10,120,40);
        label.setForeground(Color.yellow);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.setFont(font);

        //user name:
        l1 =new JLabel("  User name:");
        l1.setBounds(10,60,140,40);
        l1.setForeground(Color.yellow);
        l1.setBackground(Color.red);
        l1.setOpaque(true);
        l1.setFont(font);

        //password:
        l2 =new JLabel("  Password:");
        l2.setBounds(10,110,140,40);
        l2.setForeground(Color.yellow);
        l2.setBackground(Color.red);
        l2.setOpaque(true);
        l2.setFont(font);

        //text field for user name:
        tf1=new JTextField();
        tf1.setBounds(155,60,140,40);
        tf1.setFont(font);
//        tf1.setBorder(b);
        tf1.setForeground(Color.black);

        //text field for password:
        pf=new JPasswordField();
        pf.setBounds(155,110,140,40);
        pf.setFont(font);
//        pf.setEchoChar('');
//        pf.setBorder(b);
        pf.setForeground(Color.black);

        //frame:
        setBounds(350,200,410,200);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        add(label);
        add(l1);
        add(l2);
        add(tf1);
        add(pf);


        //button for login:
        b1=new JButton("Login");
        b1.setBounds(300,60,90,40);
        b1.setForeground(Color.yellow);
        b1.setBackground(Color.red);
        b1.setFont(font1);
        b1.addActionListener(this);
        add(b1);

        //button for creat:
        b2=new JButton("Create");
        b2.setBounds(300,110,92,40);
        b2.setForeground(Color.yellow);
        b2.setBackground(Color.red);
        b2.setFont(font1);
        b2.addActionListener(this);
        add(b2);

        //imglabel:
        imgl=new JLabel(img);
        imgl.setBounds(-10,-30,410,200);
        add(imgl);
        image_1();
    }
    public void image_1(){
        ico =new ImageIcon(getClass().getResource("download.png"));
        this.setIconImage(ico.getImage());
    }

    public static void main(String[] args) {
        Loginsystem lo=new Loginsystem();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(b2)){
            admin();
        }else if(e.getSource().equals(adb2)){
            String password,pin;
            password=adpf1.getText();
            pin=adpf2.getText();
            JOptionPane.showMessageDialog(null,"password is: "+password+" pin is: "+pin);
        }else if(e.getSource().equals(b1)){
            String name,pass,username,password;
            name="rifat";
             pass="123";
             username=tf1.getText();
             password=pf.getText();
             if(username.equals(name) && password.equals(pass)){
                tf1.setText(" ");
                pf.setText("");
                 String mode="Access Granted";
                voices(mode);
                Matrix mx=new Matrix();
            }else{
                String dmode="Access Denied";
                voices(dmode);
            }
        }
    }

    //voice method:
    public static void voices(String text) {
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice textaudio;
        textaudio = VoiceManager.getInstance().getVoice("kevin16");
        if (textaudio != null) {
            textaudio.allocate();
        }
        try {
            textaudio.setRate(100);
            textaudio.setPitch(150);
            textaudio.setVolume(6);
            textaudio.speak(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //admin panel:
    public void admin(){
        Font f1=new Font("Arial",Font.BOLD,18);
        //frame:
        frame=new JFrame();
        frame.setBounds(350,150,500,250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setResizable(false);


        //container:
        adminbox=frame.getContentPane();
        adminbox.setLayout(null);
        adminbox.setBackground(Color.black);

        //label:
        adl1 =new JLabel("    Create Account");
        adl1.setBounds(100,10,160,40);
        adl1.setForeground(Color.yellow);
        adl1.setBackground(Color.red);
        adl1.setOpaque(true);
        adl1.setFont(f1);

        //user name:
        adl2 =new JLabel("  User name:");
        adl2.setBounds(10,60,140,40);
        adl2.setForeground(Color.yellow);
        adl2.setBackground(Color.red);
        adl2.setOpaque(true);
        adl2.setFont(f1);

        //password:
        adl3 =new JLabel("  Password:");
        adl3.setBounds(10,110,140,40);
        adl3.setForeground(Color.yellow);
        adl3.setBackground(Color.red);
        adl3.setOpaque(true);
        adl3.setFont(f1);

        //text field for user name:
        adtf1=new JTextField();
        adtf1.setBounds(155,60,140,40);
        adtf1.setFont(f1);
//        tf1.setBorder(b);
        adtf1.setForeground(Color.black);

        //text field for password:
        adpf1=new JPasswordField();
        adpf1.setBounds(155,110,140,40);
        adpf1.setFont(f1);
//        adpf1.setEchoChar('');
//        adpf1.setBorder(b);
        adpf1.setForeground(Color.black);

        //recovery pin:
        adl4 =new JLabel("  Recovery Pin:");
        adl4.setBounds(10,160,140,40);
        adl4.setForeground(Color.yellow);
        adl4.setBackground(Color.red);
        adl4.setOpaque(true);
        adl4.setFont(f1);

        //textfield for recovery pin:
        adpf2=new JPasswordField();
        adpf2.setBounds(155,160,140,40);
        adpf2.setFont(f1);
//        adpf2.setEchoChar('');
//        adpf2.setBorder(b);
        adpf2.setForeground(Color.black);

        //button for reset:
        adb1=new JButton("Reset");
        adb1.setBounds(300,60,90,40);
        adb1.setForeground(Color.yellow);
        adb1.setBackground(Color.red);
        adb1.setFont(f1);

        //button for show password:
        adb2=new JButton("Show");
        adb2.setBounds(300,110,90,40);
        adb2.setForeground(Color.yellow);
        adb2.setBackground(Color.red);
        adb2.setFont(f1);
        adb2.addActionListener(this);

        //button for creat accounte:
        adb3=new JButton("Create");
        adb3.setBounds(300,160,92,40);
        adb3.setForeground(Color.yellow);
        adb3.setBackground(Color.red);
        adb3.setFont(f1);

        //add :
        adminbox.add(adl1);
        adminbox.add(adl2);
        adminbox.add(adl3);
        adminbox.add(adl4);
        adminbox.add(adtf1);
        adminbox.add(adpf1);
        adminbox.add(adpf2);
        adminbox.add(adb1);
        adminbox.add(adb2);
        adminbox.add(adb3);



    }

}
