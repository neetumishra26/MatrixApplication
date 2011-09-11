package matrixapplication

class Person {
    static mapping = {
        table 'person_table'
    }
    static constraints = {
        name(blank: false, unique: true)
    }
    String name
}
