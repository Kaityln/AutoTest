/**
 * @ProjectName: AutoTest
 * @FileName: GroupsOnMethod
 * @PackageName: com.course.testng.groups
 * @Date: 2020/7/3 11:09
 * @Author： 郑自秀
 */
package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @Authror: Zhengzixiu
 * @Date: 2020/7/3 11:09
 * @Introduction: 测试方法分组测试
 */
public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法 test1");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试方法 test2");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法 test3");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法 test4");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端组运行之前的方法=====");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端组运行之后的方法!!!!!");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是客户端组运行之前的方法*****");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是客户端组运行之后的方法!!!!!");
    }

}
