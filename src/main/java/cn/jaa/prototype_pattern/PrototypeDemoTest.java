package cn.jaa.prototype_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description: simple and deep clone test
 * @Date 2023/11/28 22:41
 */
@Slf4j
public class PrototypeDemoTest {

    public static void main(String[] args) {
        // 浅复制
        Computer computer = new Computer("16core", "16G", "1TB");
        log.info("before simple clone: " + computer.toString());
        Computer computerClone = (Computer) computer.clone();
        log.info("after simple clone: " + computerClone.toString());

        // 深复制
        Disk disk = new Disk("256G", "1TB");
        ComputerDetail computerDetail = new ComputerDetail("16core", "16G", disk);
        log.info("before deep clone: " + computerDetail.toString());
        ComputerDetail computerDetailClone = (ComputerDetail) computerDetail.clone();
        log.info("after deep clone: " + computerDetailClone.toString());
    }
}
