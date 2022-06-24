package com.study.springbootthreaddemo.service.impl;

import com.aliyun.dysmsapi20170525.Client;
import com.aliyun.dysmsapi20170525.models.SendSmsRequest;
import com.aliyun.dysmsapi20170525.models.SendSmsResponse;
import com.aliyun.tea.TeaException;
import com.aliyun.teaopenapi.models.Config;
import com.aliyun.teautil.models.RuntimeOptions;
import com.study.springbootthreaddemo.service.SmsClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @author: Rrow
 * @date: 2022/6/24 21:44
 */
@Service
public class SmsClientImpl implements SmsClient {

    @Value("${alisms.accessKeyId}")
    private String apiKey;
    @Value("${alisms.accesskeySecret}")
    private String apiSecret;
    @Value("${alisms.signName}")
    private String signName;
    @Value("${alisms.templateCode}")
    private String templateCode;
    @Value("${alisms.templateParam}")
    private String templateParam;



    @Override
    public String sendSms(String mobile) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("apiKey", apiKey);
        map.put("apiSecret", apiSecret);
        map.put("signName", signName);
        map.put("templateCode", templateCode);
        map.put("templateParam", templateParam);
        return post(map, mobile);
    }

    private String post(HashMap<String, String> map, String mobile) throws Exception{
        SendSmsResponse sendSmsResponse = null;

        com.aliyun.dysmsapi20170525.Client client = createClient(map.get("apiKey"), map.get("apiSecret"));
        SendSmsRequest sendSmsRequest = new SendSmsRequest();
        sendSmsRequest.setSignName(map.get("signName"));
        sendSmsRequest.setTemplateCode(map.get("templateCode"));
        sendSmsRequest.setPhoneNumbers(mobile);
        sendSmsRequest.setTemplateParam(map.get("templateParam"));
        RuntimeOptions runtime = new RuntimeOptions();
        try {
            // 复制代码运行请自行打印 API 的返回值
            sendSmsResponse = client.sendSmsWithOptions(sendSmsRequest, runtime);
        } catch (TeaException error) {
            // 如有需要，请打印 error
            com.aliyun.teautil.Common.assertAsString(error.message);
        } catch (Exception _error) {
            TeaException error = new TeaException(_error.getMessage(), _error);
            // 如有需要，请打印 error
            com.aliyun.teautil.Common.assertAsString(error.message);
        }
        return sendSmsResponse.toString();
    }

    public static Client createClient(String accessKeyId, String accessKeySecret) throws Exception {
        Config config = new Config()
                // 您的 AccessKey ID
                .setAccessKeyId(accessKeyId)
                // 您的 AccessKey Secret
                .setAccessKeySecret(accessKeySecret);
        // 访问的域名
        config.endpoint = "dysmsapi.aliyuncs.com";
        return new Client(config);
    }
}
