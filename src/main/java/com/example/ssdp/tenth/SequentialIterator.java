package com.example.ssdp.tenth;
import java.util.*;

public class SequentialIterator implements Iterator {
    private List<Song> songs;
    private int position;

    public SequentialIterator(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public Song next() {
        return songs.get(position++);
    }
}
