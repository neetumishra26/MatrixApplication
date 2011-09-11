package functionaltest.pages

import geb.Page

class HomePage extends Page{
    static at = { $("title").text() == "Matrix Application" }
    static url = ""
    static content = {
        createUser { $("a", name:"createNewUser") }
    }
}
