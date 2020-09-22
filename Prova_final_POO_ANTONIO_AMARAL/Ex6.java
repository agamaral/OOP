//Exercício 6 da prova final de POO por Antônio Augusto Zamai Amaral
public class Ex6 {
    private static String inverterTexto(String s1) {
        String s2 = "";

        for (int i = s1.length() - 1; 0 <= i; i--) {
            s2 += s1.charAt(i);
        }
        return s2;
    }
	public static void main(String[] args) {
        String s1 = "Antonio";
        String s2 = "Ricardo";
        String s3 = "Java";
        System.out.println(inverterTexto(s1));
        System.out.println(inverterTexto(s2));
        System.out.println(inverterTexto(s3));
	}

}
