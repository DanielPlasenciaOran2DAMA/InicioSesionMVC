package dad.javafx.responsive;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class InicioModel {

	public StringProperty usuario = new SimpleStringProperty();
	public StringProperty contrase�a = new SimpleStringProperty();

	public final StringProperty usuarioProperty() {
		return this.usuario;
	}

	public final String getUsuario() {
		return this.usuarioProperty().get();
	}

	public final void setUsuario(final String usuario) {
		this.usuarioProperty().set(usuario);
	}

	public final StringProperty contrase�aProperty() {
		return this.contrase�a;
	}

	public final String getContrase�a() {
		return this.contrase�aProperty().get();
	}

	public final void setContrase�a(final String contrase�a) {
		this.contrase�aProperty().set(contrase�a);
	}

}
