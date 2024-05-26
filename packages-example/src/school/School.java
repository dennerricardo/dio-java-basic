package school;

public class School {
	public static void main(String[] args) {
		Student denner = new Student("DENNER","34323");
		denner.setZipCode("VIOLETA FORMIGA");
		
		
		System.out.println("THE STUDENT "+ denner.getName() + " HAS "+ denner.getCpf() +" CPF "  );
	}
}
