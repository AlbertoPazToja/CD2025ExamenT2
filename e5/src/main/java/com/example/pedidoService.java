package com.example; import java.util.List; import java.util.ArrayList;

public class pedidoService{
private List<String> pedidos =new ArrayList<String>();private int totalPedidos=0; private String nomeTienda="MiTiendaOnline";

public pedidoService( ){
}

public void crearPedido(String p){
if(p!=null && !p.equals("")){
pedidos.add(p); totalPedidos++;}}

public void borrarPedido(String p){
if(p==null)return;
for(int i=0;i<pedidos.size();i++){
if(pedidos.get(i).equals(p)){
pedidos.remove(i);totalPedidos--;break;}}}

public boolean hayPedidos(){
if(pedidos.size()>0){
return true;}else{return false;}}

public int getTotalPedidos( ){
return totalPedidos;}

public void imprimirPedidos( ){
System.out.println("Listado de pedidos de la tienda con un texto extremadamente largo que debería romper la regla de longitud de línea de checkstyle porque es innecesariamente largo y repetitivo "+nomeTienda);
for(String p:pedidos){
System.out.println(p);}}

public void reiniciar(){
pedidos=new ArrayList<String>(); totalPedidos=0;}

public void procesarPedidos(){
int a=1;int b=2;int c=3;int d=4;
if(a<b)
if(b<c)
System.out.println("ok");
else
System.out.println("mal");}

public String getnomeTienda(){
return nomeTienda;}

public void setnomeTienda(String nomeTienda){
this.nomeTienda=nomeTienda;}

}