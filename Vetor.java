import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos =new Aluno[100];
    private int totalAlunos=0;
    
    public void adiciona(Aluno aluno){
        //TO DO add fim
        /*for(int c=0; c<alunos.length; c++){
            if(this.alunos[c]==null){
                this.alunos[c]= aluno;
            }
        }*/
        this.alunos[totalAlunos]=aluno;
        this.totalAlunos++;
    }

    public void adiciona(int posicao, Aluno aluno){
        //TO DO add posição
        System.out.print(verificar(posicao) ?  this.alunos[posicao] = aluno : "Já eraa");
        verificar(posicao);
        this.alunos[posicao]=aluno;
    }

    public Aluno pega(int posicao){
        //TO DO pega a posição
        verificar(posicao);
        return alunos[posicao];
    }

    public void remove(int posicao){
        //TO DO remove um aluno da posição
        verificar(posicao);
        alunos[posicao]=null;
    }

    public boolean contem(Aluno aluno){
        //TO DO retorna se o aluno está na lista
       int controle =0;       
        for (Aluno pessoa : alunos) {
            if(pessoa.equals(aluno)){
                controle = 1;
            }
            break;
        }
        if(controle==0){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(alunos);
    }

    public boolean verificar(int posicao){
        if(posicao>0 && posicao<alunos.length-1){
            return true;
        }else{
            throw new IllegalStateException("Posição inválida");
        }
    }
}
