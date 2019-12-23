package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;
import java.time.temporal.ValueRange;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016091100486499";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQChHNO1ugSM1C5UXEz3jCUj7IAGGiT643vI2BolBHewtqo0gwfRSJam+4I1EYImoT9+UcbXkZdnLOmLmVhnMqsUugUAIpdXJUasl68IvPq35ombII3SZuPKn+DzfoptZYba/O0WgLBMKluGvuzmJeJ6UpcMTF+sSSWUNqsnT50uEeMR+Q6VzDKZ4v+6kageJ/1smYVW+m83BNhdIq5SwjuB7HHmOkwxKRxS0kGe1TBn4BugSRZZQOiAzMsunJ3yPmdCDdAmXZPuxun9fE/9Kf/gKlhPo8NTgySdX0eH31tHlsmQofd5MNQw9loQ2zxRTHWAdNelKmJY0Nm+3/zclTdFAgMBAAECggEAX3ywVVJsg/L1inYx/72F/aabsgIozLGqmbzKsgnVzlxUwE6wgW9eKpWB9GXuF2sWMI3TJcxaSYIq4Nv/sxoqn1wovo3B2Jp1KrGzwaAPkJMIF3LR21OzylG7h1UGQhQcOwoQknevBVVNba0WxsjJU+pDL7zML1Yi+Zb1FZVv+O8YxICp1XNypKuzi4Tvk+Y1R5nG/nFzJ+31rWkXPQfaecZStYmnRx4triyEXwqfn+2geYDe20JTOeilFVAOmnkODQIhzGyjI3twopYE0g18hRZrmukru3q+mYcauHq8gU56VR7qKclNQLfZ4mL9ODrf7JxAqkDmyucQzrnFX48p+QKBgQDwx6j+pA56cBAjObwS1TYHpre6n3XGUBaw5cEI2SAsMJHarj9xukKk3UkPVRenoJUnMzcFoW4loCda4LHrVOwd2p0MR+zIns57ZeAQLox8opYT09vn27EFf3o+WPLy7UC5aMsD8BwL0zqqDDPzrV9zrSfj9jEttVHD9gfo7bztVwKBgQCrS/o1UDtJaSVWVTM0coV3t/ErvsdBgndFlyg/2BkyzhzOKRhw0mx6kVJKnGwKjDse+2WOI+Q5Qo9hGzMa1ogoET6oELL+vwjr4hvFo7UGXg1tpBJeYixm4CrKksp4wCGaSdBJQDd/BgdVNWFOIQglpKmz1BUha9F42H//aeRCwwKBgBll5jSeF4zgv0MH9wfBh8Z81oqQAXtevVYBlkAZryQaJ3h6wuR7MkZztR4x6qHa9YDCDT7BzX2YjC4w33OkbJellMVT3O04my03DNCIKHeJKu2CfoLRkLW0wa9L8KyhTB+Cp0+OB1dT+68uRFii5BuumzOXp45bvvk9vY3bbf9XAoGAOE7OXc4U3wnQOzPglCH9G6B8h5u71h3z5Q1OLsZzag70yxQZM6UIAbZZbatDnKgCGyoadQH5WJU3mn0dbHoO4dThWs+6dyEG5rs509r/e6tZEKx5WUs+O0b+6f4czlqh8RzIefvBAmFR8cGNTehvzCf3nORfWdAeWHIaiTQe048CgYEA17YMPefCV6xzYlxR+3JOXwqarefOp7bCw/HWe/l4nOg6hWfUm1T5X/IGigiV20TrLX2RxGfobhUXPYAAaplTHf2zzi8ZoKUYX1PEAnT0LcIkL5/qRYDhp0OL4HXJsyJ44tHShmDjhEi/nlrwq9WPj7Ofye84QhhGnmQFK6Zs2No=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoRzTtboEjNQuVFxM94wlI+yABhok+uN7yNgaJQR3sLaqNIMH0UiWpvuCNRGCJqE/flHG15GXZyzpi5lYZzKrFLoFACKXVyVGrJevCLz6t+aJmyCN0mbjyp/g836KbWWG2vztFoCwTCpbhr7s5iXielKXDExfrEkllDarJ0+dLhHjEfkOlcwymeL/upGoHif9bJmFVvpvNwTYXSKuUsI7gexx5jpMMSkcUtJBntUwZ+AboEkWWUDogMzLLpyd8j5nQg3QJl2T7sbp/XxP/Sn/4CpYT6PDU4MknV9Hh99bR5bJkKH3eTDUMPZaENs8UUx1gHTXpSpiWNDZvt/83JU3RQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/AlipayDemo/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/AlipayDemo/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void today(){
        System.out.print("hello world!");
    }
}

