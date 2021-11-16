package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comentario;
import entidades.Post;

public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Tenha uma ótima viagem");
		Comentario c2 = new Comentario("Que incrível");
		
		Post p1 = new Post(sdf.parse("21/06/2021 13:15:07"), "Viagem para Nova Zelândia",
				"Vou visitar esse país incrível", 12);
		
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		System.out.println(p1);

	}

}
