package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    


public class EndToEndTransformationISignalPropsConditionalWrapper {

    
    private EndToEndTransformationISignalPropsConditional endToEndTransformationISignalPropsConditional;

    public EndToEndTransformationISignalPropsConditionalWrapper(EndToEndTransformationISignalPropsConditional endToEndTransformationISignalPropsConditional) {
        this.endToEndTransformationISignalPropsConditional = endToEndTransformationISignalPropsConditional;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationISignalPropsConditional.getS())) {
            
            return endToEndTransformationISignalPropsConditional.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationISignalPropsConditional.getT())) {
            
            return endToEndTransformationISignalPropsConditional.getT();
            
        } else {
            return null;
        }
        
    }

    public CsTransformerErrorReactionEnumWrapper getCsErrorReaction() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationISignalPropsConditional.getCsErrorReaction())) {
            
            return new CsTransformerErrorReactionEnumWrapper(endToEndTransformationISignalPropsConditional.getCsErrorReaction());
            
        } else {
            return null;
        }
        
    }

    public TransformerRefWrapper getTransformerRef() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationISignalPropsConditional.getTransformerRef())) {
            
            return new TransformerRefWrapper(endToEndTransformationISignalPropsConditional.getTransformerRef());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<PositiveIntegerWrapper> getDataIds() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationISignalPropsConditional.getDataIds())) {
            ArrayList<PositiveInteger> originalList = endToEndTransformationISignalPropsConditional.getDataIds();
            ArrayList<PositiveIntegerWrapper> wrapperList = (ArrayList<PositiveIntegerWrapper>)originalList.stream()
                .map(item -> new PositiveIntegerWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getDataLength() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationISignalPropsConditional.getDataLength())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationISignalPropsConditional.getDataLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMaxDataLength() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationISignalPropsConditional.getMaxDataLength())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationISignalPropsConditional.getMaxDataLength());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerWrapper getMinDataLength() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationISignalPropsConditional.getMinDataLength())) {
            
            return new PositiveIntegerWrapper(endToEndTransformationISignalPropsConditional.getMinDataLength());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(endToEndTransformationISignalPropsConditional.getVariationPoint())) {
            
            return new VariationPointWrapper(endToEndTransformationISignalPropsConditional.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}