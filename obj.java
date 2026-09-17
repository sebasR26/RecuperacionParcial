public class obj {
    int IdProducto;
    String name;
    double precio;

    public obj(int idProducto, String name, double precio) {
        IdProducto = idProducto;
        this.name = name;
        this.precio = precio;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int idProducto) {
        IdProducto = idProducto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
