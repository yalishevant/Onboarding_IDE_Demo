package tickets

open class Issue(val title: String) {
    val id: TaskID = TaskID()

    open fun generateReport(): String {
        return "ID: $id"
    }
}

