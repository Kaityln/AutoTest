/**
 * @ProjectName: AutoTest
 * @FileName: IgnoreTest
 * @PackageName: com.course.testng
 * @Date: 2020/7/3 11:03
 * @Author： 郑自秀
 */
package com.course.testng;

import org.testng.annotations.Test;

/**
 * @Authror: Zhengzixiu
 * @Date: 2020/7/3 11:03
 * @Introduction: 忽略测试
 */
public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("ignore1 执行");
    }

    // (enabled = false) : 暂时运行时不执行当前方法
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 执行");
    }

    // (enabled = true) ：为true或者 没有使用enabled 标签，默认要执行
    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3 执行");
    }

}
