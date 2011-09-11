import geb.Module

class UserRow extends Module{
    static content = {
        cell { i -> $("td", i) }
        name { cell(0).text() }
    }
}
