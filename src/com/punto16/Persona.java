package com.punto16;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private String sexo;
    private double estatura;
    private double peso;

    private final String HOMBRE = "H";
    private final String MUJER = "M";


    private final int INFRAPESO = -1;
    private final int PESO_IDEAL = 0;
    private final int SOBREPESO = 1;

    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.estatura = 0;
        this.peso = 0;
        this.sexo = HOMBRE;
        this.generarDNI();
    }

    public Persona( String nombre, int edad, String sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = 0;
        this.peso = 0;
        this.sexo = sexo;
        this.generarDNI();
    }
    public Persona( String nombre, int edad, String sexo, double estatura, double peso){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estatura = estatura;
        this.peso = peso;
        this.generarDNI();
    }

    public double calcularIMC(){
        double IMC = this.getPeso() / (Math.pow(this.getEstatura(), 2));
        if(IMC < 20){
            return INFRAPESO;
        } else if (IMC >= 25){
            return SOBREPESO;
        }else{
            return PESO_IDEAL;
        }
    }

    public boolean esMayorDeEdad(){
        if(getEdad()>=18){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        String info = " \n - Nombre: " +this.nombre+
                "\n - Edad: "+this.getEdad()+"\n - Sexo: "+this.getSexo()+" \n - DNI: "+this.getDNI()+"\n - Estatura: " +this.getEstatura()+" m"+
                "\n - Peso "+this.getPeso()+" kg";
        return info;
    }

    private void generarDNI(){
        String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int aleatorio = (int) (Math.floor(Math.random()*(100000000)));
        int modulo= aleatorio % 23;
        char letra = juegoCaracteres.charAt(modulo);
        String dni = String.valueOf(aleatorio)+letra;
        this.dni = dni;
    }


    public double getPeso(){
        return this.peso;
    }

    public String getSexo(){
        return this.sexo;
    }

    public double getEstatura(){
        return this.estatura;
    }
    public int getEdad(){
        return this.edad;
    }

    public String getDNI(){
        return this.dni;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setEstatura(double estatura){
        this.estatura = estatura;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    public void setSexo(String sexo){
        String s = sexo.toUpperCase();
        if(s.equals(MUJER)){
            this.sexo = MUJER;
        }else{
            this.sexo = HOMBRE;
        }
    }


}
