package com.tranction;

/**
 * 理解AOP的思想
 *
 * aop是一种面向切面的编程，是一种 oop思想的延伸。类似于代理思想
 *
 *      切面：
 *          模块与模块，业务与业务之间
 *
 * 将一些重复使用的，与业务无关的代码放到一个切点中
 *  使我们能够更加关注与业务的实现
 *
 *  常用的两种方式
 *      1  使用 JDK的代理，当我们由一个代理类的时候使用的JDK的代理
 *      2  当我们没有实现类的时候，用的使cglib
 *
 */
public class MySaction {


    public void begin() {
        System.out.println("开启事务");
    }

    public void commit() {
        System.out.println("提交事务");
    }


}
