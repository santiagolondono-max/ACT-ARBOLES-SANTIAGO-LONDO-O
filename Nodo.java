// Clase que representa cada nodo del árbol
// Cada nodo tiene un valor y dos ramas: izquierda y derecha
public class Nodo {

    int valor;
    Nodo izquierdo;
    Nodo derecho;

    // Constructor: crea un nodo con un valor y sin ramas aún
    public Nodo(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
}
