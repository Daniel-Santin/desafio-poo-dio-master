import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(2);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java POO");
        curso2.setDescricao("Descrição do Curso Java POO");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devDaniel.getNome() + " :" + devDaniel.getConteudosInscritos());
        devDaniel.progredir();
        System.out.println("--------");
        System.out.println("Conteúdos inscritos " + devDaniel.getNome() + " :" + devDaniel.getConteudosInscritos());
        devDaniel.progredir();
        System.out.println("--------");
        System.out.println("Conteúdos concluidos " + devDaniel.getNome() + " :" + devDaniel.getConteudosConcluidos());
        System.out.println("XP:" + devDaniel.calcularTotalXp());





        System.out.println("-----");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devJoao.getNome() + " :" + devJoao.getConteudosInscritos());
        System.out.println("--------");
        devJoao.progredir();
        System.out.println("Conteúdos inscritos " + devJoao.getNome() + " :" + devJoao.getConteudosInscritos());
        System.out.println("--------");
        devJoao.progredir();
        System.out.println("Conteúdos concluidos " + devJoao.getNome() + " :" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
        
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        System.out.println(bootcamp);
    }

}
