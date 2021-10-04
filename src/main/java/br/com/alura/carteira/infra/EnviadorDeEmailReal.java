package br.com.alura.carteira.infra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class EnviadorDeEmailReal implements EnviadorDeEmail {

	@Autowired
	private JavaMailSender emailSender;

	@Value("${email.remetente}")
	private String remetente;

	@Override
	@Async
	public void enviarEmail(String assunto, String destinatario, String mensagem) {
		try {
			SimpleMailMessage email = new SimpleMailMessage();
			email.setFrom(remetente);
			email.setSubject(assunto);
			email.setTo(destinatario);
			email.setText(mensagem);
			emailSender.send(email);
		} catch (Exception e) {
			throw new RuntimeException("Erro ao enviar email!", e);
		}
	}

}
