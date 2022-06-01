package com.study.delegatepattern;

/**
 * @author: Rrow
 * @date: 2022/6/1 20:57
 */
public class TestMain {
    public static void main(String[] args) {
        Boss.command("吃",new Leader());
        Boss.command("玩",new Leader());
        Boss.command("others",new Leader());
    }
}
