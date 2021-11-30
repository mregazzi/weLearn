package it.hxp.welearn.course;

import it.hxp.welearn.exception.UserNotLoggedInException;
import it.hxp.welearn.user.User;
import it.hxp.welearn.user.UserSession;

import java.util.ArrayList;
import java.util.List;


public class CourseService {
    public List<Course> getCoursesByUser(User user) throws UserNotLoggedInException {
        List<Course> courseList = new ArrayList<>();
        User loggedUser = UserSession.getInstance().getLoggedUser();
        boolean isFriend = false;
        if (loggedUser != null) {
            for (User friend : user.getFriends()) {
                if (friend.equals(loggedUser)) {
                    isFriend = true;
                    break;
                }
            }
            if (isFriend) {
                courseList = CourseDAO.findCoursesByUser(user);
            }
            return courseList;
        } else {
            throw new UserNotLoggedInException();
        }
    }
}