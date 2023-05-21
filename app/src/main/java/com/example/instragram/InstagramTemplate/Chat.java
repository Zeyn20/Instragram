package com.example.instragram.InstagramTemplate;

public class Chat {
    private int foto;
    private String nombre;
    private String mensaje;
    private String hora;

    public Chat(int f, String nom, String men, String h) {

        foto = f;
        nombre = nom;
        mensaje = men;
        hora = h;

    }
    public int getFoto() {return foto;}
    public String getNombre() {return nombre;}

    public String getMensaje() {return mensaje;}

    public String getHora() {return hora;}
}
