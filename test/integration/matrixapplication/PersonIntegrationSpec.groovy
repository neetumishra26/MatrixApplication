package matrixapplication

import grails.plugin.spock.IntegrationSpec

class PersonIntegrationSpec extends IntegrationSpec{

    def 'should be able to save a person to the database'() {
        given:
        def newPerson = new Person(name:"neetu")

        when:
        def success = newPerson.save()

        then:
        success != null
    }

    def 'should not be able to save a case with a duplicate id'() {
        given:
        def newPerson1 = new Person(name:"neetu")
        newPerson1.save()
        def newPerson2 = new Person(name:"neetu")

        when:
        def returnValue = newPerson2.save()

        then:
        returnValue == null
    }
}
