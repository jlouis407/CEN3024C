import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class TriviaGame extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Trivia Game");
		
		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(10, 10, 10, 10));
		gridPane.setVgap(8);
		gridPane.setHgap(10);
		
		// Scene 1 contents
		Label nameLabel = new Label("Enter your name: ");
		GridPane.setConstraints(nameLabel, 0, 0);
		
		TextField nameInput = new TextField();
		GridPane.setConstraints(nameInput, 1, 0);
		
		Button nameButton = new Button("Submit");
		GridPane.setConstraints(nameButton, 0, 1);
		
		gridPane.getChildren().addAll(nameLabel, nameInput, nameButton);
		
		GridPane gridPane2 = new GridPane();
		gridPane2.setPadding(new Insets(10, 10, 10, 10));
		gridPane2.setVgap(8);
		gridPane2.setHgap(10);
		
		// Scene 2 contents
		Label nameAreaLabel = new Label (nameInput.getText());
		GridPane.setConstraints(nameAreaLabel, 0, 0);
		
		Label pointsLabel = new Label("0");
		GridPane.setConstraints(pointsLabel, 10, 0);
		
		Label clockLabel = new Label("5");
		GridPane.setConstraints(clockLabel, 20, 0);
		
		Label object1 = new Label("Object1");
		GridPane.setConstraints(object1, 5, 15);
		
		Label object2 = new Label ("Object2");
		GridPane.setConstraints(object2, 20, 15);
		
		Button choice1 = new Button("Choice 1");
		GridPane.setConstraints(choice1, 0, 30);
		
		Button choice2 = new Button("Choice 2");
		GridPane.setConstraints(choice2, 7, 30);
		
		Button choice3 = new Button("Choice 3");
		GridPane.setConstraints(choice3, 14, 30);
		
		Button choice4 = new Button("Choice 4");
		GridPane.setConstraints(choice4, 21, 30);
		
		Button generateReport = new Button("Generate Report");
		GridPane.setConstraints(generateReport, 12, 35);
		
		gridPane2.getChildren().addAll(nameAreaLabel, pointsLabel, clockLabel,
				object1, object2, choice1, choice2, choice3, choice4, generateReport);
		
		Scene scene1 = new Scene(gridPane, 300, 300);
		Scene scene2 = new Scene(gridPane2, 750, 500);
		//nameButton.setOnAction(e -> primaryStage.setScene(scene2));
		
		nameButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String userInput;
				
				userInput = nameInput.getText();
				nameAreaLabel.setText(userInput);
				
				primaryStage.setScene(scene2);
			}
		});
		
		primaryStage.setScene(scene1);
		primaryStage.show();

	}
	
	public static void main(String[] args) {
		
		// These four lines break the code
		FileReader fileReader = new FileReader();
		fileReader.openFile();
		fileReader.readFile();
		fileReader.openFile();
		
		launch(args);
	}
	
}
