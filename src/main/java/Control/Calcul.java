/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author usager
 */
public class Calcul {
    int a, b;
    
    public Calcul(){}

    public Calcul(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public static int Addition(int a, int b){
     int res=a;
     if (b>0){
         while (b--!=0){
         res++;
         }
        }
     else if(b<0){
         while (b++!=0){
         res--;
         }
     }
     return res;
     
     }
}
