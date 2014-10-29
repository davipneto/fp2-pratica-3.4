/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author davip_000
 */
public class Pratica34 {
    public static long fatorial(int n){
        if(n==0)
            return 1;
        return (n*fatorial(n-1));
    }
    public static int mdc(int m,int n){
        if(n>m)
            return mdc(n,m);
        if(n==0)
            return m;
        return mdc(n,m%n);
    }
    public static void main(String[] args) {
        int n=0;
        while(fatorial(n)>0){
            System.out.println(n + "! = " + fatorial(n));
            n++;
        }
        System.out.println("MDC de 12 e 24: " + mdc(12,24));
        System.out.println("MDC de 7 e 5: " + mdc(7,5));
        
    }
    
}
