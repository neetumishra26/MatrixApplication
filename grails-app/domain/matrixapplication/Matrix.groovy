package matrixapplication

class Matrix {

    static mapping = {
        table 'matrix_of_pairing'
    }

    static constraints = {
        allUsers(nullable: false)
        allPairing(nullable: true)
    }

    static hasMany = [allUsers: User, allPairing: PairedProgrammers]
}
