package br.com.arbigaus.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel c){
        if (c.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento");
        }else if(c.getClassificacao() >= 2){
            System.out.println("Muito bem avalidado no momento!");
        }else{
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
