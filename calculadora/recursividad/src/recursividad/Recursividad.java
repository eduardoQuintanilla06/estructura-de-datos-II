/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author Laboratorio5Pc11
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
//       mostrarDes(3);
//       
//       mostrarAsc(3);
//         System.out.println(factorial(3)); 
         System.out.println(FiboRecursivo(8)); 
//         System.out.println(suma(8,2));
       

    }

    //método recursivo para calcular la suma desde 1 hasta N
 public static int factorial (int n){
         
       if(n == 0)  //caso base
         return 1;
          else
           return n *factorial(n-1);
        
       
    }
    public static void mostrarDes (int n){
        if(n > 0) { //caso base
            System.out.println(n);
            mostrarDes(n-1);
        }
      }
   public static void mostrarAsc (int n){
        if(n >0) { //caso base
            mostrarAsc(n-1);//toma todo el numero para redurcirlo
            System.out.println(n);
            //mostrarAsc(n-1);
        
        }
    }
        public static long FiboRecursivo(long pos){ 
        long retornado=0; 
        if(pos==0 || pos==1)
        { 
        retornado=pos; 
        }else{ 
        retornado=FiboRecursivo(pos-2)+FiboRecursivo(pos-1);
      } 
        return retornado;
    } 
        //suma recursiva de dos numeros
   public static int suma(int a, int b) {
        if (b == 0) {
            return a;
        } else if (a == 0) {
            return b;
        } else {
            return 1 + suma(a, b - 1);
        }
    }
}
