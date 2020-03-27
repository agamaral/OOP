package pck;

public class Main {
    public static void main(String args[]) {

        Contato tonis = new Contato("Antonio","am4r4u@gmail.com","19999158977");
        Contato ricks = new Contato("Ricardo","ricardo.ramos@ifsuldeminas.edu.br","3599912190");
        
        Agenda agendaPablo = new Agenda();
        
        agendaPablo.addContato(ricks);
        agendaPablo.addContato(tonis);
        
        agendaPablo.exibirContatos();
    }
}