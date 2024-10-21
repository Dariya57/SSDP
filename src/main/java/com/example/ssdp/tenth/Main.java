package com.example.ssdp.tenth;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Song> songs = Arrays.asList(new Song("Song 1"), new Song("Song 2"), new Song("Song 3"));
        Playlist playlist = new Playlist(songs);

        Iterator sequentialIterator = playlist.createSequentialIterator();
        Iterator shuffleIterator = playlist.createShuffleIterator();

        while (sequentialIterator.hasNext()) {
            System.out.println(sequentialIterator.next().getTitle());
        }

        System.out.println("Shuffle:");

        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next().getTitle());
        }
    }
}
