package FactoryMethod_exemplo;

public class SorveteFactory {

    public static ISorvete obterSorvete(String sabor) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("FactoryMethod_exemplo.Sorvete" + sabor);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Sabor inexistente");
        }
        if (!(objeto instanceof ISorvete)) {
            throw new IllegalArgumentException("Sorvete inválido");
        }
        return (ISorvete) objeto;
    }
}
