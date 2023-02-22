public class Main {
    public static void main(String[] args) {
        System.out.println("LIBRERÍA");
        EntradaSalida.salida("Hola por consola", EntradaSalida.SALIDA_CONSOLA);
        EntradaSalida.salida("Hola por ventana",EntradaSalida.SALIDA_VENTANA);
        String entradaS = EntradaSalida.EntradaString("POR FAVOR INTRODUCE EL MENSAJE QUE QUIERAS MOSTRAR");
        EntradaSalida.salida(entradaS,EntradaSalida.SALIDA_VENTANA);
        int numeroEntero = EntradaSalida.EmtradaInt("Por favor introduce un número");
        EntradaSalida.salida(String.valueOf(numeroEntero),EntradaSalida.SALIDA_CONSOLA);
    }
}