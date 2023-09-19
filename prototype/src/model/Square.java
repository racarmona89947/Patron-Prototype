package model;

// se crea una clase circulo de tipo figura 
public class Square implements Shape{    
    // se crea un parametro nombre para identificar el objeto
    private String name;
    // se creea un parametro de tipo entero para las posiciones 
    private int positionX,  positionY;
    // se crea el constructor vacio
    public Square(){}
    
    // metodo cambiar nombre del objeto 
    public void setName(String n){
        this.name = n;
    }
    //metodo que me devuelve nombre del  objeto
    public String getName(){
        // retorna el atributo nombre 
        return name;
    }
    // metodo para enviar posiciones nuevas del objeto
    public void move(int x, int y){
        // asigna nuevas posiciones 
        this.positionX=x;
        this.positionY=y;

    }
    // metodo para optiener posiciones 
    public void getPosition(){
        System.out.println("Cuadrado en x: " + this.positionX);
        System.out.println("Cuadrado en y: " + this.positionY);
    }
    // metodo encargado de crear copia exacta del circulo 
    public Shape clone(){
        // se crea un objeto nuevo de tipo figura
        Shape shape = new Square();
        // se le envia el parametro del nuevo nombre
        shape.setName(this.name);
        // se le envia las nuevas posiciones para el nuevo objeto 
        shape.move(this.positionX, this.positionY);
        // el metodo devuelve una figura de tipo Figura
        return shape;
    }
    


}
