package modelos;

public class EmpleadoAsalariado extends Empleado {
    public EmpleadoAsalariado(String nombre, double salario, int anios) {
        super(nombre, salario, anios);
    }

    @Override
    public double calcularSalarioBruto() {
        // Bono del 10% si lleva más de 5 años [cite: 16]
        double bono = (antiguedad > 5) ? salarioBase * 0.10 : 0;
        return salarioBase + bono;
    }
}
