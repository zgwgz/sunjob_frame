package com.test;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * 队列   先进先出
 *
 * 于stack不同，队列是一个先进先出的容器
 *
 * 创建方式
 *      Queue queue=new ConcurrentLinkedQueue()
 *  一些方法
 *      queue.add(1); 添加
 *       queue.poll();取出队首元素
 *
 *
 *  使用场景，
 *      我们可以在这个基础上实现消息队列
 *      能够对庞大的数据进行缓冲，减轻服务器的负担
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue queue=new ConcurrentLinkedQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        queue.poll();

        System.out.println(queue);
    }
}
