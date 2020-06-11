package com.jack.design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * @author kevin
 * @version v1.0
 * @description
 * @date 2019-10-30 16:13
 **/
public class MailUtil {
    public static void sendMail(Mail mail){
        String s = "向{0}同学发送邮件,邮件地址：{1},邮件内容：{2}发送邮件成功";
        System.out.println(MessageFormat.format(s, mail.getName(), mail.getEmail(), mail.getContent()));
    }

    public static void saveOriginalMailRecord(Mail mail){
        System.out.println("存储originalMail目录，originalMail为" + mail.getContent());
    }
}
