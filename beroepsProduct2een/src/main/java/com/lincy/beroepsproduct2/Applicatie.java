package com.lincy.beroepsproduct2;
import javafx.application.Application;
import com.lincy.beroepsproduct2.HomeScreen;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Applicatie extends Application {

    private static Stage mainStage;
    private static ArrayList<Scene> scenes = new ArrayList<>();

    public static int[] applicationSize = {1200, 650};
    public static int[] applicationCenter = {applicationSize[0] / 2, applicationSize[1] / 2};
    public static String APIKEY = "35ccf4a7";

    public static void main(String[] args) {launch(args);}

    @Override
    public void start(Stage primaryStage) {

    }
}
