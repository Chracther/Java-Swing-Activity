import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class MidtermsonThursday extends JFrame{
	JFrame frame;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	JRadioButton rb1,rb2,rb3,rb4,rb5;
	ButtonGroup group;
	JTextField tf;
	MidtermsonThursday(){
		frame=new JFrame();
		frame.setTitle("335 Midterms on Thursday");
		frame.setSize(460,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		b1=new JButton("Now Playing");
		b1.setBounds(0,0,110,30);

		b2=new JButton("Media Guide");
		b2.setBounds(0,30,110,30);

		b3=new JButton("Library");
		b3.setBounds(0,60,80,30);

		b4=new JButton("Help & Info");
		b4.setBounds(0,90,100,30);

		b5=new JButton("Services");
		b5.setBounds(0,120,90,30);

		b6=new JButton("0");
		b6.setBounds(340,0,50,30);

		b7=new JButton("1");
		b7.setBounds(390,0,50,30);

		b8=new JButton("2");
		b8.setBounds(340,30,50,30);

		b9=new JButton("3");
		b9.setBounds(390,30,50,30);

		b10=new JButton("OK");
		b10.setBounds(340,60,100,210);

		rb1 = new JRadioButton("Movies");
		rb1.setBounds(30,275,70,30);

		rb2 = new JRadioButton("Music");
		rb2.setBounds(110,275,70,30);

		rb3 = new JRadioButton("Videos");
		rb3.setBounds(190,275,70,30);

		rb4 = new JRadioButton("DvD");
		rb4.setBounds(270,275,50,30);

		rb5 = new JRadioButton("Web Pages");
		rb5.setBounds(320,275,110,30);

		group = new ButtonGroup();

		group.add(rb1);
		group.add(rb2);
        group.add(rb3);
        group.add(rb4);
        group.add(rb5);

		tf=new JTextField();
		tf.setBounds(110,00,230,270);

		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(b7);
		frame.add(b8);
		frame.add(b9);
		frame.add(b10);
		frame.add(rb1);
		frame.add(rb2);
		frame.add(rb3);
		frame.add(rb4);
		frame.add(rb5);
		frame.add(tf);
		frame.setVisible(true);

	}
public static void main(String[] args){
	new MidtermsonThursday();
}

}