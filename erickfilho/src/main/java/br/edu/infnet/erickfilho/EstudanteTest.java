package br.edu.infnet.erickfilho;

import br.edu.infnet.erickfilho.model.domain.Estudante;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class EstudanteTest implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception{
        // Instanciando um estudante
        Estudante estudante1 = new Estudante();

        // Atribuindo valores ao estudante
        estudante1.setNome("Clara");
        estudante1.setIdade(16);
        estudante1.setCurso("História");
        estudante1.setMatricula(12345);


        // Acessando informações do estudante
        System.out.println(estudante1.getInfo());

        // Alterando o curso do estudante
        estudante1.setCurso("Física");

        // Acessando informações atualizadas do estudante
        System.out.println(estudante1.getInfo());

        // Verificando se o estudante pode votar
        if (estudante1.podeVotar()) {
            System.out.println(estudante1.getNome() + " pode votar.");
        } else {
            System.out.println(estudante1.getNome() + " ainda não pode votar.");
        }
    }
}
