package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    


public class SwRecordLayoutVWrapper {

    
    private SwRecordLayoutV swRecordLayoutV;

    public SwRecordLayoutVWrapper(SwRecordLayoutV swRecordLayoutV) {
        this.swRecordLayoutV = swRecordLayoutV;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutV.getS())) {
            
            return swRecordLayoutV.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutV.getT())) {
            
            return swRecordLayoutV.getT();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortLabel() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutV.getShortLabel())) {
            
            return new IdentifierWrapper(swRecordLayoutV.getShortLabel());
            
        } else {
            return null;
        }
        
    }

    public AsamRecordLayoutSemanticsWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutV.getCategory())) {
            
            return new AsamRecordLayoutSemanticsWrapper(swRecordLayoutV.getCategory());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutV.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(swRecordLayoutV.getDesc());
            
        } else {
            return null;
        }
        
    }

    public BaseTypeRefWrapper getBaseTypeRef() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutV.getBaseTypeRef())) {
            
            return new BaseTypeRefWrapper(swRecordLayoutV.getBaseTypeRef());
            
        } else {
            return null;
        }
        
    }

    public AxisIndexTypeWrapper getSwRecordLayoutVAxis() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutV.getSwRecordLayoutVAxis())) {
            
            return new AxisIndexTypeWrapper(swRecordLayoutV.getSwRecordLayoutVAxis());
            
        } else {
            return null;
        }
        
    }

    public NmtokenStringWrapper getSwRecordLayoutVProp() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutV.getSwRecordLayoutVProp())) {
            
            return new NmtokenStringWrapper(swRecordLayoutV.getSwRecordLayoutVProp());
            
        } else {
            return null;
        }
        
    }

    public NmtokensStringWrapper getSwRecordLayoutVIndex() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutV.getSwRecordLayoutVIndex())) {
            
            return new NmtokensStringWrapper(swRecordLayoutV.getSwRecordLayoutVIndex());
            
        } else {
            return null;
        }
        
    }

    public SwGenericAxisParamTypeRefWrapper getSwGenericAxisParamTypeRef() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutV.getSwGenericAxisParamTypeRef())) {
            
            return new SwGenericAxisParamTypeRefWrapper(swRecordLayoutV.getSwGenericAxisParamTypeRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getSwRecordLayoutVFixValue() {
        
        if (CollUtil.isNotEmpty(swRecordLayoutV.getSwRecordLayoutVFixValue())) {
            
            return new IntegerWrapper(swRecordLayoutV.getSwRecordLayoutVFixValue());
            
        } else {
            return null;
        }
        
    }




    


    
}