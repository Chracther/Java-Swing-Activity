import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class GoodThingIStudied extends JFrame{

	JFrame frame;
	JLabel label;
	JButton b1, b2, b3, b4, b5, b6, b7;
	JTextField tf;

		GoodThingIStudied(){

				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame=new JFrame();
				frame.setTitle("Good thing I studied!");

				label=new JLabel("Type stuff:");
				label.setBounds(78,190,60,30);
				label.setForeground(Color.red);

				b1=new JButton("Button1");
				b1.setBounds(0,0,118,30);

				b2=new JButton("Button2");
				b2.setBounds(118,0,118,30);

				b3=new JButton("Button3");
				b3.setBounds(236,0,119,30);

				b4=new JButton("Button4");
				b4.setBounds(0,30,177,80);

				b5=new JButton("Button5");
				b5.setBounds(177,30,178,80);

				b6=new JButton("Button6");
				b6.setBounds(0,110,177,80);

				b7=new JButton("Button7");
				b7.setBounds(177,110,178,80);

				tf=new JTextField();
				tf.setBounds(150,194,130,25);


				frame.add(label);
				frame.add(b1);
				frame.add(b2);
				frame.add(b3);
				frame.add(b4);
				frame.add(b5);
				frame.add(b6);
				frame.add(b7);
				frame.add(tf);

				frame.setSize(456,302);
				frame.setLayout(null);
				frame.setVisible(true);


	}

	public static void main(String[] args){
		new GoodThingIStudied();
	}

}