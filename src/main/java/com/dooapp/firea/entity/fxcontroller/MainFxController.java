package com.dooapp.firea.entity.fxcontroller;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class MainFxController
{
	AnnotationConfigApplicationContext	context;
	
	@FXML
	VBox thecontent;
	
	public void setContect(AnnotationConfigApplicationContext	ctx)
	{
		this.context = ctx;
	
	}
	
	public void show(String view)
	{
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/" + view + ".fxml"));
		loader.setControllerFactory(new Callback<Class<?>, Object>() {
			
			@Override
			public Object call(Class<?> arg0)
			{
				return context.getBean(arg0);
			}
		});
		
		try
		{
			thecontent.getChildren().clear();
			Node node = (Node) loader.load();
			thecontent.getChildren().add(node);
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
	}

	public void PersistentImageDataSwitchAction()
	{
		this.show ("PersistentImageData_search");
	}

	public void RisqueSwitchAction()
	{
		this.show ("Risque_search");
	}

	public void AbstractEntitySwitchAction()
	{
		this.show ("AbstractEntity_search");
	}

	public void PersistentImageSwitchAction()
	{
		this.show ("PersistentImage_search");
	}

	public void ContactSwitchAction()
	{
		this.show ("Contact_search");
	}

	public void FolderSwitchAction()
	{
		this.show ("Folder_search");
	}

	public void ProjectSwitchAction()
	{
		this.show ("Project_search");
	}

}
