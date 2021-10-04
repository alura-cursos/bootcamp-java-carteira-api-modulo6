package br.com.alura.carteira.infra;

import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "test"})
public class EnviadorDeEmailFake implements EnviadorDeEmail {

	@Async
	public void enviarEmail(String assunto, String destinatario, String mensagem) {
		System.out.println("=========================");
		System.out.println("Enviando email: ");
		System.out.println("Assunto: " +assunto);
		System.out.println("Destinatario: " +destinatario);
		System.out.println("Mensagem: " +mensagem);
		System.out.println("=========================");
	}

}
