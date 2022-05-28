package com.study.proxymode.staticproxy;

/**
 * @author: Rrow
 * @date: 2022/5/28 17:35
 */
public class NachacoProxyPerson implements IEntertain{

    private Nekoha nekoha;

    public NachacoProxyPerson(Nekoha nekoha) {
        this.nekoha = nekoha;
    }

    @Override
    public void play() {
        tofindSb();
        nekoha.play();
        playAfter();
    }

    private  void tofindSb(){
        System.out.println("开始找人...");
        System.out.println("找到人了...");
    }

    private void playAfter(){
        System.out.println("游玩结束...");
    }
}
