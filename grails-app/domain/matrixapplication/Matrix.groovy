package matrixapplication


class Matrix {
    static mapping = {
        table 'pairing_matrix'
    }

    static constraints = {
        allUsers(nullable: false)
        allPairing(nullable: true)
    }

    static hasMany = [allUsers: Person, allPairing: Pairing]

}
