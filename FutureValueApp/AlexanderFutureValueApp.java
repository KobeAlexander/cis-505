package FutureValueApp;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class AlexanderFutureValueApp extends Application {

    private TextField textField1 = new TextField();
    private TextField textField2 = new TextField();

    private TextArea textArea = new TextArea();

    private Label lblMonthlyPayment = new Label("Monthly Payment:");
    private Label lblInterestRate = new Label("Interest Rate:");
    private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
    private Label lblYears = new Label("Years:");
    private Label lbl5 = new Label();

    private ComboBox<Integer> comboBox;

    private Button btnCalculator = new Button("Calculate");
    private Button btnClear = new Button("Clear");

    @Override
    public void start(Stage primaryStage) throws Exception {

        Integer years[] = {2021, 2022, 2023};
        comboBox = new ComboBox<Integer>(FXCollections.observableArrayList(years));
        GridPane pane = new GridPane();
        Scene scene = new Scene(pane, 300, 300);

        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        pane.add(lblMonthlyPayment, 0, 0, 1, 1);
        pane.add(textField1, 1, 0);
        pane.add(lblInterestRate, 0, 1, 1, 1);
        pane.add(textField2, 1, 1);
        pane.add(lblYears, 0, 3);
        pane.add(comboBox, 1, 3);
        pane.add(textArea, 0, 5, 2, 3);

        lblInterestRateFormat.setTextFill(Color.RED);
        pane.add(lblInterestRateFormat, 1, 2);
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);

        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.setSpacing(20);
        actionBtnContainer.getChildren().add(btnClear);
        actionBtnContainer.getChildren().add(btnCalculator);
        pane.add(actionBtnContainer, 1, 4);




        primaryStage.setTitle("Alexander Future Value App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
