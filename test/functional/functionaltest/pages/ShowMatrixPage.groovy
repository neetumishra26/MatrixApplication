package functionaltest.pages

import geb.Page

class ShowMatrixPage extends Page{
    static at = { $("title").text() == "Show Matrix" }
    static url = "matrix/show"
    static content = {
        allUser {$("#all-user-table tbody tr").size()}
    }
}
