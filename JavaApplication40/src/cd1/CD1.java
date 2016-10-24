/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cd1;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author otorradomiguez
 */
public class CD1 {

    /**
     * @param args the command line arguments
     */
    //https://github.com/omartorrado/CD1.git
    public static void main(String[] args) {
        //comentario1
        Scanner sc1=new Scanner(System.in);
        System.out.println("numeros aleatorios");
        //experimento

        Random e=new Random(10);
        for (int n=0; n<10;n++){
            if (e.nextInt()>=5){
            System.out.println("Pruebas GIT");
            }
            else{
            System.out.println("Hola mundo");
            }
        }
        //Conflicto
       //Comentario
    }

}
