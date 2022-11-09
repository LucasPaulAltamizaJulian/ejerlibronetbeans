/*Crear una lista de números aleatorios. Insertar los nuevos nodos por la cabeza de la lista. Un vez
creada la lista, se han de recorrer los nodos para mostrar los número pares.
 */
package ejercicio8_2_245;

import ejercicio8_1_237.*;

/**
 *
 * @author lucas
 */
public class Nodo
{
int dato;
Nodo enlace;
public Nodo(int x)
{
 dato = x;
 enlace = null;
}
public int getDato()
{
 return dato;
}
public Nodo getEnlace()
{
 return enlace;
}
public void setEnlace(Nodo enlace)
{
 this.enlace = enlace;
}
}
