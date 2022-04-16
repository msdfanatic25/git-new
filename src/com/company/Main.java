package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 int phy,chem,maths,ped,eng;
        Scanner sc= new Scanner(System.in);
        int sum;
        phy=sc.nextInt();
        chem=sc.nextInt();
        maths=sc.nextInt();
        ped=sc.nextInt();
        eng=sc.nextInt();
        sum=phy+chem+maths+ped+eng;
        System.out.println("This is total marks: "+ sum);

        double percentage=sum/5.0;
        System.out.println("This is percentage: "+ percentage);
    }
}
