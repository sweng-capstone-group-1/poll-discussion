package edu.psu.sweng894.group1.capstone.data.entities;

// I think this whole thing is YAGNI
// At best maybe we do need it, but we don't need it yet
// But why are we saving notifications in the DB? Even if we want a notification object,
// it shouldn't need an id.
public class Notification {
    private Integer id;
    private String notificationType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }
}
