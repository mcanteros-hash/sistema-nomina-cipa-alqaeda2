import modelos.*;

public class Main {
    public static void main(String[] args) {
        // Instancia de la calculadora (Principio de Responsabilidad Única)
        CalculadoraNomina calculadora = new CalculadoraNomina();

        System.out.println("--- PRUEBAS DE NÓMINA - CIPA ALQAEDA 2.0 ---");

        // PRUEBA 1: Asalariado con antigüedad > 5 años (Recibe bono 10%)
        Empleado asalariado = new EmpleadoAsalariado("Martin Cantero", 2000000, 6);
        double netoAsalariado = calculadora.calcularNeto(asalariado, false);
        System.out.println("\nEmpleado: " + asalariado.getNombre());
        System.out.println("Salario Neto (+ Bono 10% + Alimentación $1M): $" + netoAsalariado);

        // PRUEBA 2: Por Horas (> 40h paga extra 1.5x)
        Empleado porHoras = new EmpleadoPorHoras("Jose Vanegas", 45, 20000, 2);
        double netoHoras = calculadora.calcularNeto(porHoras, true);
        System.out.println("\nEmpleado: " + porHoras.getNombre());
        System.out.println("Salario Neto (Incluye 5h extras y Fondo Ahorro): $" + netoHoras);

        // PRUEBA 3: Comisión (> $20M en ventas recibe bono 3%)
        Empleado comision = new EmpleadoComision("Cesar Arteaga", 1200000, 25000000, 0.05, 3);
        double netoComision = calculadora.calcularNeto(comision, false);
        System.out.println("\nEmpleado: " + comision.getNombre());
        System.out.println("Salario Neto (+ Bono 3% ventas + Alimentación $1M): $" + netoComision);

        // PRUEBA 4: Validación Salario Neto Negativo (No debe permitirlo)
        Empleado temporal = new EmpleadoTemporal("Arihan Perez", 100000, 1);
        double netoTemporal = calculadora.calcularNeto(temporal, false);
        System.out.println("\nPrueba Seguridad - Empleado: " + temporal.getNombre());
        System.out.println("Salario Neto (Validación > 0): $" + netoTemporal);
    }
}
