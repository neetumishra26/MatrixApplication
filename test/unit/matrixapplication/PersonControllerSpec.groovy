package matrixapplication

import grails.plugin.spock.ControllerSpec

class PersonControllerSpec extends ControllerSpec{

    def "should save user"(){
        given:
        mockDomain(Person)
        controller.params.id = "1"
        controller.params.name = "Neetu"

        when:
        controller.save()

        then:
        redirectArgs == [action:'show']
    }
}