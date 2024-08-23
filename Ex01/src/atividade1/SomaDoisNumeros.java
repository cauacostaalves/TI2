package atividade1;
import java.util.*;
public class SomaDoisNumeros {
	public static void main(String Args[]) {
		Scanner sc = new Scanner(System.in);
		int x=0;
		int y=0;
		int soma=0;
		x = sc.nextInt();
		y = sc.nextInt();
		soma = x + y;
		System.out.print("soma: " + soma);
		sc.close();
	}
}
