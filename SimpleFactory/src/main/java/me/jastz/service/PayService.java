package me.jastz.service;

public class PayService {

    public static void pay(String payMethod) {
        if ("weixin".equalsIgnoreCase(payMethod)) {
            System.out.println("weixin");
        } else if ("alipay".equalsIgnoreCase(payMethod)) {
            System.out.println("alipay");
        }
    }
}
