
import javax.swing.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by dave & carlos on 6/07/17.
 */
public class rokola {

    String disk[][];
    String albunm[];
    String top[];
    String artist[];
    ArrayList<String> lista;
    ArrayList<String> personal;

    public rokola(){
        disk = new String[10][10];
        top = new String[11];
        albunm = new String[10];
        artist = new String[10];
        lista = new ArrayList<String>();
        personal = new ArrayList<String>();
    }

    public void disco(int x) {

        // disco allison
        albunm[0] = "All is on";
        disk[0][0] = "Memorama - 2:03";
        disk[0][1] = "Dualidad - 3:25";
        disk[0][2] = "Ayuda - 12:12";
        disk[0][3] = "Fragil - 3:28";
        disk[0][4] = "Miedo - 4:20";
        disk[0][5] = "Aqui - 2:10";
        disk[0][6] = "Apocalipsis 2:15";
        disk[0][7] = "Mecambio 1:30";
        disk[0][8] = "Ya no te amo 2:51";
        disk[0][9] = "Rompase el vidrio en caso de emergencia 3:28";

        //Disco foster de people torches
        albunm[1] = "torches";
        disk[1][0] = "Helena beat - 3:55";
        disk[1][1] = "Pumped up kicks - 3:13";
        disk[1][2] = "Call it what you want - 2:12";
        disk[1][3] = "Don't stop - 2:12";
        disk[1][4] = "Waste - 3:00";
        disk[1][5] = "Miss you - 5:21";
        disk[1][6] = "Love - 2:12";
        disk[1][7] = "Houdini - 3:12";
        disk[1][8] = "Life on the nickel - 4:00";
        disk[1][9] = "Chin music for the unsuspect hero - 4:12";

        //Disco linsdlay starling shatter me
        albunm[2] = "shatter me";
        disk[2][0] = "Beyon the veil - 3:12";
        disk[2][1] = "Mirror haus - 3:12";
        disk[2][2] = "V-pop - 1:21";
        disk[2][3] = "Lindsey Stirling feat. Lzzy hale - 2:21";
        disk[2][4] = "Heist - 4:31";
        disk[2][5] = "Roundtable Rival - 3:21";
        disk[2][6] = "Nigth Vision - 3:24";
        disk[2][7] = "Ascendance - 4:00";
        disk[2][8] = "Swag - 3:54";
        disk[2][9] = "Master of tides - 2:12";

        //Disco imagine dragons Nigth visions
        albunm[3] = "Nigth Visions";
        disk[3][0] = "Radioactive - 3:12";
        disk[3][1] = "Tiptoe - 3:12";
        disk[3][2] = "it's time - 1:21";
        disk[3][3] = "Deamons - 2:21";
        disk[3][4] = "On top of the world - 4:31";
        disk[3][5] = "Amsterdam - 3:21";
        disk[3][6] = "Hear me - 3:24";
        disk[3][7] = "Every Night - 4:00";
        disk[3][8] = "Underdog - 3:54";
        disk[3][9] = "Selene - 2:12";

        //Disco Marron 5
        artist[4] = "Marron 5";
        albunm[4] = "V";
        disk[4][0] = "Maps - 2:03";
        disk[4][1] = "Animals - 3:25";
        disk[4][2] = "Stars - 4:23";
        disk[4][3] = "it was always you - 3:28";
        disk[4][4] = "Unkiss me - 4:20";
        disk[4][5] = "Sugar - 2:10";
        disk[4][6] = "New Love 2:15";
        disk[4][7] = "Leaving California 1:30";
        disk[4][8] = "In your pocket 2:51";
        disk[4][9] = "Shoot love 3:28";

        // panda
        albunm[5]  = "parati con desesperacion";
        disk[5][0] = "Disculpa los Malos Pensamientos - 3:23";
        disk[5][1] = "Cuando No Es Como Deberia Ser - 3:32";
        disk[5][2] = "Los Malaventurados no lloran - 4:32";
        disk[5][3] = "El Infame Estar y No Estar - 3:21";
        disk[5][4] = "Maracas  - 3:32";
        disk[5][5] = "Doble Gracias - 2:21";
        disk[5][6] = "Hola  -3:21";
        disk[5][7] = "Nuestra Afliccion - 3:23";
        disk[5][8] = "Espejismos - 3:53";
        disk[5][9] = "Matando Memorias - 3:42";

// Cuisillos
        albunm[6] = "Concierto del amor";
        disk[6][0] = "Acuerda de Mi - 3:23";
        disk[6][1] = "Perdoname - 3:32";
        disk[6][2] = "mil heridas  - 4:32";
        disk[6][3] = "No se lo Digas A Ella - 3:21";
        disk[6][4] = "Ya No Me Mires Asi  - 3:32";
        disk[6][5] = "A veces lloro- 2:21";
        disk[6][6] = "No Señor Apache - 3:21";
        disk[6][7] = "Vive y Dejame Vivir - 3:23";
        disk[6][8] = "No Voy A llorar - 3:53";
        disk[6][9] = "Ojitos Mentirosos - 3:42";

// DLD
        albunm[7] = "DLD";
        disk[7][0] = "Pide Al Tiempoo - 3:23";
        disk[7][1] = "Rencuentro - 3:32";
        disk[7][2] = "Devuelveme - 4:32";
        disk[7][3] = "A Distancia - 3:21";
        disk[7][4] = "Mi Vida - 3:32";
        disk[7][5] = "Todo Cuenta - 2:21";
        disk[7][6] = "Viernes- 3:21";
        disk[7][7] = "Estare - 3:23";
        disk[7][8] = "Arsenico - 3:53";
        disk[7][9] = "Las Cruzadas- 3:42";

// Katty Parry
        albunm[8] = "Prism";
        disk[8][0] = "Roar - 3:23";
        disk[8][1] = "Dark Horse- 3:32";
        disk[8][2] = "Bon Appétit- 4:32";
        disk[8][3] = "Firework- 3:21";
        disk[8][4] = "Hot And Cold- 3:32";
        disk[8][5] = "Wide Awake- 2:21";
        disk[8][6] = "Last Friday Night 3:21";
        disk[8][7] = "California Gurls - 3:23";
        disk[8][8] = "I Kissed a Girl - 3:53";
        disk[8][9] = "The One That Got Away- 3:42";

// La Arrolladora Banda El Limón
        albunm[9] = "Libre otra vez";
        disk[9][0] = "Me Va A Pesar - 3:23";
        disk[9][1] = "Ya Es muy Tarde 3:32";
        disk[9][2] = "Mi Segunda Vida- 4:32";
        disk[9][3] = "El Final De Nuestra Historia- 3:21";
        disk[9][4] = "Ya Te Perdi La Fe - 3:32";
        disk[9][5] = "El Ruido De Tus Zapatos - 2:21";
        disk[9][6] = "Ojala Que Me Olvides - 3:21";
        disk[9][7] = "Ya No Te Buscare - 3:23";
        disk[9][8] = "Mas Adelante - 3:53";
        disk[9][9] = "Heridas Que se Curan - 3:42";
        try {

            switch (x) {
                case 1: //Reproducir por cancion
                    int cancion = 0;
                    for (int i = 0; i < disk.length; i++) {
                        for (int j = 0; j < disk[i].length; j++) {
                            lista.add(cancion, disk[i][j]);
                            cancion++;
                        }
                    }
                    String canciones = "";
                    cancion = 0;
                    for (Object o : lista) {

                        if (cancion % 5 == 0) {

                            canciones += cancion + "|  " + o + "\n\n|";
                        } else {
                            canciones += "|   " + cancion + " " + o + "|";
                        }
                        cancion++;
                    }
                    String my = JOptionPane.showInputDialog(null,
                            "                      Lista completa de canciones\n" +
                                    "Seleccione una pista para reproducir" +
                                    "\n" + canciones);
                    int m = Integer.parseInt(my);
                    JOptionPane.showMessageDialog(null, "Reproduciendo " + lista.get(m));
                    break;

                case 2: // crear lista
                    cancion = 0;
                    for (int i = 0; i < disk.length; i++) {
                        for (int j = 0; j < disk[i].length; j++) {
                            lista.add(cancion, disk[i][j]);
                            cancion++;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Ingresa todas las canciones que tu quieras!!!");
                    String songs = "";
                    cancion = 0;
                    for (int i = 0; i < 30; i++) {

                        if (cancion % 5 == 0) {

                            songs += cancion + "|  " + lista.get(i) + "\n\n|";
                        } else {
                            songs += "|   " + cancion + " " + lista.get(i) + "|";
                        }
                        cancion++;
                    }

                    String cantidad;
                    int index = 0;
                    Pattern pattern = Pattern.compile("^q");

                        while (true) {
                            cantidad = JOptionPane.showInputDialog(null,
                                    songs + "          \n\nq para dejar de ingresar canciones" +
                                            "   " +
                                            "\n\nIgrese numero de cancion");
                            Matcher matcher = pattern.matcher(cantidad);

                            if (matcher.find()) {
                                break;
                            } else {
                                int nueva = Integer.parseInt(cantidad);
                                if (nueva > 100) {
                                    JOptionPane.showMessageDialog(null, (nueva * 11) +"Cancion no encontrada!");
                                } else {
                                    personal.add(index, lista.get(nueva));
                                    JOptionPane.showMessageDialog(null, "ha sido añadida");
                                    index ++;
                                }
                            }
                        }
                    break;

                case 3:// Reproducir por album
                    String pa = JOptionPane.showInputDialog(null, "" +
                            "" +
                            "1.- All is on -- Allison\n" +
                            "2.- Torches -- Foster The People\n" +
                            "3.- Shatter me -- Lindsay Stirling\n" +
                            "4.- Nigth visions -- Imagine Dragons\n" +
                            "5.- V -- Marron 5\n" +
                            "6.- Para ti con despresion -- Panda\n" +
                            "7.- Concierto del amor --Cuisillos\n" +
                            "8.- DLD -- DLD\n" +
                            "9.- Prism -- Katy Perry\n" +
                            "10.- Libre otra vez -- La Arrolladora Banda El Limón\n");
                    int album = Integer.parseInt(pa);
                    switch (album) {
                        case 1:
                            for (int i = 0; i < disk.length; i++) {
                                JOptionPane.showMessageDialog(null, albunm[album - 1] + "\n" + "Tocando: " + disk[album - 1][i]);
                            }
                            break;
                        case 2:
                            for (int i = 0; i < disk.length; i++) {
                                JOptionPane.showMessageDialog(null, albunm[album - 1] + "\n" + "Tocando: " + disk[album - 1][i]);
                            }
                            break;
                        case 3:
                            for (int i = 0; i < disk.length; i++) {
                                JOptionPane.showMessageDialog(null, albunm[album - 1] + "\n" + "Tocando: " + disk[album - 1][i]);
                            }
                            break;
                        case 4:
                            for (int i = 0; i < disk.length; i++) {
                                JOptionPane.showMessageDialog(null, albunm[album - 1] + "\n" + "Tocando: " + disk[album - 1][i]);
                            }
                            break;
                        case 5:
                            for (int i = 0; i < disk.length; i++) {
                                JOptionPane.showMessageDialog(null, albunm[album - 1] + "\n" + "Tocando: " + disk[album - 1][i]);
                            }
                            break;
                        case 6:
                            for (int i = 0; i < disk.length; i++) {
                                JOptionPane.showMessageDialog(null, albunm[album - 1] + "\n" + "Tocando: " + disk[album - 1][i]);
                            }
                            break;
                        case 7:
                            for (int i = 0; i < disk.length; i++) {
                                JOptionPane.showMessageDialog(null, albunm[album - 1] + "\n" + "Tocando: " + disk[album - 1][i]);
                            }
                            break;
                        case 8:
                            for (int i = 0; i < disk.length; i++) {
                                JOptionPane.showMessageDialog(null, albunm[album - 1] + "\n" + "Tocando: " + disk[album - 1][i]);
                            }
                            break;
                        case 9:
                            for (int i = 0; i < disk.length; i++) {
                                JOptionPane.showMessageDialog(null, albunm[album - 1] + "\n" + "Tocando: " + disk[album - 1][i]);
                            }
                            break;
                        case 10:
                            for (int i = 0; i < disk.length; i++) {
                                JOptionPane.showMessageDialog(null, albunm[album - 1] + "\n" + "Tocando: " + disk[album - 1][i]);
                            }
                            break;
                    }
                    break;

                case 4: //Top10
                    top[0] = disk[1][3];
                    top[1] = disk[0][0];
                    top[2] = disk[3][3];
                    top[3] = disk[4][5];
                    top[4] = disk[7][5];
                    top[5] = disk[8][0];
                    top[6] = disk[4][3];
                    top[7] = disk[6][8];
                    top[8] = disk[7][3];
                    top[9] = disk[5][5];
                    top[10] = disk[9][9];
                    int c = 1;
                    String s = "";
                    for (int i = 0; i < top.length - 1; i++) {
                        s += c + " " + top[i] + "\n";
                        c++;
                    }
                    JOptionPane.showMessageDialog(null, s);
                    break;

                case 5: // Reproducir personalizada
                    if (personal.isEmpty()) {
                        JOptionPane.showMessageDialog(null,
                                "ERROR, ahún no has creado una lista personalizada");
                    } else {
                        for (Object n : personal) {
                            String pertenece = "";
                            for (Object w : top) {
                                if (n.equals(w))
                                    pertenece = "Pertenece al top 10";
                            }

                            JOptionPane.showMessageDialog(null,
                                    "Reproduciendo " + n + "   " +
                                            "" +
                                            "" +
                                            "" +
                                            " " + pertenece);
                            pertenece = "";
                        }
                    }
                    break;
                case 6://limpiar lista
                    personal.clear();
                    break;
            }
        }catch (IndexOutOfBoundsException noSongError){
            JOptionPane.showMessageDialog(null,"Cancion no valida!");
        }catch (NumberFormatException exception){
            JOptionPane.showMessageDialog(null, "Seleccione una opcion!");
        }
    }

    public void menu (){

        int eleccion = 0;

        do {
            try {


                String resp = JOptionPane.showInputDialog(null, "\n\t Menu \n\n" +
                        "1.- Reproducir por cancion\n" +
                        "2.- Crear lista'\n" +
                        "3.- Reproducir por album\n" +
                        "4.- Top 10\n" +
                        "5.- Reproducir Lista Personalizada\n" +
                        "6.- Limpiar lista\n" +
                        "7.- Apagar\n");

                eleccion = Integer.parseInt(resp);

                switch (eleccion) {
                    case 1: //reproducir por cancion
                        disco(eleccion);
                        break;

                    case 2://crear lista
                        disco(eleccion);
                        break;

                    case 3://por album
                        disco(eleccion);
                        break;

                    case 4://top 10
                        disco(eleccion);
                        break;

                    case 5:
                        disco(eleccion);
                        break;
                    case 6:
                        disco(eleccion);
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Apagando el sistema...");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "ERROR Opcion no valida");
                        break;
                }
            }catch (NumberFormatException exception){
                JOptionPane.showMessageDialog(null, "Seleccione una opcion!");
            }
        }while (eleccion != 7);
    }

    public static void main(String[] args) {
        rokola rokola = new rokola();

        rokola.menu();

    }
}
