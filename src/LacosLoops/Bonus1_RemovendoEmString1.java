package LacosLoops;

import java.util.Scanner;


                // RETIRE OS 'A's DA PRASE "TIRANDO OS A'S DA FRASE A A A"
 

public class Bonus1_RemovendoEmString1 {
    
    public static void main(String[] args) {
	
       String frase = "Tirando os a's da frase 'a' 'a' 'a'"; 
	     int index = 0; //indice começando em '0'. index = a colocação da determinada letra dentro da frase.
       System.out.println("Frase Original: " + frase);

      while (frase.indexOf("a") >= 0){ // <- retorna ao index('a') de primeira ocorrencia  maior ou = 0 na frase.
        index = frase.indexOf("a"); // procura e acha o próximo index ('a'). 
           
	    frase = frase.substring(0, index) + frase.substring(index + 1); //retira o a da frase começando pelo index '0' até o "index" ou seja, até o fim da frase. - um, por um.
            
      
      System.out.println("String com 'a' removida: " + frase);

   
	   } 
    }
}
   
    

