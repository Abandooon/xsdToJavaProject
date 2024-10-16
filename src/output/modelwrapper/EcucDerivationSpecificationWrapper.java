package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class EcucDerivationSpecificationWrapper {

    
    private EcucDerivationSpecification ecucDerivationSpecification;

    public EcucDerivationSpecificationWrapper(EcucDerivationSpecification ecucDerivationSpecification) {
        this.ecucDerivationSpecification = ecucDerivationSpecification;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucDerivationSpecification.getS())) {
            
            return ecucDerivationSpecification.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucDerivationSpecification.getT())) {
            
            return ecucDerivationSpecification.getT();
            
        } else {
            return null;
        }
        
    }

    public EcucParameterDerivationFormulaWrapper getCalculationFormula() {
        
        if (CollUtil.isNotEmpty(ecucDerivationSpecification.getCalculationFormula())) {
            
            return new EcucParameterDerivationFormulaWrapper(ecucDerivationSpecification.getCalculationFormula());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucQueryWrapper> getEcucQuerys() {
        
        if (CollUtil.isNotEmpty(ecucDerivationSpecification.getEcucQuerys())) {
            ArrayList<EcucQuery> originalList = ecucDerivationSpecification.getEcucQuerys();
            ArrayList<EcucQueryWrapper> wrapperList = (ArrayList<EcucQueryWrapper>)originalList.stream()
                .map(item -> new EcucQueryWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MlFormulaWrapper getInformalFormula() {
        
        if (CollUtil.isNotEmpty(ecucDerivationSpecification.getInformalFormula())) {
            
            return new MlFormulaWrapper(ecucDerivationSpecification.getInformalFormula());
            
        } else {
            return null;
        }
        
    }




    


    
}