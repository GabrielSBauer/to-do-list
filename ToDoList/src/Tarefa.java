public class Tarefa {

    private String titulo;
    private boolean estaConcluida;

    public Tarefa(String titulo) {
        this.titulo = titulo;
        this.estaConcluida = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isConcluida() {
        return estaConcluida;
    }

    public void marcarComoConcluida() {
        this.estaConcluida = true;
    }

    @Override
    public String toString() {
        return titulo + (estaConcluida ? "[concluida]" : "[n concluida]"); //tem como concatenar assim mula
    }

}
