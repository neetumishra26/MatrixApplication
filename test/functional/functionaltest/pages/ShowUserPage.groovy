package functionaltest.pages

import geb.Page
import geb.Module

class ShowUserPage extends Page{
    static at = { $("title").text() == "Users" }
    static url = "user/index"
    static content = {
//        allUser { $("#user-table tr") }.collect {module UserRow, it}
      allUser {$("#user-table tbody tr").size()}

    }
}

class UserRow extends Module{
    static content = {
        cell { i -> $("td", i) }
        name { cell(0).text() }
    }
}




