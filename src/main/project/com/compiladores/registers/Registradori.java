package project.com.compiladores.registers;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Registradori {
    private int proximaInstrucao;

    public void incrementa() {
        proximaInstrucao++;
    }
}
