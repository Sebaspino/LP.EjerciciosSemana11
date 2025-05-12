package com.example;

import java.util.*;

public class menu1 {
    public static void main(String[] args) {
        System.out.println("Menu - Ejercicios semana 3");

        Scanner entradaDato = new Scanner(System.in);
        ;
        int ejercicio;

        do {
            System.out.println("Ingresar el ejercicio que desea validar entre 1 y 20; ó 0 para Salir ");
            ejercicio = entradaDato.nextInt();
            ejercicios(ejercicio);
            System.out.println(" ");
        } while (ejercicio != 0);
    }

    public static void ejercicios(int ejercicio) {
        switch (ejercicio) {
            case 1:
                System.out.println("Ejercicio 01");

                Scanner entradaDato = new Scanner(System.in);

                System.out.println("Escriba el primer número: ");
                int a = entradaDato.nextInt();
                System.out.println("Escriba el segundo número: ");
                int b = entradaDato.nextInt();

                if (a > b) {
                    System.out.println("El número " + a + " es mayor que " + b + " y son diferentes");
                } else if (a < b) {
                    System.out.println("El número " + b + " es mayor que " + a + " y son diferentes");
                } else {
                    System.out.println("Ambos números " + a + " son iguales");
                }
                entradaDato.close();
                break;
            case 2:
                System.out.println("Ejercicio 02");

                entradaDato = new Scanner(System.in);

                System.out.println("Escriba un número: ");
                int num = entradaDato.nextInt();

                if (num % 2 == 0) {
                    System.out.println("El número " + num + " es par");
                } else if (num % 2 == 1) {
                    System.out.println("El número " + num + " es impar");
                }
                entradaDato.close();
                break;
            case 3:
                System.out.println("Ejercicio 03");

                entradaDato = new Scanner(System.in);

                System.out.println("Escribe en que grados celcius se encuentra el agua: ");
                int agua = entradaDato.nextInt();

                if (agua <= 0) {
                    System.out.println("El agua se encuentra en estado SOLIDO a " + agua + "° celcius");
                } else if (agua > 0 && agua <= 100) {
                    System.out.println("El agua se encuentra en estado LIQUIDO a " + agua + "° celcius");
                } else {
                    System.out.println("El agua se encuentra en estado GASEOSO a " + agua + "° celcius");
                }
                entradaDato.close();
                break;
            case 4:
                System.out.println("Ejercicio 04");

                entradaDato = new Scanner(System.in);

                System.out.println("Escribe el valor de la compra en pesos COL: ");
                int compra = entradaDato.nextInt();

                if (compra > 100000) {
                    System.out.println("Por la compra tienes un descuento de: " + (compra * 0.1));
                    System.out.println("El valor a pagar es: " + (compra * 0.9));
                } else if (compra > 50000 && compra <= 100000) {
                    System.out.println("Por la compra tienes un descuento de: " + (compra * 0.05));
                    System.out.println("El valor a pagar es: " + (compra * 0.95));
                } else {
                    System.out.println("Por la compra no tienes descuento");
                    System.out.println("El valor a pagar es: " + compra);
                }
                entradaDato.close();
                break;
            case 5:
                System.out.println("Ejercicio 05");

                entradaDato = new Scanner(System.in);

                System.out.println("Escribe un número: ");
                num = entradaDato.nextInt();

                if (num < 0) {
                    System.out.println("El número " + num + " es negativo");
                } else if (num > 0) {
                    System.out.println("El número " + num + " es positivo");
                } else {
                    System.out.println("El número es cero");
                }

                if (num % 2 == 0) {
                    System.out.println("El número " + num + " es par");
                } else {
                    System.out.println("El número " + num + " es impar");
                }
                entradaDato.close();
                break;
            case 6:
                System.out.println("Ejercicio 06");
                entradaDato = new Scanner(System.in);

                System.out.println("Para Celsius escribir 1 y para Fahrenheit escribir 2: ");
                int grado = entradaDato.nextInt();

                if (grado == 1) {
                    System.out.println("Escriba los grados Celsius: ");
                    double C = entradaDato.nextDouble();
                    System.out.println("Los " + C + "° Celsius son " + ((C * 9) / 5 + 32) + "° Fahrenheit.");

                } else if (grado == 2) {
                    System.out.println("Escriba los grados Fahrenheit: ");
                    double F = entradaDato.nextDouble();
                    System.out.println("Los " + F + "° Fahrenheit son " + ((F - 32) * 5) / 9 + "° Celsius.");
                } else {
                    System.out.println("Ingresa un número correcto");
                }
                entradaDato.close();
                break;
            case 7:
                System.out.println("Ejercicio 07");
                entradaDato = new Scanner(System.in);

                System.out.println("Ingrese su peso en kg: ");
                double peso = entradaDato.nextDouble();
                System.out.println("Ingrese su altura en cm: ");
                double altura = entradaDato.nextDouble();

                double imc = peso / ((altura * altura) / 10000);

                if (imc < 18.5) {
                    System.out.println("Tu imc es: " + imc + " estas en BAJO PESO.");
                } else if (imc >= 18.5 && imc < 25) {
                    System.out.println("Tu imc es: " + imc + " estas en PESO NORMAL.");
                } else if (imc >= 25 && imc < 30) {
                    System.out.println("Tu imc es: " + imc + " estas en SOBREPESO.");
                } else if (imc >= 30) {
                    System.out.println("Tu imc es: " + imc + " estas en OBESIDAD.");
                }
                entradaDato.close();
                break;
            case 8:
                System.out.println("Ejercicio 08");

                entradaDato = new Scanner(System.in);

                System.out.println("Escriba la cantidad de minutos: ");
                int min = entradaDato.nextInt();

                System.out.println("La cantidad dada se difiere asi:");
                System.out.println(min / (24 * 60) + " dias.");
                System.out.println(min / 60 + " horas.");
                System.out.println(min % 60 + " minutos.");
                entradaDato.close();
                break;
            case 9:
                System.out.println("Ejercicio 09");

                entradaDato = new Scanner(System.in);

                System.out.println("Escriba la nota númerica obtenida:");
                int nota = entradaDato.nextInt();

                if (nota >= 90 && nota <= 100) {
                    System.out.println("La nota: " + nota + " es A");
                } else if (nota >= 80 && nota < 90) {
                    System.out.println("La nota: " + nota + " es B");
                } else if (nota >= 70 && nota < 80) {
                    System.out.println("La nota: 78" + nota + " es C");
                } else if (nota >= 60 && nota < 70) {
                    System.out.println("La nota: " + nota + " es D");
                } else if (nota >= 0 && nota < 60) {
                    System.out.println("La nota: " + nota + " es F");
                } else {
                    System.out.println("La nota es erronea");
                }
                entradaDato.close();
                break;
            case 10:
                System.out.println("Ejercicio 10");

                entradaDato = new Scanner(System.in);

                System.out.println("Escribe el primer valor:");
                int num1 = entradaDato.nextInt();
                System.out.println("Escribe el primer valor:");
                int num2 = entradaDato.nextInt();
                System.out.println("Escribe el signo de la operación que desea realizar:");
                String operacion = entradaDato.next();
                switch (operacion) {
                    case "+":
                        int suma = (num1 + num2);
                        System.out.println("La suma entre: " + num1 + " y " + num2 + " es igual " + suma);
                        break;
                    case "-":
                        int resta = num1 - num2;
                        System.out.println("La resta entre: " + num1 + " y " + num2 + " es igual " + resta);
                        break;
                    case "*":
                        int multi = num1 * num2;
                        System.out.println("La multiplicación entre: " + num1 + " y " + num2 + " es igual " + multi);
                        break;
                    case "/":
                        if (num2 != 0) {
                            int divi = num1 / num2;
                            System.out.println("La división entre: " + num1 + " y " + num2 + " es igual " + divi);
                        } else {
                            System.out.println("La división entre 0 no se puede efectuar.");
                        }
                        break;
                    default:
                        System.out.println("Ingrese una operacion entre +, -, * ó /");
                        break;
                }
                entradaDato.close();
                break;
            case 11:
                System.out.println("Ejercicio 11");

                entradaDato = new Scanner(System.in);

                System.out.println("Ingrese un número del 1 al 7: ");
                num = entradaDato.nextInt();

                switch (num) {
                    case 1:
                        System.out.println("Lunes");
                        break;
                    case 2:
                        System.out.println("Martes");
                        break;
                    case 3:
                        System.out.println("Miercoles");
                        break;
                    case 4:
                        System.out.println("Jueves");
                        break;
                    case 5:
                        System.out.println("Viernes");
                        break;
                    case 6:
                        System.out.println("Sabado");
                        break;
                    case 7:
                        System.out.println("Domingo");
                        break;
                    default:
                        System.out.println("Ingrese un valor valido entre el 1 y el 7");
                        break;
                }
                entradaDato.close();
                break;
            case 12:
                System.out.println("Ejercicio 12");

                Scanner entradaDatos = new Scanner(System.in);

                System.out.println("Escribe la edad que tienes en años: ");
                int años = entradaDatos.nextInt();

                if (años >= 0 && años <= 2) {
                    System.out.println("Tu eres un Bebe");
                } else if (años >= 3 && años <= 12) {
                    System.out.println("Tu eres un Niño");
                } else if (años >= 13 && años <= 19) {
                    System.out.println("Tu eres un Adolescente");
                } else if (años >= 20 && años <= 64) {
                    System.out.println("Tu eres un Adulto");
                } else if (años >= 65) {
                    System.out.println("Tu eres un Adulto Mayor");
                } else {
                    System.out.println("Por favor ingrese un valor correcto mayor a CERO");
                }
                entradaDatos.close();
                break;
            case 13:
                System.out.println("Ejercicio 13");

                entradaDato = new Scanner(System.in);

                System.out.println("Escriba el monto que desea prestar: ");
                double prestamo = entradaDato.nextDouble();
                System.out.println("Escriba la tasa de interes anual: ");
                double tasa = entradaDato.nextDouble();
                System.out.println("Escriba el número de años que desea prestar el monto: ");
                double año = entradaDato.nextDouble();

                double tasanual = tasa / 12;
                double añospagos = año * 12;

                double elevado = Math.pow((1 + tasanual), añospagos);

                double pago = prestamo * (tasanual * elevado) / (elevado - 1);

                System.out.println("El valor del pago mensual es: " + pago);
                System.out.println("El valor de la tasa de interes mensual es: " + tasanual);
                System.out.println("Las coutas a pagar son: " + añospagos);
                break;
            case 14:
                System.out.println("Ejercicio 14");

                entradaDatos = new Scanner(System.in);

                System.out.println("Escriba el año que desea consultar");
                año = entradaDatos.nextInt();

                if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                    System.out.println("El año " + año + " es bisiesto.");
                } else {
                    System.out.println("El año " + año + " no es bisiesto.");
                }
                break;
            case 15:
                System.out.println("Ejercicio 15");

                entradaDato = new Scanner(System.in);

                System.out.println("Escriba la cantidad de años tiene de suscripción: ");
                años = entradaDato.nextInt();
                System.out.println("Escriba el precio de la compra en US: ");
                compra = entradaDato.nextInt();

                if (años >= 1 && años <= 2) {
                    double descuento1 = compra * 0.05;
                    System.out.println("El valor de la compra fue: " + compra);
                    System.out.println("El valor del descuento es: " + descuento1);
                    if (compra >= 500) {
                        double adicion1 = (compra - descuento1) * 0.05;
                        System.out.println("El valor del descuento2 es: " + adicion1);
                        System.out.println("El valor a pagar es: " + (compra - descuento1 - adicion1));
                    } else {
                        System.out.println("El valor a pagar es: " + (compra - descuento1));
                    }
                } else if (años >= 3 && años <= 5) {
                    double descuento2 = compra * 0.10;
                    System.out.println("El valor de la compra fue: " + compra);
                    System.out.println("El valor del descuento es: " + descuento2);
                    if (compra >= 500) {
                        double adicion2 = (compra - descuento2) * 0.05;
                        System.out.println("El valor del descuento2 es: " + adicion2);
                        System.out.println("El valor a pagar es: " + (compra - descuento2 - adicion2));
                    } else {
                        System.out.println("El valor a pagar es: " + (compra - descuento2));
                    }
                } else if (años > 5) {
                    double descuento3 = compra * 0.15;
                    System.out.println("El valor de la compra fue: " + compra);
                    System.out.println("El valor del descuento es: " + descuento3);
                    if (compra >= 500) {
                        double adicion3 = (compra - descuento3) * 0.05;
                        System.out.println("El valor del descuento2 es: " + adicion3);
                        System.out.println("El valor a pagar es: " + (compra - descuento3 - adicion3));
                    } else {
                        System.out.println("El valor a pagar es: " + (compra - descuento3));
                    }
                } else {
                    System.out.println("Los datos son invalidos");
                }
                break;
            case 16:
                System.out.println("Ejercicio 16");

                entradaDato = new Scanner(System.in);

                System.out.println("Escribe la edad que tienes: ");
                int edad = entradaDato.nextInt();
                String mayor = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
                System.out.println("El usuario es: " + mayor);

                System.out.println("Escribe un número: ");
                num = entradaDato.nextInt();
                String numero = (num > 0) ? "Positivo" : (num < 0) ? "Negativo" : "Cero";
                System.out.println("El numero es: " + numero);
                entradaDato.close();
                break;
            case 17:
                System.out.println("Ejercicio 17");

                entradaDatos = new Scanner(System.in);

                System.out.println("Ingrese el primer número: ");
                double num3 = entradaDatos.nextDouble();
                System.out.println("Ingrese el segunto número: ");
                double num4 = entradaDatos.nextDouble();
                System.out.println("Ingrese el tercer número: ");
                double num5 = entradaDatos.nextDouble();

                double suma = num3 + num4 + num5;
                System.out.println("La suma de los números es: " + suma);
                double multi = num3 * num4 * num5;
                System.out.println("La multiplicación de los números es: " + multi);
                double prom = suma / 3;
                System.out.println("El promedio de los números es: " + prom);

                if (prom > suma) {
                    System.out.println("El promedio es mayor que la suma");
                } else {
                    System.out.println("La suma es mayor que el promedio");
                }
                entradaDatos.close();
                break;
            case 18:
                System.out.println("Ejercicio 18");

                entradaDatos = new Scanner(System.in);

                System.out.println("Escribir un número: ");
                num = entradaDatos.nextInt();

                if (num % 2 == 0) {
                    System.out.println("El número " + num + " es divisible por 2");
                } else {
                    System.out.println("El número " + num + " no es divisible por 2");
                }

                if (num % 3 == 0) {
                    System.out.println("El número " + num + " es divisible por 3");
                } else {
                    System.out.println("El número " + num + " no es divisible por 3");
                }

                if (num % 5 == 0) {
                    System.out.println("El número " + num + " es divisible por 5");
                } else {
                    System.out.println("El número " + num + " no es divisible por 5");
                }
                entradaDatos.close();
                break;
            case 19:
                System.out.println("Ejercicio 19");

                Scanner entradaDatoScanner = new Scanner(System.in);

                System.out.println("Ingrese la nota de examenes: ");
                double nota1 = entradaDatoScanner.nextDouble();
                System.out.println("Ingrese la nota de proyectos: ");
                double nota2 = entradaDatoScanner.nextDouble();
                System.out.println("Ingrese la nota de tareas: ");
                double nota3 = entradaDatoScanner.nextDouble();
                System.out.println("Ingrese la nota de participación: ");
                double nota4 = entradaDatoScanner.nextDouble();

                double total = (nota1 * 0.4) + (nota2 * 0.3) + (nota3 * 0.2) + (nota4 * 0.1);

                System.out.println("La nota total del curso es: " + total);
                entradaDatoScanner.close();
                break;
            case 20:
                System.out.println("Ejercicio 20");

                entradaDatos = new Scanner(System.in);

                System.out.println("Ingrese la primera longitud: ");
                double num6 = entradaDatos.nextDouble();
                System.out.println("Ingrese la segunda longitud: ");
                double num7 = entradaDatos.nextDouble();
                System.out.println("Ingrese la tercera longitud: ");
                double num8 = entradaDatos.nextDouble();

                if (num6 <= 0 || num7 <= 0 || num8 <= 0) {
                    System.out.println("Longitudes invalidas");
                } else if (num6 >= (num7 + num8) || num8 >= (num7 + num6) || num8 >= (num6 + num7)) {
                    System.out.println("No es un triangulo");
                } else if (num6 == num7 && num7 == num8) {
                    System.out.println("Es un triangulo equilatero");
                } else if ((num6 == num7 || num8 == num6 || num8 == num7)) {
                    System.out.println("Es un triangulo isoceles");
                } else if (num6 != num7 && num7 != num8 && num8 != num6) {
                    System.out.println("Es un triangulo escaleno");
                }
                entradaDatos.close();
                break;
            case 0:
                    System.out.println("Muchas gracias por ejecutar. Adios.");
                    break;
            default:
                    System.out.println("Ingrese un valor valido");
                    break;
        }
    }
}