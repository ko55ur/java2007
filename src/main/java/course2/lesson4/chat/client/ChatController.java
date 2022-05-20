package course2.lesson4.chat.client;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.awt.event.KeyListener;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

public class ChatController implements Initializable {

    @FXML
    private VBox mainPanel;

    @FXML
    private TextArea chatArea;

    @FXML
    private ListView<String> contacts;

    @FXML
    private TextField inputField;

    @FXML
    private Button btnSend;

    public void mockAction(ActionEvent actionEvent) {
        System.out.println("mock");
    }

    public void closeApplication(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void sendMessage(ActionEvent actionEvent) {
        String text = inputField.getText();
        if (text == null || text.isBlank()) {
            return;
        }

        ObservableList<String> recipient = contacts.getSelectionModel().getSelectedItems();
        if (!recipient.isEmpty()) {
            chatArea.appendText(recipient + text + System.lineSeparator());
            inputField.clear();
            return;

        } else {
            assert recipient != null;
            if (recipient.isEmpty()) {

                chatArea.appendText("broadcast: " + text + System.lineSeparator());
                inputField.clear();
                return;
            }
        }

        chatArea.requestFocus();
        inputField.clear();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        List<String> names = List.of("Vasya", "Masha", "Petya", "Valera", "Nastya");
        contacts.setItems(FXCollections.observableArrayList(names));

    }
}
