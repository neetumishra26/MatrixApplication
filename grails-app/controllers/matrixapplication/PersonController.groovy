package matrixapplication

class PersonController {

    def index = { }
    def create = {
    }

    def show = {
        [userList: Person.findAll()]
    }

    def save = {
        def newPerson = new Person(name: params.name)
        if (newPerson.save(flush: true)) {
            redirect(action: 'show')
        }
    }
}
