package com.company;

import java.util.List;

public class User implements UserObserver {
    private String name;

    public User(String name){
        this.name = name;
    }

    @Override
    public void update(List<String> authors, List<String> songNames) {
        System.out.println("Hey, " + this.name + "\nWe have some changes in our playlist\n" );
        for(int i = 0; i<songNames.size(); i++){
            System.out.println(authors.get(i) + " - " + songNames.get(i));
        }
        System.out.println();
    }


}
