package functionaltest.pages

import geb.Page

class NewUserPage extends Page {
    static at = { $("title").text() == "Create User" }
    static url = "user/save"
    static content = {
        userName { $("input", id: "uname") }
        save { $("button", id: "add-user") }
    }
}
