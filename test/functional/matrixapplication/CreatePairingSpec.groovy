package matrixapplication

import geb.Page
import functionaltest.pages.CreatePairingPage
import functionaltest.pages.ShowMatrixPage
import functionaltest.MatrixApplicationGebSpec
import functionaltest.pages.NewUserPage
import functionaltest.pages.ShowUserPage

class CreatePairingSpec extends MatrixApplicationGebSpec{

    def "should be able to save user pairing record when 2 username is given"() {
        given:
        to NewUserPage
        username.value("Neetu")
        save.click()
        at(ShowUserPage)
        clickAddUser
        to NewUserPage
        username.value("Mishra")
        save.click()
        at(ShowUserPage)
        and:
        clickAddPairing
        to CreatePairingPage

        when:
        username1.value("Neetu")
        username2.value("Mishra")
        and:
        save.click()

        then:
        assert at(ShowMatrixPage)
    }
}
