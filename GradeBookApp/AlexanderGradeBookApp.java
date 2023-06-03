/**
 * Alexander, K. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class AlexanderGradeBookApp extends Application {

    private TextField firstNameField;
    private TextField lastNameField;
    private TextField courseField;
    private ComboBox<String> gradeComboBox;
    private TextArea resultsTextArea;

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

        // Create results text area
        resultsTextArea = new TextArea();
        resultsTextArea.setEditable(false);

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

        // Add results text area to the grid pane
        gridPane.add(resultsTextArea, 0, 6, 2, 1);

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
        try {
            List<String> lines = Files.readAllLines(Path.of("grades.csv"));
            StringBuilder stringBuilder = new StringBuilder();
            for (String line : lines) {
                stringBuilder.append(line).append("\n");
            }
            resultsTextArea.setText(stringBuilder.toString());
        } catch (IOException e) {
            resultsTextArea.setText("Error reading entries: " + e.getMessage());
        }
    }

    private void saveEntry() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String course = courseField.getText();
        String grade = gradeComboBox.getSelectionModel().getSelectedItem();

        Student student = new Student(firstName, lastName, course, grade);
        String entry = student.toCSV();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("grades.csv", true))) {
            writer.write(entry);
            writer.newLine();
            writer.flush();
            resultsTextArea.setText("Entry saved successfully.");
        } catch (IOException e) {
            resultsTextArea.setText("Error saving entry: " + e.getMessage());
        }
    }

    private static class Student {
        private String firstName;
        private String lastName;
        private String course;
        private String grade;

        public Student() {
        }

        public Student(String firstName, String lastName, String course, String grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.course = course;
            this.grade = grade;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String toCSV() {
            return firstName + "," + lastName + "," + course + "," + grade;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", course='" + course + '\'' +
                    ", grade='" + grade + '\'' +
                    '}';
        }
    }
}
