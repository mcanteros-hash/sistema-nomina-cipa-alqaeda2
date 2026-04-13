# sistema-nomina-cipa-alqaeda2

**Universidad de Cartagena - Ingeniería de Software**

## 👥 Integrantes
* Martin Cantero Silgado
* Jose Vanegas Ruiz
* Arihan Perez

## 📝 Descripción del Proyecto
Este proyecto consiste en un sistema de nómina desarrollado en Java bajo el paradigma de **Programación Orientada a Objetos (POO)**. El sistema gestiona cuatro tipos de perfiles laborales (Asalariado, Por Horas, Comisión y Temporal), calculando salarios brutos, deducciones de ley y beneficios adicionales de forma automatizada.

## ⚙️ Principios y Buenas Prácticas (SOLID & Codigo limpio)
Siguiendo los requerimientos de la actividad, el código implementa:
1. **Responsabilidad Única (SRP):** Cada clase de empleado gestiona su propio cálculo bruto, mientras que la lógica de deducciones generales reside en la clase `CalculadoraNomina`.
2. **Abstracción y Herencia:** Se definió una clase base `Empleado` para estandarizar el comportamiento de todos los trabajadores.
3. **Código Limpio:** Nombres de variables significativos y métodos breves para facilitar el mantenimiento.
4. **Comentarios de Código:** Documentación interna que explica las reglas de negocio y la lógica aplicada.

## 🛠️ Metodología de Desarrollo
El equipo **Alqaeda 2.0** utilizó la metodología **Scrum** para organizar el desarrollo:
* **Planificación:** Análisis de las reglas de negocio y definición de la arquitectura de clases.
* **Control de Versiones:** Uso de **GitHub** para registrar el progreso y colaboración del CIPA.

## 📊 Reglas de Negocio Implementadas
El sistema cumple estrictamente con las directrices del enunciado:
* **Empleado Asalariado:** Salario fijo con bono del 10% por antigüedad mayor a 5 años.
* **Empleado por Horas:** Pago por horas con recargo de 1.5x en horas extras (más de 40 horas).
* **Empleado por Comisión:** Salario base más comisión, con un bono adicional del 3% si las ventas superan $20.000.000.
* **Empleado Temporal:** Salario fijo mensual sin bonos adicionales.
* **Deducciones:** Descuento obligatorio del 4% para Seguro Social y Pensión, además de la ARL.
* **Beneficios:** Bono alimentación de $1.000.000 para empleados permanentes y fondo de ahorro (2%) para empleados por horas con más de 1 año.
* **Validaciones:** Control de horas y ventas no negativas, y garantía de que ningún salario neto sea negativo.

## 📺 Sustentación en Video
La exposición de la actividad, donde se muestran las pruebas unitarias y el funcionamiento del código, se encuentra en el siguiente enlace:

👉 ****
