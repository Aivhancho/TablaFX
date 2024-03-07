package com.example.tabla;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TableColumn ageColumn;

    @FXML
    private TableColumn emailColumn;

    @FXML
    private TableColumn namecolumn;
    ObservableList<Person> listaPersonas;

    @FXML
    private TableView<Person> tablaPersonas;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //configurar las columnas, cada línea pertenece a un campo, entre comillas se pondrá el nombre de la columna
        namecolumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));

        Person a= new Person("Pistacho",23,"Pistacho@example.com");
        Person b= new Person("Arena",26,"Arena@example.com");
        Person c= new Person("Cuchara",21,"Cuchara@example.com");

        listaPersonas = FXCollections.observableArrayList(a,b,c);

        tablaPersonas.setItems(listaPersonas);
    }
    //creamos una nueva persona que al dar al botón se creará la persona indicada
    @FXML
    private void onaddpersonclick(){
        Person d = new Person("Anacardo", 45, "Ana@cardo.com");
        listaPersonas.add(d);
    };
}