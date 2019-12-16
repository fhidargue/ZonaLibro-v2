public class HiloMotos implements Runnable{
    
    public String numMoto;
    
    public HiloMotos(String moto){
        numMoto=moto;
    }
    
    public void run(){
        System.out.println("Iniciando entrega "+numMoto);
        try{
            for(int contar=1;contar<11;contar++){
                Thread.sleep(400);
                System.out.println(""+numMoto+", terminó entrega: "+contar);
            }
        }catch(InterruptedException e){
            System.out.println(""+numMoto+" Interrumpido!");
        }
        System.out.println("Terminando - "+numMoto);
    }
}
