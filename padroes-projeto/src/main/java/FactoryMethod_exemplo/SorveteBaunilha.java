package FactoryMethod_exemplo;


public class SorveteBaunilha implements ISorvete {

    public String preparar() {
        return "Sorvete de Baunilha preparado";
    }

    public String cancelar() {
        return "Sorvete de Baunilha cancelado";
    }
}
