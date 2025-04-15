
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
	public class GUITest extends JFrame implements ActionListener{
	JFrame frame;
	static int operator;
	static double a,b,result;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bAdd,bSub,bMult,bDiv,bEqual,bDec,bClear;
	JTextField tf;
		GUITest(){
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 frame = new JFrame();
						//Button Sections
						b1=new JButton("1");
						b1.setBounds(100,300,100,100);
						b1.setFont(new Font("Arial", Font.BOLD, 20));


						b2=new JButton("2");
						b2.setBounds(200,300,100,100);
						b2.setFont(new Font("Arial", Font.BOLD, 20));


						b3=new JButton("3");
						b3.setBounds(300,300,100,100);
						b3.setFont(new Font("Arial", Font.BOLD, 20));


						b4=new JButton("4");
						b4.setBounds(100,400,100,100);
						b4.setFont(new Font("Arial", Font.BOLD, 20));


						b5=new JButton("5");
						b5.setBounds(200,400,100,100);
						b5.setFont(new Font("Arial", Font.BOLD, 20));


						b6=new JButton("6");
						b6.setBounds(300,400,100,100);
						b6.setFont(new Font("Arial", Font.BOLD, 20));


						b7=new JButton("7");
						b7.setBounds(100,500,100,100);
						b7.setFont(new Font("Arial", Font.BOLD, 20));


						b8=new JButton("8");
						b8.setBounds(200,500,100,100);
						b8.setFont(new Font("Arial", Font.BOLD, 20));


						b9=new JButton("9");
						b9.setBounds(300,500,100,100);
						b9.setFont(new Font("Arial", Font.BOLD, 20));


						b0=new JButton("0");
						b0.setBounds(200,600,100,100);
						b0.setFont(new Font("Arial", Font.BOLD, 20));


						bAdd=new JButton("+");
						bAdd.setBounds(400,300,100,100);
						bAdd.setFont(new Font("Arial", Font.BOLD, 20));


						bSub=new JButton("-");
						bSub.setBounds(400,400,100,100);
						bSub.setFont(new Font("Arial", Font.BOLD, 20));


						bMult=new JButton("*");
						bMult.setBounds(400,500,100,100);
						bMult.setFont(new Font("Arial", Font.BOLD, 20));


						bDiv=new JButton("/");
						bDiv.setBounds(400,600,100,100);
						bDiv.setFont(new Font("Arial", Font.BOLD, 20));


						bEqual=new JButton("=");
						bEqual.setBounds(300,600,100,100);
						bEqual.setFont(new Font("Arial", Font.BOLD, 20));


						bDec=new JButton(".");
						bDec.setBounds(100,600,100,100);
						bDec.setFont(new Font("Arial", Font.BOLD, 20));


						bClear=new JButton("Clear");
						bClear.setBounds(100,250,400,50);
						bClear.setFont(new Font("Arial", Font.BOLD, 20));


						//Textfield Sections
						tf=new JTextField();
						tf.setBounds(100,200,400,50);
						tf.setFont(new Font("Arial", Font.BOLD, 30));

						//Adding Area
						frame.add(b1);
						frame.add(b2);
						frame.add(b3);
						frame.add(b4);
						frame.add(b5);
						frame.add(b6);
						frame.add(b7);
						frame.add(b8);
						frame.add(b9);
						frame.add(b0);
						frame.add(bAdd);
						frame.add(bSub);
						frame.add(bMult);
						frame.add(bDiv);
						frame.add(bEqual);
						frame.add(bDec);
						frame.add(bClear);
						frame.add(tf);


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
						bAdd.addActionListener(this);
						bSub.addActionListener(this);
						bMult.addActionListener(this);
						bDiv.addActionListener(this);
						bDec.addActionListener(this);
						bEqual.addActionListener(this);
						bClear.addActionListener(this);
						tf.addActionListener(this);
						//Frame Data
									//length,width
						frame.setSize(1000,800);

						frame.setLayout(null);

						frame.setVisible(true);


		}
		 public void actionPerformed(ActionEvent e) {

		            if (e.getSource() == b1) {
		                  tf.setText(tf.getText().concat("1"));
		            }

		            else if (e.getSource() == b2) {
		                  tf.setText(tf.getText().concat("2"));
		            }

		            else if (e.getSource() == b3) {
		                  tf.setText(tf.getText().concat("3"));
		            }

		            else if (e.getSource() == b4) {
		                  tf.setText(tf.getText().concat("4"));
		            }

		            else if (e.getSource() == b5) {
		                  tf.setText(tf.getText().concat("5"));
		            }

		            else if (e.getSource() == b6) {
		                  tf.setText(tf.getText().concat("6"));
		            }

		            else if (e.getSource() == b7) {
		                  tf.setText(tf.getText().concat("7"));
		            }

		            else if (e.getSource() == b8) {
		                  tf.setText(tf.getText().concat("8"));
		            }

		            else if (e.getSource() == b9) {
		                  tf.setText(tf.getText().concat("9"));
		            }

		            else if (e.getSource() == b0) {
		                  tf.setText(tf.getText().concat("0"));
		            }

		            else if (e.getSource() == bDec) {
		                  tf.setText(tf.getText().concat("."));
		            }

		            if (e.getSource() == bAdd) {
		                  a = Double.parseDouble(tf.getText());
		                  operator = 1;
		                  tf.setText("");
		            }

		            if (e.getSource() == bSub) {
		                  a = Double.parseDouble(tf.getText());
		                  operator = 2;
		                  tf.setText("");
		            }

		            if (e.getSource() == bMult) {
		                  a = Double.parseDouble(tf.getText());
		                  operator = 3;
		                  tf.setText("");
		            }

		            if (e.getSource() == bDiv) {
		                  a = Double.parseDouble(tf.getText());
		                  operator = 4;
		                  tf.setText("");
		            }

		            if (e.getSource() == bEqual) {
		                  b = Double.parseDouble(tf.getText());
		                  switch (operator) {
		                        case 1:
		                              result = a + b;
		                              break;

		                        case 2:
		                              result = a - b;
		                              break;

		                        case 3:
		                              result = a * b;
		                              break;

		                        case 4:
		                              result = a / b;
		                              break;

		                        default:
		                              result = 0;
		                  }

		                  tf.setText("" + result);
		            }

		            if (e.getSource() == bClear)
		                  tf.setText("");
		      }


		public static void main(String[] args){

			new GUITest();
		}

}