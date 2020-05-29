package main.java;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.sun.javafx.robot.impl.FXRobotHelper.getChildren;
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

        List<Integer> horizontal1 = Arrays.asList(1, 2, 3);
        List<Integer> horizontal2 = Arrays.asList(4, 5, 6);
        List<Integer> horizontal3 = Arrays.asList(7, 8, 9);
        List<Integer> vertical1 = Arrays.asList(1, 4, 7);
        List<Integer> vertical2 = Arrays.asList(2, 5, 8);
        List<Integer> vertical3 = Arrays.asList(3, 6, 9);
        List<Integer> diagonal1 = Arrays.asList(1, 5, 9);
        List<Integer> diagonal2 = Arrays.asList(3, 5, 7);

    List<List<Integer>> listOfList = Arrays.asList(horizontal1, horizontal2, horizontal3,
            vertical1, vertical2, vertical3, diagonal1, diagonal2);

    List<Integer> playersMoves = new ArrayList<>();
    List<Integer> computersMover = new ArrayList<>();








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

            label.setPrefSize(100,40);
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
                button1.isDisabled();  //klikniety true false
                playersMoves.add(1); //dodanie do listy
                check();
            });

            button2.setOnAction(event -> {
                button2.setText(String.valueOf(player));
                button2.setDisable(true);
                button2.isDisabled();
                playersMoves.add(2);
                check();
            });

            button3.setOnAction(event -> {
                button3.setText(String.valueOf(player));
                button3.setDisable(true);
                button3.isDisabled();
                playersMoves.add(3);
                check();
            });

            button4.setOnAction(event -> {
                button4.setText(String.valueOf(player));
                button4.setDisable(true);
                button4.isDisabled();
                playersMoves.add(4);
                check();
            });

            button5.setOnAction(event -> {
                button5.setText(String.valueOf(player));
                button5.setDisable(true);
                button5.isDisabled();
                playersMoves.add(5);
                check();
            });

            button6.setOnAction(event -> {
                button6.setText(String.valueOf(player));
                button6.setDisable(true);
                button6.isDisabled();
                playersMoves.add(6);
                check();
            });

            button7.setOnAction(event -> {
                button7.setText(String.valueOf(player));
                button7.setDisable(true);
                button7.isDisabled();
                playersMoves.add(7);
                check();
            });

            button8.setOnAction(event -> {
                button8.setText(String.valueOf(player));
                button8.setDisable(true);
                button8.isDisabled();
                playersMoves.add(8);
                check();
            });

            button9.setOnAction(event -> {
                button9.setText(String.valueOf(player));
                button9.setDisable(true);
                button9.isDisabled();
                playersMoves.add(9);
                check();
            });
        }

        public void check(){
//            if     (button1Value && button2Value && button3Value || button4Value && button5Value && button6Value ||
//                    button7Value && button8Value && button9Value || //poziom
//                    button1Value && button3Value && button7Value || button2Value && button5Value && button8Value ||
//                    button3Value && button6Value && button9Value || //pion
//                    button1Value && button5Value && button9Value || button3Value && button5Value && button7Value) //skos
//            {
//            label.setText("YOU WON");


            for (List playersList : listOfList) {
                playersMoves.containsAll(playersList); //true lub false, true player won
                if (playersList.equals(true) {
                    System.out.println("WON");
                }

            }

            for (List computer: listOfList) {
                computersMover.containsAll(computer);
            }

        }



        public static void main(String[] args) {


            launch(args);
        }
}
