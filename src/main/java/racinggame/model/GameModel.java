package racinggame.model;

import java.util.ArrayList;

public class GameModel {

    public static final String progressBar = "-";
    public static final String userProgressDivder = " : ";

    private String[] carList;
    private int racingCnt;
    private int gameProgress;
    private int[] carProceedData;
    private String[] carProgressBarLists;

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
