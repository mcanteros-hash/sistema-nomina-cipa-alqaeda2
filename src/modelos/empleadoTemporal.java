package modelos;

public class EmpleadoTemporal extends Empleado {
    public EmpleadoTemporal(String nombre, double salario, int anios) {
        super(nombre, salario, anios);
    }

    @Override
    public double calcularSalarioBruto() {
        return salarioBase; // Sin bonos según el PDF [cite: 32]
    }
}
