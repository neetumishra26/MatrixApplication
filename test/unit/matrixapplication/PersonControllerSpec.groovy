package matrixapplication

import grails.plugin.spock.ControllerSpec

class PersonControllerSpec extends ControllerSpec {

    def "should save user"() {
        given:
        mockDomain(Person)
        controller.params.name = "Neetu"

        when:
        controller.save()

        then:
        redirectArgs == [action: 'show']
    }

    def "should show users"() {
        given:
        def persons = [new Person(name: "neetu"), new Person(name: "mishra")]
        mockDomain(Person, persons)

        when:
        def allUsers = controller.show()

        then:
        allUsers['userList'] == persons
    }
}