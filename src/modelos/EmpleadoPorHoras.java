package modelos;

public class EmpleadoPorHoras extends Empleado {
    private int horas;
    private double tarifa;

    public EmpleadoPorHoras(String nombre, int horas, double tarifa, int anios) {
        super(nombre, 0, anios);
        this.horas = Math.max(0, horas); // Validación: horas no negativas [cite: 48]
        this.tarifa = tarifa;
    }

    @Override
    public double calcularSalarioBruto() {
        if (horas <= 40) return horas * tarifa;
        // Pago extra a 1.5x después de la hora 40 [cite: 19]
        return (40 * tarifa) + ((horas - 40) * tarifa * 1.5);
    }
}
