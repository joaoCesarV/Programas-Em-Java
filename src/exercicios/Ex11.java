package exercicios;

import java.util.StringJoiner;

public class Ex11 {
	public static void main(String[] args) {
		
		StringJoiner sj = new StringJoiner("*");
		String s = "";
		for(int i = 0; i < 5; i++ ) {
			s += "*"; 
			System.out.println(s);
		}
		
	}

}
