# 🌳 Árbol Binario de Búsqueda — Java

## ¿Qué es un Árbol Binario?

Un árbol binario es una estructura de datos donde cada elemento (llamado **nodo**) puede tener máximo **dos ramas**: una izquierda y una derecha.

En un **Árbol Binario de Búsqueda (ABB)** hay una regla clave:
- Los números **menores** al nodo van a la **izquierda**
- Los números **mayores** al nodo van a la **derecha**

Ejemplo con los números 5, 3, 7, 1, 4:

```
        5          ← raíz
       / \
      3   7        ← 3 < 5 va izquierda, 7 > 5 va derecha
     / \
    1   4          ← 1 < 3 va izquierda, 4 > 3 va derecha
```

---

## 📁 Estructura del proyecto

```
Actividad_Arboles/
├── src/
│   ├── Nodo.java          ← representa cada nodo del árbol
│   ├── ArbolBinario.java  ← lógica: insertar, inorden, buscar
│   └── Main.java          ← menú principal
└── README.md
```

---

## 🧠 ¿Cómo se implementó?

El proyecto usa **3 clases**:

**Nodo.java** — cada nodo guarda un valor y apunta a sus ramas izquierda y derecha.

**ArbolBinario.java** — contiene las operaciones:
- `insertar()` → ubica el número en su posición correcta usando recursividad
- `inorden()` → recorre izquierda → raíz → derecha (imprime en orden ascendente)
- `buscar()` → recorre el árbol comparando valores hasta encontrarlo o no

**Main.java** — menú con `while(true)` y `switch` para interactuar desde consola.

---

## 🛠️ Tecnologías

- **Lenguaje:** Java
- **IDE:** IntelliJ IDEA
- **JDK:** 17 o superior

---

## ▶️ Instrucciones de ejecución

### Desde IntelliJ IDEA
1. Clona el repositorio
2. Abre IntelliJ → **File → Open** → selecciona la carpeta
3. Abre `src/Main.java`
4. Clic en ▶️ al lado de `public static void main`

### Desde la terminal
```bash
git clone https://github.com/tu-usuario/nombre-repo.git
cd nombre-repo
javac src/*.java -d out
java -cp out Main
```

---

## 💻 Ejemplo de ejecución en consola

```
Seleccione una opción:
1. Insertar número
2. Mostrar recorrido inorden
3. Buscar número
4. Salir
1
Ingrese el número a insertar: 5
Número 5 insertado correctamente.

Seleccione una opción:
1. Insertar número
...
1
Ingrese el número a insertar: 3
Número 3 insertado correctamente.

Seleccione una opción:
...
2
Recorrido inorden: 3 5

Seleccione una opción:
...
3
Ingrese el número a buscar: 7
El número 7 NO existe en el árbol.
```

---

## 📸 Capturas de pantalla

<img width="1050" height="591" alt="image" src="https://github.com/user-attachments/assets/36bb018f-b1f1-4bdc-9461-3325f3b08b9c" />
<img width="1050" height="591" alt="image" src="https://github.com/user-attachments/assets/557e84cd-24e6-468f-8fc4-d792bdddfaf1" />


---

## 👥 Integrantes del grupo

| Nombre Estudiante | 
|--------|
| SANTIAGO LONDOÑO RÚA|
Ingeniería de Software y Datos
