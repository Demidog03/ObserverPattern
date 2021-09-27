package com.company;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements Observable{

    private final List<String> authors = new ArrayList<>();
    private final List<String> songNames = new ArrayList<>();
    private final List<UserObserver> users = new ArrayList<>();
    private final List<ServiceObserver> serviceManagers = new ArrayList<>();

    public void addSong(String author, String songName){
        authors.add(author);
        songNames.add(songName);
        notifyEverybody();
    }

    public void removeSong(String author, String songName){
        authors.remove(author);
        songNames.remove(songName);
        notifyEverybody();

    }


    @Override
    public void registerServiceManagers(ServiceObserver serviceManager) {
        this.serviceManagers.add(serviceManager);
    }

    @Override
    public void unregisterServiceManagers(ServiceObserver serviceManager) {
        this.serviceManagers.remove(serviceManager);
    }

    @Override
    public void registerUser(UserObserver user) {
        this.users.add(user);
    }

    @Override
    public void unregisterUser(UserObserver user) {
        this.users.remove(user);
    }

    @Override
    public void notifyEverybody() {
        for(UserObserver user: this.users){
            user.update(this.authors, this.songNames);

        }
        for(ServiceObserver serviceManager: this.serviceManagers){
            serviceManager.update(this.authors);
        }
    }



}
