package matrixapplication

import geb.Page
import functionaltest.pages.CreatePairingPage
import functionaltest.pages.ShowMatrixPage
import functionaltest.MatrixApplicationGebSpec

class CreatePairingSpec extends MatrixApplicationGebSpec{

    def "should be able to save user pairing record when 2 username is given"() {
        given:
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
