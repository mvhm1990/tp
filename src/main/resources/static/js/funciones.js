(function ($) {
    "use strict";
    $('#boton').click(function () {
        var fecha = $("#fecha").val();
        var comunicado = {fecha_Creacion: fecha};
        $.ajax({
            type: "POST",
            dataType: 'json',
            contentType: "application/json",
            url: "/apis/listar",
            data: JSON.stringify(comunicado),
            success: function (respuesta) {
                $("#lista").empty();
                $.each(respuesta, function (index, valor) {
                    $("#lista").append(
                            '<tr><td>' + valor.encabezado + '</td><td>' + valor.fecha_Creacion + '</td></tr>'
                            );
                });
                console.log("funciono");
            },
            error: function (response) {
                alert("error");
            }
        });
    });
})(jQuery);
