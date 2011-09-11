package matrixapplication

class PersonController {

    def index = { }
    def create = {

    }

    def show = {
        [userList: Person.findAll()]
    }

    def save = {
        def newPerson = new Person(id:params.id, name: params.name)
        print(params)
        if(newPerson.save(flush:true)){
            redirect(action:'show')
        }
    }
}
