package matrixapplication

class MatrixController {

    def index = {
    }

    def create = {
    }

    def show = {
        def totalUser = Person.getAll().size()
        def numberOfTimes = new int[totalUser][totalUser]
        def row = 0
        def col = 0
        def matrix = new Matrix()
        matrix.allPairing = Pairing.getAll()
        matrix.allUsers = Person.getAll()
        for (def person1 in Person.getAll()) {
            for (def person2 in Person.getAll()) {
                def pairingToCompare = new Pairing(personOne: person1, personTwo: person2)
                //                matrix.allPairing.findAll {
                //                    it.equals(pairingToCompare)
                //                }
                def count = 0
                for (def onePair in matrix.allPairing) {
                    if (onePair.equals(pairingToCompare))
                        count = 1
                }
                numberOfTimes[row][col] = count
                col++

                //                matrix.allPairing.each{
                //                    if(it.equals(pairingToCompare))
                //                        numberOfTimes[row][col]++
                //                }
            }
            row++
            col = 0
        }
        [allUser: Person.getAll(), allPairing: Pairing.getAll(), pairingMatrix: numberOfTimes.toArrayString()]
    }

    def link = {
        def userOne = Person.findByName(params.nameOne)
        def userTwo = Person.findByName(params.nameTwo)
        def makePair
        if (userOne != null && userTwo != null && userOne != userTwo) {
            makePair = new Pairing(personOne: userOne, personTwo: userTwo)
            if (makePair.save(flush: true)) {
                redirect(action: 'show')
            }
        }
        else
            redirect(action: 'create')

    }
}
