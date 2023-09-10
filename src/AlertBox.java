import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.Objects;

/**
 * Created by Yeo Kangwei on 3/7/2017.
 */
public class AlertBox {

    private static AlertBox instance = new AlertBox();
    private String css = Objects.requireNonNull(this.getClass().getResource("UI.css")).toExternalForm();

    /**
     * Ensures that AlertBox adheres to a singleton pattern
     * @return New AlertBox if not created; otherwise return an instance of AlertBox
     */
    public static AlertBox getInstance() {
        if (instance == null) {
            instance = new AlertBox();
        }
        return instance;
    }

    /**
     * Displays a basic alert box with a title and message and a close button.
     * @param title The title of the alert box
     * @param message The message of the alert box
     */
    public void display (String title, String message) {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(500);
        window.setMinHeight(200);

        Label label = new Label();
        label.setText(message);
        Button closeButton = new Button("Cancel");
        closeButton.setOnAction(e -> window.close());

        Button confirmButton = new Button("Confirm");
        confirmButton.setOnAction(e -> Controller.confirmDeleteSong());

        //VBox layout = new VBox(10);
        //layout.getChildren().addAll(label);
        //layout.setAlignment(Pos.CENTER);

        //Scene scene = new Scene(layout);
        //layout.getStylesheets().add(css);

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        //pane.setPadding(new Insets(10, 12, 15, 12));
        pane.add(label,0, 0, 2, 1);
        pane.add(closeButton, 0, 2, 1, 1);
        pane.add(confirmButton, 1, 2, 1, 1);
        Scene scene = new Scene(pane);
        pane.getStylesheets().add(css);

        window.setScene(scene);
        window.showAndWait();
    }
}
