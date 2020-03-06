package pck;

public class Agenda {
    private Contato contatos[];

    public Agenda(int tamanho) {
        contatos = new Contato[tamanho];
    }

    public boolean addContato(Contato novoContato) {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = novoContato;
                return true;
            }
        }
        return false;
    }

    public void exibirContato() {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                System.out.println("Número do contato " + i);
                contatos[i].mostrarInformacoes();
                System.out.println("=================");
            }
        }
    }
}