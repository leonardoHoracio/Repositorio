package controller;

import java.io.IOException;

public interface IArquivosController {

	public void readDir(String path) throws IOException;//lendo arquivos do diretório
	public void createFile(String path, String nome )throws IOException;//caminho onde o arquivo vai ser criado
	public void readFile(String path, String nome)throws IOException;
	public void OpenFile(String path, String nome)throws IOException;
	
}
