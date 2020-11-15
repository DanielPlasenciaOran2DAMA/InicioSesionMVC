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
		usuarioText.setPrefColumnCount(5);

		contraseñaText = new PasswordField();
		contraseñaText.setPrefColumnCount(5);

		accederButton = new Button("Acceder");
		accederButton.setDefaultButton(true);
		cancelarButton = new Button("Cancelar");

		GridPane introduceDatosGrid = new GridPane();
		introduceDatosGrid.setHgap(5);
		introduceDatosGrid.setVgap(5);
		introduceDatosGrid.setPadding(new Insets(15));
		introduceDatosGrid.setAlignment(Pos.BASELINE_CENTER);
		introduceDatosGrid.addRow(0, new Label("Usuario: "), usuarioText);
		introduceDatosGrid.addRow(1, new Label("Contraseña: "), contraseñaText);

		HBox botonesBox = new HBox(5, accederButton, cancelarButton);
		botonesBox.setFillHeight(false);
		botonesBox.setAlignment(Pos.CENTER);

		setSpacing(5);
		setFillWidth(false);
		setAlignment(Pos.CENTER);
		getChildren().addAll(introduceDatosGrid, botonesBox);
	}

	public TextField getUsuarioText() {
		return usuarioText;
	}

	public PasswordField getContraseñaText() {
		return contraseñaText;
	}

	public Button getAccederButton() {
		return accederButton;
	}

	public Button getCancelarButton() {
		return cancelarButton;
	}

}
