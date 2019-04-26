import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Yeo Kangwei on 24/6/2017.
 */

public class Main extends Application {

    Stage window;
    public static AlertBox alertBox;

    public static void main(String[] args) {


        //Step 1: Get list of songs from database
        MenuCompiler.getSongsFromSongbook();

        //Step 2: Check for command
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Command List:");
        System.out.println("Enter 1 to add song to Songbook.");
        System.out.println("Enter 2 to delete song from Songbook.");
        int command = sc.nextInt();
        if (command == 1) {
            //Step 3a: Add song to Songbook
            String songAdded = Controller.addSongToSongbook();
            if (songAdded == null) {
                System.out.println("No song has been added.");
            } else {
                System.out.println("Song added: " + songAdded);
                System.out.println("Song has been placed in: " + DBManager.getFilePath());
            }
        } else if (command == 2) {
            //Step 3b: Delete song from Songbook
            System.out.println("Enter the number of the song you wish to delete below:");

            int indexOfSongToBeDeleted = sc.nextInt();
            ArrayList<String> songList = DBManager.getListOfSongs();
            String songToBeDeleted = songList.get(indexOfSongToBeDeleted);
            System.out.println("Are you sure you want to delete (Y/N): " + indexOfSongToBeDeleted + ". " + songToBeDeleted);
            //System.out.println(indexOfSongToBeDeleted + ". " + songList.get(indexOfSongToBeDeleted));

            String confirmation = sc.next();
            System.out.println(confirmation);
            if (confirmation.equals("Y") || confirmation.equals("y")) {
                Controller.deleteSongFromSongbook(songToBeDeleted);
                /*
                //Step 1: Remove song from database
                DBManager.removeSongFromDB(songToBeDeleted);
                DBManager.initialiseDB();
                System.out.println("Checking database from Main.");
                //DBManager.checkSongList();
                ArrayList<String> temp = new ArrayList<>();
                temp = DBManager.getListOfSongs();
                for (int i = 0; i < temp.size(); i++) {
                    System.out.println(temp.get(i));
                }
                //System.out.println();
                //Step 2: Refresh song list in MenuCompiler
                MenuCompiler.refreshSongList(temp);
                //Step 3: Compile Menu
                MenuCompiler.compileMenu();
                //Step 4: Delete the song file
                DBManager.setSongTitle(songToBeDeleted);
                //Step 4a: Check if song exists (This step sets up the file path for deletion)

                DBManager.isSongExists();
                String songpath = DBManager.getFilePath();
                File song = new File(songpath);
                boolean deletionResult = song.delete();
                if (deletionResult) {
                    System.out.println("Song has been deleted");
                } else {
                    System.out.println("Song has not been deleted.  Please investigate further.");
                }
                */
                //System.out.println("Delete song");

            } else {
                System.out.println("Song has not been deleted due to invalid command entered.");
            }
            /*
            for (int i = 0; i < songList.size(); i++) {
                System.out.println(i + ". " + songList.get(i));
            }
            */
        } else {
            System.out.println("Please enter an appropriate command.");
        }

        //launch(args);
        System.exit(0);
    }

    public static void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //this.stage = stage; // initialize value of stage.
        //URL url = getClass().getResource("GLCCSongbookUI.fxml");
        //File file = new File(url.getPath());
        //String basePath = new File("resources/GLCCSongbookUI.fxml").getAbsolutePath();
        //System.out.println(basePath);
        /*
        Parent root = FXMLLoader.load(getClass().getResource("GLCCSongbookUI.fxml"));
        primaryStage.setScene(new Scene(root));
        window = primaryStage;
        window.setTitle("GLCC Songbook Manager");
        window.setResizable(false);
        primaryStage.show();
        alertBox = AlertBox.getInstance();
        */
    }
}
