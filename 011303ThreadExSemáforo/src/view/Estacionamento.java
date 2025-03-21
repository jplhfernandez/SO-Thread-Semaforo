package view;

import controller.ThreadCarro;
import java.util.concurrent.Semaphore;

public class Estacionamento {

	public static void main(String[] args) {
		int permissoes = 3;
		Semaphore semaforo = new Semaphore(permissoes);
		
		for(int idCarro = 0; idCarro < 10; idCarro++) {
			Thread tCarro = new ThreadCarro(idCarro, semaforo);
			tCarro.start();
		}
	}

}
