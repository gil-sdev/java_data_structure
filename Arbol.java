// definición de la clase Arbol

 public class Arbol
 {
 private NodoArbol raiz;

 // el constructor inicializa un Arbol vacío de enteros
 public Arbol()
 {
 raiz = null;
 } // fin del constructor de Arbol sin argumentos

 // inserta un nuevo nodo en el árbol de búsqueda binaria
 public void insertarNodo( int valorInsertar )
 {
 if ( raiz == null )
 raiz = new NodoArbol( valorInsertar ); // crea el nodo raíz aquí
 else
 raiz.insertar( valorInsertar ); // llama al método insertar
 } // fin del método insertarNodo

 // comienza el recorrido preorden
 public void recorridoPreorden()
 {
 ayudantePreorden( raiz );
 } // fin del método recorridoPreorden

 // método recursivo para realizar el recorrido preorden
 private void ayudantePreorden( NodoArbol nodo )
 {
 if ( nodo == null )
 return;

 System.out.printf( "%d ", nodo.datos ); // imprime los datos del nodo
 ayudantePreorden( nodo.nodoIzq ); // recorre el subárbol izquierdo
 ayudantePreorden( nodo.nodoDer ); // recorre el subárbol derecho
 } // fin del método ayudantePreorden

 // comienza recorrido inorden
 public void recorridoInorden()
 {
 ayudanteInorden( raiz );
 } // fin del método recorridoInorden

 // método recursivo para realizar el recorrido inorden
 private void ayudanteInorden( NodoArbol nodo )
 {
 if ( nodo == null )
return;
 ayudanteInorden( nodo.nodoIzq ); // recorre el subárbol izquierdo
 System.out.printf( "%d ", nodo.datos ); // imprime los datos del nodo
 ayudanteInorden( nodo.nodoDer ); // recorre el subárbol derecho
 } // fin del método ayudanteInorden

 // comienza recorrido postorden
 public void recorridoPostorden()
 {
 ayudantePostorden( raiz );
 } // fin del método recorridoPostorden

 // método recursivo para realizar el recorrido postorden
 private void ayudantePostorden( NodoArbol nodo )
 {
 if ( nodo == null )
 return;

 ayudantePostorden( nodo.nodoIzq ); // recorre el subárbol izquierdo
 ayudantePostorden( nodo.nodoDer ); // recorre el subárbol derecho
 System.out.printf( "%d ", nodo.datos ); // imprime los datos del nodo
 } // fin del método ayudantePostorden
 } // fin de la clase Arbol