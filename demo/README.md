# Delivery Express - Taller de Colecciones y Genéricos

## Integrantes
- Valery Nickol Rosero Molina
- Johan David Delgado Delgado
- Juan Matabanchoy

## Cómo ejecutar
1. Clonar el repositorio
2. Compilar: `javac -d bin src/main/java/**/*.java`
3. Ejecutar: `java -cp bin app.Main`

## Explicación de cada parte

### Parte A - Listas
- **ArrayList**: Usado para almacenar pedidos en orden
- **LinkedList**: Más eficiente para inserciones al inicio (O(1) vs O(n) de ArrayList)

### Parte B - HashSet
- Elimina automáticamente duplicados usando equals() y hashCode()
- No mantiene orden de inserción

### Parte C - HashMap
- Indexa pedidos por cliente
- Permite búsqueda eficiente y cálculo de totales

### Parte D - Genéricos
- Método genérico `filtrar` que funciona con cualquier tipo
- Usa Predicate para criterios de filtrado flexibles