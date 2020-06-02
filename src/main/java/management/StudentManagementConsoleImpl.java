package management;

import data_access.StudentDao;
import models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import util.UserInputService;

import java.util.List;

@Component
public class StudentManagementConsoleImpl implements StudentManagement{

    @Autowired
    public UserInputService scannerService;
    @Autowired
    public StudentDao studentDao;

    @Override
    public Student create() {
        return null;
    }

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student find(int id) {
        return null;
    }

    @Override
    public Student remove(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student edit(Student student) {
        return null;
    }
}
