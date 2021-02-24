import java.util.*;
public class krusgal_algorithm 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int[][] matrix=new int[5][5];
        int[] parent =new int[5];
        int min=999;
        int u=0;
        int v=0;
        int noofedges=1;
        int total=0;
        for(int i=0;i<5;i++)
        {
            parent[i]=0;
            for(int j=0;j<5;j++)
            {
                System.out.println("enter edge weight for vertices "+i+j+" :");
                matrix[i][j]=sc.nextInt();
                if(matrix[i][j]==0)
                   matrix[i][j]=999;
            }
        }
        while(noofedges<5)
        {
            min=999;
            for(int i=0;i<5;i++)
            {
                for(int j=0;j<5;j++)
                {
                    if(matrix[i][j]<min)
                    {
                        min=matrix[i][j];
                        u=i;
                        v=j;
                    }
                }
            }
            int x=u;
            int y=v;
            while(parent[x]!=0)
            {
                x=parent[x];
            }
            while(parent[y]!=0)
            {
                y=parent[y];
            }
            if(x!=y)
            {
                noofedges++;
                System.out.println("edge found "+u+"->"+v+" Min:"+min);
                total+=min;
                parent[v]=u;
            }
            matrix[u][v]=matrix[v][u]=999;
        }
        System.out.println("the weight is : "+total);
    }
}
