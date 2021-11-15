package trabalhandoComDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y1 = sdf1.parse("15/11/2021");
		Date y2 = sdf2.parse("15/11/2021 14:51:25");
		
		//Datas de agora 
		
		Date hoje = new Date();
		Date hoje2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);// padrão de 1/01/1970
		Date y3 = Date.from(Instant.parse("2021-11-15T15:04:20Z"));
		
		
		
		System.out.println("Y1: "+(y1));
		System.out.println("Y2: "+(y2));
		System.out.println("Hoje: "+(hoje));
		System.out.println("Hoje2: "+ (hoje2));
		System.out.println("Horário Padrão Java: "+(x3));
		System.out.println("Padrão UTC: "+(y3));
		
		System.out.println("-----------------------------------");
		System.out.println("Y1: "+sdf2.format(y1));
		System.out.println("Y2: "+sdf2.format(y2));
		System.out.println("Hoje: "+sdf2.format(hoje));
		System.out.println("Hoje2: "+ sdf2.format(hoje2));
		System.out.println("Horário Padrão Java: "+sdf2.format(x3));
		System.out.println("Padrão UTC: "+sdf2.format(y3));
		
		System.out.println("-----------------------------------");
		System.out.println("Y1: "+sdf3.format(y1));
		System.out.println("Y2: "+sdf3.format(y2));
		System.out.println("Hoje: "+sdf3.format(hoje));
		System.out.println("Hoje2: "+ sdf3.format(hoje2));
		System.out.println("Horário Padrão Java: "+sdf3.format(x3));
		System.out.println("Padrão UTC: "+sdf3.format(y3));

	}

}
