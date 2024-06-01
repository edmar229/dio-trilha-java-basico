package phone;
import applications.AparelhoTelefonico;
import applications.Navegador;
import applications.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, Navegador{
  public void tocar() {
    System.out.println("TOCANDO MUSICA");
  }

  public void pausar() {
    System.out.println("MUSICA PAUSADA");
  }

  public void selecionarMusica(String musica) {
    System.out.println("REPRODUZINDO: " + musica);
  }

  public void ligar(String numero) {
    System.out.println("LIGANDO PARA: " + numero);
  }

  public void atender() {
    System.out.println("ATENDENDO");
  }

  public void iniciarCorreioVoz() {
    System.out.println("ABRINDO CORREIO DE VOZ");
  }

  public void exibirPagina(String url) {
    System.out.println("CARREGANDO O SITE " + url);
  }

  public void adicionarNovaAba() {
    System.out.println("NOVA ABA ABERTA");
  }

  public void atualizarPagina() {
    System.out.println("ATUALIZANDO");
  }

}
