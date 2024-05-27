
public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando do meu Iphone para: "+numero);
	}
	@Override
	public void atender() {
		System.out.println("Iphone: atendeu");
	}
	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iphone: correio de voz");	
	}
	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Iphone: Tocando "+musica);
	}
	@Override
	public void pausar() {
		System.out.println("Iphone: pausar");
	}
	@Override
	public void tocar() {
		System.out.println("Iphone: tocar");
	}
	@Override
	public void exibirPagina(String URL) {
		System.out.println("Iphone: SURFANDO NA WEB: "+URL);
	}
	@Override
	public void adicionarNovaAba() {
		System.out.println("Iphone: Nova Aba");
	}
	@Override
	public void atualizarPagina() {
		System.out.println("Iphone: Pagina Atualizada");
	}

}
