package model;

public interface Shape {
    // Método para cambiar nombre
    void setName(String n);
    
    // Método para obtener el nombre
    String getName();
    
    // Método para mover la figura
    void move(int x, int y);
    
    // Método para obtener la posición 
    void getPosition();
    
    // Método para clonar figura
    Shape clone();
}
