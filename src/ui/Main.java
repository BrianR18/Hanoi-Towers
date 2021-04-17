/*
 * Si este comentario continua aqui quiere decir que el programa actual solo lee 
 * los datos desde el archivo y es capaz de resolver los casos base n = 1 y n = 2
 * */

package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	private static String output;
	
	public static void main(String[] args) throws IOException{
		int n = 0;
		output = new String();
		BufferedReader br = new BufferedReader(new FileReader("data/Hanoi_input.txt"));//Ingresar el archivo a la carpeta data, en caso de tener un nombre distinto cambiarlo aqui
		BufferedWriter bw = new BufferedWriter(new FileWriter("data/Hanoi_output.txt"));
		String line = br.readLine();
		int size = Integer.parseInt(line);
		try {
			for(int i = 0; i < size;i++) {
				line = br.readLine();
				n = Integer.parseInt(line);
				output += n+" "+0+" "+0+"\n";
				hanoiTowers(n,0,0,0);
				output += "\n";
			}//End for
		}catch(NumberFormatException e){
			System.err.println("Ha ocurrido un error al procesor los numeros");
		}
		bw.write(output);
		br.close();
		bw.close();
	}//End main
	
	public static void hanoiTowers(int n,int A, int B, int C){
		A = n;
		if(n == 1){
			A -= 1;
			C += 1;
			output += A+" "+B+" "+C+"\n";
			if(B == 1){
				output += A+" "+(B-1)+" "+(C+1)+"\n";
			}
		}else if(n == 2){
			output += (A-1)+" "+(B+1)+" "+C+"\n";
			hanoiTowers(n-1,A-1,B+1,C);
		}
	}//End hanoiTowers
}//End Main
