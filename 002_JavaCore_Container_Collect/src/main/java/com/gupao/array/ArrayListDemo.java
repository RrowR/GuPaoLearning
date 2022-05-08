package com.gupao.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Rrow
 * @date: 2022/4/25 21:23
 */
public class ArrayListDemo {

    private static List list = new ArrayList();

    public static void main(String[] args) {
        /*
        * 会出现并发修改异常  属于failfast机制
        * Exception in thread "Thread-1" java.util.ConcurrentModificationException
          at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:909)
          at java.util.ArrayList$Itr.next(ArrayList.java:859)
          at com.gupao.array.ThreadIterator.run(ThreadIterator.java:22)
        * try {
                ArrayList.this.remove(lastRet);
                cursor = lastRet;
                lastRet = -1;
                expectedModCount = modCount;
            } catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }
        * */
        // 进行添加
        new ThreadAdd(list).start();
        // 进行遍历
        new ThreadIterator(list).start();
    }
}
