import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class LayoutQuestion{

	JLabel label;
	JFrame frame;
	JButton bHi, bLongName, bBye, b1, b2, b3, b4, b5, b6, b7, bCancel;
	JCheckBox cbBold, cbItalic, cbUnderLine, cbStrikeOut;

		LayoutQuestion(){


			frame=new JFrame();
			frame.setTitle("Layout question");

			label=new JLabel("Buttons:");
			label.setBounds(0,0,50,30);

			bHi=new JButton("hi");
			bHi.setBounds(50,0,135,30);

			bLongName=new JButton("long name");
			bLongName.setBounds(175,0,135,30);

			bBye=new JButton("bye");
			bBye.setBounds(300,0,135,30);

			b1=new JButton("1");
			b1.setBounds(80,30,175,100);

			b2=new JButton("2");
			b2.setBounds(255,30,180,100);

			b3=new JButton("3");
			b3.setBounds(80,130,87,50);

			b4=new JButton("4");
			b4.setBounds(167,130,88,50);

			b5=new JButton("5");
			b5.setBounds(80,180,87,50);

			b6=new JButton("6");
			b6.setBounds(167,180,88,50);

			b7=new JButton("7");
			b7.setBounds(255,130,180,100);

			bCancel=new JButton("Cancel");
			bCancel.setBounds(0,230,435,30);

			cbBold=new JCheckBox("Bold");
			cbBold.setBounds(0,30,80,30);

			cbItalic=new JCheckBox("Italic");
			cbItalic.setBounds(0,60,80,30);

			cbUnderLine=new JCheckBox("Underline");
			cbUnderLine.setBounds(0,90,80,30);

			cbStrikeOut=new JCheckBox("Strikeout");
			cbStrikeOut.setBounds(0,120,80,30);

			frame.add(label);
			frame.add(bHi);
			frame.add(bLongName);
			frame.add(bBye);
			frame.add(b1);
			frame.add(b2);
			frame.add(b3);
			frame.add(b4);
			frame.add(b5);
			frame.add(b6);
			frame.add(b7);
			frame.add(bCancel);
			frame.add(cbBold);
			frame.add(cbItalic);
			frame.add(cbUnderLine);
			frame.add(cbStrikeOut);

			frame.setSize(456,302);
			frame.setLayout(null);
			frame.setVisible(true);

}

public static void main(String[] args){

			new LayoutQuestion();
		}




}