import javafx.beans.binding.ListBinding;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 * Created by Yeo Kangwei on 30/6/2017.
 */
public class Controller implements Initializable {

    @FXML private ComboBox<String> deleteSongComboBox;
    @FXML private Button deleteSongButton;
    @FXML private Button addSongButton;

    private ObservableList<String> songList;

    public static String addSongToSongbook() {
        //Step 1. Extract song from text file
        DBManager.readInSongToBeAdded();

        //Step 2. Check if song exists in current song book
        //Step 2a. If song is inside, do not add it to songbook
        //Step 2b. If song is not inside, add it to songbook

        if (DBManager.isSongExists()) {
            System.out.println("Song is already in songbook.  Please give it a new name.");
            return null;
        } else {
            SongCompiler.compileSong(DBManager.getFilePath());
            //Step 3. Generate a new updated english.html
            String songToBeAdded = DBManager.getSongTitle();
            MenuCompiler.addSongToMenu(songToBeAdded);
            return songToBeAdded;
        }
    }

    public void removeSongFromSongbook() {
        Main.alertBox.display("Confirm", "Is this the song you would like to remove?");
    }

    public static void confirmDeleteSong() {

    }

    public static void deleteSongFromSongbook(String songToBeDeleted) {
        //Step 1: Remove song from database
        DBManager.removeSongFromDB(songToBeDeleted);
        //DBManager.initialiseDB();
        System.out.println("Checking database from Controller.");
        //DBManager.checkSongList();
        //ArrayList<String> temp = new ArrayList<>();
        /*
        temp = DBManager.getListOfSongs();
        for (int i = 0; i < temp.size(); i++) {
            System.out.println(temp.get(i));
        }
        */
        //System.out.println();

        //Step 2: Refresh song list in MenuCompiler
        MenuCompiler.refreshSongList();
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

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        DBManager.initialiseDB();
        bindSongList();
    }

    private void bindSongList() {
        songList = new ListBinding<String>() {
            {super.bind(DBManager.observableSongList);}
            @Override
            protected ObservableList<String> computeValue() {
                return FXCollections.observableArrayList(DBManager.observableSongList);
            }
        };
        deleteSongComboBox.setItems(songList);
    }

}
