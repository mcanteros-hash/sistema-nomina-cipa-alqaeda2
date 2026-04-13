package modelos;
// Arihann
public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;
    protected int antiguedad;

    public Empleado(String nombre, double salarioBase, int antiguedad) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.antiguedad = antiguedad;
    }

    public abstract double calcularSalarioBruto();
}
