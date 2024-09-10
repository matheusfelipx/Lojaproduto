package br.com.etec.model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Operacoes {
	@FXML
	private TextField txfUsuario;
	
	@FXML
	private PasswordField psfUsuario;
	
	@FXML
	private Button btnAcessar;
	
	@FXML
	private Button btnFechar;
	
	@FXML
	private Stage acpPalco;


	@FXML
	private void acessarConta(ActionEvent event) {
		
		String nomeUsuario;
		nomeUsuario = txfUsuario.getText();
		
		String senhaUsuario;
		senhaUsuario = psfUsuario.getText();
		
		if(nomeUsuario.isEmpty() || senhaUsuario.isEmpty()) {
			
			if(nomeUsuario.isEmpty()) {
				mostrarMensagem(Alert.AlertType.WARNING, "FALTANDO DADOS", "SEM USUARIO OU SENHA");
	
			}else {
				if(senhaUsuario.isEmpty()){
				mostrarMensagem(Alert.AlertType.WARNING, "FALTANDO DADOS", "SEM USUARIO OU SENHA");
			}
			
			}
		} // if
		
		else {
			if(nomeUsuario.equals("admin") && senhaUsuario.equals("123456")) {
				mostrarMensagem(Alert.AlertType.CONFIRMATION, "ACESSO PERMITIDO", "LOGADO COM SUCESSO!");
				
			}
			else {
				mostrarMensagem(Alert.AlertType.ERROR,"ERRO DE ACESSO", "Usuario ou senha errado");
			}
		}
		
	} // acessarConta
	//--------------------------------------------------------
	
	private void mostrarMensagem(Alert.AlertType tipo, String titulo, String mensagem) {
		Alert alerta = new Alert(tipo);
		alerta.setTitle(titulo);
		alerta.setHeaderText(null);
		alerta.setContentText(mensagem);
		alerta.showAndWait();
	}
	
	@FXML
	private void fecharTelaLogin(ActionEvent event) {
		acpPalco = (Stage) btnFechar.getScene().getWindow();
		acpPalco.close();
	}
	
}

