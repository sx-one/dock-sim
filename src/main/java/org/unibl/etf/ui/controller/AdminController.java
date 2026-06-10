package org.unibl.etf.ui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import org.unibl.etf.model.Terminal;
import org.unibl.etf.model.ship.Ship;
import org.unibl.etf.service.PortService;
import org.unibl.etf.ui.viewmodel.AdminViewModel;

public final class AdminController {

    @FXML private VBox terminalsVBox;
    @FXML private Label totalShipsLabel;
    @FXML private Label freeDocksLabel;
    @FXML private Label totalDocksLabel;
    @FXML private Label totalStateShipsLabel;
    @FXML private Label selectedTerminalLabel;
    @FXML private Button addShipBtn;
    @FXML private TableView<Ship> tableView;

    private final AdminViewModel viewModel = new AdminViewModel();

    @FXML
    public void initialize() {
        viewModel.refresh();

        PortService.getInstance().getTerminals().forEach(terminal ->
                terminalsVBox.getChildren().add(createTerminalButton(terminal))
        );

        totalShipsLabel.textProperty().bind(
                viewModel.totalShipsProperty().asString()
        );

        freeDocksLabel.textProperty().bind(
                viewModel.freeDocksProperty().asString()
        );

        totalDocksLabel.textProperty().bind(
                viewModel.totalDocksProperty().asString()
        );

        totalStateShipsLabel.textProperty().bind(
                viewModel.totalStateShipsProperty().asString()
        );

        selectedTerminalLabel.textProperty().bind(
                viewModel.selectedTerminalProperty()
        );

        addShipBtn.disableProperty().bind(
                viewModel.isAddShipBtnDisabledProperty()
        );
    }

    private Button createTerminalButton(Terminal terminal) {
        var button = new Button();

        button.setText("Terminal " + terminal.getId());
        button.setOnAction(_ -> onTerminalSelected(terminal));

        return button;
    }

    @FXML
    private void onStartSimulationAction() {

    }

    @FXML
    private void onAddShipAction() {

    }

    private void onTerminalSelected(Terminal terminal) {
        viewModel.setSelectedTerminal(terminal);
    }
}
