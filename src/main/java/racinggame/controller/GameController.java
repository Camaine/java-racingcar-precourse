package racinggame.controller;

import racinggame.model.GameModel;
import racinggame.model.GameNoticeModel;
import racinggame.service.GamePrepareService;
import racinggame.view.GameView;

public class GameController {

    private GamePrepareService prepareService = new GamePrepareService();
    private GameModel gameModel = new GameModel();

    public void getCarList(){
        GameView.printReqUserInput(GameNoticeModel.reqCarList);
        if(prepareService.getCarNames(gameModel)){
            getRacingCnt();
            return;
        }
        getCarList();
        return;
    }

    public void getRacingCnt(){
        GameView.printReqUserInput(GameNoticeModel.reqRacingCnt);
        if(prepareService.getRacingCnt(gameModel)){
            playGame();
            return;
        }
        getRacingCnt();
        return;
    }

    public void playGame(){

    }

    public void finishGame(){

    }
}
