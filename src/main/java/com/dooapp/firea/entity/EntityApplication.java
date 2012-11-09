package com.dooapp.firea.entity;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.util.Callback;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dooapp.firea.entity.config.InfrastructureContextConfiguration;
import com.dooapp.firea.entity.fxcontroller.MainFxController;

public class EntityApplication extends Application
{
	
	AnnotationConfigApplicationContext	context;
	
	public EntityApplication()
	{
	}
	
	public static void main(String[] args)
	{
		Application.launch(EntityApplication.class, args);
	}
	
	@Override
	public void start(Stage stage) throws Exception
	{
		
		context = new AnnotationConfigApplicationContext(InfrastructureContextConfiguration.class);
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("views/main.fxml"));
		loader.setControllerFactory(new Callback<Class<?>, Object>() {
			
			@Override
			public Object call(Class<?> arg0)
			{
				return context.getBean(arg0);
			}
		});
		
		MainFxController mainController = context.getBean(MainFxController.class);
		mainController.setContect(context);
	
		Parent root = (Parent) loader.load();
		
		stage.setTitle("Building");
		stage.setScene(new Scene(root, 800, 600));
		stage.show();
	}
	
}
