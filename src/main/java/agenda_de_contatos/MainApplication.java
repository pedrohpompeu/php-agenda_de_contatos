package agenda_de_contatos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 940, 460);

        scene.getStylesheets().add(MainApplication.class.getResource("purple-theme.css").toExternalForm());

        stage.setTitle("Agenda de Contatos php");
        stage.setScene(scene);
        stage.show();
    }
}