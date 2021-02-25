/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javatest;
import java.util.Scanner;

class kmpl
{
    public int show(int a, int b)
    {
        return(a+b);
    }
}
/**
 *
 * @author KMPL
 */
public class demo1 {
    
    public static void main(String[] args){
        kmpl d=new kmpl();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the values:");
        int x=s.nextInt();
        int y=s.nextInt();
        int res=d.show(x,y);
        System.out.println("Welcome to class"+res);
            }  
}
