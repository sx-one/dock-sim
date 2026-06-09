package org.unibl.etf;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        var loader = new FXMLLoader(getClass().getResource("/fxml/admin.fxml"));
        var scene = new Scene(loader.load());

        stage.setScene(scene);

        stage.show();

        // For simplicity's sake we cannot downsize the window below initial window size
        stage.setMinHeight(stage.getHeight());
        stage.setMinWidth(stage.getWidth());
    }

    @SuppressWarnings("unused")
    static void main(String[] args) {
        launch(args);
    }
}
