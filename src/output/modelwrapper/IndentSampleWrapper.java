package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    


public class IndentSampleWrapper {

    
    private IndentSample indentSample;

    public IndentSampleWrapper(IndentSample indentSample) {
        this.indentSample = indentSample;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(indentSample.getS())) {
            
            return indentSample.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(indentSample.getT())) {
            
            return indentSample.getT();
            
        } else {
            return null;
        }
        
    }

    public ItemLabelPosEnumSimple getItemLabelPos() {
        
        if (CollUtil.isNotEmpty(indentSample.getItemLabelPos())) {
            
            return indentSample.getItemLabelPos();
            
        } else {
            return null;
        }
        
    }

    public ArrayList<LOverviewParagraphWrapper> getL2() {
        
        if (CollUtil.isNotEmpty(indentSample.getL2())) {
            ArrayList<LOverviewParagraph> originalList = indentSample.getL2();
            ArrayList<LOverviewParagraphWrapper> wrapperList = (ArrayList<LOverviewParagraphWrapper>)originalList.stream()
                .map(item -> new LOverviewParagraphWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}