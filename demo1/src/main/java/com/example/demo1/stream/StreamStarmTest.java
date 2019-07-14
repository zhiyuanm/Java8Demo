package com.example.demo1.stream;
/**
 * 此类用于演示StreamAPI的使用步骤1：开始操作
 * @author liyuting
 *
 * Stream的使用步骤：
 * 	1、开始操作（获取Stream对象）
 * 	2、中间操作（处理指向的数据）
 * 	3、终止操作（拿到想要的结果）
 *
 * 创建Stream对象的方式：
 * 	1、通过集合获取Stream对象【★】
 * 	Stream<XX> stream = 集合.stream();//获取串行流
 *  Stream<XX> stream = 集合.parallelStream();//获取并行流
 *  2、通过数组获取Stream对象
 *  Stream<XX> stream = Arrays.stream(数组名);
 *
 *  3、通过一组值获取Stream对象
 *  Stream<XX> stream =Stream.of(T...ts);
 *
 *  4、生成无限流
 *  Stream<XX> stream = Stream.generate(Supplier sup);
 *
 */
public class StreamStarmTest {

}
