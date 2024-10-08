import java.util.ArrayList;

public class Fazendeiro
{
    
    public Fazendeiro()
    {
    
    }
    
    public ArrayList distribuirSementes(int cavaEscolhida, ArrayList<CavaSimples> cavasSimples){
        CavaSimples inicial = cavasSimples.get(cavaEscolhida);
        // Distribui 1 semente pra cada cava seguinte
        for (int i=cavaEscolhida; i < inicial.getQntSementes(); i++){
            // Caso a cava seja a 12 (n existe), volta pra 1a
            if (i>11){
                i = 0;
            }
            cavasSimples.get(i).addSementes(1);
        }
        // Remove tds as sementes da cava inicial
        inicial.removerTdsSementes();
        
        return cavasSimples;
    }

    
}
