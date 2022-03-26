package pages;

import helpers.HelperWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webdriver.Driver;

public class RecordPage extends BasePage {


    @FindBy(id = "field-customerName")
    private WebElement nome;

    @FindBy(id = "field-contactLastName")
    private WebElement ulitimoNome;

    @FindBy(id = "field-contactFirstName")
    private WebElement primeiroNome;

    @FindBy(id = "field-phone")
    private WebElement telefone;

    @FindBy(id = "field-addressLine1")
    private WebElement primeiroEndereco;

    @FindBy(id = "field-addressLine2")
    private WebElement segundoEndereco;

    @FindBy(id = "field-city")
    private WebElement cidade;

    @FindBy(id = "field-state")
    private WebElement estado;

    @FindBy(id = "field-postalCode")
    private WebElement codigoPostal;

    @FindBy(id = "field-country")
    private WebElement pais;

    @FindBy(id = "field-salesRepEmployeeNumber")
    private WebElement emprego;

    @FindBy(id = "field-creditLimit")
    private WebElement limiteCredito;

    @FindBy(id = "form-button-save")
    private WebElement salvarInformacao;

    @FindBy(id = "report-success")
    private WebElement mensagemSucesso;

    @FindBy(id = "save-and-go-back-button")
    private WebElement voltarLista;


    public RecordPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void preencherNome() {
        super.preencherCampoTexto("Teste Sicredi", this.nome);
    }

    public void preencherUltimoNome() {
        super.preencherCampoTexto("Teste", ulitimoNome);
    }

    public void preencherPrimeirNome() {
        super.preencherCampoTexto("Vinicius", primeiroNome);
    }

    public void preencherTelefone() {
        super.preencherCampoTexto("51 9999-9999", telefone);
    }

    public void preencherPrimeiroEndereco() {
        super.preencherCampoTexto("Av Assis Brasil, 3970", primeiroEndereco);
    }

    public void preencherSegundoEndereco() {
        super.preencherCampoTexto("Torre D", segundoEndereco);
    }

    public void preencherCidade() {
        super.preencherCampoTexto("Porto Alegre", cidade);
    }

    public void preencherEstado() {
        super.preencherCampoTexto("RS", estado);
    }

    public void preencherCodigoPostal() {
        super.preencherCampoTexto("91000-000", codigoPostal);
    }

    public void preencherPais() {
        super.preencherCampoTexto("Brasil", pais);
    }

    public void preencherEmprego() {
        super.preencherCampoTexto("123", emprego);
    }

    public void preencherLimiteCredito() {
        super.preencherCampoTexto("200", limiteCredito);
    }

    public void clicarEmSalvar() {
        super.clickBotao(salvarInformacao);
    }

    public String obterMensagemSucesso() {
        HelperWait.waitPresenceOfElementLocated(mensagemSucesso, 10, "Your data has been successfully stored into the database. Edit Record or Go back to list");
        return super.obterMensagem(mensagemSucesso);
    }

    public void clicarVoltarAlista(){
        super.clickBotao(voltarLista);
    }
}


