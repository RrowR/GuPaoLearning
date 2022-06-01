package com.study.delegatepattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: Rrow
 * @date: 2022/6/1 20:24
 */
public class Leader implements IWorker {

    public Map<String, IWorker> map = new HashMap();

    public Leader() {
        map.put("吃", new EatEmployee());
        map.put("玩", new PlayEmployee());
    }

    @Override
    public void doing(String task) {
        if (!map.containsKey(task)) {
            System.out.println("我做不了");
        }
        if (map.containsKey(task)) {
            map.get(task).doing(task);
        }
    }
}
