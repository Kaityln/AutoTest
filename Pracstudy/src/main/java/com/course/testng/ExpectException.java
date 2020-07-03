/**
 * @ProjectName: AutoTest
 * @FileName: ExpectException
 * @PackageName: com.course.testng
 * @Date: 2020/7/3 13:44
 * @Author： 郑自秀
 */
package com.course.testng;

import org.testng.annotations.Test;

/**
 * @Authror: Zhengzixiu
 * @Date: 2020/7/3 13:44
 * @Introduction: 异常测试
 */
public class ExpectException {
    /** 什么时候会用到异常测试？
     * 在我们期望结果为一个异常的时候
     * 比如：我们传入了某些不合法的参数，程序抛出了异常
     * 即：想要的结果便是得到这个异常
     */

    // 这是一个测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    // 这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();
    }


}
