package stdgui.data.model.modelwrapper;


    
    

    
    

    
    


public class CompuNominatorDenominatorWrapper {

    
    private CompuNominatorDenominator compuNominatorDenominator;

    public CompuNominatorDenominatorWrapper(CompuNominatorDenominator compuNominatorDenominator) {
        this.compuNominatorDenominator = compuNominatorDenominator;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(compuNominatorDenominator.getS())) {
            
            return compuNominatorDenominator.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(compuNominatorDenominator.getT())) {
            
            return compuNominatorDenominator.getT();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<NumericalValueVariationPointWrapper> getV() {
        
        if (CollUtil.isNotEmpty(compuNominatorDenominator.getV())) {
            ArrayList<NumericalValueVariationPoint> originalList = compuNominatorDenominator.getV();
            ArrayList<NumericalValueVariationPointWrapper> wrapperList = (ArrayList<NumericalValueVariationPointWrapper>)originalList.stream()
                .map(item -> new NumericalValueVariationPointWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}