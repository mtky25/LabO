import java.lang.Math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


class musicaTest { 

    private final Busca busca = new Busca();

    @Test
    @DisplayName("Testa busca por Titulo, Intérprete e Compositor")

    void testaBusca(){
        assertEquals("Everlong", busca.buscaCompositor(null, "Foo Fighters"));
    }
}

