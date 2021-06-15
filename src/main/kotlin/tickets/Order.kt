package tickets

class Order(title: String): Issue(title) {
    override fun generateReport(): String {
            return "tickets.Order ID: $id"
    }
}