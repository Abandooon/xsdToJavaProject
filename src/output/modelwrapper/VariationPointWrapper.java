package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class VariationPointWrapper {

    
    private VariationPoint variationPoint;

    public VariationPointWrapper(VariationPoint variationPoint) {
        this.variationPoint = variationPoint;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(variationPoint.getS())) {
            
            return variationPoint.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(variationPoint.getT())) {
            
            return variationPoint.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(variationPoint.getShortLabel())) {
            
            return new IdentifierWrapper(variationPoint.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(variationPoint.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(variationPoint.getDesc());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getBlueprintCondition() {
        
        if (CollUtil.isNotEmpty(variationPoint.getBlueprintCondition())) {
            
            return new DocumentationBlockWrapper(variationPoint.getBlueprintCondition());
            
        } else {
            return null;
        }
        
    }

    public BlueprintFormulaWrapper getFormalBlueprintCondition() {
        
        if (CollUtil.isNotEmpty(variationPoint.getFormalBlueprintCondition())) {
            
            return new BlueprintFormulaWrapper(variationPoint.getFormalBlueprintCondition());
            
        } else {
            return null;
        }
        
    }

    public ConditionByFormulaWrapper getSwSyscond() {
        
        if (CollUtil.isNotEmpty(variationPoint.getSwSyscond())) {
            
            return new ConditionByFormulaWrapper(variationPoint.getSwSyscond());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PostBuildVariantConditionWrapper> getPostBuildVariantConditions() {
        
        if (CollUtil.isNotEmpty(variationPoint.getPostBuildVariantConditions())) {
            ArrayList<PostBuildVariantCondition> originalList = variationPoint.getPostBuildVariantConditions();
            ArrayList<PostBuildVariantConditionWrapper> wrapperList = (ArrayList<PostBuildVariantConditionWrapper>)originalList.stream()
                .map(item -> new PostBuildVariantConditionWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public SdgWrapper getSdg() {
        
        if (CollUtil.isNotEmpty(variationPoint.getSdg())) {
            
            return new SdgWrapper(variationPoint.getSdg());
            
        } else {
            return null;
        }
        
    }




    


    
}