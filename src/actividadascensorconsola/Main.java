/* 
 * Copyright 2019 Alejandro Alberca - alejandro.alberca.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Scanner;

/**
 *
 * @author Alejandro Alberca - alejandro.alberca.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN = new Scanner(System.in, "ISO-8859-1");

    public static void main(String[] args) {
        boolean semaforo = false;
                    System.out.println("-------------------------------------");
                    System.out.println("|Sois 4 desconocidos en un ascensor,|");                    
                    System.out.println("|a que planta se dirigira cada uno? |");
                    System.out.println("|      Solo hay 10 pisos (1-10)     |");
                    System.out.println("-------------------------------------");
                    
        for (int i = 0; i < 4; i++) {
            do {
                try {
                    
                    System.out.printf("%n%nA que piso te dirijes? ");
                    int planta = SCN.nextInt();
                    switch (planta) {
                        case 1:
                            System.out.printf("Planta 1 seleccionada ");
                            semaforo = false;
                            break;
                        case 2:
                            System.out.printf("Planta 2 seleccionada ");
                            semaforo = false;
                            break;
                        case 3:
                            System.out.printf("Planta 3 seleccionada ");
                            semaforo = false;
                            break;
                        case 4:
                            System.out.printf("Planta 4 seleccionada ");
                            semaforo = false;
                            break;
                        case 5:
                            System.out.printf("Planta 5 seleccionada ");
                            semaforo = false;
                            break;
                        case 6:
                            System.out.printf("Planta 6 seleccionada ");
                            semaforo = false;
                            break;
                        case 7:
                            System.out.printf("Planta 7 seleccionada ");
                            semaforo = false;
                            break;
                        case 8:
                            System.out.printf("Planta 8 seleccionada ");
                            semaforo = false;
                            break;
                        case 9:
                            System.out.printf("Planta 9 seleccionada ");
                            semaforo = false;
                            break;
                        case 10:
                            System.out.printf("Planta 10 seleccionada ");
                            semaforo = false;
                            break;

                        default:
                            semaforo = true;
                            System.out.println("No has seleccionado un piso valido.");
                            System.out.println("Recuerda que solo hay 10 pisos.");
                    }
                } catch (Exception e) {
                    System.out.println("ERROR Vuelve a introducir los datos.");
                } finally {
                    SCN.nextLine();
                }
            } while (semaforo);
        }
    }
}
