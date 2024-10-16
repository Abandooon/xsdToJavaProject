package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class FlexrayArTpNodeWrapper {

    
    private FlexrayArTpNode flexrayArTpNode;

    public FlexrayArTpNodeWrapper(FlexrayArTpNode flexrayArTpNode) {
        this.flexrayArTpNode = flexrayArTpNode;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayArTpNode.getS())) {
            
            return flexrayArTpNode.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayArTpNode.getT())) {
            
            return flexrayArTpNode.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(flexrayArTpNode.getUuid())) {
            
            return flexrayArTpNode.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(flexrayArTpNode.getShortName())) {
            
            return new IdentifierWrapper(flexrayArTpNode.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(flexrayArTpNode.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = flexrayArTpNode.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(flexrayArTpNode.getLongName())) {
            
            return new MultilanguageLongNameWrapper(flexrayArTpNode.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(flexrayArTpNode.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(flexrayArTpNode.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(flexrayArTpNode.getCategory())) {
            
            return new CategoryStringWrapper(flexrayArTpNode.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(flexrayArTpNode.getAdminData())) {
            
            return new AdminDataWrapper(flexrayArTpNode.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(flexrayArTpNode.getIntroduction())) {
            
            return new DocumentationBlockWrapper(flexrayArTpNode.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(flexrayArTpNode.getAnnotations())) {
            ArrayList<Annotation> originalList = flexrayArTpNode.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConnectorRefWrapper> getConnectorRefs() {
        
        if (CollUtil.isNotEmpty(flexrayArTpNode.getConnectorRefs())) {
            ArrayList<ConnectorRef> originalList = flexrayArTpNode.getConnectorRefs();
            ArrayList<ConnectorRefWrapper> wrapperList = (ArrayList<ConnectorRefWrapper>)originalList.stream()
                .map(item -> new ConnectorRefWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TpAddressRefWrapper getTpAddressRef() {
        
        if (CollUtil.isNotEmpty(flexrayArTpNode.getTpAddressRef())) {
            
            return new TpAddressRefWrapper(flexrayArTpNode.getTpAddressRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(flexrayArTpNode.getVariationPoint())) {
            
            return new VariationPointWrapper(flexrayArTpNode.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}