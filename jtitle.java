import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class jtitle extends JFrame{
	JFrame frame;
	JLabel label;
	JRadioButton rb1,rb2,rb3;
	ButtonGroup group;
	JList<String> newList;
	JScrollPane scrollPane;
	jtitle(){

		frame=new JFrame();
		frame.setTitle("Title");
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		label=new JLabel("Louie");
		label.setBounds(120,70,100,20);
		label.setFont(new Font("SansSerif", Font.BOLD, 20));
		label.setForeground(Color.BLUE);

		rb1 = new JRadioButton("Huey");
		rb2 = new JRadioButton("Duey");
		rb3 = new JRadioButton("Louie");
		group = new ButtonGroup();

		group.add(rb1);
		group.add(rb2);
        group.add(rb3);

		rb1.setBounds(20, 20, 60, 20);
		rb2.setBounds(90, 20, 60, 20);
        rb3.setBounds(160, 20, 60, 20);
        rb3.setSelected(true);

		String[] list = {"Monospaced", "SansSerif", "Serif"};
		newList=new JList<>(list);
		newList.setSelectedIndex(1);
		scrollPane = new JScrollPane(newList);

		scrollPane.setBounds(20,50,100,60);

		frame.add(scrollPane);
		frame.add(rb1);
		frame.add(rb2);
        frame.add(rb3);
        frame.add(label);

        rb1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
				label.setText("Huey");
				}
		});
		rb2.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
						label.setText("Duey");
						}
		});
		rb3.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
						label.setText("Louie");
						}
		});
		frame.setVisible(true);
	}

public static void main(String[] args){
	new jtitle();
}

}