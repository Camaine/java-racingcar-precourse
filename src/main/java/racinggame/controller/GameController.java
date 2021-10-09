package racinggame.controller;

import racinggame.model.GameModel;
import racinggame.model.GameNoticeModel;
import racinggame.service.GamePrepareService;
import racinggame.service.GameProceedService;
import racinggame.view.GameView;

public class GameController {

    private GamePrepareService prepareService = new GamePrepareService();
    private GameProceedService proceedService =  new GameProceedService();
    private GameModel gameModel = new GameModel();

    public void getCarList(){
        GameView.printGameInfo(GameNoticeModel.reqCarList);
        if(prepareService.getCarNames(gameModel)){
            getRacingCnt();
            return;
        }
        getCarList();
        return;
    }

    public void getRacingCnt(){
        GameView.printGameInfo(GameNoticeModel.reqRacingCnt);
        if(prepareService.getRacingCnt(gameModel)){
            GameView.printGameInfo(GameNoticeModel.printResultContext);
            proceedService.initializeGameData(gameModel);
            playGame();
            return;
        }
        getRacingCnt();
        return;
    }

    public void playGame(){
        for(int i = 0 ; i < gameModel.getRacingCnt() ; i++){
            proceedService.doRace(gameModel);
        }
    }

    public void finishGame(){

    }
}
