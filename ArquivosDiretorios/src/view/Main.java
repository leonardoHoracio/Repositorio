package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IArquivosController IarqCont = new ArquivosController();

		 String dirWindows = "C:\\Windows";//pasta que desejo listar os
		// diretórios
		String path = "C:\\TEMP\\Arquivo";
		String nome = "arquivo.csv";
		try {
			// IarqCont.readDir(dirWindows);
			IarqCont.createFile(path, nome);
			IarqCont.readFile(path, nome);
			IarqCont.OpenFile(path, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
