package com.projectAi.response;

public class UserRest {

    private String id;
    private String UserFirstName;
    private String UserLastName;

    public UserRest() {
    }

    public UserRest(String id, String userFirstName, String userLastName) {
        this.id = id;
        UserFirstName = userFirstName;
        UserLastName = userLastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserFirstName() {
        return UserFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        UserFirstName = userFirstName;
    }

    public String getUserLastName() {
        return UserLastName;
    }

    public void setUserLastName(String userLastName) {
        UserLastName = userLastName;
    }
}
