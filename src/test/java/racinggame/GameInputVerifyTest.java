package racinggame;

import nextstep.test.NSTest;
import org.junit.jupiter.api.Test;
import racinggame.model.GameModel;
import racinggame.service.GameInvaildInputDetectService;

import static org.assertj.core.api.Assertions.*;

public class GameInputVerifyTest extends NSTest {

    @Override
    protected void runMain() {}

    @Test
    void car_name_length_1_to_5(){
        GameModel model = new GameModel();
        String[] testCar = new String[]{"KIA"};
        GameInvaildInputDetectService.isInvaildCarName(testCar);
        model.setCarList(testCar);
        assertThat(model.getCarList()[0]).isEqualTo("KIA");
    }

    @Test
    void racing_count_is_integer(){
        GameModel model = new GameModel();
        String testCnt = "1";
        GameInvaildInputDetectService.isInvaildRacingCnt(testCnt);
        model.setRacingCnt(Integer.parseInt(testCnt));
        assertThat(model.getRacingCnt()).isEqualTo(1);
    }

}
