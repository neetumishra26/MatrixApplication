package functionaltest.pages

import geb.Page

class CreatePairingPage extends Page{
    static at = { $("title").text() == "Add Pairing" }
    static url = "matrix/create"
    static content = {
        username1 { $("input", id: "nameOne") }
        username2 { $("input", id: "nameTwo") }
        save { $("button", id: "pairing-save") }
    }
}
