package com.study.springbootthreaddemo.service;

/**
 * @author: Rrow
 * @date: 2022/6/24 21:43
 */
public interface SmsClient {

    String sendSms(String mobile) throws Exception;

}
