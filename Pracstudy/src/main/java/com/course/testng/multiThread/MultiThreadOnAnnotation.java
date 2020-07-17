/**
 * @ProjectName: AutoTest
 * @FileName: MultiThreadAnnotation
 * @PackageName: com.course.testng.multiThread
 * @Date: 2020/7/17 16:11
 * @Author： Kaityln
 */
package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @Authror: Kaityln
 * @Date: 2020/7/17 16:11
 * @Introduction: 通过注解的方式实现多线程测试
 * 其中：invocationCount----表示执行的次数
 *      threadPoolSize----表示线程池的内线程的个数
 */
public class MultiThreadOnAnnotation {

    /**
     * 多线程测试，没有关联的用例可以使用多线程，减少执行时间
     */

    //4个线程同时运行，共执行10次----四个线程瓜分争夺执行次数
    @Test(invocationCount = 10, threadPoolSize = 4)
    public void Test(){
        System.out.println("*******hello*******");
        System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
    }
}
