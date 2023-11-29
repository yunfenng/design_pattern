package cn.jaa.prototype_pattern;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/11/28 22:33
 */
public class ComputerDetail implements Cloneable {

    private String cpu;
    private String memory;
    private Disk disk;

    public ComputerDetail(String cpu, String memory, Disk disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    @Override
    protected Object clone() { // 深复制
        try {
            ComputerDetail computerDetail = (ComputerDetail) super.clone();
            computerDetail.disk = (Disk) this.disk.clone(); // 引用对象深复制
            return computerDetail;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "ComputerDetail{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", disk=" + disk +
                '}';
    }
}
