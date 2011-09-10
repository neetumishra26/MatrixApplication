package matrixapplication

class User {

    static mapping = {
        table 'user'
    }

    static constraints = {
        name(blank: false)
    }

    static belongsTo = [matrix: Matrix, linkedPair: PairedProgrammers]

    String name
    Matrix matrix
}
