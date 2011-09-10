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

    static PairedProgrammers link(programmerOne, programmerTwo)
    {
        def pairingLink = new PairedProgrammers()
        programmerOne?.addToLinkedPair(pairingLink)
        programmerTwo?.addToLinkedPair(pairingLink)
        pairingLink.save()
        programmerOne.save(flush: true)
        programmerTwo.save(flush: true)
        return pairingLink
    }

}