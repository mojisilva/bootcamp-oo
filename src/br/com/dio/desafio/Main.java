package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTítulo("Java");
        curso.setDescricao("Introdução ao Java");
        curso.setCargaHoraria(2);
        System.out.println(curso);

        Mentoria m1 = new Mentoria();
        m1.setTitulo("Java");
        m1.setDescricao("Como aplicar melhores prática em java");
        m1.setData(LocalDate.now());

        System.out.println(m1);
    }
}
