package com.example.calculatorinator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class calc extends Application {
    Label Label1;
    Label Label2;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button plus;
    Button minus;
    Button mult;
    Button div;
    Button equals;
    Button clear;

    double sum = 0;
    double firstOpperand = 0;
    boolean first = true;
    double secondOpperand = 0;
    boolean result = false;
    String opperator = " ";

    public static void main(String[] args){
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("bb calculator");
        Label1 = new Label("");
        Label2 = new Label("");

        VBox root = new VBox();
        HBox firstRow = new HBox();
        HBox secondRow = new HBox();
        HBox thirdRow = new HBox();
        HBox fourthRow = new HBox();

        Scene scene = new Scene(root, 130, 150);
        stage.setScene(scene);
        button0 = new Button("0");
        button1 = new Button("1");
        button2 = new Button("2");
        button3 = new Button("3");
        button4 = new Button("4");
        button5 = new Button("5");
        button6 = new Button("6");
        button7 = new Button("7");
        button8 = new Button("8");
        button9 = new Button("9");
        plus = new Button("+");
        minus = new Button("-");
        mult = new Button("*");
        div = new Button("/");
        equals = new Button("=");
        clear = new Button("C");


        button0.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                if(!result) {
                    Label2 = Label1;
                    Label1.setText(Label2.getText() + "0");
                }else{
                    Label1.setText("0");
                    first = true;
                    result = false;
                }
                if(first){
                    firstOpperand = firstOpperand * 10;
                }else{
                    secondOpperand = secondOpperand * 10;
                }
            }
        });
        button1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                if(!result) {
                    Label2 = Label1;
                    Label1.setText(Label2.getText() + "1");
                }else{
                    Label1.setText("1");
                    first = true;
                    result = false;
                }
                if(first){
                    firstOpperand = (firstOpperand * 10) + 1;
                }else{
                    secondOpperand = (secondOpperand * 10) + 1;
                }
            }
        });
        button2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                if(!result) {
                    Label2 = Label1;
                    Label1.setText(Label2.getText() + "2");
                }else{
                    Label1.setText("2");
                    first = true;
                    result = false;
                }
                if(first){
                    firstOpperand = (firstOpperand * 10) + 2;
                }else{
                    secondOpperand = (secondOpperand * 10) + 2;
                }
            }
        });
        button3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                if(!result) {
                    Label2 = Label1;
                    Label1.setText(Label2.getText() + "3");
                }else{
                    Label1.setText("3");
                    first = true;
                    result = false;
                }
                if(first){
                    firstOpperand = (firstOpperand * 10) + 3;
                }else{
                    secondOpperand = (secondOpperand * 10) + 3;
                }
            }
        });
        button4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                if(!result) {
                    Label2 = Label1;
                    Label1.setText(Label2.getText() + "4");
                }else{
                    Label1.setText("4");
                    first = true;
                    result = false;
                }
                if(first){
                    firstOpperand = (firstOpperand * 10) + 4;
                }else{
                    secondOpperand = (secondOpperand * 10) + 4;
                }
            }
        });
        button5.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                if(!result) {
                    Label2 = Label1;
                    Label1.setText(Label2.getText() + "5");
                }else{
                    Label1.setText("5");
                    first = true;
                    result = false;
                }
                if(first){
                    firstOpperand = (firstOpperand * 10) + 5;
                }else{
                    secondOpperand = (secondOpperand * 10) + 5;
                }
            }
        });
        button6.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                if(!result) {
                    Label2 = Label1;
                    Label1.setText(Label2.getText() + "6");
                }else{
                    Label1.setText("6");
                    first = true;
                    result = false;
                }
                if(first){
                    firstOpperand = (firstOpperand * 10) + 6;
                }else{
                    secondOpperand = (secondOpperand * 10) + 6;
                }
            }
        });
        button7.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                if(!result) {
                    Label2 = Label1;
                    Label1.setText(Label2.getText() + "7");
                }else{
                    Label1.setText("7");
                    first = true;
                    result = false;
                }
                if(first){
                    firstOpperand = (firstOpperand * 10) + 7;
                }else{
                    secondOpperand = (secondOpperand * 10) + 7;
                }
            }
        });
        button8.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                if(!result) {
                    Label2 = Label1;
                    Label1.setText(Label2.getText() + "8");
                }else{
                    Label1.setText("8");
                    first = true;
                    result = false;
                }
                if(first){
                    firstOpperand = (firstOpperand * 10) + 8;
                }else{
                    secondOpperand = (secondOpperand * 10) + 8;
                }
            }
        });
        button9.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                if(!result) {
                    Label2 = Label1;
                    Label1.setText(Label2.getText() + "9");
                }else{
                    Label1.setText("9");
                    first = true;
                    result = false;
                }
                if(first){
                    firstOpperand = (firstOpperand * 10) + 9;
                }else{
                    secondOpperand = (secondOpperand * 10) + 9;
                }
            }
        });
        plus.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                    Label2 = Label1;
                    Label1.setText(Label2.getText() + " + ");
                    first = false;
                    opperator = "+";
            }
        });
        minus.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                Label2 = Label1;
                Label1.setText(Label2.getText() + " - ");
                first = false;
                opperator = "-";
            }
        });
        mult.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                    Label2 = Label1;
                    Label1.setText(Label2.getText() + " * ");
                    first = false;
                opperator = "*";
            }
        });
        div.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                    Label2 = Label1;
                    Label1.setText(Label2.getText() + " / ");
                    first = false;
                opperator = "/";
            }
        });
        equals.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                result = true;
                first = true;
                if(opperator == "+"){
                    sum = firstOpperand + secondOpperand;
                }else if(opperator == "-"){
                    sum = firstOpperand - secondOpperand;
                }else if(opperator == "*"){
                    sum = firstOpperand * secondOpperand;
                }else if(opperator == "/"){
                    sum = firstOpperand / secondOpperand;
                }
                Label1.setText(""+sum);
                firstOpperand = 0;
                secondOpperand = 0;
                sum = 0;
            }
        });
        clear.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                Label1.setText("   ");
                first = true;
                sum = 0;
                firstOpperand = 0;
                secondOpperand = 0;
            }
        });
        firstRow.getChildren().addAll(button7,button8,button9,div);
        secondRow.getChildren().addAll(button4,button5,button6,mult);
        thirdRow.getChildren().addAll(button1,button2,button3,minus);
        fourthRow.getChildren().addAll(clear, button0,equals,plus);
        root.getChildren().addAll(Label1, firstRow,secondRow,thirdRow,fourthRow);
        stage.show();
    }


}
