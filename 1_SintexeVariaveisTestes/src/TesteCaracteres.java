/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adenilson
 */
public class TesteCaracteres {
    public static void main(String[] args){
        // uso do char
         char letra = 'a';
         System.out.println(letra);
         
         // nao existe char vazio: char letra = '';
         // o char é so um unico caracter: char letra = 'ab';
         char valor = 66;
         System.out.println(valor); //nesse caso 66 pela tabela 66 equivale a B
         
         valor = (char) (valor + 1);
         System.out.println(valor);
        
         // uso da String
         String palavra = "alura cursos online de tecnologia";
         System.out.println(palavra);
         
         palavra = palavra + 200;
         
         System.out.println(palavra);
         
        
         
          
    }
}
