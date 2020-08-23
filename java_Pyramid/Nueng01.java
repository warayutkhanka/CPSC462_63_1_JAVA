public class nueng01 
{
    public static void main(String den[])
    {
        int nueng=4;
        for(int i=1;i<=nueng;i++)
	{
            for(int j=2;j<=i;j++)
	    {
                System.out.print(" ");
            }
            
            System.out.print(i+""+i);
            
            for(int j=nueng;j>=(i+1);j--)
	    {
                System.out.print("**");          
            }
            System.out.println(i+""+i);
        }
    }
}