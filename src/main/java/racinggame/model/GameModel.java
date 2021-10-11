package racinggame.model;

import java.util.ArrayList;

public class GameModel {

    public static final String PROGRESS_BAR = "-";
    public static final String USER_PROGRESS_DIVIDER = " : ";
    public static final String WINNER_DIVIDER = ",";

    private String[] carList;
    private int racingCnt;
    private int gameProgress;
    private int[] carProceedData;
    private String[] carProgressBarLists;
    private int topProgress;

    public int getTopProgress() {
        return topProgress;
    }

    public void setTopProgress(int topProgress) {
        this.topProgress = topProgress;
    }

    public String[] getCarProgressBarLists() {
        return carProgressBarLists;
    }

    public void setCarProgressBarLists(String[] carProgressBarLists) {
        this.carProgressBarLists = carProgressBarLists;
    }

    public int[] getCarProceedData() {
        return carProceedData;
    }

    public void setCarProceedData(int[] carProceedData) {
        this.carProceedData = carProceedData;
    }

    public int getGameProgress() {
        return gameProgress;
    }

    public void setGameProgress(int gameProgress) {
        this.gameProgress = gameProgress;
    }

    public int getRacingCnt() {
        return racingCnt;
    }

    public void setRacingCnt(int racingCnt) {
        this.racingCnt = racingCnt;
    }

    public String[] getCarList() {
        return carList;
    }

    public void setCarList(String[] carList) {
        this.carList = carList;
    }
}
