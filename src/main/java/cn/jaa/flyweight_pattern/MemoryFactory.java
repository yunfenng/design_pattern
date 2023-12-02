package cn.jaa.flyweight_pattern;

import com.alibaba.fastjson2.JSON;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * @Author: Jaa
 * @Description: 内存管理类
 * @Date 2023/12/2
 */
@Slf4j
public class MemoryFactory {

    private static List<Memory> memoryList = new ArrayList<>();

    /**
     * 获取内存
     *
     * @param size 内存大小
     * @return
     */
    public static Memory getMemory(int size) {
        Memory memory = null;
        // 遍历 memoryList 查找与欲获取内存大小相同且未被占用的内存
        for (int i = 0; i < memoryList.size(); i++) {
            memory = memoryList.get(i);
            if (Objects.equals(memory.getSize(), size) && memory.isUsed() == false) {
                memory.setUsed(true);
                memoryList.set(i, memory);
                log.info("get memory from memoryList: " + JSON.toJSONString(memory));
                break;
            }
        }

        // 如果内存列表中没有与欲获取大小相等且未被占用的内存，则开辟内存并加入到memoryList中去
        if (Objects.isNull(memory)) {
            memory = new Memory(UUID.randomUUID().toString(), 64, false);
            log.info("apply a new memory by system and add to memoryList: " + memory);
            memoryList.add(memory);
        }

        return memory;
    }

    /**
     * 释放内存
     *
     * @param id 内存id
     */
    public static void releaseMemory(String id) {
        for (int i = 0; i < memoryList.size(); i++) {
            Memory memory = memoryList.get(i);
            if (Objects.equals(id, memory.getId())) {
                memory.setUsed(false);
                memoryList.set(i, memory);
                log.info("release memory into memoryList: " + id);
                break;
            }
        }
    }
}
