package racinggame.service;

import nextstep.utils.Randoms;
import racinggame.model.GameModel;
import racinggame.view.GameView;

public class GameProceedService {

    public void doRace(GameModel model){
        for(int i = 0 ; i < model.getCarList().length ; i++){
            moveForward(model, i);
            GameView.printGameProgress(model,i);
        }
    }

    public void initializeGameData(GameModel model){
        model.setCarProceedData(new int[model.getCarList().length]);
        model.setCarProgressBarLists(new String[model.getCarList().length]);
        for(int i = 0 ; i < model.getCarList().length ; i++){
            model.getCarProgressBarLists()[i] = "";
        }
    }

    public void moveForward(GameModel model,int carNo){
        if(Randoms.pickNumberInRange(0,9) >= 4){
            model.getCarProceedData()[carNo] += 1;
            model.getCarProgressBarLists()[carNo] += GameModel.progressBar;
        }
    }
}
