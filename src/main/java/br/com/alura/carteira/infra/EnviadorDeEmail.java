package br.com.alura.carteira.infra;

public interface EnviadorDeEmail {

	void enviarEmail(String assunto, String destinatario, String mensagem);

}