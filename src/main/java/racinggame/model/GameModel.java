package racinggame.model;

import java.util.ArrayList;

public class GameModel {

    private String userInputCarList;
    private String[] carList;

    public String getUserInputCarList() {
        return userInputCarList;
    }

    public void setUserInputCarList(String userInputCarList) {
        this.userInputCarList = userInputCarList;
    }

    public String[] getCarList() {
        return carList;
    }

    public void setCarList(String[] carList) {
        this.carList = carList;
    }
}
