package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Boolean;
    

    
    

    
    


public class TextTableMappingWrapper {

    
    private TextTableMapping textTableMapping;

    public TextTableMappingWrapper(TextTableMapping textTableMapping) {
        this.textTableMapping = textTableMapping;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(textTableMapping.getS())) {
            
            return textTableMapping.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(textTableMapping.getT())) {
            
            return textTableMapping.getT();
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getBitfieldTextTableMaskFirst() {
        
        if (CollUtil.isNotEmpty(textTableMapping.getBitfieldTextTableMaskFirst())) {
            
            return new PositiveIntegerValueVariationPointWrapper(textTableMapping.getBitfieldTextTableMaskFirst());
            
        } else {
            return null;
        }
        
    }

    public PositiveIntegerValueVariationPointWrapper getBitfieldTextTableMaskSecond() {
        
        if (CollUtil.isNotEmpty(textTableMapping.getBitfieldTextTableMaskSecond())) {
            
            return new PositiveIntegerValueVariationPointWrapper(textTableMapping.getBitfieldTextTableMaskSecond());
            
        } else {
            return null;
        }
        
    }

    public BooleanWrapper getIdenticalMapping() {
        
        if (CollUtil.isNotEmpty(textTableMapping.getIdenticalMapping())) {
            
            return new BooleanWrapper(textTableMapping.getIdenticalMapping());
            
        } else {
            return null;
        }
        
    }

    public MappingDirectionEnumWrapper getMappingDirection() {
        
        if (CollUtil.isNotEmpty(textTableMapping.getMappingDirection())) {
            
            return new MappingDirectionEnumWrapper(textTableMapping.getMappingDirection());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<TextTableValuePairWrapper> getValuePairs() {
        
        if (CollUtil.isNotEmpty(textTableMapping.getValuePairs())) {
            ArrayList<TextTableValuePair> originalList = textTableMapping.getValuePairs();
            ArrayList<TextTableValuePairWrapper> wrapperList = (ArrayList<TextTableValuePairWrapper>)originalList.stream()
                .map(item -> new TextTableValuePairWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}