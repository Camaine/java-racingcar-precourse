package racinggame.controller;

import racinggame.model.GameModel;
import racinggame.service.GamePrepareService;
import racinggame.view.GameView;

public class GameController {

    private GamePrepareService prepareService = new GamePrepareService();
    private GameModel gameModel = new GameModel();

    public void prepareGame(){
        GameView.printReqCarList();
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
