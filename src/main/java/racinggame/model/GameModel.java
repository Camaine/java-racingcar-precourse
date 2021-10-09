package racinggame.model;

import java.util.ArrayList;

public class GameModel {

    private String[] carList;
    private int racingCnt;

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
