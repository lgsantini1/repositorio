import java.util.*;
import java.util.Arrays;

public class ex3
{
  public static void main(String[] args) 
    {
    String s,elemento,subj,subi;
    List<String> Array_Sub= new ArrayList<String>();  
    List<String> Array_Sub_ordenado= new ArrayList<String>();			  
    int n,q;	
    q=0;

    Scanner ler = new Scanner(System.in);	
    System.out.printf("Informe uma string:\n");
    s = ler.nextLine();
    n = s.length();    	

    for (int i=0; i<n; i++){
	for (int j=i+1; j<n+1; j++){
        Array_Sub.add(s.substring(i,j));  
		    	
	}
    }
	
    for (int i=0; i<Array_Sub.size(); i++){
    char[] ch = Array_Sub.get(i).toCharArray();
    Arrays.sort(ch);
    elemento= String.valueOf(ch);		
    Array_Sub.set(i,(elemento));	
    }

    
     for (int i=0; i<n; i++)
    {
	for (int j=1; j<n; j++)
        {
	subi=Array_Sub.get(i);
	subj=Array_Sub.get(j);
        if (subi.equals(subj))
	{  
	q++;	    	
	}
	}
    }

    System.out.printf("\nResultado: \n");
    //System.out.printf(""+Array_Sub);
    System.out.printf(""+q);
    }
}