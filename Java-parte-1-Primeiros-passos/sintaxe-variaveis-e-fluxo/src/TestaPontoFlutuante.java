
public class TestaPontoFlutuante {

	public static void main(String[] args) {
		  double salario;
		  salario = 1250.70;
		  System.out.println("meu salario é " + salario);
		  
		  double idade = 37;
		  
		  double divisao = idade/2;
		  System.out.println(divisao);
		  
		  double outraDivisao = 5/2; //isso vai dá 2,pq 5 e um int e 2 tbm e um int,então o java vai subentender que tudo é int,estanho,mas fazer oq ne
		  System.out.println(outraDivisao);
		  
		  double novaTentativa = 5.0 / 2; //agora vai dá bom,pq? bem pq 5.0 é um double,só por conta o java ja vai assumir que a conta vai resultar num double
		  System.out.println(novaTentativa);
		  
	}

}
