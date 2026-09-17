import java.util.Scanner;
import java.util.Stack;

public class metodos {

    public obj[][] llenar(obj[][] o, Scanner sc) {
        for (int i = 0; i < o.length; i++) {
            for (int j = 0; j < o.length; j++) {

                System.out.println("ingrese Id del producto");
                int id = sc.nextInt();
                System.out.println("ingrese nombre : ");
                String name = sc.next();
                System.out.println("ingrese precio");
                double precio = sc.nextDouble();

                obj a = new obj(id, name, precio);
                o[i][j] = a;

            }
        }

        return o;
    }

    public obj[] arreglo(obj[][] o) {

        int cant = 0;
        for (int i = 0; i < o.length; i++) {
            for (int j = 0; j < o.length; j++) {
                if (o[i][j].getPrecio() < 200000) {
                    cant++;
                }

            }

        }

        obj[] r = new obj[cant];

        for (int i = 0; i < o.length; i++) {
            for (int j = 0; j < o.length; j++) {
                if (o[i][j].getPrecio() < 200000) {
                    r[i] = o[i][j];
                    System.out.println("Id: " + r[i].getIdProducto() + ", Nombre: " + r[i].getName() + ", Precio: " + r[i].getPrecio());
                }

            }

        }

        return r;

    }

    public Stack<obj> pila(obj[][] o) {
        Stack<obj> p = new Stack<>();
        for (int i = 0; i < o.length; i++) {
            for (int j = 0; j < o.length; j++) {
                if (o[i][j].getPrecio() > 200000) {
                    p.push(o[i][j]);
                    System.out.println("Id: " + o[i][j].getIdProducto() + ", Nombre: " + o[i][j].getName() + ", Precio: " + o[i][j].getPrecio());
                }

            }

        }

        return p;

    }

}
