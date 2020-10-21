
public class TestaSomatoria {
	public static void main(String[] args) {
		
		int contador = 0;
		int total = 0;
		
		while(contador <= 10) {
			
			//int total = 0;
			//aqui o while iria cria em cada laço uma nova variável
			
			//total = total + contador;
			total += contador;
			
			System.out.println(total);
			contador++;
			
		}
		System.out.println(total);
		
	}

}
