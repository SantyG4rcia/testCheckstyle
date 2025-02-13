package com.myproyect.test.prueba;

public class TestCheckstyle {
    String Mivariable;

    public TestCheckstyle() {
        Mivariable = "Hola";
    }

    public void metodoConLineaLarga() {
        String lineaMuyLarga = "Esta es una línea extremadamente larga que debería exceder el límite de 120 caracteres que hemos establecido en la configuración de checkstyle";
    }
}
