package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClasseEspecialistaTest {

    @Test
    void deveRetornarExpRestante(){
        ClasseEspecialista especialista = new ClasseEspecialista();
        especialista.setExp(95);
        especialista.setExpNextLevel(100);
        assertEquals("Exp Necessário para upar: 5", especialista.verificarLvlUp());
    }

    @Test
    void deveRetornarLvlUpPendente(){
        ClasseEspecialista especialista = new ClasseEspecialista();
        especialista.setExp(105);
        especialista.setExpNextLevel(100);
        assertEquals("Level Up Pendente", especialista.verificarLvlUp());
    }

    @Test
    void deveRetornarInfo(){
        ClasseEspecialista especialista = new ClasseEspecialista();
        especialista.setExp(95);
        especialista.setExpNextLevel(100);
        especialista.setNome("Mago");
        especialista.setMana(250);
        especialista.setNivel(7);
        assertEquals("Classe Especializada{personagem: Mago\nnivel: 7\nExp Necessário para upar: 5}/n", especialista.getInfo());
    }

}