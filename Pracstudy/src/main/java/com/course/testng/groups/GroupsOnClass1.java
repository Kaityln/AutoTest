/**
 * @ProjectName: AutoTest
 * @FileName: GroupsOnClass1
 * @PackageName: com.course.testng.groups
 * @Date: 2020/7/3 13:16
 * @Author： Kaityln
 */
package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @Authror: Kaityln
 * @Date: 2020/7/3 13:16
 * @Introduction: 类分组测试
 */

@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("GroupsOnClass1 中的stu1 运行");
    }

    public void stu2(){
        System.out.println("GroupsOnClass1 中的stu2 运行");
    }
}
