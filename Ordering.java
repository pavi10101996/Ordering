import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class Ordering
{
    static boolean compare(int x,int y,int[][] a)
    {
        int m=0,n=0;
        for(int i=0;i<3;i++)
        {
            if(a[x][i]>a[y][i])
            ++m;
            else if(a[x][i]<a[y][i])
            ++n;
        }
        
        if(m>0&&n==0)
        return true;
        else if(m==0&&n>0)
        return true;
        else
        return false;
        
    }
 
public static void main (String[] args) throws java.lang.Exception
  {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while(t-->0)
    {
        int[][] a = new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            a[i][j]=sc.nextInt();
          }
          if(compare(0,1,a)&& compare(1,2,a)&& compare(2,0,a))  
            System.out.println("yes");
        else
      System.out.println("no");
    }
  }
}