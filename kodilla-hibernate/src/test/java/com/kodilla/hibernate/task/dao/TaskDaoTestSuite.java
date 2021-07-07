<<<<<<< HEAD
//package com.kodilla.hibernate.task.dao;
//
//import com.kodilla.hibernate.task.Task;
//import com.kodilla.hibernate.task.TaskFinancialDetails;
//import com.kodilla.hibernate.tasklist.TaskList;
//import com.kodilla.hibernate.tasklist.dao.TaskListDao;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.math.BigDecimal;
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//class TaskDaoTestSuite {
//
//    @Autowired
//    private TaskListDao taskListDao;
//    @Autowired
//    private TaskDao taskDao;
//    private static final String DESCRIPTION = "Test: Learn Hibernate";
//
//    @Test
//    void testTaskDaoSave() {
//        //Given
//        Task task = new Task(DESCRIPTION, 1);
//
//        //When
//        taskDao.save(task);
//
//        //Then
//        int id = task.getId();
//        Optional<Task> readTask = taskDao.findById(id);
//        assertTrue(readTask.isPresent());
//
//        //CleanUp
//        taskDao.deleteById(id);
//    }
//
//    @Test
//    void testTaskDaoFindByDuration() {
//        //Given
//        Task task = new Task(DESCRIPTION, 1);
//        taskDao.save(task);
//        int duration = task.getDuration();
//
//        //When
//        List<Task> readTasks = taskDao.findByDuration(duration);
//
//        //Then
//        assertEquals(1, readTasks.size());
//
//        //CleanUp
//        int id = readTasks.get(0).getId();
//        taskDao.deleteById(id);
//    }
//
//    @Test
//    void testTaskDaoSaveWithFinancialDetails(){
////        Given
//        Task task = new Task(DESCRIPTION, 30);
//        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(120), false));
//
////        When
//        taskDao.save(task);
//        int id = task.getId();
//
////        Then
//        assertNotEquals(0, id);
//
////        Cleanup
//        taskDao.deleteById(id);
//    }
//
//    @Test
//    void testNamedQueries() {
//        //Given
//        Task task1 = new Task("Test: Study Hibernate", 3);
//        Task task2 = new Task("Test: Practice Named Queries", 6);
//        Task task3 = new Task("Test: Study native queries", 7);
//        Task task4 = new Task("Test: Makse some tests", 13);
//
//        TaskFinancialDetails tfd1 = new TaskFinancialDetails(new BigDecimal(5), false);
//        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
//        TaskFinancialDetails tfd3 = new TaskFinancialDetails(new BigDecimal(20), false);
//        TaskFinancialDetails tfd4 = new TaskFinancialDetails(new BigDecimal(15), false);
//
//        task1.setTaskFinancialDetails(tfd1);
//        task2.setTaskFinancialDetails(tfd2);
//        task3.setTaskFinancialDetails(tfd3);
//        task4.setTaskFinancialDetails(tfd4);
//
//        TaskList taskList = new TaskList("TODO", "To do tasks");
//        taskList.getTasks().add(task1);
//        taskList.getTasks().add(task2);
//        taskList.getTasks().add(task3);
//        taskList.getTasks().add(task4);
//
//        task1.setTaskList(taskList);
//        task2.setTaskList(taskList);
//        task3.setTaskList(taskList);
//        task4.setTaskList(taskList);
//
//        taskListDao.save(taskList);
//        int id = taskList.getId();
//
//        //When
//        List<Task> longTasks = taskDao.retrieveLongTasks();
//        List<Task> shortTasks = taskDao.retrieveShortTasks();
//        List<Task> enoughTimeTasks = taskDao.retrieveTasksWithEnoughTime();
//
//        //Then
//        try {
//            assertEquals(1, longTasks.size());
//            assertEquals(3, shortTasks.size());
//            assertEquals(3, enoughTimeTasks.size());
//        } finally {
//            //CleanUp
//            taskListDao.deleteById(id);
//        }
//    }
//}
=======
package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.dao.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskDaoTestSuite {

    @Autowired
    private TaskDao taskDao;

    @Autowired
    private TaskDao taskListDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    void testTaskDaoSave() {
        //Given
        Task task = new Task(DESCRIPTION, 1);

        //When
        getTaskDao().save(task);

        //Then
        int id = task.getId();
        Optional<Task> readTask = getTaskDao().findById(id);
        assertTrue(readTask.isPresent());

        //CleanUp
        getTaskDao().deleteById(id);
    }

    @Test
    void testTaskDaoFindByDuration() {
        //Given
        Task task = new Task(DESCRIPTION, 1);
        getTaskDao().save(task);
        int duration = task.getDuration();

        //When
        List<Task> readTasks = getTaskDao().findByDuration(duration);

        //Then
        assertEquals(1, readTasks.size());

        //CleanUp
        int id = readTasks.get(0).getId();
        getTaskDao().deleteById(id);
    }

    @Test
    void testTaskDaoSaveWithFinancialDetails(){
//        Given
        Task task = new Task(DESCRIPTION, 30);
        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(120), false));

//        When
        getTaskDao().save(task);
        int id = task.getId();

//        Then
        assertNotEquals(0, id);

//        Cleanup
        getTaskDao().deleteById(id);
    }


    @Test
    void testNamedQueries() {
        //Given
        Task task1 = new Task("Test: Study Hibernate", 3);
        Task task2 = new Task("Test: Practice Named Queries", 6);
        Task task3 = new Task("Test: Study native queries", 7);
        Task task4 = new Task("Test: Makse some tests", 13);

        TaskFinancialDetails tfd1 = new TaskFinancialDetails(new BigDecimal(5), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        TaskFinancialDetails tfd3 = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd4 = new TaskFinancialDetails(new BigDecimal(15), false);

        task1.setTaskFinancialDetails(tfd1);
        task2.setTaskFinancialDetails(tfd2);
        task3.setTaskFinancialDetails(tfd3);
        task4.setTaskFinancialDetails(tfd4);

        TaskList taskList = new TaskList("TO DO", "ToDo tasks");
        taskList.getTasks().add(task1);
        taskList.getTasks().add(task2);
        taskList.getTasks().add(task3);
        taskList.getTasks().add(task4);

        task1.setTaskList(taskList);
        task2.setTaskList(taskList);
        task3.setTaskList(taskList);
        task4.setTaskList(taskList);

        taskListDao.save(taskList);
        int id = taskList.getId();

        //When
        List<Task> longTasks = getTaskDao().retrieveLongTasks();
        List<Task> shortTasks = getTaskDao().retrieveShortTasks();
        List<Task> enoughTimeTasks = getTaskDao().retrieveTasksWithEnoughTime();

        //Then
        try {
            assertEquals(1, longTasks.size());
            assertEquals(3, shortTasks.size());
            assertEquals(3, enoughTimeTasks.size());
        } finally {
            //CleanUp
            taskListDao.deleteById(id);
        }
    }

    public com.kodilla.hibernate.task.dao.TaskDao getTaskDao() {
        return taskDao;
    }

    public void setTaskDao(com.kodilla.hibernate.task.dao.TaskDao taskDao) {
        this.taskDao = taskDao;
    }
}
>>>>>>> 0730674283b298b9d1c6fa3c10bca3d2c4f2ac7e
