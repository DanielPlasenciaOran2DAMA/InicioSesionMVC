package dad.javafx.responsive;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class InicioView extends VBox {

	private TextField usuarioText;
	private PasswordField contraseñaText;
	private Button accederButton, cancelarButton;

	public InicioView() {
		super();

		usuarioText = new TextField();
		usuarioText.setPromptText("Usuario");

		contraseñaText = new PasswordField();
		contraseñaText.setPromptText("Contraseña");

		accederButton = new Button("Acceder");
		accederButton.setDefaultButton(true);
		cancelarButton = new Button("Cancelar");

		HBox botonHbox = new HBox(5, accederButton, cancelarButton);
		botonHbox.setAlignment(Pos.BASELINE_CENTER);

		GridPane grid = new GridPane();
		grid.setHgap(40);
		grid.setVgap(15);
		grid.setPadding(new Insets(15));
		grid.setAlignment(Pos.BASELINE_CENTER);

		grid.addRow(0, new Label("Usuario: "), usuarioText);
		grid.addRow(1, new Label("Contraseña: "), contraseñaText);

		this.setPadding(new Insets(15));
		this.setAlignment(Pos.CENTER);
		this.getChildren().addAll(grid, botonHbox);
	}

	public TextField getUsuarioText() {
		return usuarioText;
	}

	public PasswordField getPasswordText() {
		return contraseñaText;
	}

	public Button getAccederButton() {
		return accederButton;
	}

	public Button getCancelarButton() {
		return cancelarButton;
	}

}
