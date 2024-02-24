package me.kevinmutis.ui;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import me.kevinmutis.ui.client.SumClient;

import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class SumController {

    private final SumClient sumClient;

    public SumController() throws IOException, NotBoundException {
        this.sumClient = new SumClient();
    }

    @FXML
    private TextField input1;

    @FXML
    private TextField input2;

    @FXML
    private TextField input3;

    @FXML
    protected void handleSum() {
        final int a = Integer.parseInt(this.input1.getText());
        final int b = Integer.parseInt(this.input2.getText());
        String result;
        try {
            result = String.valueOf(this.sumClient.sum(a, b));
        } catch (final RemoteException e) {
            result = "Error";
        }
        this.input3.setText(result);
    }


}
