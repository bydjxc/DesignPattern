package com.jack.design.pattern.creational.prototype;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-10-30 16:20
 **/
public class MailTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail" + mail);
        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名" + i);
            mailTemp.setEmail("姓名" + i + "@qq.com");
            mailTemp.setContent("测试内容");
            MailUtil.sendMail(mailTemp);
            System.out.println("克隆的mailTemp" + mailTemp);
        }
        MailUtil.saveOriginalMailRecord(mail);
    }
}
