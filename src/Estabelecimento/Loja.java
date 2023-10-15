package Estabelecimento;

import TiposImpressoras.Copiadora.Copiadora;
import TiposImpressoras.Digitalizadora.Digitalizadora;
import TiposImpressoras.EquipamentoMultifuncional.EquipamentoMultifuncional;
import TiposImpressoras.Impressora.Impressora;

public class Loja {
    public static void main(String[] args) {

        EquipamentoMultifuncional em =  new EquipamentoMultifuncional();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();



    }
}
