var matrixapp = this.matrixapp || {};

matrixapp.createNewUserOnLoad = function() {

    $("#user-save").click(function() {
        matrixapp.createWithoutConfirmAction();
        return false;
    });

    $("#user-cancel").click(function() {
        return false;
    });
};

matrixapp.createWithoutConfirmAction = function() {

    if(($("#user-name").val().trim() != "")) {
        $("#case-create-form").submit();
    }
};

