/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8_2_245;

import ejercicio8_1_237.*;

/**
 *
 * @author lucas
 */
public class Lista {
    protected Nodo primero;
public void Lista(){
 primero = null;
}
public Lista insertarCabezaLista(int entrada)
{
 Nodo nuevo ;
 nuevo = new Nodo(entrada);
 nuevo.enlace = primero;
 primero = nuevo;
 return this;
}
public void visualizar()
{
 Nodo n;
 int k = 0;
 n = primero;
 while (n != null)
 {
 System.out.print(n.dato + " ");
 n = n.enlace;
 k++;
 System.out.print( (k%15 != 0 ? " " : "\n"));
 }
}
}
