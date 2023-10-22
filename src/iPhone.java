public class iPhone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {
    public static void main(String[] args){
        iPhone meuIphone = new iPhone();
        meuIphone.tocar();
        meuIphone.adicionarAba();
        meuIphone.atualizarPagina();
        meuIphone.exibirPagina();
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música na Apple Music");
    }

    @Override
    public void pausar() {
         System.out.println("Pause");
      
    }

    @Override
    public void selecionarMusica() {
         System.out.println("Select music");
    }

    @Override
    public void exibirPagina() {
         System.out.println("View page");
    }

    @Override
    public void adicionarAba() {
         System.out.println("Add page tab");
    }

    @Override
    public void atualizarPagina() {
         System.out.println("Refresh page");
    }

    @Override
    public void ligar() {
          System.out.println("Call");
    }

    @Override
    public void atender() {
        System.out.println("Take the call");
    }

    @Override
    public void iniciarCorreioVoz() {
         System.out.println("Voicemail");
    }
 
}
   

