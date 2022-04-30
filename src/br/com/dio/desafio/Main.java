package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Introdução ao Java");
        curso.setCargaHoraria(2);

        Mentoria m1 = new Mentoria();
        m1.setTitulo("Java");
        m1.setDescricao("Como aplicar melhores prática em java");
        m1.setData(LocalDate.now());

        Bootcamp b1 = new Bootcamp();
        b1.setNome("Java Developer");
        b1.setDescricao("Descrição Java Developer");
        b1.getConteudos().add(curso);
        b1.getConteudos().add(m1);

        Dev d1 = new Dev();
        d1.setNome("Eliene");
        d1.increverBootcamp(b1);
        d1.progredir();
        System.out.println("Conteúdos Inscritos " + d1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + d1.getConteudosConcluidos());

        Dev d2 = new Dev();
        d2.setNome("Martins");
        d2.increverBootcamp(b1);
        d2.progredir();
        System.out.println("Conteúdos Inscritos " + d2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + d2.getConteudosConcluidos());
    }
}
