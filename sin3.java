package bank.management.system;

import java.awt.*;

//import javax.swing.JLabel;
import javax.swing.*;

public class sin3 extends JFrame{

	JRadioButton r1,r2,r3,r4;

	public sin3() {
		
		setLayout(null);
		
		JLabel l1 = new JLabel("Page 3 : Account Details");
		l1.setFont(new Font("Raleway", Font.BOLD,22));
		l1.setBounds(280, 40, 400, 40);
		add(l1);
		
		JLabel type= new JLabel("AccountType");
		type.setFont(new Font("Raleway", Font.BOLD,22));
		type.setBounds(100, 140, 200, 30);
		add(type);
		
		r1=new JRadioButton("Saving Account");
		r1.setFont(new Font("Raleway",Font.BOLD,16));
		r1.setBackground(Color.WHITE);
		r1.setBounds(100, 180, 150, 20);
		add(r1);
		
		r2=new JRadioButton("Current Account");
		r2.setFont(new Font("Raleway",Font.BOLD,16));
		r2.setBackground(Color.WHITE);
		r2.setBounds(100, 220, 150, 20);
		add(r2);
		
		r3=new JRadioButton("Fixed Deposit Account");
		r3.setFont(new Font("Raleway",Font.BOLD,16));
		r3.setBackground(Color.WHITE);
		r3.setBounds(350, 180, 250, 20);
		add(r3);
		
		r4=new JRadioButton("Recurring Deposit Account");
		r4.setFont(new Font("Raleway",Font.BOLD,16));
		r4.setBackground(Color.WHITE);
		r4.setBounds(350, 220, 250, 20);
		add(r4);
		
		 ButtonGroup groupgender = new ButtonGroup();
	     groupgender.add(r1);
	     groupgender.add(r2);
	     groupgender.add(r3);
	     groupgender.add(r4);
		
	     JLabel card= new JLabel("Card Number");
		 card.setFont(new Font("Raleway", Font.BOLD,22));
		 card.setBounds(100, 300, 200, 30);
		 add(card);
		 
		 
	     
		setSize(850,820);
		setLocation(350,0);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new sin3();
	}
	
}
