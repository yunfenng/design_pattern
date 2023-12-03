package cn.jaa.strategy_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/12/3 10:02
 */
@Slf4j
public class StrategyDemoTest {

    public static void main(String[] args) {
        Context context = new Context();
        TravelByAirStrategy airStrategy = new TravelByAirStrategy();
        context.setTravelStrategy(airStrategy);
        context.travelMode();
        log.info("change air to airport ... ...");
        TravelByCarStrategy carStrategy = new TravelByCarStrategy();
        context.setTravelStrategy(carStrategy);
        context.travelMode();
    }
}
