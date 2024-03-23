module com.felipesantos.wksjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.felipesantos.wksjavafx to javafx.fxml;
    exports com.felipesantos.wksjavafx;
}