/**
 * @ProjectName: AutoTest
 * @FileName: MultiThreadOnXml2
 * @PackageName: com.course.testng.multiThread
 * @Date: 2020/7/17 18:03
 * @Author： Kaityln
 */
package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @Authror: Kaityln
 * @Date: 2020/7/17 18:03
 * @Introduction: 用于测试xml中parallel 的级别为 classes的多线程测试
 */
public class MultiThreadOnXml2 {

    @Test
    public void testMultiThreadOnXml2(){
        System.out.println("*******hello*******");
        System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
    }
}
