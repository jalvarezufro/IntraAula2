/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciosg;

import java.util.Scanner;

/**
 *
 * @author JAVIER
 */
public class Sucesion {

    public static void main(String[] args) {
       // System.out.print(problema2(8));
    }

    public static double problema1(double años, double año1, double año3) {
        double año2 = 0;
        double diferencia = (año3 - año1) / 2;
        año2 = año1 + diferencia;

        return año2;
    }

    public static double problema2(double seg) {
        double metros = 6;
        double metrosSeg = 6 + 0.25 * (seg - 1);
        double totalMetros = 0;
        for (int i = 1; i < seg; i++) {
            totalMetros = totalMetros + (metros + 0.25 * i);

        }
        System.out.println("En el segundo " + seg + " recorre " + metrosSeg + " metros");

        System.out.println("Hasta el segundo " + seg + " el corredor lleva " + totalMetros + " recorridos");
        return totalMetros;
    }

    public static double problema3(double añoInicio, double añoFinal, double dineroInicio, double dineroFinal) {
        double años = añoFinal - añoInicio;
        double Razon;
        Razon = Math.pow(dineroFinal / dineroInicio, Math.pow(años, -1));

        return Razon;

    }

    public static double problema4(double numeradorCuarto, double denominadorCuarto, double numeradorSeptimo, double denominadorSeptimo) {
        double sexto;
        double razon;
        double cuarto = numeradorCuarto / denominadorCuarto;
        double septimo = numeradorSeptimo / denominadorSeptimo;
        razon = Math.pow(septimo * Math.pow(cuarto, -1), Math.pow(3, -1));

        sexto = cuarto * Math.pow(razon, 2);

        return sexto;
    }

}
