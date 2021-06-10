fun main() {

    val john = Employee("John Doe", Department.MANAGEMENT)
    val kevin = Employee("Kevin Smith", Department.ADMINISTRATION)

    john.registerTask("Calculate revenue in May", kevin)

    // ...

    if (kevin.checkMyTasks().isNotEmpty())
        kevin.takeFirstTask()

    kevin.reportStatus()
}