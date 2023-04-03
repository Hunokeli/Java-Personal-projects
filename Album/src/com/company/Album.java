package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title)!=null){
            return false;
        }
        else{
            songs.add(new Song(title, duration));
            return true;
        }
    }

    private Song findSong(String title){
        for (int i=0; i< songs.size();i++){
            if(songs.get(i).getTitle() == title){
                return songs.get(i);
            }
        }
        return null;
    }

    public boolean addToPlayList(int number, LinkedList<Song> playList) {
        if (number < 0 || number > songs.size()) {
            return false;
        }
        Song add = songs.get(number - 1);
        String title = add.getTitle();

        ListIterator<Song> iterator = playList.listIterator();
        while(iterator.hasNext()){
            if(iterator.next().getTitle().compareTo(title)==0){
                return false;
            }
        }
        playList.add(add);
        return true;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        if(findSong(title)==null){
            return false;
        }
        int addIndex = 0;
        for(int i = 0;i<songs.size();i++){
            if(songs.get(i).getTitle() == title){
                addIndex = i;
            }
        }
        Song add = songs.get(addIndex);
        ListIterator<Song> iterator = playList.listIterator();
        while(iterator.hasNext()){
            if(iterator.next().getTitle().compareTo(title)==0){
                return false;
            }
        }
        playList.add(add);
        return true;
    }
}
