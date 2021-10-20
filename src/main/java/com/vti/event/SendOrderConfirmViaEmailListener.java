package com.vti.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.vti.service.IEmailService;

@Component
public class SendOrderConfirmViaEmailListener 
					implements ApplicationListener<OnSendOrderConfirmViaEmailEvent>{

	@Autowired
	private IEmailService emailService;
	
	@Override
	public void onApplicationEvent(OnSendOrderConfirmViaEmailEvent event) {
		sendConfirmViaEmail(event.getEmail());
		
	}
	
	private void sendConfirmViaEmail(String email) {
		emailService.sendOrderConfirm(email);
	}

}