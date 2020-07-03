/**
 * @ProjectName: AutoTest
 * @FileName: DependTest
 * @PackageName: com.course.testng
 * @Date: 2020/7/3 13:58
 * @Author： Kaityln
 */
package com.course.testng;

import org.testng.annotations.Test;

/**
 * @Authror: Kaityln
 * @Date: 2020/7/3 13:58
 * @Introduction: 依赖测试
 */
public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }

    // test2 依赖 tes1, 如果test1 运行失败，则test2 不会再运行, 会被忽略掉
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run; test2 依赖与 test1");
    }

}
