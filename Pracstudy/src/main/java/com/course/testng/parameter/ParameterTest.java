/**
 * @ProjectName: AutoTest
 * @FileName: ParameterTest
 * @PackageName: com.course.testng.parameter
 * @Date: 2020/7/7 11:07
 * @Author： Kaityln
 */
package com.course.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @Authror: Kaityln
 * @Date: 2020/7/7 11:07
 * @Introduction:
 */
public class ParameterTest {

    @Test
    @Parameters({"name","age"})
    public void paramTest(String name, int age){
        System.out.println("name = " + name + "; age = " + age);
    }
}
