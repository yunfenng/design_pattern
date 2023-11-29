package cn.jaa.adapter_pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Jaa
 * @Description:
 * @Date 2023/11/29 22:30
 */
@Slf4j
public class AdapterTest {

    public static void main(String[] args) {
        // 类适配器
        log.info("-----Class Adapter test-----");
        Targetable classAdapter = new ClassAdapter();
        classAdapter.editTextFile();
        classAdapter.editWordFile();

        // 对象适配器
        log.info("-----Object Adapter test-----");
        Source source = new Source();
        Targetable objectAdapter = new ObjectAdapter(source);
        objectAdapter.editTextFile();
        objectAdapter.editWordFile();

        // 接口适配器
        log.info("-----Interface Adapter test-----");
        SourceSub1 sourceSub1 = new SourceSub1();
        SourceSub2 sourceSub2 = new SourceSub2();
        sourceSub1.editTextFile();
        sourceSub2.editWordFile();
    }
}
