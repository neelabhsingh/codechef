/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechef.Oct14;

import java.util.Scanner;

/**
 *
 * @author Neelabh
 */
public class Chef_and_Ground 
{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        for(int i=0;i<T;i++)
        {
            int N=scan.nextInt();
            int M=scan.nextInt();
            int [] arr=new int[N]; 
            for(int j=0;j<N;j++){
                arr[j]=scan.nextInt();
            }
            int max=arr[0];
            for(int j=1;j<N;j++){
                if(max<arr[j])
                    max=arr[j];
            }
            int sum=0;
            for(int j=0;j<N;j++ ){
                sum+=max-arr[j];
            }
            if((M-sum)%N==0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
