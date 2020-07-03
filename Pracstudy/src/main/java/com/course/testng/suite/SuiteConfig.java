/**
 * @ProjectName: AutoTest
 * @FileName: SuiteConfig
 * @PackageName: com.course.testng.suite
 * @Date: 2020/7/1 17:19
 * @Author： Kaityln
 */
package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @Authror: Kaityln
 * @Date: 2020/7/1 17:19
 * @Introduction: 用于所有测试套件的配置
 */
public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite 运行啦");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite 运行啦");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }
}
