
import java.util.Calendar;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mati
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar fecha;
        Scanner teclado = new Scanner(System.in);
        int opcion;

        Agenda agenda= new Agenda();
        Pagina pagina;
        Cita cita;
        int hora, min, dia, mes, anyo;
        String titulo, texto;

        System.out.println("Introduce el año de la nueva agenda: ");
        anyo = teclado.nextInt();
        agenda = new Agenda(anyo);
        System.out.println("\n\n" + "***********CITAS" + agenda);

        do {
            menu();
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    /*AÑADIR METODOS PARA VALIDAR QUE EL DIA Y EL MES SON CORRECTOS*/
                    System.out.println("Introduce dia: ");
                    dia = teclado.nextInt();
                    System.out.println("Itroduce Mes: ");
                    mes = teclado.nextInt();
                    agenda.abierta = agenda.BuscaPagina(dia, mes);
                    System.out.println("La PAgina seleccionada" + agenda.abierta);
                    break;
                case 2:
                    /*AÑADIR METODOS PARA VALIDAR QUE LOS PARAMETROS SON CORRECTOS HORA Y MINUTOS*/
                    System.out.println("Introduce Hora: ");
                    hora=teclado.nextInt();
                    System.out.println("Introduce minutos: ");
                    min=teclado.nextInt();
                    System.out.println("Introduce titulo: ");
                    titulo=teclado.nextLine();
                    System.out.println("introduce texto");
                    texto=teclado.nextLine();
                    cita= new Cita(hora,min,titulo,texto);
                    agenda.abierta.añadirCita(cita);
                    agenda.abierta.();
                    break;

            }

        } while (opcion != 0);
    }

    public static void menu() {
        System.out.println("1. Seleccionar Pagina ");
        System.out.println("2. Nueva Cita ");
        System.out.println("3. Borrar Cita ");
        System.out.println("4. Buscar Cita ");
        System.out.println("5. ");
        System.out.println("6. ");
    }
}
