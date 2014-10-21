import ponto.model.Empresa;
import ponto.model.Endereco;

import java.util.ArrayList;

/**
 * Created by Ton on 21/10/2014.
 */
public class TesteEmpresa {

    public void testaEmpresa() {

        Empresa nova = new Empresa();

        nova.setNome("Empresa teste");
        nova.setCnpj("11111111111111");
        nova.setInscricaoEstadual("isento");

        ArrayList<Endereco> enderecos = new ArrayList<Endereco>();

        Endereco e1 = new Endereco();
        e1.setLogradouro(" rua legal");
        e1.setCEP("870606156");
        e1.setBairro("Centro");
        e1.setCidade("Maringa");
        e1.setEstado("Pr");
        e1.setNumero("111");

        enderecos.add(e1);

        nova.setEnderecoList(enderecos);




    }
}
