package racinggame.controller;

import racinggame.model.GameModel;
import racinggame.model.GameNoticeModel;
import racinggame.service.GamePrepareService;
import racinggame.view.GameView;

public class GameController {

    private GamePrepareService prepareService = new GamePrepareService();
    private GameModel gameModel = new GameModel();

    public void prepareGame(){
        GameView.printReqUserInput(GameNoticeModel.reqCarList);
        if(prepareService.getCarNames(gameModel)){
            playGame();
            return;
        }
        prepareGame();
        return;
    }

    public void playGame(){

    }

    public void finishGame(){

    }
}
