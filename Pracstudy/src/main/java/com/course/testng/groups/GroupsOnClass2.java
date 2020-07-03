/**
 * @ProjectName: AutoTest
 * @FileName: GroupsOnClass2
 * @PackageName: com.course.testng.groups
 * @Date: 2020/7/3 13:17
 * @Author： 郑自秀
 */
package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @Authror: Zhengzixiu
 * @Date: 2020/7/3 13:17
 * @Introduction: 测试类分组测试
 */

@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("GroupsOnClass2 中的stu1 运行");
    }

    public void stu2(){
        System.out.println("GroupsOnClass2 中的stu2 运行");
    }
}
