package com.company;

public interface Observable {
    void registerServiceManagers(ServiceObserver serviceManager);
    void unregisterServiceManagers(ServiceObserver serviceManager);
    void registerUser(UserObserver user);
    void unregisterUser(UserObserver user);
    void notifyEverybody();
}
