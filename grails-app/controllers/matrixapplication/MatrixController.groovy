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
        for (def person1 in Person.getAll()){
            for (def person2 in Person.getAll()){
                def pairingToCompare = new Pairing(personOne: person1, personTwo: person2)

                def isLinked = matrix.allPairing.each{
                    if(it == pairingToCompare)
                    return 1
                }

                if(isLinked)
                    numberOfTimes[row][col++]
            }
            row++
            col = 0
        }
        [allUser: Person.getAll(), allPairing: Pairing.getAll(), pairingMatrix: numberOfTimes]
    }

    def link = {
        def userOne = Person.findByName(params.nameOne)
        def userTwo = Person.findByName(params.nameTwo)
        def makePair
        if(userOne!= null && userTwo!=null && userOne!=userTwo)
        {
            makePair = new Pairing(personOne: userOne, personTwo: userTwo)
            if(makePair.save(flush:true)){
                redirect(action: 'show')
            }
        }
        else
            redirect(action: 'create')

    }
}
