package matrixapplication

class User {

    static mapping = {
        table 'user'
    }

    static constraints = {
        name(blank: false)
    }

    static belongsTo = [matrix: Matrix]

    String name
    Matrix matrix
}
