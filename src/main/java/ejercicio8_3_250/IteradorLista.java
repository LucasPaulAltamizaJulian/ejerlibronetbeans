/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8_3_250;

/**
 *
 * @author lucas
 */
public class IteradorLista
{
private Nodo actual;
public IteradorLista(ListaDoble ld)
{
 actual = ld.cabeza;
}
public Nodo siguiente()
{
 Nodo a;
 a = actual;
 if (actual != null)
 {
 actual = actual.adelante;
 }
 return a;
}
}
