package functionaltest.pages

import geb.Page

class NewUserPage extends Page {
    static at = { $("title").text() == "Create Person" }
    static url = "person/create"
    static content = {
        username { $("input", id: "user-name") }
        save { $("button", id: "user-save") }
        clickAddUser{
          $("a", name:"createNewUser").click()
          true
        }
    }
}
