package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class FlexrayTpNodeWrapper {

    
    private FlexrayTpNode flexrayTpNode;

    public FlexrayTpNodeWrapper(FlexrayTpNode flexrayTpNode) {
        this.flexrayTpNode = flexrayTpNode;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(flexrayTpNode.getS())) {
            
            return flexrayTpNode.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(flexrayTpNode.getT())) {
            
            return flexrayTpNode.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(flexrayTpNode.getUuid())) {
            
            return flexrayTpNode.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(flexrayTpNode.getShortName())) {
            
            return new IdentifierWrapper(flexrayTpNode.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(flexrayTpNode.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = flexrayTpNode.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(flexrayTpNode.getLongName())) {
            
            return new MultilanguageLongNameWrapper(flexrayTpNode.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(flexrayTpNode.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(flexrayTpNode.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(flexrayTpNode.getCategory())) {
            
            return new CategoryStringWrapper(flexrayTpNode.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(flexrayTpNode.getAdminData())) {
            
            return new AdminDataWrapper(flexrayTpNode.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(flexrayTpNode.getIntroduction())) {
            
            return new DocumentationBlockWrapper(flexrayTpNode.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(flexrayTpNode.getAnnotations())) {
            ArrayList<Annotation> originalList = flexrayTpNode.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ArrayList<ConnectorRef_CanTpNodeWrapper> getConnectorRefs() {
        
        if (CollUtil.isNotEmpty(flexrayTpNode.getConnectorRefs())) {
            ArrayList<ConnectorRef_CanTpNode> originalList = flexrayTpNode.getConnectorRefs();
            ArrayList<ConnectorRef_CanTpNodeWrapper> wrapperList = (ArrayList<ConnectorRef_CanTpNodeWrapper>)originalList.stream()
                .map(item -> new ConnectorRef_CanTpNodeWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public TpAddressRefWrapper getTpAddressRef() {
        
        if (CollUtil.isNotEmpty(flexrayTpNode.getTpAddressRef())) {
            
            return new TpAddressRefWrapper(flexrayTpNode.getTpAddressRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(flexrayTpNode.getVariationPoint())) {
            
            return new VariationPointWrapper(flexrayTpNode.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}