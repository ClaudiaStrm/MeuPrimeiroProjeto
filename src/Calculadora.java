
public class Calculadora {
	
	private int valor;
	
	public void somar(int valorUm, int valorDois){
		this.valor += (valorUm+valorDois); 
	}
	public void subtrair(){
	}
	public void multiplicar(int valorUm, int valorDois){
		this.valor = this.valor + (valorUm*valorDois);
	}
	public void dividir(){
	}
	public int getValor(){
	return valor;
	
	
	}

}
