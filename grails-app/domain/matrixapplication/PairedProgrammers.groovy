package matrixapplication


class PairedProgrammers {
    static mapping = {
        table 'pairing'
    }

    static constraints = {
    }

    static belongsTo = [matrix: Matrix, user: User]

    User userOne
    User userTwo

    static PairedProgrammers link(userOne, userTwo)
    {
        def pairingLink = new PairedProgrammers()
        userOne?.addToLinkedUser(pairingLink)
        userTwo?.addToLinkedUser(pairingLink)
        pairingLink.save()
        userOne.save(flush: true)
        userTwo.save(flush: true)
        return pairingLink
    }

}