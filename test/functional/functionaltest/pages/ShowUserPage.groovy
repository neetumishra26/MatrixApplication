package functionaltest.pages

import geb.Page
import geb.Module

class ShowUserPage extends Page{
    static at = { $("title").text() == "Users" }
    static url = "person/show"
    static content = {
      allUser {$("#user-table tbody tr").size()}
    }
}




