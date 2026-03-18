package com.example;

public class UsuarioApp{
private String Nombre;
private String email ;
private int edad;

public UsuarioApp(String Nombre,String email,int edad){
this.Nombre=Nombre;
this.email=email;
this.edad=edad;}

public boolean validar(){
if(Nombre==null || Nombre.equals("")){
return false;}
if(email==null || !email.contains("@")){
return false;}
if(edad<0){
return false;}
return true;}

public void mostrar(){
System.out.println( "Usuario: "+Nombre+" Email:"+email+" Edad:"+edad );}

public void setNombre(String Nombre){
this.Nombre=Nombre;}

public void setEmail(String email){
this.email=email;}

public void setEdad(int edad){
this.edad=edad;}

public String getNombre(){
return Nombre;}

public String getEmail(){
return email;}

public int getEdad(){
return edad;}

public void probar(){
int x=10;int y=20;int z=30;
if(x<y){
System.out.println("x menor");}
if(y<z){
System.out.println("y menor");}
if(x<z)
System.out.println("todo correcto");
else
System.out.println("error");
}
}