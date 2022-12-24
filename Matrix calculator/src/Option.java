import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
public class Option extends JFrame implements ActionListener {
    private Container box;
    private JLabel l1, l2, l3, rl1, rl2, rl3, rl4, rl5, rl6, rl7, rl8, rl9,img1;
    private JTextField a1, a2, a3, a4, a5, a6, a7, a8, a9, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private JButton bo1, bo2,bo3;
    private ImageIcon img,ico;


    Option() {
        work();
    }

    public void work() {
        //font:
        Font font = new Font("Arial", Font.BOLD, 23);
        Font font1 = new Font("Arial", Font.BOLD, 18);
        //img:
        img=new ImageIcon(getClass().getResource("1.gif"));
        //container:
        box = this.getContentPane();
        box.setLayout(null);
        box.setBackground(Color.red);




        //label:
        l1 = new JLabel(" Matrix (1)");
        l1.setBounds(50, 30, 120, 40);
        l1.setOpaque(true);
        l1.setBackground(Color.black);
        l1.setFont(font);
        l1.setForeground(Color.white);

        l2 = new JLabel(" Matrix (2)");
        l2.setBounds(50, 220, 120, 40);
        l2.setOpaque(true);
        l2.setBackground(Color.black);
        l2.setFont(font);
        l2.setForeground(Color.white);

        //for first matrix:
        a1 = new JTextField();
        a1.setBounds(50, 90, 30, 30);
        a1.setFont(font);
        a1.addActionListener(this);

        a2 = new JTextField();
        a2.setBounds(90, 90, 30, 30);
        a2.setFont(font);
        a2.addActionListener(this);

        a3 = new JTextField();
        a3.setBounds(130, 90, 30, 30);
        a3.setFont(font);
        a3.addActionListener(this);

        a4 = new JTextField();
        a4.setBounds(50, 130, 30, 30);
        a4.setFont(font);
        a4.addActionListener(this);

        a5 = new JTextField();
        a5.setBounds(90, 130, 30, 30);
        a5.setFont(font);
        a5.addActionListener(this);

        a6 = new JTextField();
        a6.setBounds(130, 130, 30, 30);
        a6.setFont(font);
        a6.addActionListener(this);

        a7 = new JTextField();
        a7.setBounds(50, 170, 30, 30);
        a7.setFont(font);
        a7.addActionListener(this);

        a8 = new JTextField();
        a8.setBounds(90, 170, 30, 30);
        a8.setFont(font);
        a8.addActionListener(this);

        a9 = new JTextField();
        a9.setBounds(130, 170, 30, 30);
        a9.setFont(font);
        a9.addActionListener(this);

        b1 = new JTextField();
        b1.setBounds(50, 280, 30, 30);
        b1.setFont(font);
        b1.addActionListener(this);

        b2 = new JTextField();
        b2.setBounds(90, 280, 30, 30);
        b2.setFont(font);
        b2.addActionListener(this);

        b3 = new JTextField();
        b3.setBounds(130, 280, 30, 30);
        b3.setFont(font);
        b3.addActionListener(this);

        b4 = new JTextField();
        b4.setBounds(50, 320, 30, 30);
        b4.setFont(font);
        b4.addActionListener(this);

        b5 = new JTextField();
        b5.setBounds(90, 320, 30, 30);
        b5.setFont(font);
        b5.addActionListener(this);

        b6 = new JTextField();
        b6.setBounds(130, 320, 30, 30);
        b6.setFont(font);
        b6.addActionListener(this);

        b7 = new JTextField();
        b7.setBounds(50, 360, 30, 30);
        b7.setFont(font);
        b7.addActionListener(this);

        b8 = new JTextField();
        b8.setBounds(90, 360, 30, 30);
        b8.setFont(font);
        b8.addActionListener(this);

        b9 = new JTextField();
        b9.setBounds(130, 360, 30, 30);
        b9.setFont(font);
        b9.addActionListener(this);

        //result part:
        l3 = new JLabel("   Result");
        l3.setBounds(320, 220, 120, 40);
        l3.setOpaque(true);
        l3.setBackground(Color.black);
        l3.setFont(font);
        l3.setForeground(Color.white);

        rl1 = new JLabel();
        rl1.setBounds(320, 280, 40, 35);
        rl1.setOpaque(true);
        rl1.setBackground(Color.yellow);
        rl1.setFont(font);

        rl2 = new JLabel();
        rl2.setBounds(365, 280, 40, 35);
        rl2.setOpaque(true);
        rl2.setBackground(Color.yellow);
        rl2.setFont(font);

        rl3 = new JLabel();
        rl3.setBounds(410, 280, 40, 35);
        rl3.setOpaque(true);
        rl3.setBackground(Color.yellow);
        rl3.setFont(font);

        rl4 = new JLabel();
        rl4.setBounds(320, 320, 40, 35);
        rl4.setOpaque(true);
        rl4.setBackground(Color.yellow);
        rl4.setFont(font);

        rl5 = new JLabel();
        rl5.setBounds(365, 320, 40, 35);
        rl5.setOpaque(true);
        rl5.setBackground(Color.yellow);
        rl5.setFont(font);

        rl6 = new JLabel();
        rl6.setBounds(410, 320, 40, 35);
        rl6.setOpaque(true);
        rl6.setBackground(Color.yellow);
        rl6.setFont(font);

        rl7 = new JLabel();
        rl7.setBounds(320, 360, 40, 35);
        rl7.setOpaque(true);
        rl7.setBackground(Color.yellow);
        rl7.setFont(font);

        rl8 = new JLabel();
        rl8.setBounds(365, 360, 40, 35);
        rl8.setOpaque(true);
        rl8.setBackground(Color.yellow);
        rl8.setFont(font);

        rl9 = new JLabel();
        rl9.setBounds(410, 360, 40, 35);
        rl9.setOpaque(true);
        rl9.setBackground(Color.yellow);
        rl9.setFont(font);

        //button:
        bo1 = new JButton("=");
        bo1.setBounds(70, 420, 80, 40);
        bo1.addActionListener(this);
        bo1.setFont(font);

        bo2 = new JButton("Clear");
        bo2.setBounds(330, 420, 100, 40);
        bo2.addActionListener(this);
        bo2.setFont(font1);

        bo3 = new JButton("Save");
        bo3.setBounds(180, 420, 100, 40);
        bo3.addActionListener(this);
        bo3.setFont(font1);

        //img label:
        img1=new JLabel(img);
        img1.setBounds(-10,-25,img.getIconWidth(),600);
       // img1.setOpaque(true);
        //img1.setBackground(Color.white);

        //frame:
        //frame:
        setTitle("multiplication Martix");
        setBounds(250, 50, 560, 550);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);


        //add:
        box.add(l1);add(l2);
        box.add(l3);
        box.add(a1);
        box.add(a2);
        box.add(a3);
        box.add(a4);
        box.add(a5);
        box.add(a6);
        box.add(a7);
        box.add(a8);
        box.add(a9);
        box.add(b1);
        box.add(b2);
        box.add(b3);
        box.add(b4);
        box.add(b5);
        box.add(b6);
        box.add(b7);
        box.add(b8);
        box.add(b9);
        box.add(rl1);
        box.add(rl2);
        box.add(rl3);
        box.add(rl4);
        box.add(rl5);
        box.add(rl6);
        box.add(rl7);
        box.add(rl8);
        box.add(rl9);
        box.add(bo1);
        box.add(bo2);
        box.add(bo3);
        box.add(img1);
        image_1();
    }
    public void image_1(){
        ico =new ImageIcon(getClass().getResource("download.png"));
        this.setIconImage(ico.getImage());
    }


    public static void main(String[] args) {
        Option op = new Option();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(bo3)){






                int s1 = 2;
                String s2 ="C:\\rifat\\\\";
                int s3 = 1;

                try {

                    Thread.sleep((s1*1000));
                    for(int i=1;i<=s3;i++) {
                        // name of picture:
                        LocalDateTime myObj = LocalDateTime.now();
                        int h,m,s,d,mo;
                        h= myObj.getHour();
                        m= myObj.getMinute();
                        s= myObj.getSecond();
                        d= myObj.getDayOfMonth();
                        mo= myObj.getMonthValue();
                        String a,b,c,day,month;
                        a=Integer.toString(h);
                        b=Integer.toString(m);
                        c=Integer.toString(s);
                        day=Integer.toString(d);
                        month=Integer.toString(mo);
                        String name=a+"_"+b+"_"+c+"_"+day+"_"+month;
                        //

                        Thread.sleep(1000);
                        Robot r = new Robot();

                        // It saves screenshot to desired path
                        String path = s2 + name + ".jpg";

                        // Used to get ScreenSize and capture image
                        Rectangle capture =
                                new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                        BufferedImage Image = r.createScreenCapture(capture);
                        ImageIO.write(Image, "jpg", new File(path));
                        System.out.println("Screenshot saved");
                    }
//                    l2.setText("End");
                }
                catch (AWTException | IOException | InterruptedException ex) {
                    System.out.println(ex);

                }


        }else {
            int x1, x2, x3, x4, x5, x6, x7, x8, x9, y1, y2, y3, y4, y5, y6, y7, y8, y9;

            x1 = Integer.parseInt(a1.getText());
            x2 = Integer.parseInt(a2.getText());
            x3 = Integer.parseInt(a3.getText());
            x4 = Integer.parseInt(a4.getText());
            x5 = Integer.parseInt(a5.getText());
            x6 = Integer.parseInt(a6.getText());
            x7 = Integer.parseInt(a7.getText());
            x8 = Integer.parseInt(a8.getText());
            x9 = Integer.parseInt(a9.getText());

            y1 = Integer.parseInt(b1.getText());
            y2 = Integer.parseInt(b2.getText());
            y3 = Integer.parseInt(b3.getText());
            y4 = Integer.parseInt(b4.getText());
            y5 = Integer.parseInt(b5.getText());
            y6 = Integer.parseInt(b6.getText());
            y7 = Integer.parseInt(b7.getText());
            y8 = Integer.parseInt(b8.getText());
            y9 = Integer.parseInt(b9.getText());
            if (e.getSource().equals(bo1)) {
                int a[][] = {{x1, x2, x3}, {x4, x5, x6}, {x7, x8, x9}};
                int b[][] = {{y1, y2, y3}, {y4, y5, y6}, {y7, y8, y9}};


                int c[][] = new int[3][3];


                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        c[i][j] = 0;
                        for (int k = 0; k < 3; k++) {
                            c[i][j] += a[i][k] * b[k][j];
                        }//end of k loop


                    }//end of j loop


                }
                rl1.setText(String.valueOf(c[0][0]));
                rl2.setText(String.valueOf(c[0][1]));
                rl3.setText(String.valueOf(c[0][2]));
                rl4.setText(String.valueOf(c[1][0]));
                rl5.setText(String.valueOf(c[1][1]));
                rl6.setText(String.valueOf(c[1][2]));
                rl7.setText(String.valueOf(c[2][0]));
                rl8.setText(String.valueOf(c[2][1]));
                rl9.setText(String.valueOf(c[2][2]));

            } else if (e.getSource().equals(bo2)) {
                a1.setText(" ");
                a2.setText(" ");
                a3.setText(" ");
                a4.setText(" ");
                a5.setText(" ");
                a6.setText(" ");
                a7.setText(" ");
                a8.setText(" ");
                a9.setText(" ");
                b1.setText(" ");
                b2.setText(" ");
                b3.setText(" ");
                b4.setText(" ");
                b5.setText(" ");
                b6.setText(" ");
                b7.setText(" ");
                b8.setText(" ");
                b9.setText(" ");
                rl1.setText(" ");
                rl2.setText(" ");
                rl3.setText(" ");
                rl4.setText(" ");
                rl5.setText(" ");
                rl6.setText(" ");
                rl7.setText(" ");
                rl8.setText(" ");
                rl9.setText(" ");
            }
        }


    }

    public static void multi(int x1,int x2,int x3,int x4,int x5,int x6,int x7,int x8,int x9,int y1,int y2,int y3,int y4,int y5,int y6,int y7,int y8,int y9){
        int a[][]={{x1,x2,x3},{x4,x5,x6},{x7,x8,x9}};
        int b[][]={{y1,y2,y3},{y4,y5,y6},{y7,y8,y9}};


        int c[][]=new int[3][3];


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }//end of k loop


            }//end of j loop



        }

    }
}

