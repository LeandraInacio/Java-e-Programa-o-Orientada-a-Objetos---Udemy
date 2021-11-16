package aulaEnumeracao;

import java.util.Date;
import entidades.Pedido;
import entidades.enumeracao.OrderStatus;

public class Programa {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(001, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);
		System.out.println(pedido);
	}

}
