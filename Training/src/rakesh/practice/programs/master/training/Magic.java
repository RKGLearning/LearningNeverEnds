package rakesh.practice.programs.master.training;

import java.io.*;
class magic
{
    public static void main(String args[])throws Exception
    {
        int i,j,k,n;
        magic obj=new magic();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter the upper limit to print the rakesh.practice.programs.master.training.magic number series: ");  // i.e the value of n;
        String n1 = br.readLine();
        String[] arr = n1.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

//        n=Integer.parseInt(br.readLine());
        for(k=a;k<b;k++)
        {i=k;
            while((j=obj.magicno(i))/10!=0)
            {
                i=j;
            }
            if ( j==1)
                System.out.print(k+",");
        }
    }

    int magicno(int n)
    {
        if(n/10==0)
            return n;
        else
            return n%10 + magicno(n/10);
    }
}