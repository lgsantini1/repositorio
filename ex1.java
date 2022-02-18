public class ex1
{
        public static void main(String[] args)
        {
		 int n = 6;
		 String ast="";	


		 for (int j = n; j >= 0; j--)
		 {
                   	for (int i = 0; i < n; i++)
			{
			if (i>=j) 
				{
					ast= "*";
				}
				else
				{
    					ast= " ";
				}
			System.out.print(ast);
       		 	} 
		 System.out.println("");
       		 }
        }	 
}