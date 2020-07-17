/**
 * @ProjectName: AutoTest
 * @FileName: MultiThreadOnXml
 * @PackageName: com.course.testng.multiThread
 * @Date: 2020/7/17 16:45
 * @Author： Kaityln
 */
package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @Authror: Kaityln
 * @Date: 2020/7/17 16:45
 * @Introduction: 通过xml文件实现多线程测试
 */
public class MultiThreadOnXml {

    @Test
    public void test1(){
        System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());

    }

    @Test
    public void test2(){
        System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());

    }

    @Test
    public void test3(){
        System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());

    }
}
