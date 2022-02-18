import java.util.Scanner;

public class ex2
{      			
    public static int senhaForte(String senha) {
    if (senha.length() < 6) return (6- senha.length());

    int achouNumero = 1;
    int achouMaiuscula = 1;
    int achouMinuscula = 1;
    int achouSimbolo = 1;

    for (char c : senha.toCharArray()) {
         if (c >= '0' && c <= '9') {	
             achouNumero = 0;
         } else if (c >= 'A' && c <= 'Z') {
             achouMaiuscula = 0;
         } else if (c >= 'a' && c <= 'z') {
             achouMinuscula = 0;
         } else if ( c== '!' || c== '@'|| c== '#' || c== '$' || c== '%' || 
c== '^' ||  c== '&' || c== '*' || c== '(' || c== ')' || c== '-' || c== '+'  ){
             achouSimbolo = 0;
         }
    }
    return achouNumero +achouMaiuscula +achouMinuscula +achouSimbolo;
}
		
        public static void main(String[] args)
        {
		String senha_ex2;
		Scanner ler = new Scanner(System.in);
    		senha_ex2=ler.next();	 
		System.out.println("Falta "+ senhaForte(senha_ex2) + " dígitos para a senha ser segura");
        }	 
}