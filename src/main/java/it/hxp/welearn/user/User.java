package it.hxp.welearn.user;

import it.hxp.welearn.course.Course;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Course> courses = new ArrayList<>();
    private List<User> friends = new ArrayList<>();

    public List<User> getFriends() {
        return friends;
    }

    public void addFriend(User user) {
        friends.add(user);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> courses() {
        return courses;
    }
}