package GradeBookApp;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AlexanderGradeBookApp extends Application {

    private TextField firstNameField;
    private TextField lastNameField;
    private TextField courseField;
    private ComboBox<String> gradeComboBox;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Grade Book");

        // Create form fields
        Label firstNameLabel = new Label("First Name:");
        firstNameField = new TextField();

        Label lastNameLabel = new Label("Last Name:");
        lastNameField = new TextField();

        Label courseLabel = new Label("Course:");
        courseField = new TextField();

        Label gradeLabel = new Label("Grade:");
        gradeComboBox = new ComboBox<>(FXCollections.observableArrayList(
                "A", "B", "C", "D", "F"
        ));

        // Create buttons
        Button clearButton = new Button("Clear");
        clearButton.setOnAction(e -> clearForm());

        Button viewButton = new Button("View Entries");
        viewButton.setOnAction(e -> viewEntries());

        Button saveButton = new Button("Save Entry");
        saveButton.setOnAction(e -> saveEntry());

        // Create grid pane layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Add form fields and buttons to the grid pane
        gridPane.add(firstNameLabel, 0, 0);
        gridPane.add(firstNameField, 1, 0);
        gridPane.add(lastNameLabel, 0, 1);
        gridPane.add(lastNameField, 1, 1);
        gridPane.add(courseLabel, 0, 2);
        gridPane.add(courseField, 1, 2);
        gridPane.add(gradeLabel, 0, 3);
        gridPane.add(gradeComboBox, 1, 3);
        gridPane.add(clearButton, 0, 4);
        gridPane.add(viewButton, 1, 4);
        gridPane.add(saveButton, 0, 5);

        // Create scene and set it to the stage
        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void clearForm() {
        firstNameField.clear();
        lastNameField.clear();
        courseField.clear();
        gradeComboBox.getSelectionModel().clearSelection();
    }

    private void viewEntries() {
        // Code to view saved grade entries
    }

    private void saveEntry() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String course = courseField.getText();
        String grade = gradeComboBox.getSelectionModel().getSelectedItem();

        // Code to save the grade entry
    }
}

