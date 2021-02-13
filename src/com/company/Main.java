package com.company;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
	//input
        int i=2,nb=2;
        long  n,t1,t2;
        System.out.println("Donner un nombre: \n");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
    // even tests
        t1= System.nanoTime();
        while(i<sqrt(n)){
            if(n % i == 0) nb++;
            i++;
        }
    //output
        if(nb==2) System.out.println("le nombre est premier");
        else System.out.println("le nombre n'est pas premier");
        t2= System.nanoTime();
        System.out.println("le temps d'execution est : " + TimeUnit.NANOSECONDS.toMillis(t2-t1));
    }
}
