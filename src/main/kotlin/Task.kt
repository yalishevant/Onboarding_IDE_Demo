import kotlin.random.Random

class Task(val taskName: String) {
    val id: TaskID = TaskID()

    var owner: Employee? = null

    fun generateReport(): String {
        if (owner != null)
            return "The task is owned by ${owner?.getFirstName()?.first()}. ${owner?.getLastName()}."
        else
            return "The task has no owner."
    }
}

object TaskManager {

    var tasks = mutableListOf<Task>()

    fun getEmployeesTasks(employee: Employee): List<Task> {
        return tasks.filter { it.owner == employee }
    }

    fun register(taskName: String, owner: Employee): TaskID {
        val task = Task(taskName)
        task.owner = owner
        tasks.add(task)
        return task.id
    }
}

class TaskID() {
    val id = Random(10).nextInt()
}