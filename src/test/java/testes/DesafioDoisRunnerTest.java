package testes;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.RecordPage;

public class DesafioDoisRunnerTest {


    private final RecordPage recordPage = new RecordPage();
    private final HomePage homePage = new HomePage();

    @Test
    public void validarExclusaoDeUmItem() {
        recordPage.clicarVoltarAlista();
        homePage.fecharMensagem();
        homePage.preencherPesquisaNome();
        homePage.clickCheckBoxSelecionar();
        homePage.clickBotaoDelete();
        Assert.assertEquals("Are you sure that you want to delete this 1 item?", homePage.obterMensagemConfirmacao());
        homePage.clickConfirmaDelete();
        Assert.assertEquals("Your data has been successfully deleted from the database.", homePage.obterTextoConfirmacaoDelete());
    }
}
