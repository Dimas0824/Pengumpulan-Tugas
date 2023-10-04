public class Task {
    private int id;
    private String title;
    private String description;
    private String status;

    // Constructor, getters, and setters
}

public class Board {
    private List<Task> tasks;

    public Board() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(int taskId) {
        tasks.removeIf(task -> task.getId() == taskId);
    }

    public void updateTaskStatus(int taskId, String newStatus) {
        tasks.stream()
                .filter(task -> task.getId() == taskId)
                .findFirst()
                .ifPresent(task -> task.setStatus(newStatus));
    }

    // Other methods for managing tasks

    public List<Task> getTasks() {
        return tasks;
    }
}

public class Main {
    public static void main(String[] args) {
        Board board = new Board();

        // Add tasks to the board
        Task task1 = new Task(1, "Task 1", "Description 1", "To Do");
        Task task2 = new Task(2, "Task 2", "Description 2", "In Progress");
        Task task3 = new Task(3, "Task 3", "Description 3", "Done");

        board.addTask(task1);
        board.addTask(task2);
        board.addTask(task3);

        // Update task status
        board.updateTaskStatus(1, "In Progress");

        // Remove a task
        board.removeTask(3);

        // Get all tasks on the board
        List<Task> tasks = board.getTasks();
        for (Task task : tasks) {
            System.out.println(task.getTitle() + " - " + task.getStatus());
        }
    }
}