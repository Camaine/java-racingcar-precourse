package racinggame.view;

import nextstep.utils.Console;
import racinggame.model.GameModel;
import racinggame.model.GameNoticeModel;

public class GameView {

    public static String getCarNames(GameModel model){
        String carList = Console.readLine();
        return carList;
    }

    public static void printReqCarList(){
        System.out.println(GameNoticeModel.reqCarList);
    }

    public static void printError(String error){
        System.out.println(error);
    }
}
