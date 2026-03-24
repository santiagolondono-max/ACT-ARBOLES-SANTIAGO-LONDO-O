// Clase que implementa el Árbol Binario de Búsqueda (ABB)
// Regla principal: menores a la izquierda, mayores a la derecha
public class ArbolBinario {

    // La raíz es el nodo principal del árbol (el primero que se inserta)
    Nodo raiz;

    // Constructor: árbol vacío al inicio
    public ArbolBinario() {
        this.raiz = null;
    }

    // insertar: agrega un número al árbol en su posición correcta
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    // Método auxiliar recursivo para insertar
    private Nodo insertarRecursivo(Nodo nodo, int valor) {
        // Si el lugar está vacío, aquí va el nuevo nodo
        if (nodo == null) {
            return new Nodo(valor);
        }
        // Si el valor es menor, va a la izquierda
        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRecursivo(nodo.izquierdo, valor);
        }
        // Si el valor es mayor, va a la derecha
        else if (valor > nodo.valor) {
            nodo.derecho = insertarRecursivo(nodo.derecho, valor);
        }
        // Si es igual, no se inserta (no se permiten duplicados)
        return nodo;
    }

    // inorden: recorre el árbol izquierda → raíz → derecha
    // Esto imprime los números en orden ascendente
    public void inorden() {
        if (raiz == null) {
            System.out.println("El árbol está vacío.");
            return;
        }
        inordenRecursivo(raiz);
        System.out.println();
    }

    private void inordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            inordenRecursivo(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inordenRecursivo(nodo.derecho);
        }
    }

    // buscar: indica si un número existe en el árbol
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(Nodo nodo, int valor) {
        // Si llegamos a null, el valor no existe
        if (nodo == null) {
            return false;
        }
        // Si encontramos el valor, retornamos true
        if (valor == nodo.valor) {
            return true;
        }
        // Si es menor buscamos a la izquierda, si es mayor a la derecha
        if (valor < nodo.valor) {
            return buscarRecursivo(nodo.izquierdo, valor);
        } else {
            return buscarRecursivo(nodo.derecho, valor);
        }
    }
}
