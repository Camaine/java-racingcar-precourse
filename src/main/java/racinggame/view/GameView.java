package racinggame.view;

import nextstep.utils.Console;
import racinggame.model.GameModel;
import racinggame.model.GameNoticeModel;

public class GameView {

    public static String getUserInput(){
        String input = Console.readLine();
        return input;
    }

    public static void printGameProgress(GameModel model, int carNo){
        System.out.println(model.getCarList()[carNo] + GameModel.USER_PROGRESS_DIVIDER + model.getCarProgressBarLists()[carNo]);
        if(model.getCarList().length == carNo + 1){
            System.out.println("");
        }
    }

    public static void printGameResult(GameModel model, String winners){
        System.out.println(GameNoticeModel.WINNER_CONTEXT_PREFIX + winners + GameNoticeModel.WINNER_CONTEXT_POSTFIX);
    }

    public static void printGameInfo(String info){
        System.out.println(info);
    }
}
