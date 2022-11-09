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

public class Main3 extends Application {

    public  static GridPane initRootLayout(){
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25));

        Text scenetitle = new Text("Расчет калорийности");
        Font fontbig = Font.font("Tahoma", FontWeight.NORMAL,26);
        scenetitle.setFont(fontbig);

        root.add(scenetitle,0,0,2,1);

        Label ProductWeight = new Label("Вес продукта:");
        ProductWeight.setFont(fontbig);
        root.add(ProductWeight, 0 ,1);

        TextField nameTextField = new TextField();
        nameTextField.setFont(fontbig);
        root.add(nameTextField,1,1);

        Label Poyasnenie = new Label("100 грамм колбасы = 301 Ккал");
        Poyasnenie.setFont(fontbig);
        root.add(Poyasnenie,0,2);


        Text resoult = new Text("Результат:");
        resoult.setFont(fontbig);
        root.add(resoult,0,6);
        Button btn = new Button("Расчет калорийности");
        btn.setFont(fontbig);
        btn.setOnAction(event -> {
            Calendar calendar = Calendar.getInstance(TimeZone.getDefault(),Locale.getDefault());
            calendar.setTime(new Date());
        });
        root.add(btn,1,5);
        return root;
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane root = initRootLayout();
        Scene scene = new Scene(root,800,500);
        primaryStage.setTitle("Лабораторная");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
//Button btn = new Button(" ");