package dad.buscar;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class BuscarReemplazarApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear controles
        TextField tfBuscar = new TextField();
        TextField tfReemplazarCon = new TextField();
        
        CheckBox cbMayusMin = new CheckBox("Mayúsculas y minúsculas");
        CheckBox cbExpReg = new CheckBox("Expresión regular");
        CheckBox cbBuscarAtras = new CheckBox("Buscar hacia atrás");
        CheckBox cbResaltarResultados = new CheckBox("Resaltar resultados");

        // Organizar CheckBox en un GridPane interno
        GridPane gridChecks = new GridPane();
        gridChecks.add(cbMayusMin, 0, 0);
        gridChecks.add(cbExpReg, 1, 0);
        gridChecks.add(cbBuscarAtras, 0, 1);
        gridChecks.add(cbResaltarResultados, 1, 1);
        gridChecks.setHgap(20);
        gridChecks.setVgap(10);

        // Configurar botones para que sean expansibles
        Button btnBuscar = new Button("Buscar");
        Button btnReemplazar = new Button("Reemplazar");
        Button btnReemplazarTodo = new Button("Reemplazar todo");
        Button btnCerrar = new Button("Cerrar");
        Button btnAyuda = new Button("Ayuda");
        btnBuscar.setMaxWidth(Double.MAX_VALUE);
        btnReemplazar.setMaxWidth(Double.MAX_VALUE);
        btnReemplazarTodo.setMaxWidth(Double.MAX_VALUE);
        btnCerrar.setMaxWidth(Double.MAX_VALUE);
        btnAyuda.setMaxWidth(Double.MAX_VALUE);

        // Organizar controles en un GridPane principal
        GridPane gridPane = new GridPane();
        gridPane.add(new Label("Buscar:"), 0, 0);
        gridPane.add(tfBuscar, 1, 0);
        gridPane.add(new Label("Reemplazar con:"), 0, 1);
        gridPane.add(tfReemplazarCon, 1, 1);
        gridPane.add(gridChecks, 1, 2); // Añadir el GridPane interno
        
        // Organizar botones en un VBox
        VBox vBoxBtn = new VBox(10, btnBuscar, btnReemplazar, btnReemplazarTodo, btnCerrar, btnAyuda);
        vBoxBtn.setFillWidth(true);

        // Organizar GridPane y VBox en un HBox principal
        HBox hBoxPrincipal = new HBox(20, gridPane, vBoxBtn);
        hBoxPrincipal.setPadding(new Insets(20));
        hBoxPrincipal.setAlignment(Pos.CENTER);

        // Crear escena y mostrarla
        Scene scene = new Scene(hBoxPrincipal);
        primaryStage.setTitle("Buscar y Reemplazar");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}











