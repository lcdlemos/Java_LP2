package prova4;

public class Idoso extends Passageiro{
		
		public Idoso(double valor, String lugar, int idade){
			super(valor, lugar, idade);
		}
		
		//Getters
		@Override
		public double getValor() {
			return super.getValor()*0.7;
		}
		
		//Métodos
		@Override
		public String toString() {
			return super.toString() + " - Valor Idoso: R$ " + this.getValor();
		}
}
