package com.example;

import java.util.*;

public class menu2 {
    public static void main(String[] args) {
        System.out.println("Menu - Ejercicios semana 9");

        Scanner entradaDato;

        int ejercicio;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresar el ejercicio que desea validar (1 a 10): ");
            ejercicio = sc.nextInt();
            if (ejercicio < 1 || ejercicio > 10) {
                System.out.println("Valor inválido. Por favor, ingrese valores entre 1 y 10.");
            }
        } while (ejercicio < 1 || ejercicio > 10);

        switch (ejercicio) {
            case 1:
                System.out.println("Ejercicio 1: Control de precios en una tienda.");

                String[] nombres = new String[5];
                double[] precios = new double[5];

                // Llenado del Array
                int i = 0;
                while (i < 5) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Ingrese el nombre del producto num " + (i + 1) + ": ");
                    nombres[i] = sc.nextLine();
                    System.out.println("Ingrese el valor del producto num " + (i + 1) + ": ");
                    precios[i] = sc.nextInt();
                    i++;
                }
                // Mostrar solo los que superen los 50.000 COP.
                for (i = 0; i < precios.length; i++) {
                    if (precios[i] > 50000) {
                        System.out.println(nombres[i] + " es el objeto con un precio alto.");
                        System.out.println(precios[i] + " es el valor del producto.");
                    }
                }
                break;
            case 2:
                System.out.println("Ejercicio 2: Registro de horas de trabajadores.");

                double[][] horas = new double[3][5];

                // Llenado de la matriz.
                int suma = 0;
                for (i = 0; i < horas.length; i++) { // Filas
                    for (int j = 0; j < horas[i].length; j++) { // Columnas
                        Scanner sc = new Scanner(System.in);
                        System.out.print("El empleado " + (i + 1) + " trabajó en el dia " + (j + 1)
                                + " las sgte cantidad de horas: ");
                        horas[i][j] = sc.nextInt();
                        suma += horas[i][j];
                    }
                }
                System.out.println("El empleado " + (i + 1) + " trabajó " + suma + " horas en la semana.");
                System.out.println();
                break;
            case 3:
                System.out.println("Ejercicio 3: Análisis de notas escolares");

                ArrayList<Double> notas = new ArrayList<>();

                // Llenado del ArrayList
                for (i = 0; i < 10; i++) {
                    Scanner sc = new Scanner(System.in);
                    System.out.print(
                            "Ingrese la nota del estudiante entre 0 y 5. La nota del estudiante " + (i + 1) + " es: ");
                    Double nota = sc.nextDouble();
                    notas.add(nota);
                }

                // Calcular el promedio y aprobados.
                double sumas = 0;
                int aprobados = 0;
                for (Double nota : notas) {
                    sumas += nota;
                    if (nota >= 3.5) {
                        aprobados++;
                    }
                }
                double promedio = sumas / notas.size();

                // Imprimir los resultados
                System.out.println("El promedio de las notas es: " + promedio);
                System.out.println("Número de estudiantes que aprobaron: " + aprobados);
                break;
            case 4:
                System.out.println("Ejercicio 4: Simulación de retiro en cajero automático");

                // Billetes disponibles
                int[] billetes = { 100000, 50000, 20000, 10000 };

                // Arreglo para contar cuántos de cada billete se entregan
                int[] cantidadBilletes = new int[billetes.length];

                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese el monto a retirar (COP): ");
                int monto = scanner.nextInt();

                // Validar que el monto sea múltiplo del menor billete (10.000)
                if (monto % 10000 != 0) {
                    System.out.println("El monto debe ser múltiplo de 10.000 COP.");
                }

                int restante = monto;

                for (i = 0; i < billetes.length; i++) {
                    if (restante >= billetes[i]) {
                        cantidadBilletes[i] = restante / billetes[i];
                        restante %= billetes[i];
                    }
                }

                if (restante > 0) {
                    System.out.println("No es posible entregar el monto exacto con los billetes disponibles.");
                } else {
                    System.out.println("Billetes entregados:");
                    for (i = 0; i < billetes.length; i++) {
                        if (cantidadBilletes[i] > 0) {
                            System.out.println("$" + billetes[i] + " x " + cantidadBilletes[i]);
                        }
                    }
                }
                scanner.close();
                break;
            case 5:
                System.out.println("Ejercicio 5: Revisión de ventas diarias");

                scanner = new Scanner(System.in);
                int[] ventas = new int[7];

                // Ingresar ventas
                System.out.println("Ingrese las ventas diarias (en COL):");
                for (i = 0; i < 7; i++) {
                    System.out.print("Venta del día " + (i + 1) + ": ");
                    ventas[i] = scanner.nextInt();
                }

                // Inicializar mayor y menor con el primer día
                int mayorVenta = ventas[0];
                int menorVenta = ventas[0];
                int diaMayor = 1;
                int diaMenor = 1;

                // Recorrer el arreglo para encontrar el día de mayor y menor venta
                for (i = 1; i < 7; i++) {
                    if (ventas[i] > mayorVenta) {
                        mayorVenta = ventas[i];
                        diaMayor = i + 1;
                    }
                    if (ventas[i] < menorVenta) {
                        menorVenta = ventas[i];
                        diaMenor = i + 1;
                    }
                }

                // Mostrar resultados
                System.out.println("\nDía de mayor venta: Día " + diaMayor + " con $" + mayorVenta);
                System.out.println("Día de menor venta: Día " + diaMenor + " con $" + menorVenta);

                scanner.close();
                break;
            case 6:
                System.out.println("Ejercicio 6: Priorización de pacientes en un centro de salud");

                Scanner sc = new Scanner(System.in);
                ArrayList<String> nombresp = new ArrayList<>();
                ArrayList<Integer> prioridades = new ArrayList<>();

                // Ingreso de datos
                for (i = 0; i < 5; i++) {
                    System.out.print("Ingrese el nombre del paciente " + (i + 1) + ": ");
                    nombresp.add(sc.nextLine());

                    int prioridad;
                    do {
                        System.out.print("Ingrese la prioridad (1 = alta, 2 = media, 3 = baja): ");
                        prioridad = sc.nextInt();
                        sc.nextLine(); // Consume la nueva línea pendiente
                    } while (prioridad < 1 || prioridad > 3);

                    prioridades.add(prioridad);
                }

                System.out.println("\nPacientes ordenados por prioridad:");

                // Mostrar pacientes con prioridad alta (1)
                for (i = 0; i < nombresp.size(); i++) {
                    if (prioridades.get(i) == 1) {
                        System.out.println("Prioridad Alta - " + nombresp.get(i));
                    }
                }

                // Mostrar pacientes con prioridad media (2)
                for (i = 0; i < nombresp.size(); i++) {
                    if (prioridades.get(i) == 2) {
                        System.out.println("Prioridad Media - " + nombresp.get(i));
                    }
                }

                // Mostrar pacientes con prioridad baja (3)
                for (i = 0; i < nombresp.size(); i++) {
                    if (prioridades.get(i) == 3) {
                        System.out.println("Prioridad Baja - " + nombresp.get(i));
                    }
                }
                sc.close();
                break;
            case 7:
                System.out.println("Ejercicio 7: Evaluación de productos fabricados");

                scanner = new Scanner(System.in);

                int[] estados = new int[50]; // Arreglo para almacenar el estado de 50 productos
                int productosDefectuosos = 0;
                int productosBuenos = 0;

                // Simulación del registro de estados (puedes reemplazar esto con la entrada
                // real de datos)
                for (i = 0; i < estados.length; i++) {
                    int estado;
                    do {
                        System.out.print("Estado del producto " + (i + 1) + ": ");
                        estado = scanner.nextInt();
                        if (estado != 0 && estado != 1) {
                            System.out.println("Estado inválido. Por favor, ingrese 0 o 1.");
                        }
                    } while (estado != 0 && estado != 1);
                    estados[i] = estado;
                }

                // Evaluación de los productos
                for (int estado : estados) {
                    if (estado == 0) {
                        productosDefectuosos++;
                    } else if (estado == 1) {
                        productosBuenos++;
                    }
                }

                // Cálculo del porcentaje de defectos
                double porcentajeDefectos = (double) productosDefectuosos / estados.length * 100;

                // Mostrar los resultados
                System.out.println("Cantidad de productos defectuosos: " + productosDefectuosos);
                System.out.println("Cantidad de productos buenos: " + productosBuenos);
                System.out.printf("Porcentaje de productos defectuosos: %.2f%%\n", porcentajeDefectos);
                scanner.close();
                break;
            case 8:
                System.out.println("Ejercicio 8: Horarios de transporte público (Básico)");

                // Horarios de salida de los buses (formato 24h)
                double[] horariosSalida = { 7.00, 9.30, 12.00, 14.30, 17.00, 19.30 };

                scanner = new Scanner(System.in);

                System.out.print("Ingrese la hora actual (formato HH.MM, ej. 07.00): ");
                double horaUsuario = scanner.nextDouble();

                double proximoBus = -1; // Inicializamos con un valor que indica que no se encontró

                // Encontrar el próximo bus disponible
                for (double horario : horariosSalida) {
                    if (horario > horaUsuario) {
                        proximoBus = horario;
                        break; // Encontramos el primer horario posterior
                    }
                }

                // Mostrar el resultado
                System.out.println("La hora ingresada es: " + String.format("%.2f", horaUsuario));

                if (proximoBus != -1) {
                    System.out.println("El próximo bus disponible saldrá a las: " + String.format("%.2f", proximoBus));
                } else {
                    System.out.println("No hay más buses disponibles para hoy después de esta hora.");
                }
                scanner.close();
                break;
            case 9:
                System.out.println("Ejercicio 9: Clasificación de compras en un mercado");

                ArrayList<Double> montos = new ArrayList<>();
                scanner = new Scanner(System.in);

                // Registrar los montos de compra de 8 clientes
                System.out.println("Ingrese el monto de compra de cada uno de los 8 clientes (en COP):");
                for (i = 0; i < 8; i++) {
                    System.out.print("Monto del cliente " + (i + 1) + ": ");
                    montos.add(scanner.nextDouble());
                }

                int pequenos = 0;
                int medianos = 0;
                int grandes = 0;

                // Clasificar las compras
                for (double compra : montos) {
                    if (compra < 50000) {
                        pequenos++;
                    } else if (compra >= 50000 && compra <= 100000) {
                        medianos++;
                    } else {
                        grandes++;
                    }
                }

                // Mostrar los resultados
                System.out.println("\nClasificación de las compras:");
                System.out.println("Compras pequeñas (<50.000 COP): " + pequenos);
                System.out.println("Compras medianas (50.000 - 100.000 COP): " + medianos);
                System.out.println("Compras grandes (>100.000 COP): " + grandes);

                scanner.close();
                break;
            case 10:
                System.out.println("Ejercicio 10: Monitoreo de temperatura ambiental");
                scanner = new Scanner(System.in);
                double[] temperaturas = new double[12];
                int supero35 = 0;
                int porDebajo20 = 0;

                System.out.println("Ingrese las temperaturas medidas cada hora durante 12 horas:");

                // Ciclo para pedir al usuario que ingrese cada temperatura
                for (i = 0; i < 12; i++) {
                    System.out.print("Temperatura hora " + (i + 1) + ": ");
                    temperaturas[i] = scanner.nextDouble();
                }

                // Ciclo para recorrer las temperaturas ingresadas y realizar el análisis
                for (double temperatura : temperaturas) {
                    if (temperatura > 35) {
                        supero35++;
                    }
                    if (temperatura < 20) {
                        porDebajo20++;
                    }
                }

                // Mostrar los resultados
                System.out.println("\nResultados del monitoreo:");
                System.out.println("Número de veces que la temperatura superó los 35°C: " + supero35);
                System.out.println("Número de veces que la temperatura estuvo por debajo de los 20°C: " + porDebajo20);

                scanner.close();
                break;
        }
    }
}
