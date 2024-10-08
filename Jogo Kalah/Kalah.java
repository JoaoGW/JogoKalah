public class Kalah
{
    
    Fazenda fazenda = new Fazenda();
    Input input = new Input();
    
    
    
    public Kalah()
    {
       if (input.iniciarJogo()){
           fazenda.iniciarJogo();
           //fazenda.distribuirSementes(input.escolherCava());
           
       }
       
       input.mostrarTabuleiro(fazenda.getArrayCavas(), fazenda.getSilo1(), fazenda.getSilo2());

    }

    
}
