package matrixapplication

import grails.plugin.spock.IntegrationSpec

class MatrixIntegrationSpec extends IntegrationSpec{

    def "should save linking between two users"() {
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
