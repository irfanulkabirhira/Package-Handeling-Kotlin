package Package_Handeling

class StudentDetails {
    var id: Int = 0
    var name: String = ""
    var dept: String = ""
    var versity: String = ""
    var age: Int = 0

    fun display() {
        println("ID: $id")
        println("Name: $name")
        println("Dept: $dept")
        println("Versity: $versity")
        println("Age: $age")
    }
}

fun main() {
    val st = StudentDetails()
    st.id = 2102055
    st.name = "I am Hira"
    st.dept = "CSE"
    st.versity = "NITER(DU)"
    st.age = 23
    st.display()
}
