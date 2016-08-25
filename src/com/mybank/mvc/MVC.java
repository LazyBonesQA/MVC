package com.mybank.mvc;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.mybank.loadconfig.LoadConfig;

public class MVC {

	public static void main(String[] args) {
		Model theModel = null;
		View theView = null;
		Controller theController = null;
		String pathToConfig = args[0];
		LoadConfig load = new LoadConfig();

		try {
			Class<Model> tModel = (Class<Model>) Class.forName(load.readProperties("model", pathToConfig));
			theModel = tModel.newInstance();
			Class<View> tView = (Class<View>) Class.forName(load.readProperties("view", pathToConfig));
			theView = tView.newInstance();
			Class<Controller> tController = (Class<Controller>) Class.forName(load.readProperties("controller", pathToConfig));
			Constructor constructor = tController.getConstructor(new Class[] { Model.class, View.class });
			theController = (Controller) constructor.newInstance(new Object[] { theModel, theView });

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException
				| SecurityException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		/* Simple way 
	  	------------------ 
		 * Model theModel = new Model(); 
		 * View theView = new View();
		 * Controller theController = new Controller(theModel, theView);
		------------------
		 */
		
		theView.launchFrame();


	}

}
