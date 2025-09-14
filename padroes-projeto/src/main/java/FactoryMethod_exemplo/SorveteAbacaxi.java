package FactoryMethod_exemplo;

public class SorveteAbacaxi {

    public String preparar() {
        return "Sorvete de Abacaxi preparado";
    }

    public String cancelar() {
        return "Sorvete de Abacaxi cancelado";
    }
}

// CLASSE CRIADA PARA FAZER O TESTE = SABOR INVALIDO: A CLASSE 'SORVETE ABACAXI' EXISTE MAS NÃO IMPLEMENTA
// A INTERFACE ISORVETE!

