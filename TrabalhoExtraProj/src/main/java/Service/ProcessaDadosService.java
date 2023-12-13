package Service;

import Model.SubjectModel;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ProcessaDadosService {

    private String SOLTEIRO = "Solteiro(a)";
    private String CASADO = "Casado(a)";
    private String MASCULINO = "Masculino";
    private String FEMININO = "Feminino";


    public Map<String,Double> processar(Collection<SubjectModel> subjectCollection){
        Map<String,Double> data = new HashMap<>();
        double qtdMasculinoSolteiro = 0;
        double qtdFemininoSolteira = 0;
        double qtdMasculinoCasado = 0;
        double qtdFemininoCasada = 0;

        for (SubjectModel subjectModel: subjectCollection) {
            if(subjectModel.getEstadoCivil().equalsIgnoreCase(SOLTEIRO)){
                if(subjectModel.getGenero().equalsIgnoreCase(MASCULINO)){
                    qtdMasculinoSolteiro++;
                }else {
                    qtdFemininoSolteira++;
                }
            }else{
                if(subjectModel.getGenero().equals(MASCULINO)){
                    qtdMasculinoCasado++;
                }else {
                    qtdFemininoCasada++;
                }
            }
        }
        data.put(MASCULINO+SOLTEIRO,qtdMasculinoSolteiro);
        data.put(FEMININO+SOLTEIRO,qtdFemininoSolteira);
        data.put(MASCULINO+CASADO,qtdMasculinoCasado);
        data.put(FEMININO+CASADO,qtdFemininoCasada);

        return data;
    }

    public String getCASADO() {
        return CASADO;
    }

    public String getFEMININO() {
        return FEMININO;
    }

    public String getMASCULINO() {
        return MASCULINO;
    }

    public String getSOLTEIRO() {
        return SOLTEIRO;
    }
}

