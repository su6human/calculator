package com.example.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {
    Calculator calc = new Calculator();
    @FXML
    private TextField Resulttxt;

    @FXML
    private void buttonone() {
        String val = Resulttxt.getText();
        val = val + "1";
        Resulttxt.setText(val);

    }

    @FXML
    private void buttontwo() {
        String val = Resulttxt.getText();
        val = val + "2";
        Resulttxt.setText(val);

    }

    @FXML
    private void buttonthree() {
        String val = Resulttxt.getText();
        val = val + "3";
        Resulttxt.setText(val);

    }

    @FXML
    private void buttonfour() {
        String val = Resulttxt.getText();
        val = val + "4";
        Resulttxt.setText(val);

    }

    @FXML
    private void buttonfive() {
        String val = Resulttxt.getText();
        val = val + "5";
        Resulttxt.setText(val);

    }

    @FXML
    private void buttonsix() {
        String val = Resulttxt.getText();
        val = val + "6";
        Resulttxt.setText(val);

    }

    @FXML
    private void buttonseven() {
        String val = Resulttxt.getText();
        val = val + "7";
        Resulttxt.setText(val);

    }

    @FXML
    private void buttoneight() {
        String val = Resulttxt.getText();
        val = val + "8";
        Resulttxt.setText(val);

    }

    @FXML
    private void buttonnine() {
        String val = Resulttxt.getText();
        val = val + "9";
        Resulttxt.setText(val);

    }

    @FXML
    private void buttonzero() {
        String val = Resulttxt.getText();
        val = val + "0";
        Resulttxt.setText(val);

    }

    @FXML
    private void buttonminus() {
        String op1 = Resulttxt.getText();
        calc.setOp1(Integer.parseInt(op1));  // Set first operand
        calc.setOperator('-');               // Set operator
        Resulttxt.clear();
    }
    @FXML
    private void buttonmulti() {
        String op1 = Resulttxt.getText();
        calc.setOp1(Integer.parseInt(op1));  // Set first operand
        calc.setOperator('*');               // Set operator
        Resulttxt.clear();
    }
    @FXML
    private void buttonplus() {
        String op1 = Resulttxt.getText();
        calc.setOp1(Integer.parseInt(op1));  // Set first operand
        calc.setOperator('+');               // Set operator
        Resulttxt.clear();
    }
    @FXML
    private void buttondiv() {
        String op1 = Resulttxt.getText();
        calc.setOp1(Integer.parseInt(op1));  // Set first operand
        calc.setOperator('/');               // Set operator
        Resulttxt.clear();
    }
    @FXML
    private void buttonequals() {
        String op2 = Resulttxt.getText();
        calc.setOp2(Integer.parseInt(op2));
        calc.calculate();
        Resulttxt.setText("" + calc.getResult());
    }
    @FXML
    private void buttonclear() {
        Resulttxt.clear();
    }
}