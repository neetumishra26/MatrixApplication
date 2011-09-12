package matrixapplication

import grails.plugin.spock.IntegrationSpec

class PairingIntegrationSpec extends IntegrationSpec{

    def 'should be able to save a pairing between two users in the database'() {
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

        def 'should be able to save all pairing if same users are pairing'() {
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

}
