package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Playlist songList = new Playlist();

        songList.addSong("Lil Nas X", "Panini");
        songList.addSong("Lil Nas X", "Old Town Road");

        User someUser = new User("Bob");
        User someUser2 = new User("Alice");

        songList.registerUser(someUser);
        songList.registerUser(someUser2);
        songList.addSong("Jack Harlow", "WHATS POPPIN");
        songList.addSong("Gone Fludd", "Mumble");
        songList.removeSong("Gone Fludd", "Mumble");

        Service someServiceManager1 = new Service("Miras");
        songList.registerServiceManagers(someServiceManager1);
        songList.addSong("Gone Fludd", "Pustota");

    }
}
