package cn.jaa.strategy_pattern;

/**
 * @Author: Jaa
 * @Description: Context实现策略模式
 * @Date 2023/12/3 10:00
 */
public class Context {
    private TravelStrategy travelStrategy;

    public TravelStrategy getTravelStrategy() {
        return travelStrategy;
    }

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public void travelMode() {
        this.travelStrategy.travelMode();
    }
}
