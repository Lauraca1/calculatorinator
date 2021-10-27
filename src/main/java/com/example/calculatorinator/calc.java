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


public class Calc extends Application {
    Label label1;
    Label label2;
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
    public void buttonClicked(boolean res, Label l1, boolean first, double fO, double sO, int num){
        if(!res) {
            Label label2 = l1;
            this.label1.setText(label2.getText() + Integer.toString(num) );
        }else{
            label1.setText(Integer.toString(num));
            this.first = true;
            this.result = false;
        }
        if(first){
            this.firstOpperand = (fO * 10) + num;
        }else{
            this.secondOpperand = (sO * 10) + num;
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("bb calculator");
        label1 = new Label("");
        label2 = new Label("");

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
                buttonClicked(result, label1, first, firstOpperand, secondOpperand, 0);
            }
        });
        button1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                buttonClicked(result, label1, first, firstOpperand, secondOpperand, 1);
            }
        });
        button2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                buttonClicked(result, label1, first, firstOpperand, secondOpperand, 2);
            }
        });
        button3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                buttonClicked(result, label1, first, firstOpperand, secondOpperand, 3);
            }
        });
        button4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                buttonClicked(result, label1, first, firstOpperand, secondOpperand, 4);
            }
        });
        button5.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                buttonClicked(result, label1, first, firstOpperand, secondOpperand, 5);
            }
        });
        button6.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                buttonClicked(result, label1, first, firstOpperand, secondOpperand, 6);
            }
        });
        button7.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                buttonClicked(result, label1, first, firstOpperand, secondOpperand, 7);
            }
        });
        button8.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                buttonClicked(result, label1, first, firstOpperand, secondOpperand, 8);
            }
        });
        button9.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                buttonClicked(result, label1, first, firstOpperand, secondOpperand, 9);
            }
        });
        plus.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                    label2 = label1;
                    label1.setText(label2.getText() + " + ");
                    first = false;
                    opperator = "+";
            }
        });
        minus.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                label2 = label1;
                label1.setText(label2.getText() + " - ");
                first = false;
                opperator = "-";
            }
        });
        mult.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                    label2 = label1;
                    label1.setText(label2.getText() + " * ");
                    first = false;
                opperator = "*";
            }
        });
        div.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                    label2 = label1;
                    label1.setText(label2.getText() + " / ");
                    first = false;
                opperator = "/";
            }
        });
        equals.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                result = true;
                first = true;
                if(opperator.equals("+")){
                    sum = firstOpperand + secondOpperand;
                }else if(opperator.equals("-")){
                    sum = firstOpperand - secondOpperand;
                }else if(opperator.equals("*")){
                    sum = firstOpperand * secondOpperand;
                }else if(opperator.equals("/")){
                    sum = firstOpperand / secondOpperand;
                }
                label1.setText(""+sum);
                firstOpperand = 0;
                secondOpperand = 0;
                sum = 0;
            }
        });
        clear.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                label1.setText("   ");
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
        root.getChildren().addAll(label1, firstRow,secondRow,thirdRow,fourthRow);
        stage.show();
    }


}
