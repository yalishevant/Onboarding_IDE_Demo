class Employee(val fullName: String, var department: Department) {

    private val activeTasks: MutableList<Task> = mutableListOf()

    fun getFirstName(): String = fullName.split(" ").first()
    fun getLastName(): String = fullName.split(" ").last()

    fun registerTask(taskName: String, owner: Employee): TaskID? {
        if (owner.isAvailable())
            return TaskManager.register(taskName, owner)
        else
            return null
    }

    fun takeFirstTask(): Boolean {
        if (!isAvailable()) return false

        val tasks = TaskManager.getEmployeesTasks(this)

        if (tasks.isNotEmpty()) {
            activeTasks.add(tasks.first())
            return true
        } else
            return false
    }

    private fun isAvailable(): Boolean {
        return activeTasks.size < TASK_LIMIT
    }

    fun checkMyTasks(): List<Task> {
        return TaskManager.getEmployeesTasks(this)
    }

    fun reportStatus() {
        println("Tasks in work:")
        val tasks = TaskManager.getEmployeesTasks(this)
        println(tasks.joinToString(", ") { it.taskName })
    }

    companion object {
        const val TASK_LIMIT: Int = 5
    }
}