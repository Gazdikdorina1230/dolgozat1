/*
* File: dolgozat1.java
* Author: Gazdik Dorina
* Copyright: 2024, Gazdik Dorina
* Group: Szoft I-II-N
* Date: 2024-09-29
* Github: https://github.com/Gazdikdoirna1230/
* Licenc: GNU GPL
*/

import java.util.Scanner;

public class RombuszTerulet {

    public static void main(String[] args) {

        System.out.println("Ez a program egy rombusz területét számítja ki a két átló alapján.");
        System.out.println("Gazdik Dorina, Szoft/I/II/N");

        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem az első átló hosszát (e): ");
        double e = sc.nextDouble();

        System.out.print("Kérem a második átló hosszát (f): ");
        double f = sc.nextDouble();

        double terulet = (e * f) / 2;

        System.out.println("A rombusz területe: " + terulet);

        sc.close();
    }

}
