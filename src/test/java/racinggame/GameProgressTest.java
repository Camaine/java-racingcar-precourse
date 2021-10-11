package racinggame;

import nextstep.test.NSTest;
import nextstep.utils.Randoms;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import racinggame.model.GameModel;
import racinggame.service.GameFinishService;
import racinggame.service.GameProceedService;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;

public class GameProgressTest extends NSTest {

    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    @Override
    protected void runMain() {

    }

    @BeforeEach
    void car_set(){
        GameModel model = new GameModel();
        model.setCarList(new String[]{"KIA"});
    }

    @Test
    void only_over_4_forward(){
        try (final MockedStatic<Randoms> mockRandoms = mockStatic(Randoms.class)) {
            mockRandoms.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
                    .thenReturn(5, 1);

            GameModel model = new GameModel();
            GameProceedService proceedService = new GameProceedService();
            model.setCarProceedData(new int[]{0, 0});
            model.setCarList(new String[]{"KIA", "BMW"});
            model.setCarProgressBarLists(new String[]{"", ""});

            proceedService.doRace(model);

            assertThat(model.getCarProceedData()[0]).isEqualTo(1);
            assertThat(model.getCarProceedData()[1]).isEqualTo(0);
        }
    }

    @Test
    void winner_only_one(){
        try (final MockedStatic<Randoms> mockRandoms = mockStatic(Randoms.class)) {
            mockRandoms.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
                    .thenReturn(5, 1);

            GameModel model = new GameModel();
            GameProceedService proceedService = new GameProceedService();
            GameFinishService finishService = new GameFinishService();
            model.setCarProceedData(new int[]{0, 0});
            model.setCarList(new String[]{"KIA", "BMW"});
            model.setCarProgressBarLists(new String[]{"", ""});

            proceedService.doRace(model);
            finishService.getWinnerResult(model);

            assertThat(model.getWinner()).isEqualTo("KIA");
        }
    }

    @Test
    void winner_over_two(){
        try (final MockedStatic<Randoms> mockRandoms = mockStatic(Randoms.class)) {
            mockRandoms.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
                    .thenReturn(5, 4);

            GameModel model = new GameModel();
            GameProceedService proceedService = new GameProceedService();
            GameFinishService finishService = new GameFinishService();
            model.setCarProceedData(new int[]{0, 0});
            model.setCarList(new String[]{"KIA", "BMW"});
            model.setCarProgressBarLists(new String[]{"", ""});

            proceedService.doRace(model);
            finishService.getWinnerResult(model);

            assertThat(model.getWinner()).isEqualTo("KIA,BMW");
        }
    }
}
