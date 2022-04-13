package com.study.lawofdemeter.demeter;

/**
 * @author: Rrow
 * @date: 2022/4/14 1:40
 * demeter法则
 *      只和朋友交流，不和陌生人说话
 *    朋友:
 *      出现在成员变量、方法的输入、输出参数中的类成为成员朋友类
 *      而出现在方法体内部的类不属于朋友类
 */
// TODO 理解的不是很透彻
public class LodTest {
    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();
        Employee employee = new Employee();
        teamLeader.commandCheckNumber(employee);
    }
}
