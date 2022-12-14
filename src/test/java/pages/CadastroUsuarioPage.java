package pages;

import org.openqa.selenium.By;
import runner.RunCucumber;

import static support.Commands.*;

public class CadastroUsuarioPage extends RunCucumber {

    // elementos
    private By campoNome = By.id("user");
    private By campoEmail = By.id("email");
    private By campoSenha = By.id("password");
    private By botaoFazerCadastro= By.xpath("//*[@id=\"btnRegister\"]");

    // Ações / Funções / Métodos
    public void preencheNome(String nome){
         fillField(campoNome, nome);
    }
    public void preencheEmail(String email){
         fillField(campoEmail, email);
    }

    public void preencherSenha(String senha){
        fillField(campoSenha, senha);
    }

    public void cadastrarUsuario(){
        clickElement(botaoFazerCadastro);
    }

    public void verificaCadastroSucesso(){
        checkMessage(By.id("swal2-title"), "Cadastro realizado!");
    }
}
