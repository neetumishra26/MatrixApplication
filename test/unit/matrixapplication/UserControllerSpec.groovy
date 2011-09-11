package matrixapplication

import grails.plugin.spock.ControllerSpec

class UserControllerSpec extends ControllerSpec{

    def "should save user"(){
        given:
        mockDomain(Person, [])
        controller.params.id = "1"
        controller.params.name = "Neetu"

        when:
        controller.save()

        then:
        Person.count() == 1
    }
}
