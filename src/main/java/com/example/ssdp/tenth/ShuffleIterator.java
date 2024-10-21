package com.example.ssdp.tenth;
import java.util.*;
public class ShuffleIterator implements Iterator {
    private List<Song> songs;
    private List<Song> shuffled;
    private int position;

    public ShuffleIterator(List<Song> songs) {
        this.songs = new ArrayList<>(songs);
        Collections.shuffle(this.songs);
        this.shuffled = this.songs;
    }

    @Override
    public boolean hasNext() {
        return position < shuffled.size();
    }

    @Override
    public Song next() {
        return shuffled.get(position++);
    }
}