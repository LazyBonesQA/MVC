package com.mybank.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
	private Model cModel;
	private View cView;
	
	public Controller(Model m, View v){
		cModel = m;
		cView = v;
		cView.addActionListenerForDisplay(new MyListener());
	}
	
	class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			try{
				cView.setBalanceForField(cModel.getBalance());
			}catch(Exception ecept){}
		}
		
	}
	
}
