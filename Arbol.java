// definici�n de la clase Arbol

 public class Arbol
 {
 private NodoArbol raiz;

 // el constructor inicializa un Arbol vac�o de enteros
 public Arbol()
 {
 raiz = null;
 } // fin del constructor de Arbol sin argumentos

 // inserta un nuevo nodo en el �rbol de b�squeda binaria
 public void insertarNodo( int valorInsertar )
 {
 if ( raiz == null )
 raiz = new NodoArbol( valorInsertar ); // crea el nodo ra�z aqu�
 else
 raiz.insertar( valorInsertar ); // llama al m�todo insertar
 } // fin del m�todo insertarNodo

 // comienza el recorrido preorden
 public void recorridoPreorden()
 {
 ayudantePreorden( raiz );
 } // fin del m�todo recorridoPreorden

 // m�todo recursivo para realizar el recorrido preorden
 private void ayudantePreorden( NodoArbol nodo )
 {
 if ( nodo == null )
 return;

 System.out.printf( "%d ", nodo.datos ); // imprime los datos del nodo
 ayudantePreorden( nodo.nodoIzq ); // recorre el sub�rbol izquierdo
 ayudantePreorden( nodo.nodoDer ); // recorre el sub�rbol derecho
 } // fin del m�todo ayudantePreorden

 // comienza recorrido inorden
 public void recorridoInorden()
 {
 ayudanteInorden( raiz );
 } // fin del m�todo recorridoInorden

 // m�todo recursivo para realizar el recorrido inorden
 private void ayudanteInorden( NodoArbol nodo )
 {
 if ( nodo == null )
return;
 ayudanteInorden( nodo.nodoIzq ); // recorre el sub�rbol izquierdo
 System.out.printf( "%d ", nodo.datos ); // imprime los datos del nodo
 ayudanteInorden( nodo.nodoDer ); // recorre el sub�rbol derecho
 } // fin del m�todo ayudanteInorden

 // comienza recorrido postorden
 public void recorridoPostorden()
 {
 ayudantePostorden( raiz );
 } // fin del m�todo recorridoPostorden

 // m�todo recursivo para realizar el recorrido postorden
 private void ayudantePostorden( NodoArbol nodo )
 {
 if ( nodo == null )
 return;

 ayudantePostorden( nodo.nodoIzq ); // recorre el sub�rbol izquierdo
 ayudantePostorden( nodo.nodoDer ); // recorre el sub�rbol derecho
 System.out.printf( "%d ", nodo.datos ); // imprime los datos del nodo
 } // fin del m�todo ayudantePostorden
 } // fin de la clase Arbol