package com.test;

import java.util.Stack;

/**
 * 栈，先进后出。类似于我们的甜筒
 * 使用方式   Stack stack=new Stack();
 *
 *  涉及的方法
 *           stack.push  用于将元素压到栈的顶部
 *           stack.empty() 判断stack是否为空  如果为空 则返回 true 不为空则返回 false
 *           stack.pop() 用于取出栈顶元素，，如果为空则会报错
 *
 *  应用场景
 *          入一些确定的元素的倒装  通过两个 stack进行操作
 *
 */
public class TestStack {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);


        System.out.println(stack.empty());


        //System.out.println(stack.pop());


        //将stack中的元素逆序
        Stack stack1=new Stack();

        while (!stack.empty()){
            stack1.push(stack.pop());
        }



        System.out.println(stack1);


    }
}
