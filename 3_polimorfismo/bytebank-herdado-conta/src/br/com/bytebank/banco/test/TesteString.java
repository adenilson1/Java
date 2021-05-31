package br.com.bytebank.banco.test;


public class TesteString {

	public static void main(String[] args) {
		String vazio = "   Alura   ";
		int a =3;
		String nome = "Alura"; // object literal 
		// é uma má pratica esvrever String outro= new String("Alura");
		
		
		//String outra = nome.replace('A','a'); // muda letra "A" para "a"
		
		//String outra = nome.toLowerCase(); // passa todas letras para minusculas
		
		//String outra = nome.toUpperCase(); // passa todas as letras para maisculas
		/**
		 * usando o char
		 */
//		
//		char c = 'A';
//		char d = 'a';
//		
//		String outra = nome.replace(c,d);
		
		
		// Para saber posição de caracter, usae-se o charAT()
//		char c = nome.charAt(2);
//		System.out.println(c);
		
		//Usando o indexOf(), diz a posição de uma string ou char 
//		int pos =nome.indexOf("ur");
//		System.out.println(pos);
		
		// usando subString(), retorna uma substring de uma string 
		//e onde se inicia com um caracter especifico.
//		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
		// conhece o tamanho da strinf, usa-se o length();
//		System.out.println(nome.length());
//		
//		for(int i=0; i < nome.length(); i++) {
//			System.out.println(nome.charAt(i));
//		}
		
		// saber se a string é vazia, usae o isEmpty()
//		System.out.println(vazio.isEmpty());
		
		//Para tirar espaços de uma string usa-se trim() do inicio e do 
		// fim de uma string
		
  		String outroVazio = vazio.trim();
//		
//		System.out.println(vazio);
//		System.out.println(outroVazio);
//		System.out.println(outroVazio.isEmpty());
		
		// Para saber se há uma substring em string , usa- se contains()
		System.out.println(vazio.contains("Alu"));
	
//		System.out.println(nome);
//		System.out.println(outra);
		

	}

}
