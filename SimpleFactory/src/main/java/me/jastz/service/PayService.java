package me.jastz.service;

import me.jastz.pay.factory.PayFactory;
import me.jastz.pay.product.AbstractPay;

public class PayService {

    public static void pay(String payMethod) {
        if ("weixin".equalsIgnoreCase(payMethod)) {
            System.out.println("weixin");
        } else if ("alipay".equalsIgnoreCase(payMethod)) {
            System.out.println("alipay");
        }
    }

    public static void pay2(String payMethod) {
        AbstractPay pay = PayFactory.getPayMethod(payMethod);
        if (pay != null) pay.pay();
    }
}
