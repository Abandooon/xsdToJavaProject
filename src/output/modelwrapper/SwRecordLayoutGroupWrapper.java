package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    

    
    


public class SwRecordLayoutGroupWrapper {

    
    private SwRecordLayoutGroup swRecordLayoutGroup;

    public SwRecordLayoutGroupWrapper(SwRecordLayoutGroup swRecordLayoutGroup) {
        this.swRecordLayoutGroup = swRecordLayoutGroup;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutGroup.getS())) {
            
            return swRecordLayoutGroup.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutGroup.getT())) {
            
            return swRecordLayoutGroup.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutGroup.getShortLabel())) {
            
            return new IdentifierWrapper(swRecordLayoutGroup.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public AsamRecordLayoutSemanticsWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutGroup.getCategory())) {
            
            return new AsamRecordLayoutSemanticsWrapper(swRecordLayoutGroup.getCategory());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutGroup.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(swRecordLayoutGroup.getDesc());
            
        } else {
            return null;
        }
        
    }

    public AxisIndexTypeWrapper getSwRecordLayoutGroupAxis() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutGroup.getSwRecordLayoutGroupAxis())) {
            
            return new AxisIndexTypeWrapper(swRecordLayoutGroup.getSwRecordLayoutGroupAxis());
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getSwRecordLayoutGroupIndex() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutGroup.getSwRecordLayoutGroupIndex())) {
            
            return new NmtokenStringWrapper(swRecordLayoutGroup.getSwRecordLayoutGroupIndex());
            
        } else {
            return null;
        }
        
    }

    public SwGenericAxisParamTypeRefWrapper getSwGenericAxisParamTypeRef() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutGroup.getSwGenericAxisParamTypeRef())) {
            
            return new SwGenericAxisParamTypeRefWrapper(swRecordLayoutGroup.getSwGenericAxisParamTypeRef());
            
        } else {
            return null;
        }
        
    }

    public RecordLayoutIteratorPointWrapper getSwRecordLayoutGroupFrom() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutGroup.getSwRecordLayoutGroupFrom())) {
            
            return new RecordLayoutIteratorPointWrapper(swRecordLayoutGroup.getSwRecordLayoutGroupFrom());
            
        } else {
            return null;
        }
        
    }

    public RecordLayoutIteratorPointWrapper getSwRecordLayoutGroupTo() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutGroup.getSwRecordLayoutGroupTo())) {
            
            return new RecordLayoutIteratorPointWrapper(swRecordLayoutGroup.getSwRecordLayoutGroupTo());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getSwRecordLayoutGroupStep() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutGroup.getSwRecordLayoutGroupStep())) {
            
            return new IntegerWrapper(swRecordLayoutGroup.getSwRecordLayoutGroupStep());
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getSwRecordLayoutComponent() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutGroup.getSwRecordLayoutComponent())) {
            
            return new IdentifierWrapper(swRecordLayoutGroup.getSwRecordLayoutComponent());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<SwRecordLayoutRefWrapper> getSwRecordLayoutRef() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutGroup.getSwRecordLayoutRef())) {
            ArrayList<SwRecordLayoutRef> originalList = swRecordLayoutGroup.getSwRecordLayoutRef();
            ArrayList<SwRecordLayoutRefWrapper> wrapperList = (ArrayList<SwRecordLayoutRefWrapper>)originalList.stream()
                .map(item -> new SwRecordLayoutRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwRecordLayoutVWrapper> getSwRecordLayoutV() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutGroup.getSwRecordLayoutV())) {
            ArrayList<SwRecordLayoutV> originalList = swRecordLayoutGroup.getSwRecordLayoutV();
            ArrayList<SwRecordLayoutVWrapper> wrapperList = (ArrayList<SwRecordLayoutVWrapper>)originalList.stream()
                .map(item -> new SwRecordLayoutVWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<SwRecordLayoutGroupWrapper> getSwRecordLayoutGroup() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutGroup.getSwRecordLayoutGroup())) {
            ArrayList<SwRecordLayoutGroup> originalList = swRecordLayoutGroup.getSwRecordLayoutGroup();
            ArrayList<SwRecordLayoutGroupWrapper> wrapperList = (ArrayList<SwRecordLayoutGroupWrapper>)originalList.stream()
                .map(item -> new SwRecordLayoutGroupWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }




    


    
}