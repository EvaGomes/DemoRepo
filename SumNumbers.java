import java.util.Scanner;


/**
 * Resolu��o do exerc�cio 1 do Laborat�rio 07 - Git e GitHub; devolve a soma de
 * dois n�meros decimais introduzidos pelo utilizador.
 * 
 * @author Eva G
 * @version 1.0 (09/Oct/2014)
 */

public class SumNumbers
{

	public static void main( String[] args )
	{
		Scanner kb = new Scanner( System.in );
		System.out.print( "Digite dois n�meros: " );
		double num1 = kb.nextDouble(), num2 = kb.nextDouble();
		System.out.println( num1 + "+" + num2 + "=" + sum( num1, num2 ) );
	}

	static double sum( double n1, double n2 )
	{
		return n1 + n2;
	}

}
