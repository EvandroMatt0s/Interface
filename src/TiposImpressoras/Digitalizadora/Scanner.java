package TiposImpressoras.Digitalizadora;

import TiposImpressoras.Digitalizadora.Digitalizadora;

public class Scanner implements Digitalizadora {

    @Override
    public void digitalizar() {
        System.out.println("Digitaliando");
    }
}
