/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto1006;

import java.util.Scanner;

public class Projeto1006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, C, A1, B1, C1, MEDIA;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        A1 = A * 2;
        B1 = B * 3;
        C1 = C * 5;
        MEDIA = (A1 + B1 + C1) / 10;
        System.out.printf("MEDIA = %.1f\n", MEDIA);
    }
}
        
