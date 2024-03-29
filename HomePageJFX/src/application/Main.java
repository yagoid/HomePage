package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
	 @Override
	    public void start(Stage primaryStage) throws Exception{

	        FXMLLoader loader =new FXMLLoader(getClass().getResource("Vista.fxml"));
	        AnchorPane pane=loader.load();
	        Scene scene=new Scene(pane);
	        scene.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
	        primaryStage.setTitle("Home page");
	        primaryStage.setScene(scene);
	        primaryStage.setMinHeight(700);
	        primaryStage.setMinWidth(700);
	        primaryStage.show();

	    }
	    
	    public static void main(String[] args) {
	        launch(args);
	    }
}
