public class Aluno {
    private String nome;
    private int idade;
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;
    private String status = "aprovado!";

    //name
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //age
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //note1
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    //note2
    public double getNote2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    //note3
    public double getNota3() {
        return nota3;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    //media

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    //status

    public String getStatus(double nota1, double nota2, double nota3) {
        double media;
        if((nota1 + nota2 + nota3)/3 >= 7){
            return status;
        }
            return null;
    }


    public void setStatus(String status) {
        this.status = status;
    }
}

