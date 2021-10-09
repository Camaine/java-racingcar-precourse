package racinggame.service;

import racinggame.model.GameModel;
import racinggame.model.GameNoticeModel;
import racinggame.view.GameView;

public class GamePrepareService {

    public boolean getCarNames(GameModel model){
        String userInputCarList = GameView.getUserInput();
        if(saveUserInputCarList(userInputCarList,model)){
            return true;
        }
        return false;
    }

    public boolean getRacingCnt(GameModel model){
        String userInputRacingCnt = GameView.getUserInput();
        if(saveUserInputRacingCnt(userInputRacingCnt,model)){
            return true;
        }
        return false;
    }

    private boolean saveUserInputCarList(String userInput, GameModel model){
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

    private boolean saveUserInputRacingCnt(String userInput, GameModel model){
        try{
            GameInvaildInputDetectService.isInvaildRacingCnt(userInput);
        }catch(Exception e){
            return false;
        }
        model.setRacingCnt(Integer.parseInt(userInput));
        return true;
    }


}
