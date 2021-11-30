package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(3,4,5,10,7);
		
		Stream<Integer> st1 = lista.stream().map(p -> p*10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Maria","Lucas","Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x+2);
		Stream<Integer> st4 = st3.limit(10);
		System.out.println(Arrays.toString(st4.toArray()));
		//System.out.println(Arrays.toString(st3.limit(10).toArray()));
	}

}
