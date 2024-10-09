import Interfaces.Navegador;
import Interfaces.ReprodutorMusical;
import Interfaces.Telefone;

public class Celular implements ReprodutorMusical, Telefone, Navegador {

    @Override
    public void tocar() {
        System.out.println("Tocando música!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música!");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atender...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio Voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina!");
    }
}
