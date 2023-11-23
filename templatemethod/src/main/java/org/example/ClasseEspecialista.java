package org.example;

public class ClasseEspecialista extends Classe{

    @Override
    public String verificarLvlUp() {
        if((this.getExpNextLevel() - this.getExp()) > 0){
            int expNecessario = this.getExpNextLevel() - this.getExp();
            return "Exp Necessário para upar: " + expNecessario;
        }
        else{
            return "Level Up Pendente";
        }
    }

    @Override
    public String getArquetipo(){
        return "Classe Especializada";
    }
}
