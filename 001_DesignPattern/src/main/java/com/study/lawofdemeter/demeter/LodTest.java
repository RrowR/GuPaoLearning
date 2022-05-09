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
public class LodTest {
    public static void main(String[] args) {
        /*
        * demeter法则
        *   出现在我方法里的对象不应该出现，如果有入参，应该调用入参里的方法
        *   把不该属于我的其他对象(陌生人)从我的方法里剔除出去
        *
        * */
        TeamLeader teamLeader = new TeamLeader();
        Employee employee = new Employee();
        teamLeader.commandCheckNumber(employee);
    }
}
