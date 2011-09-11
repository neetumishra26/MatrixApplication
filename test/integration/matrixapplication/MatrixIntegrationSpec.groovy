package matrixapplication

import grails.plugin.spock.IntegrationSpec

class MatrixIntegrationSpec extends IntegrationSpec{

    def 'should be able to save a pairing to the database'() {
        given:
        def newPerson1 = new Person(name: "Neetu")
        newPerson1.save()
        def newPerson2 = new Person(name: "mishra")
        newPerson2.save()
        def newPairing = new Pairing(personOne: newPerson1, personTwo: newPerson2)

        when:
        def success = newPairing.save(flush:true)

        then:
        success != null
    }

    def 'should be able to save all pairing with same person'() {
        given:
        def newPerson1 = new Person(name: "Neetu")
        newPerson1.save()
        def newPerson2 = new Person(name: "mishra")
        newPerson2.save()
        def newPairing1 = new Pairing(personOne: newPerson1, personTwo: newPerson2)
        def newPairing2 = new Pairing(personOne: newPerson1, personTwo: newPerson2)
        newPairing1.save()

        when:
        def returnValue = newPairing2.save()

        then:
        returnValue != null
    }

    def "should save pairing between two users"() {
        given:
        def person1 = new Person(name: "Neetu")
        person1.save(flush:true)
        def person2 = new Person(name: "Mishra")
        person2.save(flush:true)
        MatrixController controller = new MatrixController()
        controller.params.nameOne = "Neetu"
        controller.params.nameTwo = "Mishra"

        when:
        controller.link()

        then:
        Pairing.getAll().first().personOne == person1
        Pairing.getAll().first().personTwo == person2
    }
}
