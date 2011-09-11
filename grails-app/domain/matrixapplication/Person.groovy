package matrixapplication

class Person {

    static mapping = {
        table 'personTable'
    }

    static constraints = {
        id(unique: true)
        name(blank: false)
    }

//    static hasMany = [linkedUser: PairedProgrammers]

//    static belongsTo = [matrix: Matrix]

    String id
    String name
}
