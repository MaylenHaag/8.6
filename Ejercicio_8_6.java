package ejercicio_8_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author maylenhaagrosbaco
 */
public class Ejercicio_8_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos productos que venderemos y el precio que tendrán. Además,
    se necesita que la aplicación cuente con las funciones básicas. Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
    eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
    Realizar un menú para lograr todas las acciones previamente mencionadas.    
         */

        Scanner leer = new Scanner(System.in);

        HashMap<String, Integer> productos = new HashMap();

        System.out.println("Bienvenido a <Tu almacén online>");
        System.out.println("");

        int aux = 0;

        String nombreProducto;
        int precioProducto;
        do {

            System.out.println("MENÚ");

            System.out.println("1. Introducir un producto.");

            System.out.println("2. Introducir/modificar el precio de un producto.");

            System.out.println("3. Eliminar un producto");

            System.out.println("4. Mostrar los productos que tenemos almacenados con sus respectivos precios.");

            System.out.println("5. Salir.");

            System.out.println("");

            System.out.println("Elija la acción a realizar.");

            int accion = leer.nextInt();

            switch (accion) {

                case 1:

                    System.out.println("Ingrese el nombre del producto:");

                    nombreProducto = leer.next();

                    productos.put(nombreProducto, 0);

                    break;

                case 2:

                    System.out.println("Ingrese el nombre del producto del cual desea ingresar/modificar su precio:");

                    nombreProducto = leer.next();

                    System.out.println("Ingrese el precio del producto:");

                    precioProducto = leer.nextInt();

                    productos.put(nombreProducto, precioProducto);

                    break;

                case 3:

                    System.out.println("Ingrese el nombre del producto que desea eliminar:");

                    nombreProducto = leer.next();

                    productos.remove(nombreProducto);

                    break;

                case 4:

                    for (Map.Entry<String, Integer> auxi : productos.entrySet()) {

                        String key = auxi.getKey();

                        Integer val = auxi.getValue();

                        System.out.println("Producto: " + key + " Precio: " + val);

                    }

                    break;

                case 5:

                    aux++;

                    System.out.println("Usted ha salido del programa exitosamente.");

                    break;

            }

        } while (aux == 0);
    }
}
