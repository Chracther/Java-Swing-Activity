	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.io.*;
	public class IDigLayout extends JFrame{

		JFrame frame;
		JLabel label;
		JButton b1, b2, b3, b4, b5, b6, b7, b8;
		JTextField tf;
		IDigLayout(){
			frame=new JFrame();
			frame.setTitle("I Dig Layout");

			label=new JLabel("Pretty Tricky!");
			label.setBounds(0,305,100,30);
			label.setForeground(Color.blue);

			b1=new JButton("1");
			b1.setBounds(0,30,50,30);

			b2=new JButton("2");
			b2.setBounds(0,0,500,30);

			b3=new JButton("3");
			b3.setBounds(0,60,500,30);

			b4=new JButton("4");
			b4.setBounds(0,90,250,110);

			b5=new JButton("5");
			b5.setBounds(250,170,250,30);

			b6=new JButton("6");
			b6.setBounds(80,206,50,30);

			b7=new JButton("7");
			b7.setBounds(140,206,50,30);

			b8=new JButton("8");
			b8.setBounds(250,200,250,110);

			tf=new JTextField();
			tf.setBounds(50,30,450,30);

			frame.add(label);
			frame.add(b1);
			frame.add(b2);
			frame.add(b3);
			frame.add(b4);
			frame.add(b5);
			frame.add(b6);
			frame.add(b7);
			frame.add(b8);
			frame.add(tf);

			b1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
				tf.setText("text");
				}
			});

			frame.setSize(500,370);
			frame.setLayout(null);
			frame.setVisible(true);
			}
		public static void main(String[] args){
			new IDigLayout();
		}
	}