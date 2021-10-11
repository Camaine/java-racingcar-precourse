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

    public static void isInvaildRacingCnt(String racingCnt){
        int cnt = 0 ;
        try{
            cnt = Integer.parseInt(racingCnt);
        }catch (Exception e){
            GameView.printGameInfo(GameErrorModel.ERROR_CONTEXT + GameErrorModel.RACING_COUNT_NOT_EXISTS);
            return;
        }
        if(cnt == 0){
            racingCntIsZero();
        }
    }

    private static void racingCntIsZero(){
        GameView.printGameInfo(GameErrorModel.ERROR_CONTEXT + GameErrorModel.RACING_COUNT_IS_ZERO);
        throw new IllegalArgumentException(GameErrorModel.ERROR_CONTEXT + GameErrorModel.RACING_COUNT_IS_ZERO);
    }

    private static void carNameExceedFive(){
        GameView.printGameInfo(GameErrorModel.ERROR_CONTEXT + GameErrorModel.CAR_NAME_EXCEED_FIVE);
        throw new IllegalArgumentException(GameErrorModel.ERROR_CONTEXT + GameErrorModel.CAR_NAME_EXCEED_FIVE);
    }

    private static void carNameNotExist(){
        GameView.printGameInfo(GameErrorModel.ERROR_CONTEXT + GameErrorModel.CAR_NAME_NOT_EXIST);
        throw new IllegalArgumentException(GameErrorModel.ERROR_CONTEXT + GameErrorModel.CAR_NAME_NOT_EXIST);
    }
}
