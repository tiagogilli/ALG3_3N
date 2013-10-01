package trabalho;

import java.util.Scanner;
import java.util.Stack;  

public class Trabalho {

    public static void main(String[] args) {       
        
        Scanner ler = new Scanner(System.in);
        String equacao;        
        
        System.out.println("Digite a expressão matemática:");
        equacao = ler.next();               
        
        /*if(ValidaParenteses(equacao)){  
             System.out.println("Resultado: " + Calcula(equacao));     
       } else {  
           System.out.println("A expressão "+ Calcula(equacao) + "não é válida!");  
       }  */
}
    public static boolean ValidaParenteses(String equacao)  
      {  
      Stack       s = new Stack();  
      int         i;  
      char        current_char;  
      Character   c;  
      char        c1;  
      boolean     ret=true;  
  
      for ( i=0; i < equacao.length(); i++ )  
         {    
         current_char=equacao.charAt( i );  
  
         if (Aberto(current_char))  
            {  
            c=new Character(current_char);  
            s.push( c );  
            }  
         else if (Fechado(current_char))  
            {  
            if ( s.isEmpty() )  
               {  
               ret=false;  
               break;  
               }  
            else  
               {  
               c=(Character)s.pop();  
               c1=c.charValue();  
               if ( !Dentro( c1, current_char ) )  
                  {  
                  ret=false;  
                  break;  
                  }  
               }  
            }  
         }  
  
      if ( !s.isEmpty() )  
         ret=false;  
  
      return ret;  
      }       

    public static boolean Aberto( char c )  
    {  
         if ( c=='(' || c=='[' || c=='{' )  
            return true;  
         else  
            return false;  
    }
    
    public static boolean Fechado( char c )  
      {  
      if ( c==')' || c==']' || c=='}' )  
         return true;  
      else  
         return false;  
      }  
    
     private static boolean Dentro( char open, char closed )  
      {  
      if ( open=='(' && closed==')' )  
         return true;  
      else if ( open=='[' && closed==']' )  
         return true;  
      else if ( open=='{' && closed=='}' )  
         return true;  
      else  
         return false;  
      }     
     
}

