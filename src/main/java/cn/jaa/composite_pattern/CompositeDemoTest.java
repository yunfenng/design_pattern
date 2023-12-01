package cn.jaa.composite_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/12/1
 */
@Slf4j
public class CompositeDemoTest {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode("root");
        TreeNode node2 = new TreeNode("ch1");

        node1.add(node2);
        log.info(node1.toString());

        node1.remove(node2);
        log.info(node1.toString());
    }
}
