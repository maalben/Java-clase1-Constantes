package main;

public enum Mensajes {

    PETICION_RADIO("Ingresa el radio del círculo:"),
    MENSAJE_RESPUESTA("El área del círculo es ");

    private String mensaje;

    Mensajes(String s) {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }
}
