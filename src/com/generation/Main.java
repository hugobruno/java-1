package com.generation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Angulo 1");
        int ang1 = sc.nextInt();
        System.out.println("Angulo 2");
        int ang2 = sc.nextInt();
        System.out.println("Angulo 3");
        int ang3 = sc.nextInt();
        sc.nextLine();
        int sumaTotal = ang1 + ang2 + ang3;

        if (sumaTotal == 180) {
            System.out.println("Valido");
        } else {
            System.out.println("No valido");
        }
        sc.close();
    }
}
/*
        Scanner sn = new Scanner(System.in);
        System.out.println("Escribe el año");
        int anio = sn.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
    }
}*/
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero1 = sc.nextInt();
        System.out.println("Ingresa otro numero");
        int numero2 = sc.nextInt();
        System.out.println("Ingresa la operación deseada: \n 1) Suma \n 2) Resta" + " \n 3) Multiplicación \n 4) División");
        int operacion = sc.nextInt();
        sc.nextLine();
        float resultado = 0;
        switch(operacion){
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("La operacion que seleccionaste es invalida");
                break;
        }
        System.out.println(resultado);
    }
}*/

        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println("Ingresa el dia deseado: \n 1) Lunes \n 2) Martes" + " \n 3) Miercoles \n 4) Jueves");
        int semana = sc.nextInt();
        String dia;
        switch(semana){
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
                default:
        System.out.println("Dia invalido");
                break;
        }
        System.out.println(semana);
        }
        }





