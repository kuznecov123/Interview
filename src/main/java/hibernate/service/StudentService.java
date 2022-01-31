package hibernate.service;

import hibernate.dao.StudentDao;
import hibernate.model.Student;

import java.util.List;

public class StudentService {

    private StudentDao studentsDao = new StudentDao();

    public StudentService() {
    }

    public Student findUser(int id) {
        return studentsDao.findById(id);
    }

    public void saveUser(Student student) {
        studentsDao.save(student);
    }

    public void deleteUser(Student student) {
        studentsDao.delete(student);
    }

    public void updateUser(Student student) {
        studentsDao.update(student);
    }

    public List<Student> findAllUsers() {
        return studentsDao.findAll();
    }
}
