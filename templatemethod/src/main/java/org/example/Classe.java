package org.example;

public abstract class Classe {

    protected String nome;
    private int mana;
    private int nivel;
    private int exp;
    private int expNextLevel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getExpNextLevel() {
        return expNextLevel;
    }

    public void setExpNextLevel(int expNextLevel) {
        this.expNextLevel = expNextLevel;
    }

    public void levelUp (int nivel, int mana, int expNextLevel){
        this.nivel = nivel;
        this.mana = mana;
        this.expNextLevel = expNextLevel;
    }

    public abstract String verificarLvlUp();

    public String getArquetipo(){
        return "Classe";
    }

    public String getInfo(){
        return getArquetipo() + "{" +
                "personagem: " + this.nome + "\n" +
                "nivel: " + this.nivel + "\n" +
                this.verificarLvlUp() + "}/n";
    }
}