package functionaltest.pages

import geb.Page

class NewUserPage extends Page {
    static at = { $("title").text() == "Create User" }
    static url = "user/create"
    static content = {
        username { $("input", id: "user-name") }
        save { $("button", id: "user-save") }
    }
}
