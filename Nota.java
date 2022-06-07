public class Nota extends Aluno {

    public static void main(String[] args) {

        Aluno lorena = new Aluno();
        lorena.setNome("Lorena Lima Pereira");
        System.out.println(lorena.getNome());
        lorena.getStatus(7.0, 8.0, 9.0);

    }
}
