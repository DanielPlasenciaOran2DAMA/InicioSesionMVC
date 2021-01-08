package dad.javafx.responsive;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class InicioSesion extends Application {

	private InicioController inicioController;

	@Override
	public void start(Stage primaryStage) throws Exception {

		inicioController = new InicioController(primaryStage);

		Scene scene = new Scene(inicioController.getView(), 320, 200);

		primaryStage.setTitle("Iniciar sesi�n");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
