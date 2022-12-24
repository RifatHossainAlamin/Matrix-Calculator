import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Calc extends JFrame implements ActionListener
{

    JTextField t;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;
    Container box;
    ImageIcon ico;

    static double a=0,b=0,result=0;
    static int operator=0;
//    String s0, s1, s2;

    Calc()
    {
        Font font = new Font("Arial",Font.BOLD,23);
//        s0 = s1 = s2 = "";
        //container:
        box=this.getContentPane();
        box.setLayout(null);
        box.setBackground(Color.red);


        t=new JTextField();
        t.setFont(font);
        b1=new JButton("1");
        b1.setFont(font);
        b2=new JButton("2");
        b2.setFont(font);
        b3=new JButton("3");
        b3.setFont(font);
        b4=new JButton("4");
        b4.setFont(font);
        b5=new JButton("5");
        b5.setFont(font);
        b6=new JButton("6");
        b6.setFont(font);
        b7=new JButton("7");
        b7.setFont(font);
        b8=new JButton("8");
        b8.setFont(font);
        b9=new JButton("9");
        b9.setFont(font);
        b0=new JButton("0");
        b0.setFont(font);
        bdiv=new JButton("/");
        bdiv.setFont(font);
        bmul=new JButton("*");
        bmul.setFont(font);
        bsub=new JButton("-");
        bsub.setFont(font);
        badd=new JButton("+");
        badd.setFont(font);
        bdec=new JButton(".");
        bdec.setFont(font);
        beq=new JButton("=");
        beq.setFont(font);
        bdel=new JButton("Back");
        bdel.setFont(font);
        bclr=new JButton("Clear");
        bclr.setFont(font);

        //set system:
        t.setBounds(30,30,280,50);
        b7.setBounds(40,100,50,40);
        b8.setBounds(110,100,50,40);
        b9.setBounds(180,100,50,40);
        bdiv.setBounds(250,100,50,40);
        b4.setBounds(40,170,50,40);
        b5.setBounds(110,170,50,40);
        b6.setBounds(180,170,50,40);
        bmul.setBounds(250,170,50,40);
        b1.setBounds(40,240,50,40);
        b2.setBounds(110,240,50,40);
        b3.setBounds(180,240,50,40);
        bsub.setBounds(250,240,50,40);
        bdec.setBounds(40,310,50,40);
        b0.setBounds(110,310,50,40);
        beq.setBounds(180,310,50,40);
        badd.setBounds(250,310,50,40);
        bdel.setBounds(60,380,100,40);
        bclr.setBounds(180,380,100,40);
        box.add(t);
        box.add(b7);
        box.add(b8);
        box.add(b9);
        box.add(bdiv);
        box.add(b4);
        box.add(b5);
        box.add(b6);
        box.add(bmul);
        box.add(b1);
        box.add(b2);
        box.add(b3);
        box.add(bsub);
        box.add(bdec);
        box.add(b0);
        box.add(beq);
        box.add(badd);
        box.add(bdel);
        box.add(bclr);
        //frame:
        setTitle("Calculator");
        setVisible(true);
        setBounds(300,80,350,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bsub.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bdel.addActionListener(this);
        bclr.addActionListener(this);
        image_1();
    }
    public void image_1(){
        ico =new ImageIcon(getClass().getResource("download.png"));
        this.setIconImage(ico.getImage());
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1) {
            t.setText(t.getText().concat("1"));
            badd.setBackground(Color.white);
            bsub.setBackground(Color.white);
            bmul.setBackground(Color.white);
            bdiv.setBackground(Color.white);
        }
        if(e.getSource()==b2) {
            t.setText(t.getText().concat("2"));
            badd.setBackground(Color.white);
            bsub.setBackground(Color.white);
            bmul.setBackground(Color.white);
            bdiv.setBackground(Color.white);
        }
        if(e.getSource()==b3) {
            t.setText(t.getText().concat("3"));
            badd.setBackground(Color.white);
            bsub.setBackground(Color.white);
            bmul.setBackground(Color.white);
            bdiv.setBackground(Color.white);
        }
        if(e.getSource()==b4) {
            t.setText(t.getText().concat("4"));
            badd.setBackground(Color.white);
            bsub.setBackground(Color.white);
            bmul.setBackground(Color.white);
            bdiv.setBackground(Color.white);
        }
        if(e.getSource()==b5) {
            t.setText(t.getText().concat("5"));
            badd.setBackground(Color.white);
            bsub.setBackground(Color.white);
            bmul.setBackground(Color.white);
            bdiv.setBackground(Color.white);
        }
        if(e.getSource()==b6) {
            t.setText(t.getText().concat("6"));
            badd.setBackground(Color.white);
            bsub.setBackground(Color.white);
            bmul.setBackground(Color.white);
            bdiv.setBackground(Color.white);
        }
        if(e.getSource()==b7) {
            t.setText(t.getText().concat("7"));
            badd.setBackground(Color.white);
            bsub.setBackground(Color.white);
            bmul.setBackground(Color.white);
            bdiv.setBackground(Color.white);
        }
        if(e.getSource()==b8) {
            t.setText(t.getText().concat("8"));
            badd.setBackground(Color.white);
            bsub.setBackground(Color.white);
            bmul.setBackground(Color.white);
            bdiv.setBackground(Color.white);
        }
        if(e.getSource()==b9) {
            t.setText(t.getText().concat("9"));
            badd.setBackground(Color.white);
            bsub.setBackground(Color.white);
            bmul.setBackground(Color.white);
            bdiv.setBackground(Color.white);
        }
        if(e.getSource()==b0) {
            t.setText(t.getText().concat("0"));
            badd.setBackground(Color.white);
            bsub.setBackground(Color.white);
            bmul.setBackground(Color.white);
            bdiv.setBackground(Color.white);
        }
        if(e.getSource()==bdec)
            t.setText(t.getText().concat("."));
        if(e.getSource()==badd)
        {
            a=Double.parseDouble(t.getText());
            operator=1;
            t.setText("");
            badd.setBackground(Color.blue);
        }
        if(e.getSource()==bsub)
        {
            a=Double.parseDouble(t.getText());
            operator=2;
            t.setText("");
            bsub.setBackground(Color.blue);
        }
        if(e.getSource()==bmul)
        {
            a=Double.parseDouble(t.getText());
            operator=3;
            t.setText("");
            bmul.setBackground(Color.blue);
        }
        if(e.getSource()==bdiv)
        {
            a=Double.parseDouble(t.getText());
            operator=4;
            t.setText("");
            bdiv.setBackground(Color.blue);
        }
        if(e.getSource()==beq)
        {
            b=Double.parseDouble(t.getText());
            switch(operator)
            {
                case 1: result=a+b;
                    break;
                case 2: result=a-b;
                    break;
                case 3: result=a*b;
                    break;
                case 4: result=a/b;
                    break;
                default: result=0;
            }
            t.setText(""+result);
            badd.setBackground(Color.white);
            bsub.setBackground(Color.white);
            bmul.setBackground(Color.white);
            bdiv.setBackground(Color.white);
        }
        if(e.getSource()==bclr)
            t.setText("");
        if(e.getSource()==bdel)
        {
            String s=t.getText();
            t.setText("");
            for(int i=0;i<s.length()-1;i++)
                t.setText(t.getText()+s.charAt(i));
        }
    }


    //try action:
//    public void actionPerformed(ActionEvent e)
//    {
//        String s = e.getActionCommand();
//
//        // if the value is a number
//        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
//            // if operand is present then add to second no
//            if (!s1.equals(""))
//                s2 = s2 + s;
//            else
//                s0 = s0 + s;
//
//            // set the value of text
//            t.setText(s0 + s1 + s2);
//        }
//        else if (s.charAt(0) == 'C') {
//            // clear the one letter
//            s0 = s1 = s2 = "";
//
//            // set the value of text
//            t.setText(s0 + s1 + s2);
//        }else if (s.charAt(0) == 'B'){
//            String r=t.getText();
//            t.setText("");
//            for(int i=0;i<r.length()-1;i++)
//                t.setText(t.getText()+s.charAt(i));
//        }
//        else if (s.charAt(0) == '=') {
//
//            double te;
//
//            // store the value in 1st
//            if (s1.equals("+"))
//                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
//            else if (s1.equals("-"))
//                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
//            else if (s1.equals("/"))
//                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
//            else
//                te = (Double.parseDouble(s0) * Double.parseDouble(s2));
//
//            // set the value of text
//            t.setText(s0 + s1 + s2 + "=" + te);
//
//            // convert it to string
//            s0 = Double.toString(te);
//
//            s1 = s2 = "";
//        }
//        else {
//            // if there was no operand
//            if (s1.equals("") || s2.equals(""))
//                s1 = s;
//                // else evaluate
//            else {
//                double te;
//
//                // store the value in 1st
//                if (s1.equals("+"))
//                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
//                else if (s1.equals("-"))
//                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
//                else if (s1.equals("/"))
//                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
//                else
//                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
//
//                // convert it to string
//                s0 = Double.toString(te);
//
//                // place the operator
//                s1 = s;
//
//                // make the operand blank
//                s2 = "";
//            }
//
//            // set the value of text
//            t.setText(s0 + s1 + s2);
//        }
//
////        if(e.getSource()==bdel)
////        {
////            String r=t.getText();
////            t.setText("");
////            for(int i=0;i<r.length()-1;i++)
////                t.setText(t.getText()+s.charAt(i));
////        }
//    }







    public static void main(String...s)
    {
        new Calc();
    }
}