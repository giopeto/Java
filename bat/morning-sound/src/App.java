import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App extends Application {

    private final ScheduledExecutorService scheduler =
            Executors.newScheduledThreadPool(1);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
       // powerOffMonitor();
        goToSleep(40);
        startMediaPlayer(primaryStage);
    }

    private void startMediaPlayer(Stage primaryStage) {
        Media pick = new Media(Paths.get("rain.mp3").toUri().toString());
        //Media pick = new Media("rain.mp3"); // replace this with your own audio file
        MediaPlayer player = new MediaPlayer(pick);

        // Add a mediaView, to display the media. Its necessary !
        // This mediaView is added to a Pane
        MediaView mediaView = new MediaView(player);

        // Add to scene
        Group root = new Group(mediaView);
        Scene scene = new Scene(root, 500, 200);

        // Show the stage
        primaryStage.setTitle("Media Player");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Play the media once the stage is shown
        player.play();
    }

    private void powerOffMonitor() {
        try {
            Runtime.getRuntime().exec(this.getClass().getResource("nircmd/nircmd.exe").getPath() + " monitor off ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void goToSleep(int time) {
        scheduler.schedule(new Runnable() {
            public void run() {
                try {
                    Runtime.getRuntime().exec("Rundll32.exe powrprof.dll,SetSuspendState Sleep");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, time, TimeUnit.MINUTES);
    }

}
