/**
 * @ProjectName: AutoTest
 * @FileName: BasicAnnotation
 * @PackageName: com.course.testng
 * @Date: 2020/7/1 16:12
 * @Author： 郑自秀
 */
package com.course.testng;

import org.testng.annotations.*;

/**
 * @Authror: Zhengzixiu
 * @Date: 2020/7/1 16:12
 * @Introduction:
 */
public class BasicAnnotation {

    //最基本的注解，表示 把当前方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod 这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod 这是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass 这是在类运行之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass 这是在类运行之后运行的方法");
    }


    // 测试套件
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite 测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite 测试套件");
    }

}
