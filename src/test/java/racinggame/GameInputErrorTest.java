package racinggame;

import nextstep.test.NSTest;
import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;
import racinggame.model.GameModel;
import racinggame.service.GameInvaildInputDetectService;

import static org.assertj.core.api.Assertions.*;

public class GameInputErrorTest extends NSTest {

    private static final String ERROR_MESSAGE = "[ERROR]";

    @Override
    protected void runMain() {}

    @Test
    void name_exceed_5(){
        GameModel model = new GameModel();
        String[] testCar = new String[]{"HYUNDAI"};
        ThrowableAssert.ThrowingCallable throwingCallable = () ->
                GameInvaildInputDetectService.isInvaildCarName(testCar);
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(throwingCallable);
    }

    @Test
    void name_blank(){
        GameModel model = new GameModel();
        String[] testCar = new String[]{""};
        ThrowableAssert.ThrowingCallable throwingCallable = () ->
                GameInvaildInputDetectService.isInvaildCarName(testCar);
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(throwingCallable);
    }

    @Test
    void count_blank(){
        GameModel model = new GameModel();
        String testCnt = "";
        ThrowableAssert.ThrowingCallable throwingCallable = () ->
                GameInvaildInputDetectService.isInvaildRacingCnt(testCnt);
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(throwingCallable);
    }

    @Test
    void count_zero(){
        GameModel model = new GameModel();
        String testCnt = "0";
        ThrowableAssert.ThrowingCallable throwingCallable = () ->
                GameInvaildInputDetectService.isInvaildRacingCnt(testCnt);
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(throwingCallable);
    }

}
