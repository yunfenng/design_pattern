package cn.jaa.prototype_pattern;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/11/28 22:34
 */
public class Disk implements Cloneable {
    private String ssd;
    private String hhd;

    public Disk(String ssd, String hhd) {
        this.ssd = ssd;
        this.hhd = hhd;
    }

    @Override
    protected Object clone() { // 应用对象深复制
        try {
            return (Disk) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Disk{" +
                "ssd='" + ssd + '\'' +
                ", hhd='" + hhd + '\'' +
                '}';
    }
}
