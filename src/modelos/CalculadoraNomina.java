package modelos;

public class CalculadoraNomina {
    public double calcularNeto(Empleado e, boolean aceptaFondo) {
        double bruto = e.calcularSalarioBruto();
        
        // Deducción Salud/Pensión 4%
        double neto = bruto - (bruto * 0.04);

        // Bono Alimentación $1.000.000 (Asalariado y Comisión)
        if (e instanceof EmpleadoAsalariado || e instanceof EmpleadoComision) {
            neto += 1000000;
        }

        // Fondo de Ahorro 2% (Horas con > 1 año)
        if (e instanceof EmpleadoPorHoras && e.antiguedad > 1 && aceptaFondo) {
            neto += (bruto * 0.02);
        }

        // Validación: Nunca negativo
        return Math.max(0, neto);
    }
}
