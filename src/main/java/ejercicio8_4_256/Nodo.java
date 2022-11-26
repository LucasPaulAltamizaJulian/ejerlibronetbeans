/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8_4_256;

/**
 *
 * @author lucas
 */
public class Nodo {
    String dato;
Nodo enlace;
public Nodo (String entrada)
{
 dato = entrada;
 enlace = this; // se apunta asímismo
}
}
