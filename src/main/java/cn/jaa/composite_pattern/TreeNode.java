package cn.jaa.composite_pattern;

import com.alibaba.fastjson2.JSON;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Jaa
 * @Description: 组合模式（不常用）
 * @Date 2023/12/1
 */
@Data
public class TreeNode {
    private String name;
    private TreeNode parent;
    private List<TreeNode> children = new ArrayList<>();

    public TreeNode(String name) {
        this.name = name;
    }

    public void add(TreeNode node) {
        children.add(node);
    }

    public void remove(TreeNode node) {
        children.remove(node);
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "name='" + name + '\'' +
                ", parent=" + parent +
                ", children=" + JSON.toJSONString(children) +
                '}';
    }
}
