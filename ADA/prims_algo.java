import java.util.*;
public class prims_algo
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int[][] matrix=new int[5][5];
        int[] visited=new int[5];
        int min;
        int u=0,v=0;
        int total=0;
        for(int i=0;i<5;i++)
        {
            visited[i]=0;
            for(int j=0;j<5;j++)
            {
                System.out.println("Enter the "+i+j+" weight :");
                matrix[i][j]=sc.nextInt();
                if(matrix[i][j]==0)
                   matrix[i][j]=999;
            }
        }
        visited[0]=1;
        for(int c=0;c<4;c++)
        {
            min=999;
            for(int i=0;i<5;i++)
            {
                if(visited[i]==1)
                {
                    for(int j=0;j<5;j++)
                    {
                        if(visited[j]!=1)
                        {
                            if(min>matrix[i][j])
                            {
                                min=matrix[i][j];
                                u=i;
                                v=j;
                            }
                        }
                    }
                }
            }
            visited[u]=1;
            visited[v]=1;
            total+=min;
            System.out.println("Edge found "+u+"->"+v+" weight : "+min);
        }
        System.out.println("The minimum weight of spanning tree is : "+total);
    }
}