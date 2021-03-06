package com.concurrent.model;

/**
 * 计算接口
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/9/15
 * Time: 22:29
 */
public interface Computable<A, V> {

    public V compute(A arg) throws InterruptedException;
}
