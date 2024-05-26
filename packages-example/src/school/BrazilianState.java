package school;

public enum BrazilianState {
	SAO_PAULO ("SP","São Paulo",11),
	PARAIBA ("PB","Paraíba",83),
	PERNAMBUCO ("PE","Pernambuco",84),
	PIAUI ("PI","Piauí",86),
	CEARA ("CE","Ceará",89)
	;
	
	private String name;
	private String sign;
	private int ibge;
	
	private BrazilianState(String sign, String name,int ibge) {
		this.sign = sign; 
		this.name = name;
		this.ibge = ibge;
	}

	public String getSign() {
		return sign;
	}
	
	public String getName() {
		return name;
	}
	
	public int getIbge() {
		return ibge;
	}

	public String getUpperName() {
		return name.toUpperCase();
	}
	
	
	
	
}
