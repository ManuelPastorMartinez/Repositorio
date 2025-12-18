package Tema4;

public class PartidoDeSquash_bonito {
    static java.util.Scanner teclado;

    public static void main(String[] args) {
        teclado = new java.util.Scanner(System.in);
        System.out.println("****BIENVENIDO AL PARTIDO DE SQUASH****");
        System.out.println("Introduce la puntuación de los sets");
        while (puntuacionEquipos()) {
        }
    }

    public static String PedirEntrada() {
        return teclado.next().toUpperCase();
    }

    public static boolean puntuacionEquipos() {

        boolean saque = true;
        if (PedirEntrada().matches("[ABF]+")) {
            String puntuacion = PedirEntrada();
            if (puntuacion.equals("F")) {
                System.out.println("0-0");
                return false;
            }

            int puntuacion_equipoA = 0;
            int puntuacion_equipoB = 0;
            int sets_equipoA = 0;
            int sets_equipoB = 0;

            for (int i = 0; i < puntuacion.length(); i++) {

                char letra = puntuacion.charAt(i);

                if (letra == 'F') {
                    break;
                }

                if (letra == 'A') {
                    if (saque) {
                        puntuacion_equipoA++;
                    }
                    saque = true;
                } else if (letra == 'B') {
                    if (!saque) {
                        puntuacion_equipoB++;
                    }
                    saque = false;
                }
                if (puntuacion_equipoA>=9 && puntuacion_equipoA-puntuacion_equipoB>1 || puntuacion_equipoB>=9 && puntuacion_equipoB-puntuacion_equipoA>1 ){

                    System.out.print(puntuacion_equipoA + "-" + puntuacion_equipoB);

                    if (puntuacion_equipoA>puntuacion_equipoB){
                        sets_equipoA++;
                        saque=true;
                    }else {
                        sets_equipoB++;
                        saque=false;
                    }

                    puntuacion_equipoA=0;
                    puntuacion_equipoB=0;

                    if (sets_equipoA==3 || sets_equipoB==3){
                        break;
                    }
                }
            }

        }else {
            System.out.println("Introduce una entrada válida(A,B o F)");
        }
        return true;
    }





}

