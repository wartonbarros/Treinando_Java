
public class TestaCondicional2 {
	
	public static void main(String[] args) {
		
		System.out.println("testando condicionais");
		
		int idade = 18;
		int quantidadePessoas = 1;
		//boolean acompanhado = false;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		
		//if (idade >= 18 && quantidadePessoas >= 2) {
		if (idade >= 18 && acompanhado == true) {
			// || = OR
			// && = E
			System.out.println("Seja bem vindo!");
			
		} else {
				
			System.out.println("Infelizmente você não pode entrar!");
		}
		
	}

}
