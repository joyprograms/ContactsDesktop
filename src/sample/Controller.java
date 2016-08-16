package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    @FXML
    ListView list;

    @FXML
    TextField nameText;

    @FXML
    TextField phoneText;

    @FXML
    TextField emailText;



    public void addItem() {
        System.out.println("Add");
        contacts.add(new Contact(nameText.getText(), phoneText.getText(), emailText.getText()));
        nameText.setText("");
    }
    public void removeItem() {
        System.out.println("Remove");
        Contact item = (Contact) list.getSelectionModel().getSelectedItem();
        contacts.remove(item);
    }



    @Override
    public void initialize (URL url, ResourceBundle resources) {
        list.setItems(contacts);
    }


}
