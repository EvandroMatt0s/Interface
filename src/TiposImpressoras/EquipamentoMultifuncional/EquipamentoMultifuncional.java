package TiposImpressoras.EquipamentoMultifuncional;

import TiposImpressoras.Copiadora.Copiadora;
import TiposImpressoras.Digitalizadora.Digitalizadora;
import TiposImpressoras.Impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("Copiando Via Euipamento  Multifuncional");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitaliando Via Euipamento  Multifuncional");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo Via Euipamento  Multifuncional");
    }
}
