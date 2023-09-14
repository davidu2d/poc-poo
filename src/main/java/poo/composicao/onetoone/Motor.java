package poo.composicao.onetoone;

public class Motor {

    final Carro carro;

    Motor(Carro carro) {
        this.carro = carro;
    }
    boolean ligado = false;
    double fatorInjecao = 1;

    int giros() {
        if(ligado)
            return (int) Math.round(fatorInjecao * 3000);
        return 0;
    }
}
