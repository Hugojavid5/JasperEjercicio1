module org.hugo.dein.jasperejercicio1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.hugo.dein.jasperejercicio1 to javafx.fxml;
    exports org.hugo.dein.jasperejercicio1;
}