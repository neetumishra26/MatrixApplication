package matrixapplication

import functionaltest.MatrixApplicationGebSpec
import functionaltest.pages.NewUserPage
import functionaltest.pages.ShowUserPage

class AddUserSpec extends MatrixApplicationGebSpec{
    def "should be able to save user when username is given"() {
        given:
        to NewUserPage

        when:
        username.value("Neetu")
        save.click()

        then:
        assert at(ShowUserPage)
        allUser == 1
    }
}
