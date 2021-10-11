package racinggame.controller;

import racinggame.model.GameModel;
import racinggame.model.GameNoticeModel;
import racinggame.service.GameFinishService;
import racinggame.service.GamePrepareService;
import racinggame.service.GameProceedService;
import racinggame.view.GameView;

public class GameController {

    private GamePrepareService prepareService = new GamePrepareService();
    private GameProceedService proceedService =  new GameProceedService();
    private GameFinishService finishService = new GameFinishService();
    private GameModel gameModel = new GameModel();

    public void getCarList(){
        GameView.printGameInfo(GameNoticeModel.REQ_CAR_LIST);
        if(prepareService.getCarNames(gameModel)){
            getRacingCnt();
            return;
        }
        getCarList();
        return;
    }

    public void getRacingCnt(){
        GameView.printGameInfo(GameNoticeModel.REQ_RACING_COUNT);
        if(prepareService.getRacingCnt(gameModel)){
            GameView.printGameInfo(GameNoticeModel.RACING_RESULT_CONTEXT);
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
        finishGame();
    }

    public void finishGame(){
        finishService.getWinnerResult(gameModel);
    }
}
