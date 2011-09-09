package matrixapplication


class PairedProgrammers {
    static mapping = {
        table 'pairing'
    }

    static constraints = {
    }

    static belongsTo = [matrix: Matrix]

    User programmerOne
    User programmerTwo

    static PairedProgrammers link(User programmerOne, User programmerTwo)
    {

    }

}
