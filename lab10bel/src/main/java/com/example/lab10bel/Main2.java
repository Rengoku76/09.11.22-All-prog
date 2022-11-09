package com.example.lab10bel;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.Date;

public class Main2 extends Application {

    public  static GridPane initRootLayout(){
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25));

        Text scenetitle = new Text("Calculation of age");
        Font fontbig = Font.font("Tahoma", FontWeight.NORMAL,26);
        scenetitle.setFont(fontbig);

        root.add(scenetitle,0,0,2,1);

        Label userName = new Label("Name:");
        userName.setFont(fontbig);
        root.add(userName, 0 ,1);

        TextField nameTextField = new TextField();
        nameTextField.setFont(fontbig);
        root.add(nameTextField,1,1);

        Label userYear = new Label("Year:");
        userYear.setFont(fontbig);
        root.add(userYear,0,2);

        TextField valueYear = new TextField();
        valueYear.setFont(fontbig);
        root.add(valueYear,1,2);

        Text resoult = new Text("Resoult:");
        resoult.setFont(fontbig);
        root.add(resoult,0,6);
        Button btn = new Button("OK");
        btn.setFont(fontbig);
        btn.setOnAction(event -> {
            Calendar calendar = Calendar.getInstance(TimeZone.getDefault(),Locale.getDefault());
            calendar.setTime(new Date());
            String year = valueYear.getText();
            if (year.matches("[0-9]+")) {
                int age = calendar.get(Calendar.YEAR) - Integer.parseInt(year);
                resoult.setText(nameTextField.getText() + " is " + age + " years old");
            }
            else {
                resoult.setFill(Color.FIREBRICK);
                resoult.setText("Wrong year");
            }
        });
        root.add(btn,1,5);
        return root;
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane root = initRootLayout();
        Scene scene = new Scene(root,600,500);
        primaryStage.setTitle("Age");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}