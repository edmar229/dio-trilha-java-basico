import phone.IPhone;

public class Usuario {
  public static void main(String[] args) {
    IPhone meuNovoSmartphone = new IPhone();

    meuNovoSmartphone.ligar("0800");
    meuNovoSmartphone.selecionarMusica("Parabéns para voce");
    meuNovoSmartphone.exibirPagina("www.google.com");
  }
}
