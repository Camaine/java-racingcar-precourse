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
            GameView.printError(GameErrorModel.error + GameErrorModel.racingCntNotInteger);
            return;
        }
        if(cnt == 0){
            racingCntIsZero();
        }
    }

    private static void racingCntIsZero(){
        GameView.printError(GameErrorModel.error + GameErrorModel.racingCntIsZero);
        throw new IllegalArgumentException(GameErrorModel.error + GameErrorModel.racingCntIsZero);
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
