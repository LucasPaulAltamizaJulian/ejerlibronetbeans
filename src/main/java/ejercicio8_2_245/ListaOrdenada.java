/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8_2_245;

/**
 *
 * @author lucas
 */
public class ListaOrdenada extends Lista
{
public ListaOrdenada()
{
super();
}
public ListaOrdenada insertaOrden(int entrada)
{
    Nodo nuevo ;
nuevo = new Nodo(entrada);
if (primero == null) // lista vacía
 primero = nuevo;
else if (entrada < primero.getDato())
{
 nuevo. setEnlace(primero);
 primero = nuevo;
}
else /* búsqueda del nodo anterior a partir del que
 se debe insertar */
{
 Nodo anterior, p;
 anterior = p = primero;
 while ((p.getEnlace() != null) && (entrada > p.getDato()))
 {
 anterior = p;
 p = p.getEnlace();
 }
 if (entrada > p.getDato()) //se inserta después del último nodo
 anterior = p;
 // Se procede al enlace del nuevo nodo
 nuevo.setEnlace(anterior.getEnlace());
 anterior.setEnlace(nuevo);
}
return this;
}
 // métodos a codificar:
public void eliminar (int entrada)
{;}
}