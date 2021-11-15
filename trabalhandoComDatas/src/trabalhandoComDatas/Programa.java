package trabalhandoComDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Programa {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2021-11-15T15:15:15Z"));
		
		System.out.println("Data padrão: "+sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY,3);
		d=cal.getTime();
		
		System.out.println("Data com acréscimo de hora: "+sdf.format(d));
		
		int minutos = cal.get(Calendar.MINUTE);
		
		System.out.println("Minutos: "+ minutos);
		
		int mes = 1+ cal.get(Calendar.MONTH);
		
		System.out.println("Mês: "+mes);

	}

}
