package testes;

import facade.RecordFacade;
import helpers.HelperDriver;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.HomePage;
import pages.RecordPage;

public class DesafioUmRunnerTest {

    private final HomePage homePage = new HomePage();
    private final RecordFacade recordFacade = new RecordFacade();
    private final RecordPage recordPage = new RecordPage();



    @Test
    public void validarAdicionandoUmNovoEndereco(){
      homePage.escolherItemComboBox();
      homePage.clickBotao();
      recordFacade.preencherDadosFormulario();
      Assert.assertEquals("Your data has been successfully stored into the database. Edit Record or Go back to list", recordPage.obterMensagemSucesso());
    }
}
