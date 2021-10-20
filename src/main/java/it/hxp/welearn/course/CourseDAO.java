package it.hxp.welearn.course;

import it.hxp.welearn.exception.CollaboratorCallException;
import it.hxp.welearn.user.User;

import java.util.List;

public class CourseDAO {
    public static List<Course> findCoursesByUser(User user) {
        throw new CollaboratorCallException(
                "CourseDAO should not be reached by an unit test.");
    }
}
