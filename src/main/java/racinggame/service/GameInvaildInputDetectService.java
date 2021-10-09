package racinggame.service;

import racinggame.model.GameErrorModel;
import racinggame.view.GameView;

public class GameInvaildInputDetectService extends Exception{

    public static void isInvaildCarName(String[] carList){
        int index = 0;
        while(index < carList.length && carList[index].length() < 6){
            index++;
        }
        if(index < carList.length){
            carNameExceedFive();
        }
        if(carList[0].equals("")){
            carNameNotExist();
        }
    }

    private static void carNameExceedFive(){
        GameView.printError(GameErrorModel.error + GameErrorModel.carNameExceedFive);
        throw new IllegalArgumentException(GameErrorModel.error + GameErrorModel.carNameExceedFive);
    }

    private static void carNameNotExist(){
        GameView.printError(GameErrorModel.error + GameErrorModel.carNameNotExist);
        throw new IllegalArgumentException(GameErrorModel.error + GameErrorModel.carNameNotExist);
    }
}
