import  java .time.LocalDateTime;

//Atributos
public class Task {
    private int id;
    private String descricao;
    private  boolean concluida;
    private LocalDateTime dataCriacao;

    public Task (int id, String descricao){
        this.id = id;
        this.descricao = descricao;
        this.concluida = false;
        this.dataCriacao = LocalDateTime.now();
    }

    //Getters and Setters
    public int getId(){return id;}
    public String getDescricao(){return descricao;}
    public boolean isConcluida(){return concluida;}
    public LocalDateTime getDataCriacao (){return dataCriacao;}

    public void setConcluida(boolean concluida){
        this.concluida = concluida;
    }
}


