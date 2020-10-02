package co.edu.icesi.demo;

public class Ejecutable {

    public static void main(String[] args) {
        ServicioPicoPlaca servicio = new ServicioPicoPlaca();

        boolean tiene = servicio.tienePicoPlaca(Ciudad.CALI, Dia.LUNES, "ABC123");
        System.out.println("Tiene pico y placa: " + tiene);
    }

}
