package functionaltest.pages

import geb.Page

class NewUserPage extends Page {
    static at = { $("title").text() == "Create Person" }
    static url = "user/create"
    static content = {
        username { $("input", id: "user-name") }
        save { $("button", id: "user-save") }
    }
}
