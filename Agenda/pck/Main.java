package pck;

public class Main {
    public static void main(String args[]) {
        //Vector<Contato> contatos = new Vector<Contato>(30);
        Contato antonio = new Contato("antonio","am4r4u@gmail.com","19999158977");
        Contato ricardo = new Contato("ricardo","blabla","99912190");
        Agenda agendaPablo = new Agenda(365);

        agendaPablo.addContato(ricardo);
        agendaPablo.exibirContato();

        agendaPablo.addContato(antonio);
        agendaPablo.exibirContato();
    }
}