package modulo_date;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivos {
	
	public static void main(String[] args) throws IOException {
		
		File arquivo = new File("C:\\workspace-eclipse\\modulo_datas\\arquivo.txt");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();			
		}
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
				
		for(int i = 0; i <= 10; i++) {
			
			escrever_no_arquivo.write("Texto da Minha Linha " + i +"\n");
			

		}
		
		
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
	}

}
