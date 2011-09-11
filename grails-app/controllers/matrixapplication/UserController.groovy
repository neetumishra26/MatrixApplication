package matrixapplication

class UserController {

    def index = {
        [userList: User.list()]
    }

    def create = {
        def newUser = new User()
        newUser.name = params.uname
        newUser.save()
    }

    def cancel = {

    }
}
