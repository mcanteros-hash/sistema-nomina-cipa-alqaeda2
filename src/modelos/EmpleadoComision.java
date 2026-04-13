package modelos;

public class EmpleadoComision extends Empleado {
    private double ventas;
    private double porcentajeComision;

    public EmpleadoComision(String nombre, double base, double ventas, double porcentaje, int anios) {
        super(nombre, base, anios);
        // Validación: Las ventas no pueden ser menores a $0
        this.ventas = Math.max(0, ventas); 
        this.porcentajeComision = porcentaje;
    }

    @Override
    public double calcularSalarioBruto() {
        double comision = ventas * porcentajeComision;
        // Bono del 3% si ventas > $20.000.000
        double bonoExtra = (ventas > 20000000) ? ventas * 0.03 : 0;
        return salarioBase + comision + bonoExtra;
    }
}
