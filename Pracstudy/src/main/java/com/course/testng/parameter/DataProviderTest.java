/**
 * @ProjectName: AutoTest
 * @FileName: DataProviderTest
 * @PackageName: com.course.testng.parameter
 * @Date: 2020/7/7 15:33
 * @Author： Kaityln
 */
package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @Authror: Kaityln
 * @Date: 2020/7/7 15:33
 * @Introduction:
 */
public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {
        System.out.println("name = " + name + "; age = " + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] obj = new Object[][]{
                {"zhangsan", 10},
                {"lisi", 8},
                {"wangwu", 15},
        };

        return obj;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age){
        System.out.println("test1 方法 name = " + name + "; age = " + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age){
        System.out.println("test2 方法 name = " + name + "; age = " + age);

    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;
        if (method.getName().equals("test1")){
            result = new Object[][]{
                {"zhangsan", 20},
                {"lisi", 26}
            };
        }else if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"wangwu", 30},
                    {"zhaoliu",28}
            };
        }

        return result;
    }
}
