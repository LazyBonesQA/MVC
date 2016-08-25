package com.mybank.mvc;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class View {
	JFrame frame = new JFrame("First Java Bank ATM");
	JTextArea ja = new JTextArea();
	JTextField jt = new JTextField(200);
	JButton display = new JButton("Display account balance");
	JButton makeD = new JButton("Make a deposit");
	JButton makeW = new JButton("Make a withdrawal");
	JTextField field = new JTextField(20);
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton b0 = new JButton("0");
	JButton point = new JButton("1");
	JButton enter = new JButton("ENTER");
	JPanel panelR = new JPanel();
	JPanel panelCalc = new JPanel();
	JPanel panel = new JPanel();

	public void launchFrame() {
		jt.setVisible(false);
		frame.setLayout(new BorderLayout());
		panelR.setLayout(new GridLayout(2, 1));
		panelR.add(jt);
		panelR.add(ja);
		panelCalc.setLayout(new GridLayout(4, 3));
		panelCalc.add(b1);
		panelCalc.add(b2);
		panelCalc.add(b3);
		panelCalc.add(b4);
		panelCalc.add(b5);
		panelCalc.add(b6);
		panelCalc.add(b7);
		panelCalc.add(b8);
		panelCalc.add(b9);
		panelCalc.add(b0);
		panelCalc.add(point);
		panelCalc.add(enter);
		panel.setLayout(new GridLayout(5, 1));
		panel.add(display);
		panel.add(makeD);
		panel.add(makeW);
		panel.add(field);
		panel.add(panelCalc);
		frame.add(panel, BorderLayout.WEST);
		frame.add(panelR, BorderLayout.EAST);
		frame.pack();
		frame.setVisible(true);

	}

	public void addActionListenerForDisplay(ActionListener act) {
		display.addActionListener(act);
	}

	public void setBalanceForField(double balance) {
		field.setText(String.valueOf(balance));
	}

}
