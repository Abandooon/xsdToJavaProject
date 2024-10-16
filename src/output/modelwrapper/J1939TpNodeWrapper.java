package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    

    
    


public class J1939TpNodeWrapper {

    
    private J1939TpNode j1939TpNode;

    public J1939TpNodeWrapper(J1939TpNode j1939TpNode) {
        this.j1939TpNode = j1939TpNode;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(j1939TpNode.getS())) {
            
            return j1939TpNode.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(j1939TpNode.getT())) {
            
            return j1939TpNode.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(j1939TpNode.getUuid())) {
            
            return j1939TpNode.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(j1939TpNode.getShortName())) {
            
            return new IdentifierWrapper(j1939TpNode.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(j1939TpNode.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = j1939TpNode.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(j1939TpNode.getLongName())) {
            
            return new MultilanguageLongNameWrapper(j1939TpNode.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(j1939TpNode.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(j1939TpNode.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(j1939TpNode.getCategory())) {
            
            return new CategoryStringWrapper(j1939TpNode.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(j1939TpNode.getAdminData())) {
            
            return new AdminDataWrapper(j1939TpNode.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(j1939TpNode.getIntroduction())) {
            
            return new DocumentationBlockWrapper(j1939TpNode.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(j1939TpNode.getAnnotations())) {
            ArrayList<Annotation> originalList = j1939TpNode.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ConnectorRef_CanTpNodeWrapper getConnectorRef() {
        
        if (CollUtil.isNotEmpty(j1939TpNode.getConnectorRef())) {
            
            return new ConnectorRef_CanTpNodeWrapper(j1939TpNode.getConnectorRef());
            
        } else {
            return null;
        }
        
    }

    public TpAddressRefWrapper getTpAddressRef() {
        
        if (CollUtil.isNotEmpty(j1939TpNode.getTpAddressRef())) {
            
            return new TpAddressRefWrapper(j1939TpNode.getTpAddressRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(j1939TpNode.getVariationPoint())) {
            
            return new VariationPointWrapper(j1939TpNode.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}