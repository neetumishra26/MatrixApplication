package matrixapplication

class User {

    static mapping = {
        table 'user'
    }

    static constraints = {
        name(blank: false)
    }

    static hasMany = [linkedUser: PairedProgrammers]

    static belongsTo = [matrix: Matrix]

    String name
}
