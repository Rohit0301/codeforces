import java.util.*;
import java.io.*;

public class ans  {
   

   public static void  main(String args[]){
                 Scanner sc=new Scanner(System.in);
                 int t=sc.nextInt();
                 while(t-->0){
                 int n=sc.nextInt();
                 int out[]=new int[n];
                 int a[][]=new int[3][n];
                for(int i=0;i<n;i++){
                    a[0][i]=sc.nextInt();
                }
                for(int i=0;i<n;i++){
                    a[1][i]=sc.nextInt();
                }
                for(int i=0;i<n;i++){
                    a[2][i]=sc.nextInt();
                }

               int i=0,j=0;
               int size=0;
               int flag=0;
               int prev=-1;
                 while(j<n){
                    for(;j<n;j++){
                        if(a[0][j]!=prev)
                        {
                           out[size]=a[0][j];
                           size++;
                           prev=a[0][j];

                        }
                        else {
                            break;
                        }
                    }

                    for(;j<n;j++){
                         if(a[1][j]!=prev)
                        {
                           out[size]=a[1][j];
                           size++;
                           prev=a[1][j];

                        }
                        else {
                            break;
                        }

                    }
                    for(;j<n;j++){
                         if(a[2][j]!=prev)
                        {
                           out[size]=a[2][j];
                           size++;
                           prev=a[2][j];

                        }
                        else {
                            break;
                        }

                    }
                    int start=out[0];
                    if(out[n-1]==out[n-2] || out[n-1]==start){
                    for(i=0;i<3;i++){
                    if(a[i][n-1]!=out[n-2] && a[i][n-1]!=start){
                        out[n-1]=a[i][n-1];
                        break;
                    }
                }
                 }
                
      }

                for( i=0;i<n;i++){
                    System.out.print(out[i]+" ");
                }

                System.out.println();
            }
    }
}
    
         
