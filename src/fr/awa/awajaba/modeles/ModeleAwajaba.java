/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.awa.awajaba.modeles;

import fr.awa.awajaba.entites.EvaluationRepas;

/**
 *
 * @author root
 */
public class ModeleAwajaba {
    
    private ModeleAwajaba modele = null;
    private EvaluationRepas evalRepas;

    private ModeleAwajaba(EvaluationRepas evalRepas) {
        this.evalRepas = evalRepas;
    }

    public ModeleAwajaba getModele() {
        return modele;
    }

    public EvaluationRepas getEvaluation() {
        return evalRepas;
    }

    public void setEvaluation(EvaluationRepas evalRepas) {
        this.evalRepas = evalRepas;
    }
    
}
