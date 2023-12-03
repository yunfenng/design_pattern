package cn.jaa.template_pattern;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/12/3 17:29
 */
public abstract class Dish {

    public void doDish() {
        this.preparation();
        this.doing();
        this.carriedDishes();
    }

    // 备菜
    public abstract void preparation();
    // 炒菜
    public abstract void doing();
    // 上菜
    public abstract void carriedDishes();
}
