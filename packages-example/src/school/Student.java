package school;

public class Student{
	private String  name; 
	private String  cpf; 
	private String zipCode;
	
	public Student(String name, String cpf) {
		this.name = name; 
		this.cpf = cpf ;
	
	}
	
	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}
	
	public String zipCode() {
		return zipCode;
	}
	public void setZipCode(String newZipCode) {
		this.zipCode = newZipCode;
	}
	
}