package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class Service implements ServiceObserver{
    private String serviceManager;

    public Service(String serviceManagers){
        this.serviceManager = serviceManagers;
    }


    @Override
    public void update(List<String> authors) {
        List<String> authorsListWithoutDuplicates = authors.stream().distinct().collect(Collectors.toList());

        System.out.println("Greetings, " + serviceManager + "\nWe have made some minor changes in the list of authors.\n");
        System.out.println(authorsListWithoutDuplicates);
        System.out.println();
    }
}
