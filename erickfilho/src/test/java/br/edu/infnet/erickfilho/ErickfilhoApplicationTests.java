package br.edu.infnet.erickfilho;

import br.edu.infnet.erickfilho.model.domain.Estudante;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ErickfilhoApplicationTests {
	private Estudante estudante;
	private final String nome = "Clara";
	private final int matricula = 12345;
	private final String curso = "História";

	@BeforeEach
	void setUp() {
		estudante = new Estudante();
		estudante.setNome(nome);
		estudante.setMatricula(matricula);
		estudante.setCurso(curso);
	}

	@Test
	void estudante16AnosPodeVotar() {
		estudante.setIdade(16);
        assertTrue(estudante.podeVotar());
	}

	@Test
	void estudante15AnosNaoPodeVotar() {
		estudante.setIdade(15);
        assertFalse(estudante.podeVotar());
	}

	@Test
	void estudante17AnosPodeVotar() {
		estudante.setIdade(17);
        assertTrue(estudante.podeVotar());
	}

}
