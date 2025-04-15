import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Fun extends JFrame{
	JFrame frame;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	JTextField tf;
	JLabel l1,l2,l3;

	Fun(){
		frame=new JFrame();
		frame.setTitle("335 is fun");
		frame.setSize(560,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		b1=new JButton("1");
		b1.setBounds(100,30,60,30);

		b2=new JButton("2");
		b2.setBounds(170,10,60,30);

		b3=new JButton("3");
		b3.setBounds(170,45,60,30);

		b4=new JButton("4");
		b4.setBounds(235,10,60,30);

		b5=new JButton("5");
		b5.setBounds(235,45,60,30);

		b6=new JButton("6");
		b6.setBounds(300,30,60,30);

		b7=new JButton("7");
		b7.setBounds(370,30,60,30);

		b8=new JButton("8");
		b8.setBounds(0,90,500,120);

		b9=new JButton("9");
		b9.setBounds(0,210,500,120);

		l1=new JLabel("Label 1");
		l1.setBounds(0,330,42,30);

		l2=new JLabel("Label 2");
		l2.setBounds(500,330,42,30);

		l3=new JLabel("Label 3");
		l3.setBounds(500,195,42,30);

		tf=new JTextField();
		tf.setBounds(42,330,459,30);

		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(b7);
		frame.add(b8);
		frame.add(b9);
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(tf);
		frame.setVisible(true);

	}
	public static void main(String[] args){

		new Fun();

	}

}