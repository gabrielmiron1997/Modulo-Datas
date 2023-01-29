package modulo_date;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivoTXT {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream entrada = new FileInputStream(new File("C:\\workspace-eclipse\\modulo_datas\\arquivo.txt"));
		
		Scanner lerArquivo = new Scanner(entrada, "UTF-8");
		
		while(lerArquivo.hasNext()) {
			
			String linha = lerArquivo.nextLine();
			
			if(linha != null && !linha.isEmpty()) {
				
				String[] dados = linha.split("\\;");

			}		
		}	
	}
}
