package Model;

public class SubjectModel {

    private String nome;
    private String genero;
    private String estadoCivil;

    public SubjectModel() {
    }

    public SubjectModel(String genero, String nome, String estadoCivil) {
        this.nome = nome;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String gender) {
        this.genero = gender;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = name;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Subjetc{"
                + "Nome: " + nome + "\n"
                + "Gênero: " + genero + "\n"
                + "Estado Civil: " + estadoCivil + "\n"
                + '}';
    }
}
