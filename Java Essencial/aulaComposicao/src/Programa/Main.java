package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Departamento;
import entidades.HoraContrato;
import entidades.Trabalhador;
import entidades.enumeracao.Nivel;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o departamento: ");
		String departamento1 = sc.nextLine();
		System.out.print("Nome do Trabalhador: ");
		String nomeTrabalhador= sc.nextLine();
		System.out.print("Experiência: ");
		String experiencia = sc.nextLine();
		System.out.print("Salário: ");
		Double salarioTrabalhador = sc.nextDouble();
		
		Trabalhador t1 = new Trabalhador(nomeTrabalhador,Nivel.valueOf(experiencia) , 
				salarioTrabalhador, new Departamento(departamento1));
		
		System.out.print("Quantos contratos são: ");
		int n = sc.nextInt();
		
		for ( int i = 1; i<=n;i++) {
			System.out.println("Qual a data do contrato "+i+ " ? (dd/MM/yyyy)");
			Date dataContrato = sdf.parse(sc.next());
			
			System.out.println("Qual o valor por hora do contrato "+i+" ?");
			float valor = sc.nextFloat();
			
			System.out.println("Qual duração do contrato"+i+" em horas? ");
			Integer horas = sc.nextInt();
			
			HoraContrato contrato = new HoraContrato(dataContrato, valor, horas);
			t1.addContrato(contrato);
		}
		
		System.out.print("Qual mês e ano o salário será calculado? (MM/yyyy) ");
		String mes_ano = sc.next();
		int mes = Integer.parseInt(mes_ano.substring(0,2));
		int ano = Integer.parseInt(mes_ano.substring(3));
		
		System.out.println("Nome: "+ t1.getNomeTrabalhador());
		System.out.println("Departamento: "+ t1.getDepartamento().getNome());
		System.out.println("Salário do mês "+mes_ano+" : "+ t1.salarioMes(ano, mes));
		
		sc.close();
	}

}
