package taller4Y5;
import java.time.LocalDate;
import java.time.Period;

public class diferenciaEntreDosAños {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate primeraFecha = LocalDate.of(2000, 3 , 1);
		LocalDate fechaActual = LocalDate.now();
		
		System.out.println("Primera fecha:" + primeraFecha );
		System.out.println("Fecha actual:"+ fechaActual);
		
		System.out.println();
		
		Period periodo= Period.between(primeraFecha,fechaActual);
		System.out.println("Diferencia en años es:"+ periodo.getYears());
		System.out.println("Diferencia en meses es:"+ periodo.getMonths());
		System.out.println("Diferencia en dias es:"+ periodo.getDays());
		
	}


	}


