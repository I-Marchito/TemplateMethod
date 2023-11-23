package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClasseVanillaTest {

    @Test
    void deveRetornarExpRestante(){
        ClasseVanilla vanilla = new ClasseVanilla();
        vanilla.setExp(95);
        vanilla.setExpNextLevel(100);
        assertEquals("Exp Necessário para upar: 5", vanilla.verificarLvlUp());
    }

    @Test
    void deveRetornarLvlUpPendente(){
        ClasseVanilla vanilla = new ClasseVanilla();
        vanilla.setExp(105);
        vanilla.setExpNextLevel(100);
        assertEquals("Level Up Pendente", vanilla.verificarLvlUp());
    }

    @Test
    void deveRetornarInfo(){
        ClasseVanilla vanilla = new ClasseVanilla();
        vanilla.setExp(95);
        vanilla.setExpNextLevel(100);
        vanilla.setNome("Mago");
        vanilla.setMana(250);
        vanilla.setNivel(7);
        assertEquals("Classe{personagem: Mago\nnivel: 7\nExp Necessário para upar: 5}/n", vanilla.getInfo());
    }

}