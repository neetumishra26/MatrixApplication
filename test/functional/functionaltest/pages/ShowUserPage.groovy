package functionaltest.pages

import geb.Page
import geb.Module

class ShowUserPage extends Page{
    static at = { $("title").text() == "Users" }
    static url = "user/show"
    static content = {
        allUser { $("#user-table tr") }.collect {module UserRow, it}
    }
}

