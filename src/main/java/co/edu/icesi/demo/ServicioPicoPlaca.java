package co.edu.icesi.demo;

public class ServicioPicoPlaca {

    public boolean tienePicoPlaca(Ciudad ciudad, Dia dia, String placa) {
        boolean resultado = true;

        if(placa == null || placa.length() != 6) {
            throw new IllegalArgumentException("Placa invalida");
        }

        char ultimoDigito = placa.charAt(placa.length() - 1);
        if (ciudad == Ciudad.CALI) {
            switch (dia){
                case LUNES:
                    resultado = ultimoDigito == '3' || ultimoDigito == '4';
                    break;
                case MARTES:
                    resultado = ultimoDigito == '5' || ultimoDigito == '6';
                    break;
                case MIERCOLES:
                    resultado = ultimoDigito == '7' || ultimoDigito == '8';
                    break;
                case JUEVES:
                    resultado = ultimoDigito == '9' || ultimoDigito == '0';
                    break;
                case VIERNES:
                    resultado = ultimoDigito == '1' || ultimoDigito == '2';
                    break;
                case SABADO:
                case DOMINGO:
                    break;

            }
        }

        return resultado;
    }

}
