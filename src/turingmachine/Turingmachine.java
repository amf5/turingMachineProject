/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turingmachine;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
class turingmachin{
private int head;
private char[][]arr;
private int numstat;
private int numofstringalphabet;
private int numofmachinealphabet;
public turingmachin(){}
public turingmachin(int s,int a,int m){
numstat=s;
numofstringalphabet=a;
numofmachinealphabet=m;
arr=new char [(a+m)*s][5];
head=0;
}
public  int getnum(int s,int a,int m){
    numstat=s;
numofstringalphabet=a;
numofmachinealphabet=m;

return (a+m)*s;
}
public int gethead(int a){
        a=head;
    return a;
    }
 public  char[][]inputto2array(StringBuffer s){
        turingmachin a=new turingmachin();
        int num=a.getnum(a.numstat,a.numofstringalphabet,a.numofmachinealphabet);
    char [][]arr=new char[10][5];
   int j=0;
   int k=0;
    for(int i=0;i<(s.toString()).length();i++ ){
    char c=(s.toString()).charAt(i);
    switch(c){
    case'\n':
        j++;
        k=0;
        break;
        case'-':
            break;
        default:
           arr[j][k++]=c; 
   }
     }
    
    return arr;
    }
    public char search(char c,char[][] a){
       
    int x=0;int y=0;
    
    while(c!=arr[x][y])
    {
   
   
    
    }
    
    }




}
public class Turingmachine {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner(System.in);
     System.out.println("Enter number of State");
     int numstat=s.nextInt();
     System.out.println("Enter number of Stringalphabet");
     int numaiphabet=s.nextInt();
     for(int i=0;i<numaiphabet;i++)
     {
         System.out.println("the"+(i+1)+"nd string alphabet");
         String alphabet=s.next();
     }
    System.out.println("Enter the number of machinealphabet");
    int num_machine=s.nextInt();
    for(int i=0;i<num_machine;i++)
     {
         System.out.println("the"+(i+1)+"nd machine alphabet");
         String machinealphabet=s.next();
     }
    turingmachin h= new turingmachin(numstat, numaiphabet, num_machine);
    System.out.println("Enter the transition");
String []c=null;
String a="";
StringBuffer j=new StringBuffer(a);

    for(int i=0;i<((numaiphabet+num_machine)*numstat);i++)
    {
    System.out.println("the("+(i+1)+")");
     a=s.next();
       
j.append(a);
j.append("\n");
    }
    h.getnum(numstat, numaiphabet, num_machine);
    System.out.println("the your transition");
    System.out.println(j.toString());
    
    
    }
    
}
