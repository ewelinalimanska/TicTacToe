package main.java;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import static com.sun.javafx.robot.impl.FXRobotHelper.getChildren;
import static javafx.application.Application.launch;
import static javafx.geometry.Pos.TOP_CENTER;

public class TicTacToeOneMoreTime extends Application {


        Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
        Button []buttons;

        Button newGame = new Button("New Game");
        Button exit = new Button("Exit");
        //Button x = new Button("X");
        // Button o = new Button("O");
        char player = 'X';
        Label label = new Label(" ");
        boolean win = false;
        boolean button1Value = false;
        boolean button2Value = false;
        boolean button3Value = false;
        boolean button4Value = false;
        boolean button5Value = false;
        boolean button6Value = false;
        boolean button7Value = false;
        boolean button8Value = false;
        boolean button9Value = false;

        VBox vbox = new VBox();





//    public char getPlayer() {
//        return player;
//    }
//    public void setPlayer(char sign) {
//        player = sign;
//
//        if (player == 'X') {
//            Text text = new Text("X");
//
//        } else if (player == 'O') {
//            Text text = new Text("O");
//        }
//    }

        @Override
        public void start(Stage primaryStage) throws Exception {

            //stworzenie komórek
            GridPane grid = new GridPane();
            button1 = new Button();
            button2 = new Button();
            button3 = new Button();
            button4 = new Button();
            button5 = new Button();
            button6 = new Button();
            button7 = new Button();
            button8 = new Button();
            button9 = new Button();

            buttons = new Button[] {button1, button2, button3, button4, button5, button6, button7, button8, button9};

            for (Button button : buttons) {
                button.setMinSize(100,100);
            }
            //dodanie wierszy
            grid.addRow(0, button1, button2, button3);
            grid.addRow(1, button4, button5, button6);
            grid.addRow(2, button7, button8, button9);

            grid.setAlignment(Pos.BASELINE_LEFT); // ułożenie
            grid.setMinSize(500, 300);
            grid.setGridLinesVisible(true);
            grid.setId("gameBoard"); //nazwanie planszy


            Scene scene = new Scene(grid);
            primaryStage.setTitle("TicTacToe");
            primaryStage.setScene(scene);
            primaryStage.show();

//        x.setPrefSize(40, 20);
//        x.setTranslateX(320);
//        x.setTranslateY(20);
//        getChildren(grid).add(x);
//        x.setOnAction(ActionEvent -> token = 'X');
//

//        o.setPrefSize(40, 20);
//        o.setTranslateX(370);
//        o.setTranslateY(20);
//        getChildren(grid).add(o);
//        o.setOnAction(ActionEvent -> player = o.getText());

            label.setPrefSize(40,20);
            label.setAlignment(TOP_CENTER);
            getChildren(grid).add(label);


            newGame.setPrefSize(100, 20);
            newGame.setTranslateX(320);
            newGame.setTranslateY(50);
            getChildren(grid).add(newGame);
            // newGame.setOnAction(ActionEvent -> scene.);



            exit.setPrefSize(40,20);
            exit.setTranslateX(320);
            exit.setTranslateY(100);
            getChildren(grid).add(exit);
            exit.setOnAction((ActionEvent -> {System.exit(0);}));


            button1.setOnAction(event -> {
                button1.setText(String.valueOf(player));
                button1.setDisable(true);// klika tylko 1 raz w 1 button
                button1Value = true;
                if (button1Value && button2Value && button3Value) {
                    label.setText("YOU WON");
                }
            });

            button2.setOnAction(event -> {
                button2.setText(String.valueOf(player));
                button2.setDisable(true);
                button2Value = true;
                if (button1Value && button2Value && button3Value) {
                    label.setText("YOU WON");
                }
            });

            button3.setOnAction(event -> {
                button3.setText(String.valueOf(player));
                button3.setDisable(true);
                button3Value = true;
            });

            button4.setOnAction(event -> {
                button4.setText(String.valueOf(player));
                button4.setDisable(true);
                button4Value = true;
            });

            button5.setOnAction(event -> {
                button5.setText(String.valueOf(player));
                button5.setDisable(true);
                button5Value = true;
            });

            button6.setOnAction(event -> {
                button6.setText(String.valueOf(player));
                button6.setDisable(true);
                button6Value = true;
            });

            button7.setOnAction(event -> {
                button7.setText(String.valueOf(player));
                button7.setDisable(true);
                button7Value = true;
            });

            button8.setOnAction(event -> {
                button8.setText(String.valueOf(player));
                button8.setDisable(true);
                button8Value = true;
            });

            button9.setOnAction(event -> {
                button9.setText(String.valueOf(player));
                button9.setDisable(true);
                button9Value = true;
            });
        }

        //    public boolean win() {
//
//        if (button1.getText().equals(button2.getText().equals(button3.getText()))) {
//            return true;
//        }
//        if (button4.getText().equals(button5.getText().equals(button6.getText()))) {
//            return true;
//        }
//        if (button7.getText().equals(button8.getText().equals(button9.getText()))) {
//            return true;
//        }
//        if (button1.getText().equals(button4.getText().equals(button7.getText()))) {
//            return true;
//        }
//        if (button2.getText().equals(button5.getText().equals(button8.getText()))) {
//            return true;
//        }
//        if (button3.getText().equals(button6.getText().equals(button9.getText()))) {
//            return true;
//        }
//        if (button1.getText().equals(button5.getText().equals(button9.getText()))) {
//            return true;
//        }
//        if (button3.getText().equals(button5.getText().equals(button7.getText()))) {
//            return true;
//        } else {
//            return false;
//        }
//    }
        public void check(){
            if     (button1Value && button2Value && button3Value || button4Value && button5Value && button6Value ||
                    button7Value && button8Value && button9Value || //poziom
                    button1Value && button3Value && button7Value || button2Value && button5Value && button8Value ||
                    button3Value && button6Value && button9Value || //pion
                    button1Value && button5Value && button9Value || button3Value && button5Value && button7Value) //skos
            {
            label.setText("YOU WON");

            } else {
            }
        }


        public static void main(String[] args) {


            launch(args);
        }
}
