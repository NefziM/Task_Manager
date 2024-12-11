
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTask {

    @Test
    public void testAddTask() {
       
        TaskService taskService = new TaskService();
        Task task = new Task(1, "Develop feature X", "2024-12-15", 50.0);

        taskService.addTask(task);

        assertEquals(1, taskService.getAllTasks().size(), "Task list size should be 1");
        assertEquals("Develop feature X", taskService.getAllTasks().get(0).getLabel(), "Task label mismatch");
    }

    @Test
    public void testFindTaskById() {
       
        TaskService taskService = new TaskService();
        Task task1 = new Task(1, "Develop feature X", "2024-12-15", 50.0);
        Task task2 = new Task(2, "Fix bug Y", "2024-12-16", 40.0);
        taskService.addTask(task1);
        taskService.addTask(task2);

        Task foundTask = taskService.findTaskById(2);

        assertNotNull(foundTask, "Task should not be null");
        assertEquals("Fix bug Y", foundTask.getLabel(), "Task label mismatch");
    }
}
