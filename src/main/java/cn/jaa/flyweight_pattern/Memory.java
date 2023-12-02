package cn.jaa.flyweight_pattern;

import lombok.Data;

/**
 * @Author: Jaa
 * @Description: 内存类
 * @Date 2023/12/2
 */
@Data
public class Memory {
    // 内存地址id
    private String id;
    // 内存大小
    private int size;
    // 是否被占用
    private boolean isUsed;

    public Memory(String id, int size, boolean isUsed) {
        this.id = id;
        this.size = size;
        this.isUsed = isUsed;
    }
}
