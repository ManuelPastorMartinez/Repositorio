package Tema4;

public class PartidoDeSquash_bonito {
    static java.util.Scanner teclado;

    /**
     * @author Manuel Pastor
     * @version 1.0
     */
    public static void main(String[] args) {
        teclado = new java.util.Scanner(System.in);
        System.out.println("****BIENVENIDO AL PARTIDO DE SQUASH****");
        System.out.println("Introduce la puntuación de los sets");//Inicio del programa
        while (puntuacionEquipos()) {//Bucle que llama al metodo punutacionEquipos mientras sea verdad
        }//Si puntuacionEquipos devuelve falso es el fin del bucle y por lo tanto del programa

        /**
         * Metodo que sirve de contenedor para el programa
         * Lee el método de puntuación equipos, que sirve para
         */
    }

    public static String pedirEntrada() {//Metodo para pedir la puntuación
        String entrada = "";//Primero inicio la variable
        do {//Quiero que haga lo siguiente mientras la puntuacion tenga letras que no debería
            entrada = teclado.next().toUpperCase();//Coniverto la entrada a mayusculas para que así no haya ningun error a la hora de validar
            if (!entrada.matches("[ABF]+")){//Si la entrada tiene alguna letra que no sea A,B o F
                System.out.println("Por favor introduce una letra correcta (A,B o F)");//Muestro este mensaje
            }

        }while (!entrada.matches("[ABF]+"));//Mientras que la entrada tenga más letras de las permitidas te seguirá pidiendo la entrada
        return entrada;//Una vez que solo tenga las letras permitidas ya la devuelve
    }



    public static boolean puntuacionEquipos() {

        char saque='A'; //Este char sirve para controlar quien saca


        String puntuacion = pedirEntrada();//Llamo al metodo pedirEntrada para obtener la puntuación

        if (puntuacion.equals("F")) {//Si puntuación es solo F finaliza el programa
                System.out.print("0-0");
                return false;
            }

            int puntuacion_equipoA = 0;
            int puntuacion_equipoB = 0;
            //Inicializo la puntuación de los 2 equipos


            for (int i = 0; i < puntuacion.length(); i++) {//Utilizo un for para recorrer la puntuación y ver quien obtiene el punto, si el equipo a o el equipo b

                char letra = puntuacion.charAt(i);//Este char sirve para mirar la posición en la que esta la i y mirar la letra que hay en esa posición

                if (letra == 'F') {//Si en la posicion que esta se encuentra F
                    if (puntuacion_equipoA!=0 || puntuacion_equipoB!=0) {//Y la puntuacion de los 2 equipos es diferente de 0
                        System.out.print(" "+puntuacion_equipoA + "-" + puntuacion_equipoB);//Imprime la puntuación del set sin salto de línea porque no ha encontrado F aun, por lo que sigue siendo el mismo set
                    }
                    break;//Se termina el set al haber encontrado F
                }
                if (letra == 'A') {//Si la letra que hay en la posición es A
                    if (saque=='A') {//Y el saque ya lo tenia el equipo A de antes
                        puntuacion_equipoA++;//El equipo A suma un punto
                    }
                    saque = 'A';//El saque pasa a ser del equipo A
                } else if (letra == 'B') {//En cambio, si la letra que hay en la posición es B
                    if (saque=='B') {//Y el saque lo tenía el equipo B de antes
                        puntuacion_equipoB++;//El equipo B suma un punto
                    }
                    saque = 'B';//El saque pasa a ser del equipo B
                }
                if (puntuacion_equipoA>=9 && puntuacion_equipoA-puntuacion_equipoB>1 || puntuacion_equipoB>=9 && puntuacion_equipoB-puntuacion_equipoA>1){
                    //Si la puntuación de alguno de los 2 equipos llega a nueve y la diferencia de puntos entre los 2 equipos es de 2 o más
                    System.out.println();//Hace un salto de linea para que no se imprima al lado del anterior resultado
                    System.out.print(puntuacion_equipoA+"-"+puntuacion_equipoB);//Imprime la puntuación del set
                    //Reinicia la puntuación de los 2 equipos para el siguiente set
                    puntuacion_equipoA=0;
                    puntuacion_equipoB=0;

                }
            }
            System.out.println();//Hace un salto de linea para no escribir al lado de la puntuación
            return true;//Devuelve verdadero
    }

}

