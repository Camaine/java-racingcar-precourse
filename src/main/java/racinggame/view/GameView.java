package racinggame.view;

import nextstep.utils.Console;
import racinggame.model.GameModel;
import racinggame.model.GameNoticeModel;

public class GameView {

    public static String getUserInput(){
        String input = Console.readLine();
        return input;
    }

    public static void printReqUserInput(String notice){
        System.out.println(notice);
    }

    public static void printError(String error){
        System.out.println(error);
    }
}
