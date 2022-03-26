package pages;

import helpers.HelperWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webdriver.Driver;

public class HomePage extends BasePage {

    @FindBy(id = "switch-version-select")
    private WebElement comboBox;

    @FindBy(xpath = "//*[@href='/v1.x/demo/my_boss_is_in_a_hurry/bootstrap-v4/add']")
    private WebElement botaoRecord;

    @FindBy(xpath = "//*[@placeholder='Search CustomerName']")
    private WebElement pesquisaNome;

    @FindBy(xpath = "//*[@id='gcrud-search-form']//tr[1]//input")
    private WebElement checkBoxSelecionar;

    @FindBy(className = "delete-selected-button")
    private WebElement delete;

    @FindBy(className = "alert-delete-multiple-one")
    private WebElement mensagemConfirmarDelete;

    @FindBy(className = "delete-multiple-confirmation-button")
    private WebElement confirmacaoDelete;

    @FindBy(xpath = "//*[@data-growl='message']")
    private WebElement textoConfirmacaoDelete;

    @FindBy(xpath = "//div[3]/button/span[1]")
    public WebElement fecharMensagem;

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void escolherItemComboBox() {
        super.escolherItemComboBox("Bootstrap V4 Theme", comboBox);
    }

    public void clickBotao() {
        super.clickBotao(botaoRecord);
    }

    public void preencherPesquisaNome(){
        HelperWait.waitPresenceOfElement(pesquisaNome, 10);
        super.preencherCampoTexto("Teste Sicredi", pesquisaNome);
    }

    public void clickCheckBoxSelecionar(){
        super.clickBotao(checkBoxSelecionar);
    }

    public void clickBotaoDelete(){
        HelperWait.waitPresenceOfElement(delete,10);
        super.clickBotao(delete);
    }

    public String obterMensagemConfirmacao(){
        return super.obterMensagem(mensagemConfirmarDelete);
    }

    public void clickConfirmaDelete(){
        super.clickBotao(confirmacaoDelete);
    }

    public String obterTextoConfirmacaoDelete(){
        HelperWait.waitPresenceOfElement(textoConfirmacaoDelete, 10);
        return super.obterMensagem(textoConfirmacaoDelete);
    }
    public void fecharMensagem(){
        HelperWait.waitPresenceOfElement(fecharMensagem, 10);
        super.clickBotao(fecharMensagem);
    }
}
