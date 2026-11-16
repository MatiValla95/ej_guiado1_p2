public class Main {

    static void main() {

        Modulo[] modulos = new Modulo[5];
        modulos[0] = new Modulo("Autenticación", "Java", 100, true);
        modulos[1] = new Modulo("Inventario", "Java", 75, false);
        modulos[2] = new Modulo("Reportes", "Python", 95, true);
        modulos[3] = new Modulo("Facturación", "Java", 40, false);
        modulos[4] = new Modulo("Notificaciones", "JavaScript", 20, false);

        AnalizadorProyecto analizador = new AnalizadorProyecto(modulos);

        System.out.println("=== LISTA DE MODULOS ===");
        System.out.println(analizador.listarModulos());
        System.out.println("Modulos Terminados: " + analizador.contarTerminados());
        System.out.println("Progreso Promedio: " + analizador.calcularProgresoPromedio() + "%");

        System.out.println("\n=== BUSQUEDAS ===");
        Modulo Encontrado = analizador.buscarModulo("Autenticación");
        if (Encontrado != null) {
            System.out.println("Encontrado -> " + Encontrado.mostrarInformacion());
        } else {
            System.out.println("Autenticación no existe");
        }

        Modulo Existente = analizador.buscarModulo("Pagos");
        if (Existente != null) {
            System.out.println("Encontrado -> " + Existente.mostrarInformacion());
        } else {
            System.out.println("El modulo 'Pagos' no existe");
        }

        System.out.println("\n=== Modulo: Menor Progreso ===");
        Modulo menor = analizador.obtenerMenorProgreso();
        if (menor != null) {
            System.out.println("Menor Progreso -> " + menor.mostrarInformacion());
        } else {
            System.out.println("No hay modulos para analizar");
        }
    }
}