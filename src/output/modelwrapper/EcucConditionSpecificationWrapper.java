package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    


public class EcucConditionSpecificationWrapper {

    
    private EcucConditionSpecification ecucConditionSpecification;

    public EcucConditionSpecificationWrapper(EcucConditionSpecification ecucConditionSpecification) {
        this.ecucConditionSpecification = ecucConditionSpecification;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(ecucConditionSpecification.getS())) {
            
            return ecucConditionSpecification.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(ecucConditionSpecification.getT())) {
            
            return ecucConditionSpecification.getT();
            
        } else {
            return null;
        }
        
    }

    public EcucConditionFormulaWrapper getConditionFormula() {
        
        if (CollUtil.isNotEmpty(ecucConditionSpecification.getConditionFormula())) {
            
            return new EcucConditionFormulaWrapper(ecucConditionSpecification.getConditionFormula());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<EcucQueryWrapper> getEcucQuerys() {
        
        if (CollUtil.isNotEmpty(ecucConditionSpecification.getEcucQuerys())) {
            ArrayList<EcucQuery> originalList = ecucConditionSpecification.getEcucQuerys();
            ArrayList<EcucQueryWrapper> wrapperList = (ArrayList<EcucQueryWrapper>)originalList.stream()
                .map(item -> new EcucQueryWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MlFormulaWrapper getInformalFormula() {
        
        if (CollUtil.isNotEmpty(ecucConditionSpecification.getInformalFormula())) {
            
            return new MlFormulaWrapper(ecucConditionSpecification.getInformalFormula());
            
        } else {
            return null;
        }
        
    }




    


    
}