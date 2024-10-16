package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    

    
    

    
    


public class CanTpNodeWrapper {

    
    private CanTpNode canTpNode;

    public CanTpNodeWrapper(CanTpNode canTpNode) {
        this.canTpNode = canTpNode;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(canTpNode.getS())) {
            
            return canTpNode.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(canTpNode.getT())) {
            
            return canTpNode.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(canTpNode.getUuid())) {
            
            return canTpNode.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(canTpNode.getShortName())) {
            
            return new IdentifierWrapper(canTpNode.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(canTpNode.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = canTpNode.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(canTpNode.getLongName())) {
            
            return new MultilanguageLongNameWrapper(canTpNode.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(canTpNode.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(canTpNode.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(canTpNode.getCategory())) {
            
            return new CategoryStringWrapper(canTpNode.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(canTpNode.getAdminData())) {
            
            return new AdminDataWrapper(canTpNode.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(canTpNode.getIntroduction())) {
            
            return new DocumentationBlockWrapper(canTpNode.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(canTpNode.getAnnotations())) {
            ArrayList<Annotation> originalList = canTpNode.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ConnectorRef_CanTpNodeWrapper getConnectorRef() {
        
        if (CollUtil.isNotEmpty(canTpNode.getConnectorRef())) {
            
            return new ConnectorRef_CanTpNodeWrapper(canTpNode.getConnectorRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaxFcWait() {
        
        if (CollUtil.isNotEmpty(canTpNode.getMaxFcWait())) {
            
            return new IntegerWrapper(canTpNode.getMaxFcWait());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getStMin() {
        
        if (CollUtil.isNotEmpty(canTpNode.getStMin())) {
            
            return new TimeValueWrapper(canTpNode.getStMin());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeoutAr() {
        
        if (CollUtil.isNotEmpty(canTpNode.getTimeoutAr())) {
            
            return new TimeValueWrapper(canTpNode.getTimeoutAr());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getTimeoutAs() {
        
        if (CollUtil.isNotEmpty(canTpNode.getTimeoutAs())) {
            
            return new TimeValueWrapper(canTpNode.getTimeoutAs());
            
        } else {
            return null;
        }
        
    }

    public TpAddressRef_CanTpNodeWrapper getTpAddressRef() {
        
        if (CollUtil.isNotEmpty(canTpNode.getTpAddressRef())) {
            
            return new TpAddressRef_CanTpNodeWrapper(canTpNode.getTpAddressRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(canTpNode.getVariationPoint())) {
            
            return new VariationPointWrapper(canTpNode.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}