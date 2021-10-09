package racinggame.service;

import racinggame.model.GameModel;
import racinggame.view.GameView;

public class GameFinishService {
    public void getWinnerResult(GameModel model){
        String winners = "";
        setTopProgress(model);
        for(int i = 0 ; i < model.getCarList().length ; i++){
            winners = judgeTopRacer(model, winners, i);
        }
        winners = winners.substring(1);
        GameView.printGameResult(model, winners);
    }

    public void setTopProgress(GameModel model){
        int max = 0;
        for(int i = 0 ; i < model.getCarList().length ; i++){
            max = judgeMaxNumber(max, model.getCarProceedData()[i]);
        }
        model.setTopProgress(max);
    }

    public int judgeMaxNumber(int max, int num){
        if(max < num){
            return num;
        }
        return max;
    }

    public String judgeTopRacer(GameModel model, String winners, int index){
        if(model.getCarProceedData()[index] == model.getTopProgress()){
            winners += GameModel.winnerDivder+model.getCarList()[index];
        }
        return winners;
    }
}
