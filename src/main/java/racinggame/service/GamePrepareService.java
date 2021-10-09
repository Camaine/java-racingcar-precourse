package racinggame.service;

import racinggame.model.GameModel;
import racinggame.model.GameNoticeModel;
import racinggame.view.GameView;

public class GamePrepareService {

    public boolean getCarNames(GameModel model){
        String userInputCarList = GameView.getUserInput(model);
        if(saveUserInput(userInputCarList,model)){
            return true;
        }
        return false;
    }

    public boolean getRacingCnt(GameModel model){
        GameView.printReqUserInput(GameNoticeModel.reqRacingCnt);

        return false;
    }

    public boolean saveUserInput(String userInput, GameModel model){
        String[] carList = userInput.split(",");
        try{
            GameInvaildInputDetectService.isInvaildCarName(carList);
        }
        catch (Exception e){
            return false;
        }
        model.setCarList(carList);
        return true;
    }
}
