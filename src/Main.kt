fun main() {
    val student:student? = student()//null
    student?.let { st ->
        st.hi()
        st.bye()
        st.name = "asdasa"

    }
    println(student?.name)

    //apply
    val student2 = student?.apply { // работает с параметром объекта
        hi()
        bye()
        name = "DDDDDD"

    }
    println(student?.name)
    println(student2?.name)

    //run
    val Agestudent = student().run {
        hi()
        bye()
        name = "BFEBFEBFEFBEE"
        age = 10
        age
    }
    println(Agestudent)

    val student4 = student?.also { st->
        st.bye()
        st.hi()
        st.name = "masa"
    }
    println(student4?.name)
    //выаыва
}