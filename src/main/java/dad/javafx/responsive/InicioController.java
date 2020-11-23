package dad.javafx.responsive;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import org.apache.commons.codec.digest.DigestUtils;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class InicioController {

	private InicioModel model = new InicioModel();
	private InicioView view = new InicioView();
	private Stage primaryStage;

	private ArrayList<String> usuarioArray = new ArrayList<>();
	private ArrayList<String> contrase�aArray = new ArrayList<>();

	public InicioController(Stage primaryStage) {
		this.primaryStage = primaryStage;

		model.usuarioProperty().bind(view.getUsuarioText().textProperty());
		model.contrase�aProperty().bind(view.getContrase�aText().textProperty());

		view.getAccederButton().setOnAction(e -> onAccederButton(e));
		view.getCancelarButton().setOnAction(e -> onCancelarButton(e));
	}

	public InicioView getView() {
		return view;
	}

	private void onAccederButton(ActionEvent e) {
		archivoCSV();
		String md5 = DigestUtils.md5Hex(model.getContrase�a()).toUpperCase();
		if (usuarioArray.contains(model.getUsuario()) && contrase�aArray.contains(md5)) {
			Alert infoAlert = new Alert(AlertType.INFORMATION);
			infoAlert.setTitle("Iniciar sesi�n");
			infoAlert.setHeaderText("Acceso permitido");
			infoAlert.setContentText("Las credenciales de acceso son v�lidas.");

			infoAlert.showAndWait();
		} else {
			Alert errorAlert = new Alert(AlertType.ERROR);
			errorAlert.setTitle("Iniciar sesi�n");
			errorAlert.setHeaderText("Acceso denegado");
			errorAlert.setContentText("El usuario y/o la contrase�a no son v�lidos.");

			errorAlert.showAndWait();
		}
	}

	private void archivoCSV() {
		URL url = getClass().getResource("csv/users.csv");
		String separador = ",";

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(url.getFile()));

			String line;
			while ((line = br.readLine()) != null) {
				String[] datos = line.split(separador, -1);
				usuarioArray.add(datos[0]);
				contrase�aArray.add(datos[1]);
			}

			br.close();
		} catch (IOException e1) {
			System.err.println(e1.getMessage());
		}

	}

	public void onCancelarButton(ActionEvent e) {
		primaryStage.close();
	}
}
