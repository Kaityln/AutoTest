/**
 * @ProjectName: AutoTest
 * @FileName: GroupsOnClass3
 * @PackageName: com.course.testng.groups
 * @Date: 2020/7/3 13:17
 * @Author： 郑自秀
 */
package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @Authror: Zhengzixiu
 * @Date: 2020/7/3 13:17
 * @Introduction:  测试类分组测试
 */

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("GroupsOnClass3 中的 teacher1 运行");
    }

    public void teacher2(){
        System.out.println("GroupsOnClass3 中的 teacher2 运行");
    }
}
