package school;

public class IbgeSystem {
	public static void main(String[] args) {
		for (BrazilianState uf: BrazilianState.values()) {
			System.out.println(uf.getSign()+ "-"+ uf.getUpperName());
		}
		
		BrazilianState selectedUf = BrazilianState.PARAIBA;
		
		System.out.println("The selected state was: "+ selectedUf.getName() +"-"+ selectedUf.getSign());
		System.out.println( selectedUf.getUpperName() +"-"+ selectedUf.getIbge());
	}
}
