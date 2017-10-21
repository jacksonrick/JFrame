package com.jf.email;

import freemarker.template.Template;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Map;

/**
 * 邮件服务
 * @author rick
 *
 */
public class EmailUtil {

	private JavaMailSender sender;
	private FreeMarkerConfigurer freeMarkerConfigurer = null;

	public void setFreeMarkerConfigurer(FreeMarkerConfigurer freeMarkerConfigurer) {
		this.freeMarkerConfigurer = freeMarkerConfigurer;
	}
	public void setSender(JavaMailSender sender) {
		this.sender = sender;
	}

	/**
	 * 生成html模板字符串
	 * 
	 * @param root 存储动态数据的map
	 * @return
	 */
	private String getMailText(Map<String, Object> root, String templateName) {
		String htmlText = "";
		try {
			// 通过指定模板名获取FreeMarker模板实例
			Template tpl = freeMarkerConfigurer.getConfiguration().getTemplate(templateName+".ftl");
			htmlText = FreeMarkerTemplateUtils.processTemplateIntoString(tpl, root);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return htmlText;
	}

	/**
	 * 发送邮件
	 * 
	 * @param root 存储动态数据的map
	 * @param toEmail 邮件地址
	 * @param subject 邮件主题
	 * @param templateName 模板名称
	 * @return
	 */
	public boolean sendTemplateMail(Map<String, Object> root, String toEmail, String subject, String templateName) {
		try {
			MimeMessage msg = sender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(msg, false, "utf-8");// 由于是html邮件，不是mulitpart类型
			helper.setFrom("xujunfei163@163.com");
			helper.setTo(toEmail);
			helper.setSubject(subject);
			String htmlText = getMailText(root, templateName);// 使用模板生成html邮件内容
			if(!"".equals(htmlText)){
				helper.setText(htmlText, true);
				sender.send(msg);
				return true;
			}
			return false;
		} catch (MailException e) {
			e.printStackTrace();
			return false;
		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

}
