package facade;

import pages.RecordPage;

public class RecordFacade {

    RecordPage recordPage = new RecordPage();

    public void preencherDadosFormulario(){

         recordPage.preencherNome();
         recordPage.preencherUltimoNome();
         recordPage.preencherPrimeirNome();
         recordPage.preencherTelefone();
         recordPage.preencherPrimeiroEndereco();
         recordPage.preencherSegundoEndereco();
         recordPage.preencherCidade();
         recordPage.preencherEstado();
         recordPage.preencherCodigoPostal();
         recordPage.preencherPais();
         recordPage.preencherEmprego();
         recordPage.preencherLimiteCredito();
         recordPage.clicarEmSalvar();
    }
}
