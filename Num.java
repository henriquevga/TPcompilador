/*
    Trabalho   -  Compilador
    Alunos     -  Vitor Brandao Raposo & Fernando Faria Soares 
    Professora -  Kecia Marques Ferreira
*/

package Entrega02;

public class Num extends Token {
    public final int value;

    public Num(int value) {
        super(Tag.NUM);
        this.value = value;
    }

    public String toString() {
        return "" + value;
    }
}
