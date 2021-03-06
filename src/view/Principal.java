package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import controller.SteamControler;

public class Principal {

	public static void main(String[] args) {
		String path = "D:\\Users\\Emerson\\Desktop\\Unesp\\FATEC\\FATEC Zona Leste\\2? Semestre 2021\\Sistemas Operacionais 1 - Colevati\\Aula 12\\SteamCharts.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			SteamControler procurarJogos = new SteamControler(2019, "June", 389376.72);
			
			while(line != null) {
				if(line.contains("June") && line.contains("2019") && line.contains("389376.72")) {
					System.out.println(procurarJogos.toString());
				}
				line = br.readLine();
			}
			
		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
		
		
		
		

	}

}
