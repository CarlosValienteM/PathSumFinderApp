# 🌲 Path Sum Finder - Java

Este proyecto resuelve el problema de encontrar todas las rutas desde la raíz hasta las hojas de un árbol binario donde la suma de los valores sea igual a un número objetivo (`targetSum`). Fue desarrollado en Java usando Maven, respetando los principios SOLID y buenas prácticas de codificación.

---

## 📌 Enunciado del ejercicio

**Opción A**  
> Dado el nodo raíz de un árbol binario y un número entero `targetSum`, devuelva todas las rutas de raíz a hoja donde la suma de los valores sea igual a `targetSum`.

- Cada ruta debe devolverse como una lista de valores, no como referencias de nodos.
- Una hoja es un nodo sin hijos.

### 🔢 Ejemplo:

Input:
root = [5,4,8,11,null,13,4,7,2,null,null,5,1]
targetSum = 22

Output:
[[5, 4, 11, 2], [5, 8, 4, 5]]


---

## 📂 Estructura del proyecto

src/
└── main/
└── java/
└── com.carlos.pathsum.pathsumfinderapp/
├── TreeNode.java // Clase que representa un nodo del árbol
├── PathSumFinder.java // Lógica para encontrar las rutas
└── Main.java // Construcción del árbol y ejecución


---

## ⚙️ Requisitos

- Java 22 o compatible
- NetBeans 25 (opcional)
- Maven 3.6+

---

## ▶️ Ejecución

### Desde NetBeans:

1. Abrí el proyecto
2. Ejecutá con **Run Project**

### Desde la terminal:

```bash
mvn clean compile
mvn exec:java

Resultado en consola

Caminos con suma 22:
[5, 4, 11, 2]
[5, 8, 4, 5]


