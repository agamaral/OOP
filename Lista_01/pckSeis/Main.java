import java.util.Scanner;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da cruzadinha a ser respondida:")
        int res = sc.nextInt();

        for ( int i = 0; i < 4 ; i++) {
            if ( res == 1 ) {
                System.out.println("Classe");
            } else if (res == 2 ){
                System.out.println("String");
            } else if ( res == 3 ) {
                System.out.println("Atributos");
            } else if ( res == 4) {
                System.out.println("new");
            }
        }
        sc.close();
    }