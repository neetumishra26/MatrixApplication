package matrixapplication

class Matrix {

    static mapping = {
        table 'matrix_of_pairing'
    }

    static constraints = {
    }

    static hasMany = [users: User, pairing: PairedProgrammers]

}
