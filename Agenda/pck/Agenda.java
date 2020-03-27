package pck;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> listaContatos;

    public Agenda() {
        listaContatos = new ArrayList<Contato>();
    }

    public boolean addContato(Contato novoContato) {
    	if(novoContato != null) {
    		listaContatos.add(novoContato);
    		return true;
    	} else {
    		return false;
    	}
    }

    public void exibirContatos() {
        for(Contato contato: listaContatos) {
                contato.mostrarInformacoes();
                System.out.println("=================");
        }
    }
}