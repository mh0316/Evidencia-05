import java.util.Calendar;
import java.util.GregorianCalendar;

public class FechaHoy {
    String hora;
    public int dia;
    private int mes;
    protected int año;

    public void mostrarFechaYHora(){
        GregorianCalendar calendario = new GregorianCalendar();
        hora = calendario.get(Calendar.HOUR_OF_DAY) + ":" + calendario.get(Calendar.MINUTE) + ":" + calendario.get(Calendar.SECOND);
        dia = calendario.get(Calendar.DATE);
        mes = calendario.get(Calendar.MONTH);
        año = calendario.get(Calendar.YEAR);

        System.out.println("Hora: " + hora);
        System.out.println("Fecha: " + mes + "/" + dia + "/" + año);
    }


}