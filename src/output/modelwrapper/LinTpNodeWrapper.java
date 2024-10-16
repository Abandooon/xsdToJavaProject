package stdgui.data.model.modelwrapper;


    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    

    
    
        import stdgui.data.model.orimodel.Annotation;
    

    
    

    
    
        import stdgui.data.model.orimodel.Integer;
    

    
    

    
    

    
    

    
    


public class LinTpNodeWrapper {

    
    private LinTpNode linTpNode;

    public LinTpNodeWrapper(LinTpNode linTpNode) {
        this.linTpNode = linTpNode;
    }

   
    public java.lang.String getS() {
        
        if (CollUtil.isNotEmpty(linTpNode.getS())) {
            
            return linTpNode.getS();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getT() {
        
        if (CollUtil.isNotEmpty(linTpNode.getT())) {
            
            return linTpNode.getT();
            
        } else {
            return null;
        }
        
    }

    public java.lang.String getUuid() {
        
        if (CollUtil.isNotEmpty(linTpNode.getUuid())) {
            
            return linTpNode.getUuid();
            
        } else {
            return null;
        }
        
    }

    public IdentifierWrapper getShortName() {
        
        if (CollUtil.isNotEmpty(linTpNode.getShortName())) {
            
            return new IdentifierWrapper(linTpNode.getShortName());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<ShortNameFragmentWrapper> getShortNameFragments() {
        
        if (CollUtil.isNotEmpty(linTpNode.getShortNameFragments())) {
            ArrayList<ShortNameFragment> originalList = linTpNode.getShortNameFragments();
            ArrayList<ShortNameFragmentWrapper> wrapperList = (ArrayList<ShortNameFragmentWrapper>)originalList.stream()
                .map(item -> new ShortNameFragmentWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public MultilanguageLongNameWrapper getLongName() {
        
        if (CollUtil.isNotEmpty(linTpNode.getLongName())) {
            
            return new MultilanguageLongNameWrapper(linTpNode.getLongName());
            
        } else {
            return null;
        }
        
    }

    public MultiLanguageOverviewParagraphWrapper getDesc() {
        
        if (CollUtil.isNotEmpty(linTpNode.getDesc())) {
            
            return new MultiLanguageOverviewParagraphWrapper(linTpNode.getDesc());
            
        } else {
            return null;
        }
        
    }

    public CategoryStringWrapper getCategory() {
        
        if (CollUtil.isNotEmpty(linTpNode.getCategory())) {
            
            return new CategoryStringWrapper(linTpNode.getCategory());
            
        } else {
            return null;
        }
        
    }

    public AdminDataWrapper getAdminData() {
        
        if (CollUtil.isNotEmpty(linTpNode.getAdminData())) {
            
            return new AdminDataWrapper(linTpNode.getAdminData());
            
        } else {
            return null;
        }
        
    }

    public DocumentationBlockWrapper getIntroduction() {
        
        if (CollUtil.isNotEmpty(linTpNode.getIntroduction())) {
            
            return new DocumentationBlockWrapper(linTpNode.getIntroduction());
            
        } else {
            return null;
        }
        
    }

    public ArrayList<AnnotationWrapper> getAnnotations() {
        
        if (CollUtil.isNotEmpty(linTpNode.getAnnotations())) {
            ArrayList<Annotation> originalList = linTpNode.getAnnotations();
            ArrayList<AnnotationWrapper> wrapperList = (ArrayList<AnnotationWrapper>)originalList.stream()
                .map(item -> new AnnotationWrapper(item))
                .collect(Collectors.toList());
            return wrapperList;
        } else {
            return null;
        }
        
    }

    public ConnectorRef_CanTpNodeWrapper getConnectorRef() {
        
        if (CollUtil.isNotEmpty(linTpNode.getConnectorRef())) {
            
            return new ConnectorRef_CanTpNodeWrapper(linTpNode.getConnectorRef());
            
        } else {
            return null;
        }
        
    }

    public IntegerWrapper getMaxNumberOfRespPendingFrames() {
        
        if (CollUtil.isNotEmpty(linTpNode.getMaxNumberOfRespPendingFrames())) {
            
            return new IntegerWrapper(linTpNode.getMaxNumberOfRespPendingFrames());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getP2Max() {
        
        if (CollUtil.isNotEmpty(linTpNode.getP2Max())) {
            
            return new TimeValueWrapper(linTpNode.getP2Max());
            
        } else {
            return null;
        }
        
    }

    public TimeValueWrapper getP2Timing() {
        
        if (CollUtil.isNotEmpty(linTpNode.getP2Timing())) {
            
            return new TimeValueWrapper(linTpNode.getP2Timing());
            
        } else {
            return null;
        }
        
    }

    public TpAddressRefWrapper getTpAddressRef() {
        
        if (CollUtil.isNotEmpty(linTpNode.getTpAddressRef())) {
            
            return new TpAddressRefWrapper(linTpNode.getTpAddressRef());
            
        } else {
            return null;
        }
        
    }

    public VariationPointWrapper getVariationPoint() {
        
        if (CollUtil.isNotEmpty(linTpNode.getVariationPoint())) {
            
            return new VariationPointWrapper(linTpNode.getVariationPoint());
            
        } else {
            return null;
        }
        
    }




    


    
}